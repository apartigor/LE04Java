package br.edu.up.tela;
import br.edu.up.modelos.*;
import br.edu.up.controles.*;
import java.util.Scanner;

public class Menu {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        ProfessorController professorController = new ProfessorController();
        AlunoController alunoController = new AlunoController();
        DisciplinaController disciplinaController = new DisciplinaController();

        int opcao;
        do {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Cadastrar Aluno");
            System.out.println("3. Cadastrar Disciplina");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarProfessor(scanner, professorController);
                    break;
                case 2:
                    cadastrarAluno(scanner, alunoController);
                    break;
                case 3:
                    cadastrarDisciplina(scanner, disciplinaController);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarProfessor(Scanner scanner, ProfessorController professorController) {
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
    
        professorController.cadastrarProfessor(nome, rg, matricula, lattesID, titulacao);
    }

    private static void cadastrarAluno(Scanner scanner, AlunoController alunoController) {
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
        alunoController.cadastrarAluno(nome, rg, matricula, anoIngresso, curso, turno);
    }

    private static void cadastrarDisciplina(Scanner scanner, DisciplinaController disciplinaController) {
    
        System.out.println("=== Cadastro de Disciplina ===");
        System.out.println("Funcionalidade não implementada ainda.");
    }
}

