package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.porteiro;

public class TestPorteiroImpresso {
    public static void main(String[] args) {

        porteiro porteiro05 = new porteiro();

        porteiro05.nome = "Jose";
        porteiro05.rg = 321321;
        porteiro05.cpf = 21312321;
        porteiro05.portaria = "principal";



        porteiro porteiro06 = new porteiro();
        porteiro06.nome = "lucas";
        porteiro06.rg = 321321321;
        porteiro06.cpf = 2131233311;
        porteiro06.portaria = "Portaria- Lateral";


        empressoraPorteiro.imprimaa(porteiro05);
        empressoraPorteiro.imprimaa(porteiro06);

    }
}
