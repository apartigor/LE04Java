package br.edu.up.telas;

import br.edu.up.controles.*;
import br.edu.up.modelos.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private SeguroController controller;
    private SeguroView view;
    private Scanner scanner;

    public Menu() {
        controller = new SeguroController();
        view = new SeguroView();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;

        do {
            view.exibirMenu();
            opcao = view.lerOpcao();

            switch (opcao) {
                case 1:
                    Seguro seguro = view.solicitarDadosSeguro();
                    controller.incluirSeguro(seguro);
                    view.mostrarMensagem("Seguro incluído com sucesso!");
                    break;
                case 2:
                    System.out.print("Informe o número da apólice: ");
                    String numeroApolice = scanner.next();
                    Seguro seguroLocalizado = controller.localizarSeguro(numeroApolice);
                    if (seguroLocalizado != null) {
                        view.mostrarSeguro(seguroLocalizado);
                    } else {
                        view.mostrarMensagem("Seguro não encontrado!");
                    }
                    break;
                case 3:
                    System.out.print("Informe o número da apólice: ");
                    numeroApolice = scanner.next();
                    if (controller.excluirSeguro(numeroApolice)) {
                        view.mostrarMensagem("Seguro excluído com sucesso!");
                    } else {
                        view.mostrarMensagem("Seguro não encontrado!");
                    }
                    break;
                case 4:
                    System.out.print("Deseja realmente excluir todos os seguros? (s/n): ");
                    char confirmacao = scanner.next().charAt(0);
                    if (confirmacao == 's' || confirmacao == 'S') {
                        controller.excluirTodosSeguros();
                        view.mostrarMensagem("Todos os seguros foram excluídos!");
                    }
                    break;
                case 5:
                    ArrayList<Seguro> seguros = controller.listarTodosSeguros();
                    for (Seguro s : seguros) {
                        view.mostrarSeguro(s);
                    }
                    break;
                case 6:
                    int quantidade = controller.quantidadeSeguros();
                    view.mostrarMensagem("Quantidade de seguros: " + quantidade);
                    break;
                case 7:
                    view.mostrarMensagem("Saindo do programa...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida!");
                    break;
            }
        } while (opcao != 7);

        scanner.close();
    }
}