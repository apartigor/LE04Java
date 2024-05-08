package br.edu.up.controles;

import br.edu.up.modelos.*;
import java.util.Scanner;

public class AlunoController {

    private void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Cadastro de Aluno ===");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("RG: ");
        String rg = scanner.next();
        System.out.print("Matrícula: ");
        String matricula = scanner.next();
        System.out.print("Ano de Ingresso: ");
        int anoIngresso = scanner.nextInt();
        System.out.print("Curso: ");
        String curso = scanner.next();
        System.out.print("Turno: ");
        String turno = scanner.next();
    }
}
