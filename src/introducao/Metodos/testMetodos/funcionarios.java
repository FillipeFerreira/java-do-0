package introducao.Metodos.testMetodos;

import java.util.Arrays; // Importante caso queira usar utilitários de Array

public class funcionarios {

    public String nome;
    public int idade;
    public double[] salario;

    // Método de objeto (SEM static) - Imprime os dados de CADA funcionário individualmente
    public void imprime() {
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (this.salario != null) {
            System.out.print("Salários: ");
            for (double valor : this.salario) {
                System.out.printf("[%.2f] ", valor);
            }
            System.out.println();
        } else {
            System.out.println("Nenhum salário cadastrado.");
        }
    }


    public static void imprimirmediasalario(double[] salario) {
        if (salario == null || salario.length == 0) {
            System.out.println("Não há salários para calcular a média.");
            return;
        }

        double media = 0;
        for (double salarios : salario) {
            media += salarios;
        }
        media /= salario.length;


        System.out.printf("Média Salarial: %.2f%n", media);
    }
}