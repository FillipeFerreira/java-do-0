package maratona_java_Dev_Dojo;

import java.util.Scanner;


public class xercicio_09_EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e seu salario ? vamos ver se vai doar para o devDojo");

        double salario = scanner.nextDouble();
        String doarDevDojo = "vai doar 500,00 pro devDojo";
        String naoVaiDoarDevDojo = "nao vai doar 500 pro  devDojo";

        String resultado = salario >= 5000.01 ? doarDevDojo : naoVaiDoarDevDojo;


        System.out.println(resultado);


    }
}
