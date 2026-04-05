package com.mycompany.sistemaacademico;

import java.util.ArrayList;
import java.util.List;

abstract class Curso {
    private String codigo;
    private String nome;
    private int cargaHorariaTotal;
    private int duracao;
    private String tipoDuracao;
    private String modalidade;
    private String status;

    public Curso() {
        this.nome = "Sem nome";
    }

    public abstract List<String> obterDisciplinas();
    public abstract List<String> obterAlunosAtivos();
    public abstract List<String> obterAlunosEgressos();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public void setCargaHorariaTotal(int cargaHorariaTotal) {
        this.cargaHorariaTotal = cargaHorariaTotal;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTipoDuracao() {
        return tipoDuracao;
    }

    public void setTipoDuracao(String tipoDuracao) {
        this.tipoDuracao = tipoDuracao;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class CursoTecnico extends Curso {
    private String eixoTecnologico;
    private double cargaHorariaEstagio;
    private boolean estagioObrigatorio;

    public CursoTecnico() {
        super();
        this.estagioObrigatorio = false;
    }

    public boolean verificarEstagioObrigatorio() {
        return this.cargaHorariaEstagio > 0;
    }

    @Override
    public List<String> obterDisciplinas() {
        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("Logica de Programação");
        disciplinas.add("Redes de Computadores");
        disciplinas.add("Banco de Dados");
        return disciplinas;
    }

    @Override
    public List<String> obterAlunosAtivos() {
        List<String> alunos = new ArrayList<>();
        alunos.add("Ana souza");
        alunos.add("Carlos Lima");
        return alunos;
    }

    @Override
    public List<String> obterAlunosEgressos() {
        List<String> egressos = new ArrayList<>();
        egressos.add("Fernanda Rocha");
        return egressos;
    }

    public String getEixoTecnologico() {
        return eixoTecnologico;
    }

    public void setEixoTecnologico(String eixoTecnologico) {
        this.eixoTecnologico = eixoTecnologico;
    }

    public double getCargaHorariaEstagio() {
        return cargaHorariaEstagio;
    }

    public void setCargaHorariaEstagio(double cargaHorariaEstagio) {
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }

    public boolean isEstagioObrigatorio() {
        return estagioObrigatorio;
    }

    public void setEstagioObrigatorio(boolean estagioObrigatorio) {
        this.estagioObrigatorio = estagioObrigatorio;
    }
}

class CursoGraduacao extends Curso {
    private String tipo;
    private boolean tccObrigatorio;

    public CursoGraduacao() {
        super();
        this.tipo = "Bacharelado";
    }

    public boolean validarTCC() {
        return this.tccObrigatorio;
    }

    @Override
    public List<String> obterDisciplinas() {
        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("Calculo I");
        disciplinas.add("Programação Orientada a Objetos");
        disciplinas.add("Estrutura de Dados");
        return disciplinas;
    }

    @Override
    public List<String> obterAlunosAtivos() {
        List<String> alunos = new ArrayList<>();
        alunos.add("Mariana costa");
        alunos.add("Pedro Alves");
        return alunos;
    }

    @Override
    public List<String> obterAlunosEgressos() {
        List<String> egressos = new ArrayList<>();
        egressos.add("Rafael Dias");
        return egressos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTccObrigatorio() {
        return tccObrigatorio;
    }

    public void setTccObrigatorio(boolean tccObrigatorio) {
        this.tccObrigatorio = tccObrigatorio;
    }
}

class CursoPosGraduacao extends Curso {
    private String tipo;
    private String areaDePesquisa;
    private String dissertacao;

    public CursoPosGraduacao() {
        super();
        this.dissertacao = "";
    }

    public boolean validarDissertacao() {
        return this.areaDePesquisa != null && !this.dissertacao.isEmpty();
    }

    @Override
    public List<String> obterDisciplinas() {
        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("Metodologia Cientifica");
        disciplinas.add("Pesquisa Aplicada");
        return disciplinas;
    }

    @Override
    public List<String> obterAlunosAtivos() {
        List<String> alunos = new ArrayList<>();
        alunos.add("Beatriz Santos");
        alunos.add("Lucas Ferreira");
        return alunos;
    }

    @Override
    public List<String> obterAlunosEgressos() {
        List<String> egressos = new ArrayList<>();
        egressos.add("Dra. Patricia Lima");
        return egressos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAreaDePesquisa() {
        return areaDePesquisa;
    }

    public void setAreaDePesquisa(String areaDePesquisa) {
        this.areaDePesquisa = areaDePesquisa;
    }

    public String getDissertacao() {
        return dissertacao;
    }

    public void setDissertacao(String dissertacao) {
        this.dissertacao = dissertacao;
    }
}

public class SistemaAcademico {

    public static void main(String[] args) {
        CursoTecnico tecnico = new CursoTecnico();
        tecnico.setNome("Tecnico em Informatica");
        tecnico.setCodigo("TEC001");
        tecnico.setCargaHorariaTotal(1200);
        tecnico.setDuracao(2);
        tecnico.setTipoDuracao("Semestral");
        tecnico.setModalidade("Presencial");
        tecnico.setStatus("Ativo");
        tecnico.setEixoTecnologico("Informação e Comunicação");
        tecnico.setCargaHorariaEstagio(200);

        System.out.println("=== Curso Tecnico ===");
        System.out.println("Nome: " + tecnico.getNome());
        System.out.println("Codigo: " + tecnico.getCodigo());
        System.out.println("Carga Horaria Total: " + tecnico.getCargaHorariaTotal());
        System.out.println("Duracao: " + tecnico.getDuracao() + " semestres");
        System.out.println("Modalidade: " + tecnico.getModalidade());
        System.out.println("Status: " + tecnico.getStatus());
        System.out.println("Eixo Tecnologico: " + tecnico.getEixoTecnologico());
        System.out.println("Carga Horaria Estagio: " + tecnico.getCargaHorariaEstagio());
        System.out.println("Estagio Obrigatorio: " + tecnico.verificarEstagioObrigatorio());
        System.out.println("Disciplinas: " + tecnico.obterDisciplinas());
        System.out.println("Alunos Ativos: " + tecnico.obterAlunosAtivos());
        System.out.println("Alunos Egressos: " + tecnico.obterAlunosEgressos());

        System.out.println();

        CursoGraduacao graduacao = new CursoGraduacao();
        graduacao.setNome("Engenharia de Software");
        graduacao.setCodigo("GRAD001");
        graduacao.setCargaHorariaTotal(3200);
        graduacao.setDuracao(8);
        graduacao.setTipoDuracao("Semestral");
        graduacao.setModalidade("Presencial");
        graduacao.setStatus("Ativo");
        graduacao.setTipo("Bacharelado");
        graduacao.setTccObrigatorio(true);

        System.out.println("=== Curso de Graduação ===");
        System.out.println("Nome: " + graduacao.getNome());
        System.out.println("Codigo: " + graduacao.getCodigo());
        System.out.println("Carga Horaria Total: " + graduacao.getCargaHorariaTotal());
        System.out.println("Duracao: " + graduacao.getDuracao() + " semestres");
        System.out.println("Modalidade: " + graduacao.getModalidade());
        System.out.println("Status: " + graduacao.getStatus());
        System.out.println("Tipo: " + graduacao.getTipo());
        System.out.println("TCC Obrigatorio: " + graduacao.isTccObrigatorio());
        System.out.println("TCC Valido: " + graduacao.validarTCC());
        System.out.println("Disciplinas: " + graduacao.obterDisciplinas());
        System.out.println("Alunos Ativos: " + graduacao.obterAlunosAtivos());
        System.out.println("Alunos Egressos: " + graduacao.obterAlunosEgressos());

        System.out.println();

        CursoPosGraduacao pos = new CursoPosGraduacao();
        pos.setNome("Mestrado em Computação");
        pos.setCodigo("POS001");
        pos.setCargaHorariaTotal(360);
        pos.setDuracao(4);
        pos.setTipoDuracao("Semestral");
        pos.setModalidade("Presencial");
        pos.setStatus("Ativo");
        pos.setTipo("Stricto Sensu");
        pos.setAreaDePesquisa("Inteligencia Artificial");
        pos.setDissertacao("Avanços em Machine Learning");

        System.out.println("=== Curso de Pos-Graduação ===");
        System.out.println("Nome: " + pos.getNome());
        System.out.println("Codigo: " + pos.getCodigo());
        System.out.println("Carga Horaria Total: " + pos.getCargaHorariaTotal());
        System.out.println("Duracao: " + pos.getDuracao() + " semestres");
        System.out.println("Modalidade: " + pos.getModalidade());
        System.out.println("Status: " + pos.getStatus());
        System.out.println("Tipo: " + pos.getTipo());
        System.out.println("Area de Pesquisa: " + pos.getAreaDePesquisa());
        System.out.println("Dissertação Valida: " + pos.validarDissertacao());
        System.out.println("Disciplinas: " + pos.obterDisciplinas());
        System.out.println("Alunos Ativos: " + pos.obterAlunosAtivos());
        System.out.println("Alunos Egressos: " + pos.obterAlunosEgressos());
    }
}
