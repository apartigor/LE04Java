package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import br.edu.up.modelos.*;

public class SeguroController {
    private List<Seguro> seguros;

    public SeguroController() {
        this.seguros = new ArrayList<>();
    }

    public boolean incluirSeguro(Seguro seguro) {
        if (buscarSeguroPorApolice(seguro.getApolice()).isPresent()) {
            return false; 
        }
        seguros.add(seguro);
        return true;
    }

    public Optional<Seguro> buscarSeguroPorApolice(String apolice) {
        return seguros.stream().filter(s -> s.getApolice().equals(apolice)).findFirst();
    }

    public boolean excluirSeguro(String apolice) {
        return seguros.removeIf(s -> s.getApolice().equals(apolice));
    }

    public boolean excluirTodosSeguros() {
        seguros.clear();
        return true;
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

    public List<Seguro> listarTodosSeguros() {
        return new ArrayList<>(seguros);
    }
}
