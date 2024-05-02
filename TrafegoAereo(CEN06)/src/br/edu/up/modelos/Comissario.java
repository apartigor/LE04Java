package br.edu.up.modelos;

public class Comissario extends Tripulacao {
    String[] idiomas;

    public Comissario(String nome, String rg, String identificacaoAeronautica, String matricula, String[] idiomas) {
        super(nome, rg, identificacaoAeronautica, matricula);
        this.idiomas = idiomas;
    }

}
