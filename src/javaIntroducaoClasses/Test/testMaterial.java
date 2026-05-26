package javaIntroducaoClasses.Test;

import javaIntroducaoClasses.material;

public class testMaterial {

    public static void main(String[] args) {

        material material00 = new material();

        material00.nome = "material geral";
        material00.codigo = 56184;
        material00.url = 321312;
        material00.id = 321312;
        material00.fornecedor = "Loja Material";


        System.out.println("nome material  " + material00.nome);
        System.out.println("codigo material  " + material00.codigo);
        System.out.println("url para compra  " + material00.url);
        System.out.println("id do material   " + material00.id);
        System.out.println("fornecedor de material " + material00.fornecedor);



    }
}
