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
        String nome = ler.nextLine();
        System.out.println("Data do evento:");
        String dataEvento = ler.nextLine();
        System.out.println("Local do evento:");
        String local = ler.nextLine();
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
            System.out.println("----- Eventos Disponíveis -----\n");
            for (int i = 0; i < eventos.size(); i++) {
                Evento evento = eventos.get(i);
                System.out.println((i + 1) + ". " + evento.getNome());
            }
            System.out.println("--------------------------------\n");
        }
    }

    public Evento selecionarEvento(int numeroEvento) {
        if (numeroEvento < 1 || numeroEvento > eventos.size()) {
            return null;
        }
        return eventos.get(numeroEvento - 1);
    }

    public boolean venderIngressos(Evento evento, int qtdeIngressos) {
        return evento.venderIngressos(qtdeIngressos);
    }
}