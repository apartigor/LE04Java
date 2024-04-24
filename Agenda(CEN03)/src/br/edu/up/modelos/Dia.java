package br.edu.up.modelos;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
    }

    public void adicionarCompromisso(Compromisso comp) {

    }

    public Compromisso consultarCompromisso(int hora) {
        return null;
    }

    public void excluirCompromisso(int hora) {

    }

    public String listarCompromisso() {
        return null;
    }

}
