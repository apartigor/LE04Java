package br.edu.up.telas;

import br.edu.up.modelos.*;
import br.edu.up.controles.*;
import java.util.Scanner;

public class Menu {
    private AlunoController alunoController;
    private ProfessorController professorController;
    private DisciplinaController disciplinaController;

    private Scanner scanner;

    public Menu() {
        alunoController = new AlunoController();
        professorController = new ProfessorController();
        disciplinaController = new DisciplinaController();
        scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Cadastros");
            System.out.println("2. Listagem");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirMenuCadastro();
                    break;
                case 2:
                    exibirMenuListagem();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void exibirMenuCadastro() {
        int opcao;
        do {
            System.out.println("=== Menu de Cadastros ===");
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Cadastrar Aluno");
            System.out.println("3. Cadastrar Disciplina");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarProfessor();
                    break;
                case 2:
                    cadastrarAluno();
                    break;
                case 3:
                    cadastrarDisciplina();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void exibirMenuListagem() {
        int opcao;
        do {
            System.out.println("=== Menu de Listagem ===");
            System.out.println("1. Listar Professores");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Listar Disciplinas");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    professorController.listarProfessores();
                    break;
                case 2:
                    alunoController.listarAlunos();
                    break;
                case 3:
                    disciplinaController.listarDisciplinas();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public void cadastrarProfessor() {
        System.out.println("=== Cadastro de Professor ===");
        System.out.print("Nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.next();
        scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.next();
        scanner.nextLine();
        System.out.print("Lattes ID: ");
        String lattesID = scanner.next();
        System.out.print("Instituição de Titulação: ");
        String instituicao = scanner.next();
        System.out.print("Título obtido: ");
        String tituloObtido = scanner.next();
        System.out.print("Título do trabalho de conclusão: ");
        String tituloTrabalho = scanner.next();
        System.out.print("Ano de conclusão da Titulação: ");
        int anoConclusao = scanner.nextInt();

        Titulacao titulacao = new Titulacao(instituicao, anoConclusao, tituloObtido, tituloTrabalho);
        Professor professor = new Professor(nome, rg, matricula, lattesID, titulacao);

        professorController.cadastrarProfessor(professor);
    }

    public void cadastrarAluno() {
        System.out.println("=== Cadastro de Aluno ===");
        System.out.print("Nome: ");
        scanner.nextLine(); 
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.next();
        scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.next();
        scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        System.out.print("Turno: ");
        String turno = scanner.next();
        System.out.print("Ano de Ingresso: ");
        int anoIngresso = scanner.nextInt();

        Aluno aluno = new Aluno(nome, rg, matricula, anoIngresso, curso, turno);

        alunoController.cadastrarAluno(aluno);
    }

    public void cadastrarDisciplina() {
        System.out.println("=== Cadastro de Disciplina ===");
        System.out.print("Nome: ");
        scanner.nextLine(); 
        String nome = scanner.nextLine();
        System.out.print("Identificador: ");
        String identificador = scanner.next();
        scanner.nextLine();
        System.out.print("Currículo: ");
        String curriculo = scanner.nextLine();

        System.out.println("=== Professores cadastrados ===");
        professorController.listarProfessores();

        System.out.print("Selecione o ID do professor: ");
        int idProfessor = scanner.nextInt();
        Professor professorSelecionado = professorController.buscarProfessorPorId(idProfessor);

        if (professorSelecionado == null) {
            System.out.println("Professor não encontrado.");
            return;
        }

        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);
        disciplina.setIdentificador(identificador);
        disciplina.setCurriculo(curriculo);
        disciplina.setProfessor(professorSelecionado);

        disciplinaController.cadastrarDisciplina(disciplina);
    }
}
