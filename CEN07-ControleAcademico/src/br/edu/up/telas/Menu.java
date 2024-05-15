package br.edu.up.telas;

import br.edu.up.modelos.*;
import br.edu.up.controles.*;

public class Menu {
    public static void main(String[] args) {
        ControleAcademico controle = new ControleAcademico();
        VisaoAcademica visao = new VisaoAcademica();
        int opcao;

        do {
            visao.exibirMenu();
            opcao = visao.lerOpcao();

            switch (opcao) {
                case 1:
                    Aluno aluno = visao.lerDadosAluno();
                    controle.incluirAluno(aluno);
                    visao.mostrarMensagem("Aluno incluído com sucesso!");
                    break;
                case 2:
                    Professor professor = visao.lerDadosProfessor();
                    controle.incluirProfessor(professor);
                    visao.mostrarMensagem("Professor incluído com sucesso!");
                    break;
                case 3:
                    Professor prof = controle.listarProfessores().get(0);
                    Disciplina disciplina = visao.lerDadosDisciplina(prof);
                    controle.incluirDisciplina(disciplina);
                    visao.mostrarMensagem("Disciplina incluída com sucesso!");
                    break;
                case 4:
                    for (Aluno a : controle.listarAlunos()) {
                        System.out.println("Nome: " + a.getNome() + ", Matrícula: " + a.getMatricula());
                    }
                    break;
                case 5:
                    for (Professor p : controle.listarProfessores()) {
                        System.out.println("Nome: " + p.getNome() + ", ID Lattes: " + p.getIdLattes());
                    }
                    break;
                case 6:
                    for (Disciplina d : controle.listarDisciplinas()) {
                        System.out.println("Nome: " + d.getNome() + ", Identificador: " + d.getIdentificador());
                    }
                    break;
                case 7:
                    Aluno alunoParaMatricular = controle.listarAlunos().get(0); // Para simplificação, estamos pegando o primeiro aluno
                    Disciplina disciplinaParaMatricular = controle.listarDisciplinas().get(0); // Para simplificação, estamos pegando a primeira disciplina
                    controle.matricularAlunoEmDisciplina(alunoParaMatricular, disciplinaParaMatricular);
                    visao.mostrarMensagem("Aluno matriculado na disciplina com sucesso!");
                    break;
                case 8:
                    visao.mostrarMensagem("Saindo do programa...");
                    break;
                default:
                    visao.mostrarMensagem("Opção inválida!");
                    break;
            }
        } while (opcao != 8);
    }
}
