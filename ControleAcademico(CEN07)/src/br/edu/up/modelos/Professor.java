package br.edu.up.modelos;

public class Professor extends Pessoa {
    private String lattesID;
    private Titulacao titulacao;
    
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
