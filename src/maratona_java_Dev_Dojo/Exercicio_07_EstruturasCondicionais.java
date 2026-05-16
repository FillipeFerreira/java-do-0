package maratona_java_Dev_Dojo;

import java.util.Scanner;

public class Exercicio_07_EstruturasCondicionais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ira poder comprar bebidas acoolicas ou nao ? dinheiro idade?

        System.out.println("Ola Bom dia, Qual e sua idade ?");

        int idade = scanner.nextInt();

        System.out.println("qual valor das compras");

        int valorCompras = scanner.nextInt();
        System.out.println("Quanto tem de dinheiro ?");

        int dinheiro =scanner.nextInt();

        System.out.println("tem bebidas alcolicas, responda, true para sim, e false para nao ?!");

        boolean temBebida = scanner.next().equalsIgnoreCase("sim");

        if ((idade >=18 )  && (valorCompras <= dinheiro  ))
            System.out.println("Opa pode levar as compras ");
             else if (valorCompras <= dinheiro &&  temBebida ==false) {
                 System.out.println("opa pode levar suas compras");}
             else if (valorCompras > dinheiro) {
                     System.out.println("seu dinheiro nao esta dando para as compras");}


        }


    }





























