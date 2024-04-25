package br.edu.up.modelos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;


    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        meses = new Mes[13];
    }

    public void adicionarMes(Mes mes) {
        meses[meses.length - 1] = mes;
    }

    public void excluirCompromisso(int diaMes, int hora) {
        for (Mes mes : meses) {
            if (mes != null) {
                mes.excluirCompromisso(diaMes, hora);
            }
        }
    }

    public String listarCompromissos(String nomeMes) {
        StringBuilder builder = new StringBuilder();
        for (Mes mes : meses) {
            if (mes != null && mes.getNome().equalsIgnoreCase(nomeMes)) {
                builder.append(mes.listarCompromissos());
                break;
            }
        }
        return builder.toString();
    }

    public String listarCompromissos() {
        StringBuilder builder = new StringBuilder();
        for (Mes mes : meses) {
            if (mes != null) {
                builder.append(mes.listarCompromissos());
            }
        }
        return builder.toString();
    }

    public Compromisso consultarCompromisso(int hora) {
        for (Mes mes : meses) {
            if (mes != null) {
                for (Dia dia : mes.getDias()) {
                    if (dia != null) {
                        Compromisso comp = dia.getCompromissos()[hora];
                        if (comp != null) {
                            return comp;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes, String nomeMes) {
        for (Mes mes : meses) {
            if (mes != null && mes.getNome().equalsIgnoreCase(nomeMes)) {
                mes.adicionarCompromisso(pessoa, local, assunto, hora, diaMes);
                break;
            }
        }
    }
}
