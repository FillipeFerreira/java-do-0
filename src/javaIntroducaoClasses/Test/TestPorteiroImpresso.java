package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.porteiro;

public class TestPorteiroImpresso {
    public static void main(String[] args) {

        porteiro porteiro05 = new porteiro();

        porteiro05.nome = "Jose";
        porteiro05.rg = 321321;
        porteiro05.cpf = 21312321;
        porteiro05.portaria = "principal";

        empressoraPorteiro.imprimaa(porteiro05);

    }
}
