package br.edu.up.modelos;

public class ClientePessoa extends Cliente {
    private String CPF;
    private double peso;
    private double altura;

    public ClientePessoa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito,
            String CPF, double peso, double altura, String codigo) {
        super(nome, telefone, email, endereco, vlrMaxCredito, codigo);
        this.CPF = CPF;
        this.peso = peso;
        this.altura = altura;
    }

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
        return String.format("Cliente Pessoa:\n" +
                "Nome: %s\n" +
                "Telefone: %s\n" +
                "Email: %s\n" +
                "Endereço: %s\n" +
                "CPF: %s\n" +
                "Peso: %.2f\n" +
                "Altura: %.2f\n" +
                "Valor Máximo de Crédito: %.2f\n" +
                "Valor Emprestado: %.2f\n",
                getNome(), getTelefone(), getEmail(), getEndereco(), getCPF(), getPeso(), getAltura(),
                getVlrMaxCredito(), getVlrEmprestado());
    }
}
