package br.edu.up.modelos;

public class Titulacao {
    private String instituicao;
    private int anoConclusao;
    private String tituloObtido;
    private String tituloTrabalho;

    public Titulacao(String instituicao, int anoConclusao, String tituloObtido, String tituloTrabalho) {
        this.instituicao = instituicao;
        this.anoConclusao = anoConclusao;
        this.tituloObtido = tituloObtido;
        this.tituloTrabalho = tituloTrabalho;
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

    public String getTituloObtido() {
        return tituloObtido;
    }

    public void setTituloObtido(String tituloObtido) {
        this.tituloObtido = tituloObtido;
    }

    public String getTituloTrabalho() {
        return tituloTrabalho;
    }

    public void setTituloTrabalho(String tituloTrabalho) {
        this.tituloTrabalho = tituloTrabalho;
    }
}
