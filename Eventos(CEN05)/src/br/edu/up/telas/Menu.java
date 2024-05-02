package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.controles.*;
import br.edu.up.modelos.*;

public class Menu {
    Scanner ler = new Scanner(System.in);

    ControladorEvento controladorEvento = new ControladorEvento();
    ControladorReserva controladorReserva = new ControladorReserva();

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("----- Menu -----\n");
            System.out.println("1. Adicionar Evento");
            System.out.println("2. Listar Eventos");
            System.out.println("3. Fazer Reserva");
            System.out.println("4. Listar Reservas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    controladorEvento.adicionarEvento();
                    break;
                case 2:
                    controladorEvento.listarEventos();
                    break;
                case 3:
                    controladorEvento.listarEventos();
                    System.out.print("Escolha o evento (pelo número): ");
                    int numeroEvento = ler.nextInt();
                    Evento eventoSelecionado = controladorEvento.selecionarEvento(numeroEvento);
                    if (eventoSelecionado != null) {
                        controladorReserva.fazerReserva(eventoSelecionado);
                    } else {
                        System.out.println("Evento não encontrado.");
                    }
                    break;
                case 4:
                    controladorReserva.listarReservas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 5);

    }
}
