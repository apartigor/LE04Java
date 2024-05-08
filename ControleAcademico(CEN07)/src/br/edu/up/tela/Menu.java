package br.edu.up.tela;

import br.edu.up.modelos.*;
import br.edu.up.controles.*;
import java.util.Scanner;

public class Menu {
    ProfessorController professorController = new ProfessorController();
    AlunoController alunoController = new AlunoController();
    DisciplinaController disciplinaController = new DisciplinaController();

    private Scanner scanner = new Scanner(System.in);

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    int opcao;

    public void exibirMenuPrincipal(){
    do
    {
        System.out.println("=== Menu Principal ===");
        System.out.println("1. Cadastrar Professor");
        System.out.println("2. Cadastrar Aluno");
        System.out.println("3. Cadastrar Disciplina");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                // professorController.cadastrarProfessor();
                break;
            case 2:
                // alunoController.cadastrarAluno().
                break;
            case 3:
                // disciplinaController.cadastrarDisciplina();
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }while(opcao!=0);

}
}