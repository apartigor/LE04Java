package br.edu.up.modelos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
    }

    public void adicionarMes(Mes mes) {
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {

    }

    public String listarCompromissos(String nomeMes) {
        return null;
    }

    public String listarCompromissos() {

        return null;
    }
}
