package br.edu.up.controles;

import br.edu.up.modelos.*;

public class SituacaoController {
    public static SituacaoAluno verificarSituacaoAluno(Aluno aluno, Disciplina disciplina) {
        int totalNecessarias = disciplina.getCompetenciasNecessarias().size();
        int totalComplementares = disciplina.getCompetenciasComplementares().size();
        int atingidasNecessarias = 0;
        int atingidasComplementares = 0;

        for (Competencia competencia : aluno.getCompetencias()) {
            if (disciplina.getCompetenciasNecessarias().contains(competencia)) {
                atingidasNecessarias++;
            } else if (disciplina.getCompetenciasComplementares().contains(competencia)) {
                atingidasComplementares++;
            }
        }

        double percentualNecessarias = (double) atingidasNecessarias / totalNecessarias;
        double percentualComplementares = (double) atingidasComplementares / totalComplementares;

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