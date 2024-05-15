package br.edu.up.modelos;

public abstract class Seguro {
    private String numeroApolice;
    private double valorSeguro;
    private String nomeSegurado;

    public Seguro(String numeroApolice, double valorSeguro, String nomeSegurado) {
        this.numeroApolice = numeroApolice;
        this.valorSeguro = valorSeguro;
        this.nomeSegurado = nomeSegurado;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public abstract double calcularPremio();
}
