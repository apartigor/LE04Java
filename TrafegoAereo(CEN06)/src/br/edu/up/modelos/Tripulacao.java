package br.edu.up.modelos;

public class Tripulacao extends Pessoa {
    String identificacaoAeronautica;
    String matricula;

    public Tripulacao(String nome, String rg, String identificacaoAeronautica, String matricula) {
        super(nome, rg);
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matricula = matricula;
    }

    public String getIdentificacaoAeronautica() {
        return identificacaoAeronautica;
    }

    public void setIdentificacaoAeronautica(String identificacaoAeronautica) {
        this.identificacaoAeronautica = identificacaoAeronautica;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}