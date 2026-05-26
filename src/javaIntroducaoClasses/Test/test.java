package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.pessoa;

public class test {
    public static void main(String[] args) {

        pessoa pessoa = new pessoa();

        System.out.println("--------------------------------------");

        pessoa.nome = "Fillipe";
        pessoa.matricula = 541845884;
        pessoa.idade = 25;
        pessoa.sexo = 'M';
        pessoa.medicado = " nao esta";
        pessoa.deficiencia = true;
        pessoa.rg = 454545;
        pessoa.cpf = 232133221;
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("minha matricula " + pessoa.matricula);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Sexo: " + pessoa.sexo);
        System.out.println("medicado " + pessoa.medicado);
        System.out.println("Deficiencia  " + pessoa.deficiencia);
        System.out.println("cpf   " + pessoa.cpf);

        System.out.println("--------------------------------------");

        pessoa pessoa01 = new pessoa();

        pessoa01.nome = "luiz";
        pessoa01.matricula = 545132184;
        pessoa01.idade = 36;
        pessoa01.sexo = 'm';
        pessoa01.medicado = " Nao esta";
        pessoa01.deficiencia = false;
        pessoa01.rg = 4542545;
        pessoa01.cpf = 23221321;
        System.out.println("nome " + pessoa01.nome);
        System.out.println("minha matricula " + pessoa01.matricula);
        System.out.println("sexo " + pessoa01.sexo);
        System.out.println("idade " + pessoa01.idade);
        System.out.println("medicado  " + pessoa01.medicado);
        System.out.println("Deficiencia  " + pessoa01.deficiencia);
        System.out.println("cpf   " + pessoa01.cpf);

        System.out.println("--------------------------------------");

        pessoa pessoa02 = new pessoa();

        pessoa02.nome = "ana";
        pessoa02.matricula = 545185884;
        pessoa02.idade = 62;
        pessoa02.sexo = 'f';
        pessoa02.medicado = " nao esta";
        pessoa02.deficiencia = false;
        pessoa02.rg = 4254545;
        pessoa02.cpf = 2321321;


        System.out.println("nome " + pessoa02.nome);
        System.out.println("minha matricula "+ pessoa02.matricula);
        System.out.println("sexo " + pessoa02.sexo);
        System.out.println("nome " + pessoa02.idade);
        System.out.println("medicado " + pessoa02.medicado);
        System.out.println("Deficiencia  " + pessoa02.deficiencia);
        System.out.println("rg   " + pessoa02.rg);
        System.out.println("cpf   " + pessoa02.cpf);

        System.out.println("--------------------------------------");


    }

}

