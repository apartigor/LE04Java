package br.edu.up;

import br.edu.up.modelos.*;

public class Programa {
    public static void main(String[] args) {
        Ano ano = new Ano(2024, true);


        Mes janeiro = new Mes(31, "Janeiro");
        Mes fevereiro = new Mes(29, "Fevereiro");
        Mes marco = new Mes(31, "Março");
        Mes abril = new Mes(30, "Abril");

        ano.adicionarMes(janeiro);
        ano.adicionarMes(fevereiro);
        ano.adicionarMes(marco);
        ano.adicionarMes(abril);


        ano.adicionarCompromisso("Maria", "Casa da Maria", "Aniversário de Maria", 15, 25, "Abril");
        ano.adicionarCompromisso("João", "Trabalho", "Reunião de equipe", 10, 10, "Abril");
        ano.adicionarCompromisso("Ana", "Academia", "Aula de Yoga", 18, 5, "Abril");

        Compromisso comp1 = ano.consultarCompromisso(15);
        System.out.println(comp1);
        Compromisso comp2 = ano.consultarCompromisso(10);
        System.out.println(comp2);
        Compromisso comp3 = ano.consultarCompromisso(18);
        System.out.println(comp3);

        ano.excluirCompromisso(25, 15);
        Compromisso comp1Excluido = ano.consultarCompromisso(15);
        System.out.println(comp1Excluido);
        
    }
}
