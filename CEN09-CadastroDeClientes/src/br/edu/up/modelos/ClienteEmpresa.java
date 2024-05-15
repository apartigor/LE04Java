package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito,
            String cnpj, String inscEstadual, int anoFundacao, String codigo) {
        super(nome, telefone, email, endereco, vlrMaxCredito, codigo);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    @Override
    public double getSaldo() {
        return getVlrMaxCredito() - getVlrEmprestado();
    }

    @Override
    public String toString() {
        return String.format("Cliente Empresa:\n" +
                "Nome: %s\n" +
                "Telefone: %s\n" +
                "Email: %s\n" +
                "Endereço: %s\n" +
                "CNPJ: %s\n" +
                "Inscrição Estadual: %s\n" +
                "Ano de Fundação: %d\n" +
                "Valor Máximo de Crédito: %.2f\n" +
                "Valor Emprestado: %.2f\n",
                getNome(), getTelefone(), getEmail(), getEndereco(), getCnpj(), getInscEstadual(), getAnoFundacao(),
                getVlrMaxCredito(), getVlrEmprestado());
    }
}
