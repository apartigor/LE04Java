package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.edu.up.modelos.*;

public class ControladorEvento {

    private Scanner ler = new Scanner(System.in);
    private List<Evento> eventos = new ArrayList<>();

    public void adicionarEvento() {
        System.out.println("Nome do evento:");
        String nome = ler.next();
        System.out.println("Data do evento:");
        String dataEvento = ler.next();
        System.out.println("Local do evento:");
        String local = ler.next();
        System.out.println("Lotação máxima do evento:");
        int lotacaoMax = ler.nextInt();
        System.out.println("Preço do ingresso:");
        double precoIngresso = ler.nextDouble();

        Evento evento = new Evento(nome, dataEvento, local, lotacaoMax, 0, precoIngresso);
        eventos.add(evento);
        System.out.println("Evento adicionado com sucesso!");
    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Não há eventos cadastrados.");
        } else {
            System.out.println("----- Eventos Cadastrados -----\n");
            for (Evento evento : eventos) {
                System.out.println("Nome: " + evento.getNome());
                System.out.println("Data do Evento: " + evento.getdataEvento());
                System.out.println("Local: " + evento.getLocal());
                System.out.println("Lotação Máxima: " + evento.getLotacaoMax());
                System.out.println("Ingressos Vendidos: " + evento.getQtdeIngressosVendidos());
                System.out.println("Preço do Ingresso: " + evento.getPrecoIngresso());
                System.out.println("--------------------------------\n");
            }
        }
    }
}