package br.senai.sp.jandira.model;

public class Programador extends Funcionario{
 private int horasExtras ;


 public Programador(String nome, int id){
     super(nome, id);

 }

    @Override
    public void calcularSalario() {
        setSalarioBase(getSalarioBase()+ getHorasExtras()) ;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
}
