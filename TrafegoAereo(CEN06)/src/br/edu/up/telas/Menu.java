package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.modelos.*;
import br.edu.up.controles.*;

public class Menu {
    private Scanner ler = new Scanner(System.in);
    int escolha;

    public Menu() {
        this.ler = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        do {
            System.out.println("----- Aeroporto -----");
            System.out.println("1. Registros");
            System.out.println("2. Listas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    exibirMenuRegistro();
                    break;
                case 2:
                    exibirMenuLista();
                    break;
                case 3:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 3);
    }

    public void exibirMenuRegistro() {
        do {
            System.out.println("----- Registro do Aeroporto -----");
            System.out.println("1. Registrar aeronave");
            System.out.println("2. Registrar passagem");
            System.out.println("3. Registrar passageiro");
            System.out.println("4. Registrar tripulação");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    // registrarAeronave();
                    break;
                case 2:
                    // registrarPassagem();
                    break;
                case 3:
                    // registrarPassageiro();
                    break;
                case 4:
                    // registrarTripulacao();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);
    }

    public void exibirMenuLista() {
        do {
            System.out.println("----- Registro do Aeroporto -----");
            System.out.println("1. Listar aeronave");
            System.out.println("2. Listar passagens");
            System.out.println("3. Listar passageiros");
            System.out.println("4. Listar tripulação");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    // listarAeronaves();
                    break;
                case 2:
                    // listarPassagens();
                    break;
                case 3:
                    // listarPassageiros();
                    break;
                case 4:
                    // listarTripulacao();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);
    }

}
