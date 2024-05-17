package br.edu.up.modelos;

public class SeguroVeiculo extends Seguro {
    private String marcaVeiculo;
    private String modeloVeiculo;
    private int anoVeiculo;

    public SeguroVeiculo(String numeroApolice, double valorSeguro, String nomeSegurado, String marcaVeiculo,
            String modeloVeiculo, int anoVeiculo) {
        super(numeroApolice, valorSeguro, nomeSegurado);
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoVeiculo = anoVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    @Override
    public double calcularPremio() {
        return getValorSeguro() * 0.05 + (2024 - anoVeiculo) * 0.01;
    }
}
