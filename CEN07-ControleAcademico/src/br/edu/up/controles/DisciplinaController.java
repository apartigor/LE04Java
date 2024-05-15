package br.edu.up.controles;

import br.edu.up.modelos.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaController {
    private List<Disciplina> disciplinas;

    public DisciplinaController() {
        this.disciplinas = new ArrayList<>();
    }

    public void cadastrarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        System.out.println("Disciplina cadastrada com sucesso!");
    }

    public void listarDisciplinas() {
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
        } else {
            System.out.println("=== Lista de Disciplinas ===");
            for (Disciplina disciplina : disciplinas) {
                System.out.println("Nome: " + disciplina.getNome());
                System.out.println("Identificador: " + disciplina.getIdentificador());
                System.out.println("Currículo: " + disciplina.getCurriculo());
                System.out.println("Professor: " + disciplina.getProfessor().getNome());
                System.out.println("------------------------");
            }
        }
    }
}
