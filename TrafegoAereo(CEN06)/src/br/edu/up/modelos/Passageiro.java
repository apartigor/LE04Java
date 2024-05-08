package br.edu.up.modelos;

public class Passageiro extends Pessoa {
    private String identificadorBagagem;
    private Passagem passagem;
    private Aeronave aeronave;

    public Passageiro(String nome, String rg, String identificadorBagagem, Passagem passagem,
            Aeronave aeronave) {
        super(nome, rg);
        this.identificadorBagagem = identificadorBagagem;
        this.passagem = passagem;
        this.aeronave = aeronave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getIdentificadorBagagem() {
        return identificadorBagagem;
    }

    public void setIdentificadorBagagem(String identificadorBagagem) {
        this.identificadorBagagem = identificadorBagagem;
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
}
