package br.edu.up.controles;
import br.edu.up.modelos.*;

public class AlunoController {
    public void cadastrarAluno(String nome, String rg, String matricula, int anoIngresso, String curso, String turno) {

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setRg(rg);
        aluno.setMatricula(matricula);
        aluno.setAnoIngresso(anoIngresso);
        aluno.setCurso(curso);
        aluno.setTurno(turno);
        
        System.out.println("Aluno cadastrado com sucesso: " + aluno.getNome());
    }
}
