package br.edu.up.controles;
import br.edu.up.modelos.*;

public class ProfessorController {
    public void cadastrarProfessor(String nome, String rg, String matricula, String lattesID, Titulacao titulacao) {
        
        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setRg(rg);
        professor.setMatricula(matricula);
        professor.setLattesID(lattesID);
        professor.setTitulacao(titulacao);
        
        
        System.out.println("Professor cadastrado com sucesso: " + professor.getNome());
    }


}

