package br.com.aula.estruturas;

import br.com.aula.entidades.Paciente;

public class Fila {
    private No inicio;
    private No fim;
    private int tamanho = 0;

    public void enfileirar(Paciente paciente) {
        No novoNo = new No(paciente);
        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
        tamanho++;
    }

    public Paciente desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        Paciente paciente = inicio.getPaciente();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return paciente;
    }

    public Paciente primeiro() {
        if (estaVazia()) {
            return null;
        }
        return inicio.getPaciente();
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Fila vazia.");
            return;
        }
        No atual = inicio;
        System.out.print("[");
        while (atual != null) {
            System.out.print(atual.getPaciente().getNome() + (atual.getProximo() != null ? ", " : ""));
            atual = atual.getProximo();
        }
        System.out.println("]");
    }
}