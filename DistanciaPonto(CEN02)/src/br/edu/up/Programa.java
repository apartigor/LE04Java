package br.edu.up;

import br.edu.up.modelos.Ponto;

public class Programa {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2, 5);

        double distp1p2 = ponto1.calcularDistancia(ponto2);

        System.out.printf("Distância do Ponto 1 ao Ponto 2: %.3f", distp1p2);

        

    }
}


