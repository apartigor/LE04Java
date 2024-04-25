package br.edu.up.modelos;

public class Dia {
    private int dia;
    private Compromisso[] compromissos;

    public Dia(int dia) {
        this.dia = dia;
        compromissos = new Compromisso[24];
    }

    public Compromisso[] getCompromissos() {
        return compromissos;
    }

    public void adicionarCompromisso(Compromisso comp, int hora) {
        compromissos[hora] = comp;
    }

    public void excluirCompromisso(int hora) {
        
    }

    public String listarCompromisso() {

        return;
    }
}
