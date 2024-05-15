package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.edu.up.modelos.*;

public class ControladorReserva {

    Scanner ler = new Scanner(System.in);

    private List<Reserva> reservas = new ArrayList<>();

    public void fazerReserva(Evento evento) {
        System.out.println("Nome do responsável pela reserva:");
        String nomeResponsavel = ler.next();
        System.out.println("Quantidade de pessoas:");
        int qtdePessoas = ler.nextInt();
        System.out.println("Data da reserva:");
        String dataReserva = ler.next();
        double valorTotal = qtdePessoas * evento.getPrecoIngresso();

        Reserva reserva = new Reserva(nomeResponsavel, qtdePessoas, dataReserva, valorTotal);
        reservas.add(reserva);
        evento.venderIngressos(qtdePessoas);
        System.out.println("Reserva realizada com sucesso para o evento: " + evento.getNome());
    }

    public void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Não há reservas cadastradas.");
        } else {
            System.out.println("----- Reservas Cadastradas -----\n");
            for (Reserva reserva : reservas) {
                System.out.println("Nome do Responsável: " + reserva.getNomeResponsavel());
                System.out.println("Quantidade de Pessoas: " + reserva.getQtdePessoas());
                System.out.println("Data da Reserva: " + reserva.getDataReserva());
                System.out.println("Valor Total: " + reserva.getValorTotal());
                System.out.println("--------------------------------\n");
            }
        }
    }
}
