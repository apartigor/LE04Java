package br.edu.up.modelos;

import java.lang.Math;

public class Ponto {
    private double x;
    private double y;
    private double calc;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(double x, double y, Ponto p) {
        return Math.sqrt(Math.pow((p), 2) + Math.pow((p), 2));
    }

}
