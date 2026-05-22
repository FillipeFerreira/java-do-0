package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.Pessoa;

public class Test {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        System.out.println("--------------------------------------");

        pessoa.nome = "Fillipe";
        pessoa.idade = 25;
        pessoa.sexo = 'M';
        pessoa.medicado = " false";
        pessoa.deficiencia = true;

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Sexo: " + pessoa.sexo);
        System.out.println("medicado " + pessoa.medicado);
        System.out.println("Deficiencia  " + pessoa.deficiencia);

        System.out.println("--------------------------------------");

        Pessoa pessoa01 = new Pessoa();

        pessoa01.nome = "luiz";
        pessoa01.idade = 36;
        pessoa01.sexo = 'm';
        pessoa01.medicado = " True";
        pessoa01.deficiencia = false;

        System.out.println("nome " + pessoa01.nome);
        System.out.println("sexo " + pessoa01.sexo);
        System.out.println("idade " + pessoa01.idade);
        System.out.println("medicado  " + pessoa01.medicado);
        System.out.println("Deficiencia  " + pessoa01.deficiencia);

        System.out.println("--------------------------------------");

        Pessoa pessoa02 = new Pessoa();

        pessoa02.nome = "ana";
        pessoa02.idade = 62;
        pessoa02.sexo = 'f';
        pessoa02.medicado = " True";
        pessoa02.deficiencia = false;


        System.out.println("nome " + pessoa02.nome);
        System.out.println("sexo " + pessoa02.sexo);
        System.out.println("nome " + pessoa02.idade);
        System.out.println("medicado " + pessoa02.medicado);
        System.out.println("Deficiencia  " + pessoa02.deficiencia);

        System.out.println("--------------------------------------");








    }

}

