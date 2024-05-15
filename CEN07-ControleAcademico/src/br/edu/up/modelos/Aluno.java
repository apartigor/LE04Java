package br.edu.up.modelos;

import br.edu.up.modelos.*;
import br.edu.up.modelos.Competencia.*;

import java.util.List;

public class Aluno extends Pessoa {
    private int anoIngresso;
    private String curso;
    private String turno;
    private List<Competencia> competencias;

    public Aluno(String nome, String rg, String matricula, int anoIngresso, String curso, String turno) {
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.turno = turno;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }

    public SituacaoAluno calcularSituacao() {
        long totalNecessarias = competencias.stream()
                .filter(comp -> comp.getTipo() == TipoCompetencia.NECESSARIA)
                .count();
        long atingidasNecessarias = competencias.stream()
                .filter(comp -> comp.getTipo() == TipoCompetencia.NECESSARIA && comp.getSituacao() == SituacaoCompetencia.ATINGIDA)
                .count();
        long totalComplementares = competencias.stream()
                .filter(comp -> comp.getTipo() == TipoCompetencia.COMPLEMENTAR)
                .count();
        long atingidasComplementares = competencias.stream()
                .filter(comp -> comp.getTipo() == TipoCompetencia.COMPLEMENTAR && comp.getSituacao() == SituacaoCompetencia.ATINGIDA)
                .count();

        if (totalNecessarias == 0 || totalComplementares == 0) {
            return SituacaoAluno.PENDENTE;
        }

        double percentualNecessarias = ((double) atingidasNecessarias) / totalNecessarias;
        double percentualComplementares = ((double) atingidasComplementares) / totalComplementares;

        if (percentualNecessarias == 1.0 && percentualComplementares >= 0.5) {
            return SituacaoAluno.APROVADO;
        } else if (percentualNecessarias < 0.5 || percentualComplementares < 0.5) {
            return SituacaoAluno.REPROVADO;
        } else {
            return SituacaoAluno.PENDENTE;
        }
    }

    public enum SituacaoAluno {
        APROVADO,
        REPROVADO,
        PENDENTE
    }
}
