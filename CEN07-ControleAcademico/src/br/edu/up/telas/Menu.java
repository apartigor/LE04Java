package br.edu.up.telas;

import br.edu.up.modelos.*;
import br.edu.up.controles.*;

public class Menu {
    private ControleAcademico controle;
    private VisaoAcademica visao;

    public Menu(ControleAcademico controle, VisaoAcademica visao) {
        this.controle = controle;
        this.visao = visao;
    }

    public void exibirMenu() {
        int opcaoPrincipal, opcaoSecundaria;

        do {
            visao.exibirMenuPrincipal();
            opcaoPrincipal = visao.lerOpcao();

            switch (opcaoPrincipal) {
                case 1:
                    do {
                        visao.exibirMenuPreencherDados();
                        opcaoSecundaria = visao.lerOpcao();

                        switch (opcaoSecundaria) {
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
                                if (controle.listarProfessores().isEmpty()) {
                                    visao.mostrarMensagem("Nenhum professor disponível. Inclua um professor primeiro.");
                                } else {
                                    Professor prof = controle.listarProfessores().get(0);
                                    Disciplina disciplina = visao.lerDadosDisciplina(prof);
                                    controle.incluirDisciplina(disciplina);
                                    visao.mostrarMensagem("Disciplina incluída com sucesso!");
                                }
                                break;
                            case 4:
                                if (controle.listarAlunos().isEmpty()) {
                                    visao.mostrarMensagem("Nenhum aluno disponível. Inclua um aluno primeiro.");
                                } else if (controle.listarDisciplinas().isEmpty()) {
                                    visao.mostrarMensagem(
                                            "Nenhuma disciplina disponível. Inclua uma disciplina primeiro.");
                                } else {
                                    Aluno alunoParaMatricular = controle.listarAlunos().get(0);
                                    Disciplina disciplinaParaMatricular = controle.listarDisciplinas().get(0);
                                    controle.matricularAlunoEmDisciplina(alunoParaMatricular, disciplinaParaMatricular);
                                    visao.mostrarMensagem("Aluno matriculado na disciplina com sucesso!");
                                }
                                break;
                            case 5:
                                if (controle.listarDisciplinas().isEmpty()) {
                                    visao.mostrarMensagem(
                                            "Nenhuma disciplina disponível. Inclua uma disciplina primeiro.");
                                } else {
                                    Disciplina disciplinaParaAvaliar = visao
                                            .selecionarDisciplina(controle.listarDisciplinas());
                                    controle.avaliarAlunosDisciplina(disciplinaParaAvaliar);
                                }
                                break;
                            case 6:
                                visao.mostrarMensagem("Voltando ao menu principal...");
                                break;
                            default:
                                visao.mostrarMensagem("Opção inválida!");
                                break;
                        }
                    } while (opcaoSecundaria != 6);
                    break;
                case 2:
                    do {
                        visao.exibirMenuListarDados();
                        opcaoSecundaria = visao.lerOpcao();

                        switch (opcaoSecundaria) {
                            case 1:
                                for (Aluno a : controle.listarAlunos()) {
                                    System.out.println("Nome: " + a.getNome() + ", Matrícula: " + a.getMatricula());
                                }
                                break;
                            case 2:
                                for (Professor p : controle.listarProfessores()) {
                                    System.out.println("Nome: " + p.getNome() + ", ID Lattes: " + p.getIdLattes());
                                }
                                break;
                            case 3:
                                for (Disciplina d : controle.listarDisciplinas()) {
                                    System.out.println(
                                            "Nome: " + d.getNome() + ", Identificador: " + d.getIdentificador());
                                }
                                break;
                            case 4:
                                visao.mostrarMensagem("Voltando ao menu principal...");
                                break;
                            default:
                                visao.mostrarMensagem("Opção inválida!");
                                break;
                        }
                    } while (opcaoSecundaria != 4);
                    break;
                case 3:
                    visao.mostrarMensagem("Saindo do programa...");
                    break;
                default:
                    visao.mostrarMensagem("Opção inválida!");
                    break;
            }
        } while (opcaoPrincipal != 3);
    }
}
