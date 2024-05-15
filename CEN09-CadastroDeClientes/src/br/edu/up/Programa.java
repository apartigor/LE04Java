package br.edu.up;

import br.edu.up.telas.*;



public class Programa {
    public static void main(String[] args) {
        VisaoClientes visao = new VisaoClientes();
        Menu menu = new Menu();

        int opcaoPrincipal;
        do {
            visao.exibirMenuPrincipal();
            opcaoPrincipal = visao.lerOpcao();
            menu.executarOpcao(opcaoPrincipal);
        } while (opcaoPrincipal != 5);
    }
}
