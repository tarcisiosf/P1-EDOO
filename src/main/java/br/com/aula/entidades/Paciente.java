package br.com.aula.entidades;

public class Paciente {
    private static int proximoId;
    private int id;
    private String nome;

    public Paciente(String nome) {
        this.id = proximoId++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

}
