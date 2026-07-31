import java.util.Scanner;
import java.util.Arrays;

public class ExercicioDoisDois {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();


        int [] contador = {a,b,c};

        Arrays.sort(contador);

        System.out.println(contador[0]);
        System.out.println(contador[1]);
        System.out.println(contador[2]);

        System.out.println();
        for (int i = 0; i < contador.length; i++) {
            System.out.println(contador[i]);
        }
        System.out.println();
        for (int numero :contador){
            System.out.println(numero);
        }

        }
    }



