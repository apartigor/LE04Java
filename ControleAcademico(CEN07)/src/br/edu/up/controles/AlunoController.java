package br.edu.up.controles;

import br.edu.up.modelos.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoController {
    private List<Aluno> alunos;

    public AlunoController() {
        this.alunos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("=== Lista de Alunos ===");
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("RG: " + aluno.getRg());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("Turno: " + aluno.getTurno());
                System.out.println("------------------------");
            }
        }
    }

}
