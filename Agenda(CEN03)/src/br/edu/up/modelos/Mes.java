package br.edu.up.modelos;

public class Mes {
    private String nome;
    private int qtdeDias;
    private Dia[] dias;

    public Mes(String nome, int qtdeDias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {

    }

    public void excluirCompromisso(int diaMes, int hora) {

    }

    public String listarCompromisso(int diaMes) {
        return null;
    }

    public String listarCompromisso() {
        return null;
    }

}
