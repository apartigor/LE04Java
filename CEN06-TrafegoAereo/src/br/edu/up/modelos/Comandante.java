package br.edu.up.modelos;

public class Comandante extends Tripulacao {
    int totalHorasVoo;

    public Comandante(String nome, String rg, String identificacaoAeronautica, String matricula, Passagem passagem,
            Aeronave aeronave, int totalHorasVoo) {
        super(nome, rg, identificacaoAeronautica, matricula, passagem, aeronave);
        this.totalHorasVoo = totalHorasVoo;
    }

    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }

    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    }

}
