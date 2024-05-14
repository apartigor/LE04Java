package br.edu.up.controles;

import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Titulacao;

import java.util.ArrayList;
import java.util.List;

public class ProfessorController {
    private List<Professor> professores;

    public ProfessorController() {
        this.professores = new ArrayList<>();
    }

    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor cadastrado com sucesso!");
    }

    public void listarProfessores() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            System.out.println("=== Lista de Professores ===");
            for (Professor professor : professores) {
                System.out.println("Nome: " + professor.getNome());
                System.out.println("RG: " + professor.getRg());
                System.out.println("Matrícula: " + professor.getMatricula());
                System.out.println("Lattes ID: " + professor.getLattesID());
                Titulacao titulacao = professor.getTitulacao();
                System.out.println("Titulação: " + titulacao.getTituloObtido() +
                        " em " + titulacao.getAnoConclusao() +
                        " pela instituição " + titulacao.getInstituicao() +
                        " (TCC: " + titulacao.getTituloTrabalho() + ")");
                System.out.println("------------------------");
            }
        }
    }
}
