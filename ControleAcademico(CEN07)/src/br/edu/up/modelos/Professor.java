package br.edu.up.modelos;

public class Professor extends Pessoa {
    private String lattesID;
    private Titulacao titulacao;

    public Professor(String nome, String rg, String matricula, String lattesID, Titulacao titulacao) {
        super(nome, rg, matricula);
        this.lattesID = lattesID;
        this.titulacao = titulacao;
    }

    public String getLattesID() {
        return lattesID;
    }

    public void setLattesID(String lattesID) {
        this.lattesID = lattesID;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

}
