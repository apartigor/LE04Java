package br.edu.up.controles;

import br.edu.up.modelos.Passageiro;
import java.util.ArrayList;

public class ControladorPassageiro {
    private ArrayList<Passageiro> passageiros;

    public ControladorPassageiro() {
        this.passageiros = new ArrayList<>();
    }

    public void registrarPassageiro(String nome, String rg, String identificadorBagagem) {
        Passageiro novoPassageiro = new Passageiro(nome, rg, identificadorBagagem, null, null);
        passageiros.add(novoPassageiro);
        System.out.println("Passageiro registrado com sucesso!");
    }

    public void listarPassageiros() {
        if (passageiros.isEmpty()) {
            System.out.println("Não há passageiros registrados.");
        } else {
            System.out.println("Passageiros registrados:");
            for (Passageiro passageiro : passageiros) {
                System.out.println("Nome: " + passageiro.getNome() + ", RG: " + passageiro.getRg() +
                        ", Identificador de bagagem: " + passageiro.getIdentificadorBagagem());
            }
        }
    }
}
