package br.com.aula.sistema;

import br.com.aula.entidades.Paciente;
import br.com.aula.estruturas.Fila;
import br.com.aula.estruturas.ListaFuncionando;
import br.com.aula.estruturas.Pilha;

public class Hospital {

    private final Fila setorUrgencia = new Fila();
    private final Pilha setorRadiologia = new Pilha();
    private final ListaFuncionando setorAlta = new ListaFuncionando();

    private final ListaFuncionando historicoAtendimentos = new ListaFuncionando();
    private Paciente ultimoPacienteAtendido;

    public enum Setor {
        URGENCIA, RADIOLOGIA, ALTA
    }

    public void cadastrarPaciente(String nome, Setor setor) {
        Paciente novoPaciente = new Paciente(nome);
        System.out.println("\nCadastrando " + nome + " no setor " + setor);
        switch (setor) {
            case URGENCIA:
                setorUrgencia.enfileirar(novoPaciente);
                break;
            case RADIOLOGIA:
                setorRadiologia.empilhar(novoPaciente);
                break;
            case ALTA:
                setorAlta.adicionar(novoPaciente);
                break;
        }
    }

    public void atenderPaciente(Setor setor) {
        Paciente pacienteAtendido = null;
        System.out.println("\nAtendendo próximo paciente do setor " + setor);
        switch (setor) {
            case URGENCIA:
                pacienteAtendido = setorUrgencia.desenfileirar();
                break;
            case RADIOLOGIA:
                pacienteAtendido = setorRadiologia.desempilhar();
                break;
            case ALTA:
                System.out.println("Setor de Alta não possui 'atendimento', apenas registro.");
                break;
        }

        if (pacienteAtendido != null) {
            ultimoPacienteAtendido = pacienteAtendido;
            historicoAtendimentos.adicionar(pacienteAtendido);
            System.out.println("Paciente atendido: " + pacienteAtendido.getNome());
        } else {
            System.out.println("Nenhum paciente para atender no setor " + setor);
        }
    }

    public void exibirEstadoAtual() {
        System.out.println("\nESTADO DO HOSPITAL");
        System.out.print("Setor URGÊNCIA: ");
        setorUrgencia.exibir();
        System.out.print("Setor RADIOLOGIA: ");
        setorRadiologia.exibir();
        System.out.print("Setor ALTA: ");
        setorAlta.exibir();
        System.out.println("---------------------------------");
    }

    public void consultarUltimoPacienteAtendido() {
        System.out.println("\n--- CONSULTA ÚLTIMO ATENDIMENTO ---");
        if (ultimoPacienteAtendido != null) {
            System.out.println("Último paciente atendido foi: " + ultimoPacienteAtendido);
        } else {
            System.out.println("Nenhum paciente foi atendido ainda.");
        }
        System.out.println("------------------------------------");
    }

    public void exibirHistorico() {
        System.out.println("\n--- HISTÓRICO DE ATENDIMENTOS ---");
        historicoAtendimentos.exibir();
        System.out.println("---------------------------------");
    }
}