package br.com.aula;

import br.com.aula.sistema.Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.exibirEstadoAtual();

        hospital.cadastrarPaciente("Tarcísio Antônio dos Santos Filho", Hospital.Setor.URGENCIA);
        hospital.cadastrarPaciente("Anna Luiza Pelles Machado Pereira Amorim", Hospital.Setor.URGENCIA);
        hospital.cadastrarPaciente("Adriana dos Reis Pacheco Santos", Hospital.Setor.RADIOLOGIA);
        hospital.cadastrarPaciente("Tiago Felipe Pacheco dos Santos", Hospital.Setor.RADIOLOGIA);
        hospital.cadastrarPaciente("Tarcísio Antônio dos Santos", Hospital.Setor.URGENCIA);
        hospital.cadastrarPaciente("Nicole Santos", Hospital.Setor.ALTA);
        hospital.cadastrarPaciente("Thalles Bruno", Hospital.Setor.ALTA);
        hospital.cadastrarPaciente("Pedro Willian", Hospital.Setor.URGENCIA);
        hospital.cadastrarPaciente("Eliane Pelles", Hospital.Setor.RADIOLOGIA);
        hospital.cadastrarPaciente("Maria Fernanda", Hospital.Setor.RADIOLOGIA);
        hospital.cadastrarPaciente("Marcelo Pereira", Hospital.Setor.RADIOLOGIA);

        hospital.exibirEstadoAtual();

        hospital.atenderPaciente(Hospital.Setor.URGENCIA);
        hospital.atenderPaciente(Hospital.Setor.RADIOLOGIA);

        hospital.exibirEstadoAtual();

        hospital.consultarUltimoPacienteAtendido();

        hospital.atenderPaciente(Hospital.Setor.URGENCIA);

        hospital.consultarUltimoPacienteAtendido();

        hospital.exibirHistorico();
    }
}