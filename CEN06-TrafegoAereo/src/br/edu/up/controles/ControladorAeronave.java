package br.edu.up.controles;

import br.edu.up.modelos.Aeronave;
import java.util.ArrayList;

public class ControladorAeronave {
    private ArrayList<Aeronave> aeronaves;

    public ControladorAeronave() {
        this.aeronaves = new ArrayList<>();
    }

    public void registrarAeronave(String codigo, String tipo, int quantidadeAssentos) {
        Aeronave novaAeronave = new Aeronave(codigo, tipo, quantidadeAssentos);
        aeronaves.add(novaAeronave);
        System.out.println("Aeronave registrada com sucesso!");
    }

    public void listarAeronaves() {
        if (aeronaves.isEmpty()) {
            System.out.println("Não há aeronaves registradas.");
        } else {
            System.out.println("Aeronaves registradas:");
            for (Aeronave aeronave : aeronaves) {
                System.out.println("Código: " + aeronave.getCodigo() + ", Tipo: " + aeronave.getTipo() +
                        ", Quantidade de assentos: " + aeronave.getQuantidadeAssentos());
            }
        }
    }
}
