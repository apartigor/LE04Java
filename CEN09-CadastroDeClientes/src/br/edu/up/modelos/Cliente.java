package br.edu.up.modelos;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private double vlrMaxCredito;
    private double vlrEmprestado;
    private String codigo;

    public Cliente(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito, String codigo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.vlrMaxCredito = vlrMaxCredito;
        this.vlrEmprestado = 0.0;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }

    public void setVlrMaxCredito(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public boolean emprestar(double valor) {
        if (vlrEmprestado + valor <= vlrMaxCredito) {
            vlrEmprestado += valor;
            return true;
        }
        return false;
    }

    public boolean devolver(double valor) {
        if (vlrEmprestado - valor >= 0) {
            vlrEmprestado -= valor;
            return true;
        }
        return false;
    }

    public abstract double getSaldo();

    public abstract String toString();
}
