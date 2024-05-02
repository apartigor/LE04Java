package br.edu.up.modelos;

public class Reserva {
    private String nomeResponsavel;
    private int qtdePessoas;
    private String dataReserva;
    private double valorTotal;

    public Reserva(String nomeResponsavel, int qtdePessoas, String dataReserva, double valorTotal) {
        this.nomeResponsavel = nomeResponsavel;
        this.qtdePessoas = qtdePessoas;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    

}
