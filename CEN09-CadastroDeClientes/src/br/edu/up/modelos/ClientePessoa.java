package br.edu.up.modelos;

public class ClientePessoa extends Cliente {
    public ClientePessoa(String nome, String codigo) {
        super(nome, codigo, 10000.0);
    }

    @Override
    public String getTipo() {
        return "Pessoa";
    }
}
