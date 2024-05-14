package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.controles.*;
import br.edu.up.modelos.*;

public class Menu {
    private Scanner ler = new Scanner(System.in);
    private ControladorAeronave controladorAeronave;
    private ControladorPassageiro controladorPassageiro;
    private ControladorPassagem controladorPassagem;
    private ControladorTripulacao controladorTripulacao;

    public Menu() {
        this.ler = new Scanner(System.in);
        this.controladorAeronave = new ControladorAeronave();
        this.controladorPassageiro = new ControladorPassageiro();
        this.controladorPassagem = new ControladorPassagem();
        this.controladorTripulacao = new ControladorTripulacao();
    }

    public void exibirMenuPrincipal() {
        int escolha;
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
        int escolha;
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
                    registrarAeronave();
                    break;
                case 2:
                    registrarPassagem();
                    break;
                case 3:
                    registrarPassageiro();
                    break;
                case 4:
                    registrarTripulacao();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);
    }

    public void exibirMenuLista() {
        int escolha;
        do {
            System.out.println("----- Lista do Aeroporto -----");
            System.out.println("1. Listar aeronaves");
            System.out.println("2. Listar passagens");
            System.out.println("3. Listar passageiros");
            System.out.println("4. Listar tripulação");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    controladorAeronave.listarAeronaves();
                    break;
                case 2:
                    controladorPassagem.listarPassagens();
                    break;
                case 3:
                    controladorPassageiro.listarPassageiros();
                    break;
                case 4:
                    controladorTripulacao.listarTripulacao();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);
    }

    private void registrarAeronave() {
        System.out.println("----- Registro de Aeronave -----");
        System.out.print("Digite o código da aeronave: ");
        String codigo = ler.next();
        System.out.print("Digite o tipo da aeronave: ");
        String tipo = ler.next();
        System.out.print("Digite a quantidade de assentos da aeronave: ");
        int quantidadeAssentos = ler.nextInt();
        
        controladorAeronave.registrarAeronave(codigo, tipo, quantidadeAssentos);
    }

    private void registrarPassagem() {
        System.out.println("----- Registro de Passagem -----");
        System.out.print("Digite o número do assento: ");
        int numeroAssento = ler.nextInt();
        System.out.print("Digite a classe do assento: ");
        String classeAssento = ler.next();
        System.out.println("Digite a data do voo:");
        System.out.print("Dia: ");
        int dia = ler.nextInt();
        System.out.print("Mês: ");
        int mes = ler.nextInt();
        System.out.print("Ano: ");
        int ano = ler.nextInt();
        System.out.print("Hora: ");
        int hora = ler.nextInt();
        System.out.print("Minuto: ");
        int minuto = ler.nextInt();

        Data dataVoo = new Data();
        dataVoo.setDia(dia);
        dataVoo.setMes(mes);
        dataVoo.setAno(ano);
        dataVoo.setHora(hora);
        dataVoo.setMinuto(minuto);

        controladorPassagem.registrarPassagem(numeroAssento, classeAssento, dataVoo);
    }

    private void registrarPassageiro() {
        System.out.println("----- Registro de Passageiro -----");
        System.out.print("Digite o nome completo do passageiro: ");
        ler.nextLine();
        String nome = ler.nextLine();
        System.out.print("Digite o RG do passageiro: ");
        String rg = ler.next();
        System.out.print("Digite o identificador de bagagem do passageiro: ");
        String identificadorBagagem = ler.next();
    
        controladorPassageiro.registrarPassageiro(nome, rg, identificadorBagagem);
    }

    private void registrarTripulacao() {
        System.out.println("----- Registro de Tripulação -----");
        System.out.print("Digite o nome do tripulante: ");
        ler.nextLine();
        String nome = ler.next();
        System.out.print("Digite o RG do tripulante: ");
        String rg = ler.next();
        System.out.print("Digite a identificação aeronáutica do tripulante: ");
        String identificacaoAeronautica = ler.next();
        System.out.print("Digite a matrícula do tripulante: ");
        String matricula = ler.next();
        
        controladorTripulacao.registrarTripulacao(nome, rg, identificacaoAeronautica, matricula);
    }
}
