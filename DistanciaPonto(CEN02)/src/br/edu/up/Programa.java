package br.edu.up;

import java.lang.Math;
import br.edu.up.modelos.Ponto;

public class Programa {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0, 0);
        Ponto p2 = new Ponto(2, 5);

        Ponto.calcularDistancia(p1, p2);

        System.out.println();

    }
}