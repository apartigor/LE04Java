package br.edu.up.telas;

import java.time.LocalDate;
import java.util.Scanner;
import br.edu.up.modelos.*;

public class SeguroView {
    private Scanner scanner;

    public SeguroView() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Seguro criarSeguro() {
        System.out.println("Selecione o tipo de seguro:");
        System.out.println("1. Seguro de Vida");
        System.out.println("2. Seguro de Veículo");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Informe o número da apólice: ");
        String apolice = scanner.nextLine();
        System.out.print("Informe o nome do segurado: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o RG do segurado: ");
        String RG = scanner.nextLine();
        System.out.print("Informe o CPF do segurado: ");
        String CPF = scanner.nextLine();
        System.out.print("Informe o sexo do segurado (M/F): ");
        char sexoChar = scanner.nextLine().charAt(0);
        Sexo sexo = sexoChar == 'M' ? Sexo.MASCULINO : Sexo.FEMININO;
        System.out.print("Informe o telefone do segurado: ");
        String telefone = scanner.nextLine();
        System.out.print("Informe o endereço do segurado: ");
        String endereco = scanner.nextLine();
        System.out.print("Informe o CEP do segurado: ");
        String CEP = scanner.nextLine();
        System.out.print("Informe a cidade do segurado: ");
        String cidade = scanner.nextLine();
        System.out.print("Informe o valor da apólice: ");
        double vlrApolice = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Informe a data de início (yyyy-mm-dd): ");
        LocalDate dtInicio = LocalDate.parse(scanner.nextLine());
        System.out.print("Informe a data de fim (yyyy-mm-dd): ");
        LocalDate dtFim = LocalDate.parse(scanner.nextLine());

        Segurado segurado = new Segurado();
        segurado.setNome(nome);
        segurado.setRG(RG);
        segurado.setCPF(CPF);
        segurado.setSexo(sexo);
        segurado.setTelefone(telefone);
        segurado.setEndereco(endereco);
        segurado.setCEP(CEP);
        segurado.setCidade(cidade);

        if (tipo == 1) {
            SeguroVida seguroVida = new SeguroVida();
            seguroVida.setApolice(apolice);
            seguroVida.setSegurado(segurado);
            seguroVida.setVlrApolice(vlrApolice);
            seguroVida.setDtInicio(dtInicio);
            seguroVida.setDtFim(dtFim);
            System.out.print("Cobre doença (true/false): ");
            seguroVida.setCobreDoenca(scanner.nextBoolean());
            System.out.print("Cobre acidente (true/false): ");
            seguroVida.setCobreAcidente(scanner.nextBoolean());
            return seguroVida;
        } else if (tipo == 2) {
            SeguroVeiculo seguroVeiculo = new SeguroVeiculo();
            seguroVeiculo.setApolice(apolice);
            seguroVeiculo.setSegurado(segurado);
            seguroVeiculo.setVlrApolice(vlrApolice);
            seguroVeiculo.setDtInicio(dtInicio);
            seguroVeiculo.setDtFim(dtFim);
            System.out.print("Informe o valor da franquia: ");
            seguroVeiculo.setVlrFranquia(scanner.nextDouble());
            System.out.print("Tem carro reserva (true/false): ");
            seguroVeiculo.setTemCarroReserva(scanner.nextBoolean());
            System.out.print("Cobre vidros (true/false): ");
            seguroVeiculo.setCobreVidros(scanner.nextBoolean());
            return seguroVeiculo;
        } else {
            System.out.println("Tipo de seguro inválido.");
            return null;
        }
    }

    public String pedirApolice() {
        System.out.print("Informe o número da apólice: ");
        return scanner.next();
    }

    public void mostrarSeguro(Seguro seguro) {
        if (seguro != null) {
            System.out.println(seguro.getDados());
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
