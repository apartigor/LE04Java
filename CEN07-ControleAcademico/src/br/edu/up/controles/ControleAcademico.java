package br.edu.up.controles;

import br.edu.up.modelos.*;

import java.util.ArrayList;

public class ControleAcademico {
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;

    public ControleAcademico() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void incluirProfessor(Professor professor) {
        professores.add(professor);
    }

    public void incluirDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public ArrayList<Aluno> listarAlunos() {
        return alunos;
    }

    public ArrayList<Professor> listarProfessores() {
        return professores;
    }

    public ArrayList<Disciplina> listarDisciplinas() {
        return disciplinas;
    }

    public void matricularAlunoEmDisciplina(Aluno aluno, Disciplina disciplina) {
        disciplina.matricularAluno(aluno);
    }

    public void avaliarAlunosDisciplina(Disciplina disciplina) {
        for (Aluno aluno : disciplina.getAlunosMatriculados()) {
            disciplina.avaliarAluno(aluno);
        }
    }
}
