package br.edu.up.controles;

import br.edu.up.modelos.Tripulacao;
import java.util.ArrayList;

public class ControladorTripulacao {
    private ArrayList<Tripulacao> tripulacao;

    public ControladorTripulacao() {
        this.tripulacao = new ArrayList<>();
    }

    public void registrarTripulacao(String nome, String rg, String identificacaoAeronautica, String matricula) {
        Tripulacao novoTripulante = new Tripulacao(nome, rg, identificacaoAeronautica, matricula, null, null);
        tripulacao.add(novoTripulante);
        System.out.println("Tripulante registrado com sucesso!");
    }

    public void listarTripulacao() {
        if (tripulacao.isEmpty()) {
            System.out.println("Não há tripulantes registrados.");
        } else {
            System.out.println("Tripulação registrada:");
            for (Tripulacao tripulante : tripulacao) {
                System.out.println("Nome: " + tripulante.getNome() + ", RG: " + tripulante.getRg() +
                        ", Identificação aeronáutica: " + tripulante.getIdentificacaoAeronautica() +
                        ", Matrícula: " + tripulante.getMatricula());
            }
        }
    }
}
