package br.edu.up.telas;

import java.util.Scanner;
import br.edu.up.modelos.*;

public class SeguroView {
    private Scanner scanner;

    public SeguroView() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("Menu de Opções:");
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
    }

    public int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Seguro solicitarDadosSeguro() {
        System.out.print("Digite o tipo de seguro (1 - Vida, 2 - Veículo): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Número da apólice: ");
        String numeroApolice = scanner.nextLine();
        System.out.print("Valor do seguro: ");
        double valorSeguro = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Nome do segurado: ");
        String nomeSegurado = scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Idade do segurado: ");
            int idadeSegurado = scanner.nextInt();
            System.out.print("Valor de cobertura: ");
            double valorCobertura = scanner.nextDouble();
            return new SeguroVida(numeroApolice, valorSeguro, nomeSegurado, idadeSegurado, valorCobertura);
        } else {
            System.out.print("Marca do veículo: ");
            String marcaVeiculo = scanner.nextLine();
            System.out.print("Modelo do veículo: ");
            String modeloVeiculo = scanner.nextLine();
            System.out.print("Ano do veículo: ");
            int anoVeiculo = scanner.nextInt();
            return new SeguroVeiculo(numeroApolice, valorSeguro, nomeSegurado, marcaVeiculo, modeloVeiculo, anoVeiculo);
        }
    }

    public void mostrarSeguro(Seguro seguro) {
        System.out.println("Número da apólice: " + seguro.getNumeroApolice());
        System.out.println("Valor do seguro: " + seguro.getValorSeguro());
        System.out.println("Nome do segurado: " + seguro.getNomeSegurado());
        System.out.println("Prêmio do seguro: " + seguro.calcularPremio());

        if (seguro instanceof SeguroVida) {
            SeguroVida seguroVida = (SeguroVida) seguro;
            System.out.println("Idade do segurado: " + seguroVida.getIdadeSegurado());
            System.out.println("Valor de cobertura: " + seguroVida.getValorCobertura());
        } else if (seguro instanceof SeguroVeiculo) {
            SeguroVeiculo seguroVeiculo = (SeguroVeiculo) seguro;
            System.out.println("Marca do veículo: " + seguroVeiculo.getMarcaVeiculo());
            System.out.println("Modelo do veículo: " + seguroVeiculo.getModeloVeiculo());
            System.out.println("Ano do veículo: " + seguroVeiculo.getAnoVeiculo());
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
