package introducao.Metodos.testMetodos;

import introducao.Metodos.calculadora;

public class testcalculadora {
    public static void main(String[] args) {

        calculadora calculadora = new calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("\nFinal de calculadora");

        calculadora.subritraiDoisNumeros();
        System.out.println("\n subritrai numeros final");


        calculadora.MultiplicarDoisNumeros();
        System.out.println("multiplicar ");
    }
}
