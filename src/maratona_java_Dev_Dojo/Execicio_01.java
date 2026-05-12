package maratona_java_Dev_Dojo;

import java.time.format.TextStyle;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Locale;

public class Execicio_01 {

    public static void main(String[] args) {


        LocalDate hoje = LocalDate.now();


        String mesPt = hoje.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();

        System.out.println("Qual endereco voce mora?");
        String endereco = sc.nextLine();

        System.out.println("Quanto de salario voce recebe?");
        float salario = sc.nextFloat();

        System.out.println("Qual o dia do pagamento (1 a 31)?");

        byte diaPagamento = sc.nextByte();

        if ((diaPagamento > 0) && (diaPagamento < 31))
        System.out.println("Eu " + nome + ", morando no " + endereco +
                ", confirmo que recebi o salario de R$ " + salario +
                " no dia " + diaPagamento + " do mes de " + mesPt);
        else {
            System.out.println("numero invalido, escreva numero de 1 a 31");
        }


        sc.close();
    }
}