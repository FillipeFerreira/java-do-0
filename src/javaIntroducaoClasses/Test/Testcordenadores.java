package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.cordenadores;

public class Testcordenadores {

    public static void main(String[] args) {

        cordenadores cordenadores01 = new cordenadores();

        cordenadores01.idade = 21;
        cordenadores01.nome = "Fillipe";
        cordenadores01.area = "geral";
        cordenadores01.tempo = "3meses";
        cordenadores01.rg = 2321321;
        cordenadores01.cpf = 321321;

        System.out.println("----------------------------");
        System.out.println("idade " + cordenadores01.idade);
        System.out.println("nome " + cordenadores01.nome);
        System.out.println("area " + cordenadores01.area);
        System.out.println("tempo " + cordenadores01.tempo);
        System.out.println("rg " + cordenadores01.rg);
        System.out.println("cpf " + cordenadores01.cpf);
        System.out.println("----------------------------");


        cordenadores cordenadores02 = new cordenadores();

        cordenadores02.idade = 32;
        cordenadores02.nome = "luana";
        cordenadores02.area = "adm";
        cordenadores02.tempo = "5meses";
        cordenadores02.rg = 23213211;
        cordenadores02.cpf = 321323211;
       
        System.out.println("----------------------------");

        System.out.println("idade " + cordenadores02.idade);
        System.out.println("nome " + cordenadores02.nome);
        System.out.println("area " + cordenadores02.area);
        System.out.println("tempo " + cordenadores02.tempo);
        System.out.println("rg " + cordenadores02.rg);
        System.out.println("cpf " + cordenadores02.cpf);

        System.out.println("----------------------------");
    }
}
