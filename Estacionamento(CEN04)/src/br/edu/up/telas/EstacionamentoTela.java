package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.modelos.Carro;

public class EstacionamentoTela {
    public void menu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1. Entrada de carro");
        System.out.println("2. Saída de carro");
        System.out.println("3. Emitir relatório");
        System.out.println("4. Sair");
    }

    public Carro receberDadosCarro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInforme os dados do carro:");
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Placa: ");
        String placa = sc.nextLine();
        System.out.print("Cor: ");
        String cor = sc.nextLine();
        return new Carro(modelo, placa, cor);
    }

    public String receberPlaca() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInforme a placa do carro:");
        return sc.nextLine();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
