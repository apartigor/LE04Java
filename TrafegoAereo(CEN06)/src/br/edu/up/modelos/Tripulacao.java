package br.edu.up.modelos;

public class Tripulacao extends Pessoa {
    private String identificacaoAeronautica;
    private String matricula;
    private Passagem passagem;
    private Aeronave aeronave;

    public Tripulacao(String nome, String rg, String identificacaoAeronautica, String matricula, Passagem passagem,
            Aeronave aeronave) {
        super(nome, rg);
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matricula = matricula;
        this.passagem = passagem;
        this.aeronave = aeronave;
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

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public String getRg() {
        return this.rg = rg;
    }

    public String getNome() {
        return this.nome = nome;
    }

}