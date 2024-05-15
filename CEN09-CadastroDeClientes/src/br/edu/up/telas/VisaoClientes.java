package br.edu.up.telas;

import br.edu.up.modelos.*;
import java.util.Scanner;

public class VisaoClientes {
    private Scanner scanner;
    

    public VisaoClientes() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        System.out.println("Menu de Cadastro de Clientes:");
        System.out.println("1. Incluir");
        System.out.println("2. Mostrar Dados");
        System.out.println("3. Empréstimo");
        System.out.println("4. Devolução");
        System.out.println("5. Sair");
    }

    public void exibirMenuIncluir() {
        System.out.println("INCLUIR:");
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Voltar");
    }

    public void exibirMenuMostrarDados() {
        System.out.println("MOSTRAR DADOS:");
        System.out.println("1. Mostrar dados cliente pessoa");
        System.out.println("2. Mostrar dados cliente empresa");
        System.out.println("3. Voltar");
    }

    public void exibirMenuEmprestimo() {
        System.out.println("EMPRÉSTIMO:");
        System.out.println("1. Emprestar para cliente pessoa");
        System.out.println("2. Emprestar para cliente empresa");
        System.out.println("3. Voltar");
    }

    public void exibirMenuDevolucao() {
        System.out.println("DEVOLUÇÃO:");
        System.out.println("1. Devolução de cliente pessoa");
        System.out.println("2. Devolução de cliente empresa");
        System.out.println("3. Voltar");
    }

    public int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public ClientePessoa lerDadosClientePessoa() {
        scanner.nextLine();  
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        Endereco endereco = lerEndereco();
        System.out.print("CPF: ");
        String CPF = scanner.nextLine();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Código do cliente: ");
        String codigo = scanner.next();
        return new ClientePessoa(nome, telefone, email, endereco, 10000.0, CPF, peso, altura, codigo);
    }

    public ClienteEmpresa lerDadosClienteEmpresa() {
        scanner.nextLine();  
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        Endereco endereco = lerEndereco();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Inscrição Estadual: ");
        String inscEstadual = scanner.nextLine();
        System.out.print("Ano de Fundação: ");
        int anoFundacao = scanner.nextInt();
        System.out.print("Código do cliente: ");
        String codigo = scanner.next();
        return new ClienteEmpresa(nome, telefone, email, endereco, 25000.0, cnpj, inscEstadual, anoFundacao, codigo);
    }

    public Endereco lerEndereco() {
        scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        Cidade cidade = lerCidade();
        return new Endereco(rua, numero, bairro, cep, cidade);
    }

    public Cidade lerCidade() {
        System.out.print("Cidade: ");
        String nome = scanner.nextLine();
        System.out.print("UF: ");
        String UF = scanner.nextLine();
        return new Cidade(nome, UF);
    }

    public void mostrarDadosCliente(Cliente cliente) {
        if (cliente != null) {
            System.out.println(cliente.toString());
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
