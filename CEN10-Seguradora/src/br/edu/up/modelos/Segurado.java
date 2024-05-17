package br.edu.up.modelos;

public class Segurado {
    private String nome;
    private String RG;
    private String CPF;
    private Enum sexo;
    private String telefone;
    private String endereco;
    private String CEP;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Enum getSexo() {
        return sexo;
    }

    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return String.format(
                "Segurado [Nome: %s, RG: %s, CPF: %s, Sexo: %s, Telefone: %s, Endereço: %s, CEP: %s, Cidade: %s]",
                nome, RG, CPF, sexo, telefone, endereco, CEP, cidade);
    }
}
