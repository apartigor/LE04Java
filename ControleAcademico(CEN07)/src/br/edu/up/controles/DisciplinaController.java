package br.edu.up.controles;
import br.edu.up.modelos.*;

import java.util.List;
import java.util.Set;

public class DisciplinaController {
    public void cadastrarDisciplina(String nome, String identificador, String curriculo, Professor professor, List<Aluno> alunos, Set<Competencia> competencias) {

        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);
        disciplina.setIdentificador(identificador);
        disciplina.setCurriculo(curriculo);
        disciplina.setProfessor(professor);
        disciplina.setAlunos(alunos);
        disciplina.setCompetencias(competencias);
        

        System.out.println("Disciplina cadastrada com sucesso: " + disciplina.getNome());
    }


}
