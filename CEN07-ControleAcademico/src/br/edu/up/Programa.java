package br.edu.up;

import br.edu.up.controles.ControleAcademico;
import br.edu.up.telas.*;

public class Programa {
    public static void main(String[] args) {
        VisaoAcademica visao = new VisaoAcademica();
        ControleAcademico controle = new ControleAcademico();
        Menu menu = new Menu(controle, visao);
        menu.exibirMenu();
    }
}
