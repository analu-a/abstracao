package br.senai.sp.jandira.model;

abstract class Funcionario {

    private String nome;
    private double salarioBase = 1000;
    int id;

    public Funcionario(String nome, int id) {

    }


    abstract void calcularSalario();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}