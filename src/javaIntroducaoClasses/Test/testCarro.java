package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.carro;

public class testCarro {
    public static void main(String[] args) {

        carro carro01 = new carro();

        carro01.nome = "chevete";
        carro01.modelo = "passeio";
        carro01.cor = "vermelho";
        carro01.cavalos = 120;
        carro01.ano = 1990;

        System.out.println("---------------------------------------");
        System.out.println("nome do carro " + carro01.nome);
        System.out.println("modelo do carro " + carro01.nome);
        System.out.println("cor do veiculo " + carro01.cor);
        System.out.println("quantidade de cavalos" + carro01.cavalos);
        System.out.println("ano do carro " + carro01.ano);

        System.out.println("------------------------------------");
        carro carro02 = new carro();

        carro02.nome = "opala";
        carro02.modelo = "passeio";
        carro02.cor = "preto";
        carro02.cavalos = 220;
        carro02.ano = 1980;

        System.out.println("nome do carro " + carro02.nome );
        System.out.println("modelo do carro " + carro02.modelo);
        System.out.println("cor do veiculo " + carro02.cor);
        System.out.println("quantidade de cavalos" + carro02.cavalos);
        System.out.println("ano do carro " + carro02.ano);
        System.out.println("------------------------------------");



    }

 }



