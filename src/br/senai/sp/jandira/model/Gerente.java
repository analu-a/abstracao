package br.senai.sp.jandira.model;

public class Gerente extends Funcionario{
    private double bonusGerente ;



    public Gerente(String nome, int id){
        super(nome,id);
    }

   public void calcularSalario(){
        setSalarioBase(getSalarioBase() + getBonusGerente());
   }
    public double getBonusGerente() {
        return bonusGerente;
    }

    public void setBonusGerente(double bonusGerente) {
        this.bonusGerente = bonusGerente;
    }

}
