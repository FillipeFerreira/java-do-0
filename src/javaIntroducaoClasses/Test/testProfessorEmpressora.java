package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.professor;

public class testProfessorEmpressora {

    public static void main(String[] args) {

        professor professor10 = new professor();

        professor10.nome = "henrique ";
        professor10.idade= 32;
        professor10.cpf= 1245348458;
        professor10.sexo= "masculino";
        professor10.tempo= 10;

        empressoraProfessor.imprima(professor10);

    }
}

