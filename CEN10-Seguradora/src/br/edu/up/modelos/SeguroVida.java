package br.edu.up.modelos;

public class SeguroVida extends Seguro {
    private int idadeSegurado;
    private double valorCobertura;

    public SeguroVida(String numeroApolice, double valorSeguro, String nomeSegurado, int idadeSegurado,
            double valorCobertura) {
        super(numeroApolice, valorSeguro, nomeSegurado);
        this.idadeSegurado = idadeSegurado;
        this.valorCobertura = valorCobertura;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }

    public double getValorCobertura() {
        return valorCobertura;
    }

    public void setValorCobertura(double valorCobertura) {
        this.valorCobertura = valorCobertura;
    }

    @Override
    public double calcularPremio() {
        return getValorSeguro() * 0.1 + valorCobertura * 0.02;
    }
}
