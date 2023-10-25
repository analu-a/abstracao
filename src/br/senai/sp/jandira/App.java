package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Gerente;
import br.senai.sp.jandira.model.Programador;

public class App {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Ana", 1);
        gerente1.setBonusGerente(400);
        gerente1.calcularSalario();
        System.out.println(gerente1.getSalarioBase());

        Programador programador1 = new Programador("Vi", 2);
        programador1.setHorasExtras(200);
        programador1.calcularSalario();
        System.out.println(programador1.getSalarioBase());



    }
}
