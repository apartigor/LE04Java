package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.modelos.*;


public class Menu {
    Scanner ler = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("----- Menu -----\n");
            System.out.println("1. Adicionar Evento");
            System.out.println("2. Listar Eventos");
            System.out.println("3. Fazer Reseva");
            System.out.println("4. Listar Reservas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar evento
                    break;
                case 2:
                    // Listar eventos
                    break;
                case 3:
                    // Realizar reserva
                    break;
                case 4:
                    // Listar reservas
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
