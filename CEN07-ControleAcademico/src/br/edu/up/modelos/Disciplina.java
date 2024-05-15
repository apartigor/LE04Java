package br.edu.up.modelos;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private ArrayList<String> competenciasNecessarias;
    private ArrayList<String> competenciasComplementares;
    private Professor professor;
    private ArrayList<Aluno> alunosMatriculados;

    public Disciplina(String nome, String identificador, String curriculo, Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.competenciasNecessarias = new ArrayList<>();
        this.competenciasComplementares = new ArrayList<>();
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public ArrayList<String> getCompetenciasNecessarias() {
        return competenciasNecessarias;
    }

    public void adicionarCompetenciaNecessaria(String competencia) {
        this.competenciasNecessarias.add(competencia);
    }

    public ArrayList<String> getCompetenciasComplementares() {
        return competenciasComplementares;
    }

    public void adicionarCompetenciaComplementar(String competencia) {
        this.competenciasComplementares.add(competencia);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void matricularAluno(Aluno aluno) {
        this.alunosMatriculados.add(aluno);
    }

    public void avaliarAluno(Aluno aluno) {
        String situacao = aluno.avaliarCompetencias(this);
        System.out.println("Aluno: " + aluno.getNome() + " - Situação: " + situacao);
    }
}
