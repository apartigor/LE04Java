package br.edu.up.modelos;

public class ClientePessoa extends Cliente {
    private String CPF;
    private double peso;
    private double altura;

    public ClientePessoa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito, String CPF, double peso, double altura) {
        super(nome, telefone, email, endereco, vlrMaxCredito);
        this.CPF = CPF;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e Setters

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getSaldo() {
        return getVlrMaxCredito() - getVlrEmprestado();
    }

    @Override
    public String toString() {
        return "ClientePessoa{" +
                "nome='" + getNome() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", endereco=" + getEndereco() +
                ", vlrMaxCredito=" + getVlrMaxCredito() +
                ", vlrEmprestado=" + getVlrEmprestado() +
                ", CPF='" + CPF + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
