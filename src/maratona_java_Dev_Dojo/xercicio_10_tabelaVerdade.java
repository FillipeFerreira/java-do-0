package maratona_java_Dev_Dojo;

import java.util.Scanner;


public class xercicio_10_tabelaVerdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor do seu salario anual ?? informe ex : 100000");

        double salarioBruto = scanner.nextDouble();
        double taxaImposto;

        if (salarioBruto <= 34712) {
            taxaImposto = 9.70;
        } else if (salarioBruto <= 68507) {
            taxaImposto = 37.35;
        } else {
            taxaImposto = 49.50;
        }

        double valorImposto = (salarioBruto / 100) * taxaImposto;
        double salarioLiquido = salarioBruto - valorImposto;

        System.out.println("Total de imposto a pagar: " + valorImposto);
        System.out.println("No total, tirando impostos, vai receber: " + salarioLiquido);

        scanner.close();
    }
}


