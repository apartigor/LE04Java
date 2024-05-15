package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContatoPessoal(int codigo, String nome, String telefone, String aniversario) {
        Contato contato = new Pessoal(codigo, nome, telefone, aniversario);
        contatos.add(contato);
    }

    public void adicionarContatoComercial(int codigo, String nome, String telefone, String cnpj) {
        Contato contato = new Comercial(codigo, nome, telefone, cnpj);
        contatos.add(contato);
    }

    public Contato getContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    public boolean excluirContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                contatos.remove(contato);
                return true;
            }
        }
        return false;
    }

    public String listarContatos() {
        StringBuilder lista = new StringBuilder();
        for (Contato contato : contatos) {
            lista.append(contato).append("\n");
        }
        return lista.toString();
    }
}

