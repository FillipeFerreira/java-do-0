package maratona_java_Dev_Dojo;

import java.util.Scanner;


public class xercicio_10_tabelaVerdade {
    public static void main(String[] args)

    {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Qual valor do seu salario anual ?? informe ex : 100000");

                double salarioBruto = scanner.nextDouble();
                double taxaImposto = 0;

                // Adicionadas as chaves corretamente em todos os blocos
                if (salarioBruto <= 34712) {
                    taxaImposto = 9.70;
                } else if (salarioBruto <= 68507) { // Não precisa testar se é >= 34713, o 'else' já garante isso
                    taxaImposto = 37.35;
                } else { // Se não é nenhum dos de cima, com certeza é maior que 68507
                    taxaImposto = 49.50;
                }

                // Calculando o imposto e o salário final
                double valorImposto = (salarioBruto / 100) * taxaImposto;
                double salarioLiquido = salarioBruto - valorImposto;

                System.out.println("Total de imposto a pagar: " + valorImposto);
                System.out.println("No total, tirando impostos, vai receber: " + salarioLiquido);

                scanner.close();
           }
}


