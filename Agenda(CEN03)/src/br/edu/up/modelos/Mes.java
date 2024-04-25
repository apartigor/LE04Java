package br.edu.up.modelos;

public class Mes {
    private int qtdeDias;
    private String nome;
    private Dia[] dias;

    public Mes(int qtdeDias, String nome) {
        this.qtdeDias = qtdeDias;
        this.nome = nome;
        dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public Dia[] getDias() {
        return dias;
    }

    

    public String getNome() {
        return nome;
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes, int hora) {
        dias[diaMes - 1].adicionarCompromisso(comp, hora);
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {
        Compromisso comp = new Compromisso(pessoa, local, assunto, hora);
        adicionarCompromisso(comp, diaMes, hora);
    }

    public void excluirCompromisso(int diaMes, int hora) {
        dias[diaMes - 1].excluirCompromisso(hora);
    }

    public String listarCompromissos(int diaMes) {
        StringBuilder builder = new StringBuilder();
        builder.append("Compromissos do dia ").append(diaMes).append(" de ").append(nome).append(":\n");
        for (Compromisso comp : dias[diaMes - 1].getCompromissos()) {
            if (comp != null) {
                builder.append(comp).append("\n");
            }
        }
        return builder.toString();
    }

    public String listarCompromissos() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < qtdeDias; i++) {
            builder.append(listarCompromissos(i + 1));
        }
        return builder.toString();
    }
}
