package br.edu.up.modelos;

public class Competencia {
    private String descricao;
    private SituacaoCompetencia situacao;
    private TipoCompetencia tipo;

    public Competencia(String descricao, TipoCompetencia tipo, SituacaoCompetencia situacao) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.situacao = situacao;
    }

    public TipoCompetencia getTipo() {
        return tipo;
    }

    public void setTipo(TipoCompetencia tipo) {
        this.tipo = tipo;
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

    public enum TipoCompetencia {
        NECESSARIA,
        COMPLEMENTAR
    }

}
