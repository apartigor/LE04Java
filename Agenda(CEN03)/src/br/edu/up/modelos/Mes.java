package br.edu.up.modelos;

public class Mes {
    private int nome;
    private int qtdeDias;
    private Dia[]dias;

    public Mes(int nome, int qtdeDias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
    }

    public void adicionarCompromisso(Compromisso comp, Dia[]dias) {

    }
    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {

    }

    public void excluirCompromisso(int diaMes, int hora) {

    }

    public String listarCompromisso(int diaMes) {
        return;
    }

    public String listarCompromisso() {
        return;
    }
}
