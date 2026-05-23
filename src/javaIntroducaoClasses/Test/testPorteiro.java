package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.porteiro;

public class testPorteiro {

    public static void main(String[] args) {

        porteiro porteiro00 = new porteiro();

        porteiro00.nome = "Fillipe";
        porteiro00.portaria = "portaria principal";
        porteiro00.cpf = 12452515;
        porteiro00.rg = 12452515;
        porteiro00.tempo = 3213;

        System.out.println("meu nome "+ porteiro00.nome);
        System.out.println("qual portaria "+ porteiro00.portaria);
        System.out.println("cpf "+ porteiro00.cpf);
        System.out.println("rg "+ porteiro00.rg);
        System.out.println("tempo de casa "+ porteiro00.tempo);



    }
}
