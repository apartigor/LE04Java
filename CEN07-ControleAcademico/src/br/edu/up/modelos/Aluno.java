package br.edu.up.modelos;
import java.util.HashMap;
import java.util.Map;

public class Aluno extends Pessoa {
    private int anoIngresso;
    private String curso;
    private String turno;
    private Map<String, Boolean> competencias;

    public Aluno(String nome, String rg, String matricula, int anoIngresso, String curso, String turno) {
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.turno = turno;
        this.competencias = new HashMap<>();
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

    public void adicionarCompetencia(String competencia, boolean atingida) {
        this.competencias.put(competencia, atingida);
    }

    public Map<String, Boolean> getCompetencias() {
        return competencias;
    }

    public String avaliarCompetencias(Disciplina disciplina) {
        int totalNecessarias = disciplina.getCompetenciasNecessarias().size();
        int totalComplementares = disciplina.getCompetenciasComplementares().size();

        int atingidasNecessarias = 0;
        int atingidasComplementares = 0;

        for (String comp : disciplina.getCompetenciasNecessarias()) {
            if (this.competencias.getOrDefault(comp, false)) {
                atingidasNecessarias++;
            }
        }

        for (String comp : disciplina.getCompetenciasComplementares()) {
            if (this.competencias.getOrDefault(comp, false)) {
                atingidasComplementares++;
            }
        }

        if (atingidasNecessarias == totalNecessarias && atingidasComplementares >= totalComplementares / 2) {
            return "Aprovado";
        } else if (atingidasNecessarias < totalNecessarias / 2 || atingidasComplementares < totalComplementares / 2) {
            return "Reprovado";
        } else {
            return "Pendente";
        }
    }
}
