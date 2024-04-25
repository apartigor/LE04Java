package br.edu.up;

import java.util.Scanner;

import br.edu.up.controles.EstacionamentoController;
import br.edu.up.modelos.Carro;
import br.edu.up.telas.EstacionamentoTela;

public class Programa {
    public static void main(String[] args) {
        EstacionamentoController controller = new EstacionamentoController();
        EstacionamentoTela view = new EstacionamentoTela();
        Scanner ler = new Scanner(System.in);

        int opcao;
        do {
            view.menu();
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    Carro carroEntrada = view.receberDadosCarro();
                    if (controller.entradaCarro(carroEntrada)) {
                        view.mostrarMensagem("Carro estacionado com sucesso!");
                    }
                    break;
                case 2:
                    String placaSaida = view.receberPlaca();
                    if (controller.saidaCarro(placaSaida)) {
                        view.mostrarMensagem("Carro retirado do estacionamento!");
                    }
                    break;
                case 3:
                    controller.emitirRelatorio();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}
