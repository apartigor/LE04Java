package br.edu.up.controles;

import java.util.Scanner;

import br.edu.up.modelos.*;

public class ProfessorController {

    private static void cadastrarProfessor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Cadastro de Professor ===");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("RG: ");
        String rg = scanner.next();
        System.out.print("Matrícula: ");
        String matricula = scanner.next();
        System.out.print("Lattes ID: ");
        String lattesID = scanner.next();

        Titulacao titulacao = new Titulacao();

    }

}
