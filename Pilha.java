package br.com.aula.estruturas;

import br.com.aula.entidades.Paciente;

public class Pilha {
    private No topo;
    private int tamanho = 0;

    public void empilhar(Paciente paciente) {
        No novoNo = new No(paciente);
        novoNo.setProximo(topo);
        topo = novoNo;
        tamanho++;
    }

    public Paciente desempilhar() {
        if (estaVazia()) {
            return null;
        }
        Paciente paciente = topo.getPaciente();
        topo = topo.getProximo();
        tamanho--;
        return paciente;
    }

    public Paciente topo() {
        if (estaVazia()) {
            return null;
        }
        return topo.getPaciente();
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return;
        }
        No atual = topo;
        System.out.print("[");
        while (atual != null) {
            System.out.print(atual.getPaciente().getNome() + (atual.getProximo() != null ? ", " : ""));
            atual = atual.getProximo();
        }
        System.out.println("] <- Topo");
    }
}