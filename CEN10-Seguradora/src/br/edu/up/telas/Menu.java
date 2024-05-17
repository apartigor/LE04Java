package br.edu.up.telas;

import br.edu.up.controles.*;
import br.edu.up.modelos.*;

public class Menu {
    private SeguroController controller;
    private SeguroView view;

    public Menu() {
        controller = new SeguroController();
        view = new SeguroView();
    }

    public void exibirMenu() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    Seguro seguro = view.criarSeguro();
                    if (seguro != null && controller.incluirSeguro(seguro)) {
                        view.mostrarMensagem("Seguro incluído com sucesso.");
                    } else {
                        view.mostrarMensagem("Erro ao incluir seguro ou apólice já existe.");
                    }
                    break;
                case 2:
                    String apolice = view.pedirApolice();
                    view.mostrarSeguro(controller.buscarSeguroPorApolice(apolice).orElse(null));
                    break;
                case 3:
                    apolice = view.pedirApolice();
                    if (controller.excluirSeguro(apolice)) {
                        view.mostrarMensagem("Seguro excluído com sucesso.");
                    } else {
                        view.mostrarMensagem("Erro ao excluir seguro.");
                    }
                    break;
                case 4:
                    if (controller.excluirTodosSeguros()) {
                        view.mostrarMensagem("Todos os seguros foram excluídos.");
                    }
                    break;
                case 5:
                    view.mostrarMensagem("Listando todos os seguros:");
                    controller.listarTodosSeguros().forEach(view::mostrarSeguro);
                    break;
                case 6:
                    view.mostrarMensagem("Quantidade de seguros: " + controller.quantidadeSeguros());
                    break;
                case 7:
                    view.mostrarMensagem("Saindo do programa.");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida.");
            }
        } while (opcao != 7);
    }
}
