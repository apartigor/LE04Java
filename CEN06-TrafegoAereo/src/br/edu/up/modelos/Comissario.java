package br.edu.up.modelos;

public class Comissario extends Tripulacao {
    String[] idiomas;

    public Comissario(String nome, String rg, String identificacaoAeronautica, String matricula, Passagem passagem,
            Aeronave aeronave, String[] idiomas) {
        super(nome, rg, identificacaoAeronautica, matricula, passagem, aeronave);
        this.idiomas = idiomas;
    }

}
