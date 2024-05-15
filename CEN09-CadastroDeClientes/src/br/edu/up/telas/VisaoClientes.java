package br.edu.up.telas;

import br.edu.up.modelos.*;
import java.util.Scanner;

public class VisaoClientes {
    private Scanner scanner;

    public VisaoClientes() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("Menu de Cadastro de Clientes:");
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Mostrar dados cliente pessoa");
        System.out.println("4. Mostrar dados cliente empresa");
        System.out.println("5. Emprestar para cliente pessoa");
        System.out.println("6. Emprestar para cliente empresa");
        System.out.println("7. Devolução de cliente pessoa");
        System.out.println("8. Devolução de cliente empresa");
        System.out.println("9. Sair");
    }

    public int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public ClientePessoa lerDadosClientePessoa() {
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        return new ClientePessoa(nome, codigo);
    }

    public ClienteEmpresa lerDadosClienteEmpresa() {
        scanner.nextLine(); 
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        return new ClienteEmpresa(nome, codigo);
    }

    public void mostrarDadosCliente(Cliente cliente) {
        if (cliente != null) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Código: " + cliente.getCodigo());
            System.out.println("Tipo: " + cliente.getTipo());
            System.out.println("Valor emprestado: " + cliente.getVlrEmprestado());
            System.out.println("Crédito máximo: " + cliente.getMaxCredito());
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public String lerCodigoCliente() {
        scanner.nextLine();
        System.out.print("Informe o código do cliente: ");
        return scanner.nextLine();
    }

    public double lerValor() {
        System.out.print("Informe o valor: ");
        return scanner.nextDouble();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
