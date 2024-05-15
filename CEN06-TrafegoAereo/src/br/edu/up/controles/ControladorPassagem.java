package br.edu.up.controles;

import br.edu.up.modelos.Passagem;
import br.edu.up.modelos.Data;
import java.util.ArrayList;

public class ControladorPassagem {
    private ArrayList<Passagem> passagens;

    public ControladorPassagem() {
        this.passagens = new ArrayList<>();
    }

    public void registrarPassagem(int numeroAssento, String classeAssento, Data dataVoo) {
        Passagem novaPassagem = new Passagem();
        novaPassagem.setNumeroAssento(numeroAssento);
        novaPassagem.setClasseAssento(classeAssento);
        novaPassagem.setDataVoo(dataVoo);
        passagens.add(novaPassagem);
        System.out.println("Passagem registrada com sucesso!");
    }

    public void listarPassagens() {
        if (passagens.isEmpty()) {
            System.out.println("Não há passagens registradas.");
        } else {
            System.out.println("Passagens registradas:");
            for (Passagem passagem : passagens) {
                System.out.println("Número do assento: " + passagem.getNumeroAssento() +
                        ", Classe do assento: " + passagem.getClasseAssento() +
                        ", Data do voo: " + passagem.getDataVoo());
            }
        }
    }
}
