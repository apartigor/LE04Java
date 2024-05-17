package br.edu.up.controles;

import br.edu.up.modelos.*;
import java.util.ArrayList;


public class ControleClientes {
    private ArrayList<Cliente> clientes;

    public ControleClientes() {
        clientes = new ArrayList<>();
    }

    public void incluirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equals(codigo)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean emprestarParaCliente(String codigo, double valor) {
        Cliente cliente = buscarCliente(codigo);
        if (cliente != null) {
            return cliente.emprestar(valor);
        }
        return false;
    }

    public boolean devolverParaCliente(String codigo, double valor) {
        Cliente cliente = buscarCliente(codigo);
        if (cliente != null) {
            return cliente.devolver(valor);
        }
        return false;
    }

    public ArrayList<Cliente> listarClientes() {
        return clientes;
    }
}
