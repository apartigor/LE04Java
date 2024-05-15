package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    public ClienteEmpresa(String nome, String codigo) {
        super(nome, codigo, 25000.0);
    }

    @Override
    public String getTipo() {
        return "Empresa";
    }
}
