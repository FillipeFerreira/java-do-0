package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.coordenadores;

public class Testcordenadores {

    public static void main(String[] args) {

        coordenadores coordenadores01 = new coordenadores();

        coordenadores01.idade = 21;
        coordenadores.nome = "Fillipe";
        coordenadores01.area = "geral";
        coordenadores01.tempo = "3meses";
        coordenadores01.rg = 2321321;
        coordenadores01.cpf = 321321;

        System.out.println("----------------------------");
        System.out.println("idade " + coordenadores01.idade);
        System.out.println("nome " + coordenadores01.nome);
        System.out.println("area " + coordenadores01.area);
        System.out.println("tempo " + coordenadores01.tempo);
        System.out.println("rg " + coordenadores01.rg);
        System.out.println("cpf " + coordenadores01.cpf);
        System.out.println("----------------------------");


        coordenadores coordenadores02 = new coordenadores();

        coordenadores02.idade = 32;
        coordenadores02.nome = "luana";
        coordenadores02.area = "adm";
        coordenadores02.tempo = "5meses";
        coordenadores02.rg = 23213211;
        coordenadores02.cpf = 321323211;

        System.out.println("----------------------------");

        System.out.println("idade " + coordenadores02.idade);
        System.out.println("nome " + coordenadores02.nome);
        System.out.println("area " + coordenadores02.area);
        System.out.println("tempo " + coordenadores02.tempo);
        System.out.println("rg " + coordenadores02.rg);
        System.out.println("cpf " + coordenadores02.cpf);

        System.out.println("----------------------------");
    }
}
