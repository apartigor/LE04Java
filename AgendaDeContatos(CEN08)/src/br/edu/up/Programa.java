package br.edu.up;

import br.edu.up.controles.Agenda;
import br.edu.up.telas.Menu;

public class Programa {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Menu menu = new Menu(agenda);
        menu.exibirMenu();

    }
}
