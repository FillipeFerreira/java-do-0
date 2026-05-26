package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.coordenadores;

public class testCordenadores {

    public static void main(String[] args) {

        coordenadores coordenadores01 = new coordenadores();

        coordenadores.idade = 21;
        coordenadores.nome = "Fillipe";
        coordenadores.area = "geral";
        coordenadores.tempo = "3meses";
        coordenadores.rg = 2321321;
        coordenadores.cpf = 321321;

        System.out.println("----------------------------");
        System.out.println("idade " + coordenadores.idade);
        System.out.println("nome " + coordenadores.nome);
        System.out.println("area " + coordenadores.area);
        System.out.println("tempo " + coordenadores.tempo);
        System.out.println("rg " + coordenadores.rg);
        System.out.println("cpf " + coordenadores.cpf);
        System.out.println("----------------------------");


        coordenadores coordenadores02 = new coordenadores();

        coordenadores.idade = 32;
        coordenadores.nome = "luana";
        coordenadores.area = "adm";
        coordenadores.tempo = "5meses";
        coordenadores.rg = 23213211;
        coordenadores.cpf = 321323211;

        System.out.println("----------------------------");

        System.out.println("idade " + coordenadores.idade);
        System.out.println("nome " + coordenadores.nome);
        System.out.println("area " + coordenadores.area);
        System.out.println("tempo " + coordenadores.tempo);
        System.out.println("rg " + coordenadores.rg);
        System.out.println("cpf " + coordenadores.cpf);

        System.out.println("----------------------------");
    }
}
