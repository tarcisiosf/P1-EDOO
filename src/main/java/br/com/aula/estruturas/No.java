package br.com.aula.estruturas;

import br.com.aula.entidades.Paciente;

public class No {
    private Paciente paciente;
    private No proximo;

    public No(Paciente paciente) {
        this.paciente = paciente;
        this.proximo = null;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
