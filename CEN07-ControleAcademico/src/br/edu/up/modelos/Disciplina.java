package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private Professor professor;
    private List<Aluno> alunos;
    private Set<Competencia> competencias;
    private Map<Aluno, Map<Competencia, Competencia.SituacaoCompetencia>> situacaoAlunos;

    public Disciplina() {
        situacaoAlunos = new HashMap<>();
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

    public void matricularAluno(Aluno aluno) {
        situacaoAlunos.put(aluno, new HashMap<>());
    }

    public void registrarSituacaoAluno(Aluno aluno, Competencia competencia, Competencia.SituacaoCompetencia situacao) {
        Map<Competencia, Competencia.SituacaoCompetencia> situacoes = situacaoAlunos.get(aluno);
        if (situacoes != null) {
            situacoes.put(competencia, situacao);
        }
    }

    public Map<Aluno, Map<Competencia, Competencia.SituacaoCompetencia>> getSituacaoAlunos() {
        return situacaoAlunos;
    }
}
