package br.edu.up.modelos;

public class Professor extends Pessoa {
    private String idLattes;
    private String titulacao;
    private String instituicao;
    private int anoConclusao;
    private String tituloTrabalho;

    public Professor(String nome, String rg, String matricula, String idLattes, String titulacao, String instituicao, int anoConclusao, String tituloTrabalho) {
        super(nome, rg, matricula);
        this.idLattes = idLattes;
        this.titulacao = titulacao;
        this.instituicao = instituicao;
        this.anoConclusao = anoConclusao;
        this.tituloTrabalho = tituloTrabalho;
    }

    public String getIdLattes() {
        return idLattes;
    }

    public void setIdLattes(String idLattes) {
        this.idLattes = idLattes;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getTituloTrabalho() {
        return tituloTrabalho;
    }

    public void setTituloTrabalho(String tituloTrabalho) {
        this.tituloTrabalho = tituloTrabalho;
    }
}
