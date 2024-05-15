package br.edu.up.modelos;

public abstract class Cliente {
    private String nome;
    private String codigo;
    private double vlrEmprestado;
    private double maxCredito;

    public Cliente(String nome, String codigo, double maxCredito) {
        this.nome = nome;
        this.codigo = codigo;
        this.maxCredito = maxCredito;
        this.vlrEmprestado = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public double getMaxCredito() {
        return maxCredito;
    }

    public boolean emprestar(double valor) {
        if (vlrEmprestado + valor <= maxCredito) {
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

    public abstract String getTipo();
}
