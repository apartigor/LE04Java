package br.edu.up.controles;

import br.edu.up.modelos.Carro;

public class EstacionamentoController {
    private static final int NUM_VAGAS = 10;
    private static final double PRECO_POR_PERIODO = 5.00;
    private Carro[] vagas;
    private int numCarros;

    public EstacionamentoController() {
        vagas = new Carro[NUM_VAGAS];
        numCarros = 0;
    }

    public boolean entradaCarro(Carro carro) {
        if (numCarros < NUM_VAGAS) {
            vagas[numCarros++] = carro;
            return true;
        } else {
            System.out.println("Estacionamento lotado!");
            return false;
        }
    }

    public boolean saidaCarro(String placa) {
        for (int i = 0; i < numCarros; i++) {
            if (vagas[i].getPlaca().equals(placa)) {
                vagas[i] = null;
                rearranjarVagas(i);
                numCarros--;
                return true;
            }
        }
        System.out.println("Carro não encontrado!");
        return false;
    }

    private void rearranjarVagas(int index) {
        for (int i = index; i < numCarros; i++) {
            vagas[i] = vagas[i + 1];
        }
    }

    public void emitirRelatorio() {
        System.out.println("Quantidade de carros estacionados: " + numCarros);
        System.out.println("Valor total a ser pago: R$" + (numCarros * PRECO_POR_PERIODO));
    }
}
