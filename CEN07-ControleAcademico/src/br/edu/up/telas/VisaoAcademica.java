package br.edu.up.telas;

import br.edu.up.modelos.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class VisaoAcademica {
    private Scanner scanner;

    public VisaoAcademica() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        System.out.println("Menu de Controle Acadêmico:");
        System.out.println("1. Preencher Dados");
        System.out.println("2. Listar Dados");
        System.out.println("3. Sair");
        System.out.print("\n\n\n\n\n");
    }

    public void exibirMenuPreencherDados() {
        System.out.println("Preencher Dados:");
        System.out.println("1. Incluir aluno");
        System.out.println("2. Incluir professor");
        System.out.println("3. Incluir disciplina");
        System.out.println("4. Matricular aluno em disciplina");
        System.out.println("5. Avaliar alunos de uma disciplina");
        System.out.println("6. Voltar");
        System.out.print("\n\n\n\n\n");
    }

    public void exibirMenuListarDados() {
        System.out.println("Listar Dados:");
        System.out.println("1. Listar alunos");
        System.out.println("2. Listar professores");
        System.out.println("3. Listar disciplinas");
        System.out.println("4. Voltar");
        System.out.print("\n\n\n\n\n");
    }

    public int lerOpcao() {
        try {
            System.out.print("Escolha uma opção: ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            scanner.nextLine();
            return lerOpcao();
        }
    }

    public Aluno lerDadosAluno() {
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Ano de ingresso: ");
        int anoIngresso = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        System.out.print("Turno: ");
        String turno = scanner.nextLine();
        return new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
    }

    public Professor lerDadosProfessor() {
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("ID Lattes: ");
        String idLattes = scanner.nextLine();
        System.out.print("Titulação: ");
        String titulacao = scanner.nextLine();
        System.out.print("Instituição: ");
        String instituicao = scanner.nextLine();
        System.out.print("Ano de conclusão: ");
        int anoConclusao = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Título do trabalho: ");
        String tituloTrabalho = scanner.nextLine();
        return new Professor(nome, rg, matricula, idLattes, titulacao, instituicao, anoConclusao, tituloTrabalho);
    }

    public Disciplina lerDadosDisciplina(Professor professor) {
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Identificador: ");
        String identificador = scanner.nextLine();
        System.out.print("Currículo: ");
        String curriculo = scanner.nextLine();
        return new Disciplina(nome, identificador, curriculo, professor);
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public Disciplina selecionarDisciplina(ArrayList<Disciplina> disciplinas) {
        System.out.println("Selecione a disciplina:");
        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println((i + 1) + ". " + disciplinas.get(i).getNome());
        }
        int opcao = scanner.nextInt();
        return disciplinas.get(opcao - 1);
    }
}
