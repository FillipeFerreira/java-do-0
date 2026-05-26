package introducao.Metodos.testMetodos;

import introducao.Metodos.calculadora;
import  java.util.Scanner;


public class testcalculadora {
    public static void main(String[] args) {

        calculadora calculadora = new calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("\nFinal de calculadora");

        calculadora.subritraiDoisNumeros();
        System.out.println("\n subritrai numeros final");


        System.out.println("digita um numero  para multiplicar numero inteiro ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("digita um numero ");
        int num2 = sc.nextInt();
        System.out.println("digita um numero ");
        int num3 = sc.nextInt();

        calculadora.MultiplicarDoisNumeros(num,num2,num3);



        }



        }

