package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.controles.*;
import br.edu.up.modelos.Contato;

public class Menu {
    public Scanner scanner = new Scanner(System.in);;
    private Agenda agenda;

    public Menu(Agenda agenda) {
        this.agenda = agenda;
    }

    public Menu() {
    }


    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir um contato pessoal");
            System.out.println("2. Incluir um contato comercial");
            System.out.println("3. Excluir um contato pelo código");
            System.out.println("4. Consultar um contato pelo código");
            System.out.println("5. Listar todos os contatos");
            System.out.println("6. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarContatoPessoal();
                    break;
                case 2:
                    adicionarContatoComercial();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    consultarContato();
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private void adicionarContatoPessoal() {
        System.out.print("Digite o código do contato pessoal: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o nome do contato pessoal: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do contato pessoal: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite a data de aniversário do contato pessoal: ");
        String aniversario = scanner.nextLine();

        agenda.adicionarContatoPessoal(codigo, nome, telefone, aniversario);
        System.out.println("Contato pessoal adicionado com sucesso!");
    }

    private void adicionarContatoComercial() {
        System.out.print("Digite o código do contato comercial: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o nome do contato comercial: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do contato comercial: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o CNPJ do contato comercial: ");
        String cnpj = scanner.nextLine();

        agenda.adicionarContatoComercial(codigo, nome, telefone, cnpj);
        System.out.println("Contato comercial adicionado com sucesso!");
    }

    private void excluirContato() {
        System.out.print("Digite o código do contato a ser excluído: ");
        int codigo = scanner.nextInt();
        if (agenda.excluirContato(codigo)) {
            System.out.println("Contato excluído com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private void consultarContato() {
        System.out.print("Digite o código do contato a ser consultado: ");
        int codigo = scanner.nextInt();
        Contato contato = agenda.getContato(codigo);
        if (contato != null) {
            System.out.println("Informações do contato:");
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private void listarContatos() {
        String lista = agenda.listarContatos();
        if (!lista.isEmpty()) {
            System.out.println("Lista de contatos:");
            System.out.println(lista);
        } else {
            System.out.println("A agenda está vazia.");
        }
    }
}
