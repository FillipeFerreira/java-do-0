package maratona_java_Dev_Dojo;

public class Execicio_06_operadores {

    public static void main(String[] args) {
        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        System.out.println(contador);

        int contador2 = 0;
        contador2 -= 1;
        contador2--;
        System.out.println(contador2);


        int contaCorrente = 100;

        System.out.println("quanto e ?" + contaCorrente++);

        System.out.println(contaCorrente);


    }
}
























