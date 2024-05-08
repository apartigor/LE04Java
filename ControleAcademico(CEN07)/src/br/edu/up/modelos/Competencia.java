package br.edu.up.modelos;

public class Competencia {
    private String descricao;
    private SituacaoCompetencia situacao;

    public Competencia(String descricao, SituacaoCompetencia situacao) {
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public SituacaoCompetencia getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoCompetencia situacao) {
        this.situacao = situacao;
    }

    public enum SituacaoCompetencia {
        ATINGIDA,
        NAO_ATINGIDA
    }

}
