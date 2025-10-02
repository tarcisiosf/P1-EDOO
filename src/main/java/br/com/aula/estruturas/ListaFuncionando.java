package br.com.aula.estruturas;

import br.com.aula.entidades.Paciente;

public class ListaFuncionando {
    private No cabeca;
    private int tamanho = 0;

    public void adicionar(Paciente paciente) {
        No novoNo = new No(paciente);
        if (estaVazia()) {
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
        tamanho++;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Lista vazia.");
            return;
        }
        No atual = cabeca;
        System.out.print("[");
        while (atual != null) {
            System.out.print(atual.getPaciente().getNome() + (atual.getProximo() != null ? ", " : ""));
            atual = atual.getProximo();
        }
        System.out.println("]");
    }
}