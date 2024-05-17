package br.edu.up.controles;

import java.util.ArrayList;
import br.edu.up.modelos.*;

public class SeguroController {
    private ArrayList<Seguro> seguros;

    public SeguroController() {
        seguros = new ArrayList<>();
    }

    public void incluirSeguro(Seguro seguro) {
        seguros.add(seguro);
    }

    public Seguro localizarSeguro(String numeroApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice().equals(numeroApolice)) {
                return seguro;
            }
        }
        return null;
    }

    public boolean excluirSeguro(String numeroApolice) {
        Seguro seguro = localizarSeguro(numeroApolice);
        if (seguro != null) {
            seguros.remove(seguro);
            return true;
        }
        return false;
    }

    public void excluirTodosSeguros() {
        seguros.clear();
    }

    public ArrayList<Seguro> listarTodosSeguros() {
        return seguros;
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

}
