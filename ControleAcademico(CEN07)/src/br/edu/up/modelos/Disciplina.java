package br.edu.up.modelos;

import java.util.List;
import java.util.Set;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private Professor professor;
    private List<Aluno> alunos;
    private Set<Competencia> competencias;
    
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
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public Set<Competencia> getCompetencias() {
        return competencias;
    }
    public void setCompetencias(Set<Competencia> competencias) {
        this.competencias = competencias;
    }

    
}

