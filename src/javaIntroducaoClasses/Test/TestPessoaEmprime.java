package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.pessoa;

public class TestPessoaEmprime {

    public static void main(String[] args) {

        pessoa pessoas01 = new pessoa();
        pessoas01.nome = "luiz";
        pessoas01.idade = 36;
        pessoas01.sexo = 'm';

        pessoa pessoas02 = new pessoa ();
        pessoas02.nome = "maria";
        pessoas02.idade = 36;
        pessoas02.sexo = 'f';
        pessoas02.deficiencia = true;

        pessoas01.imprime();
        pessoas02.imprime();


    }
}
