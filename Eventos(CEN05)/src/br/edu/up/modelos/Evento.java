package br.edu.up.modelos;

public class Evento {
    private String nome;
    private String dataEvento;
    private String local;
    private int lotacaoMax;
    private int qtdeIngressosVendidos;
    private double precoIngresso;

    public Evento(String nome, String dataEvento, String local, int lotacaoMax, int qtdeIngressosVendidos,
            double precoIngresso) {
        this.nome = nome;
        this.dataEvento = dataEvento;
        this.local = local;
        this.lotacaoMax = lotacaoMax;
        this.qtdeIngressosVendidos = 0;
        this.precoIngresso = precoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getdataEvento() {
        return dataEvento;
    }

    public void setdataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLotacaoMax() {
        return lotacaoMax;
    }

    public void setLotacaoMax(int lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }

    public int getQtdeIngressosVendidos() {
        return qtdeIngressosVendidos;
    }

    public void setQtdeIngressosVendidos(int qtdeIngressosVendidos) {
        this.qtdeIngressosVendidos = qtdeIngressosVendidos;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

}
