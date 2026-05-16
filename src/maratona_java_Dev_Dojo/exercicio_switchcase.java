package introducao;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual dia da semana hj, responde 1 para domingo 7 para sabado ");

        int diadasemana = scanner.nextInt();


        switch (diadasemana) {

            case 1:
                System.out.println("dom");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("qua");
                break;
            case 5:
                System.out.println("qui");
                break;
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("opcao invalida");


                System.out.println("qual seu sexto  ? responda M para masculino e F para femino");
                String sexos = scanner.next().toUpperCase();
                switch (sexos) {
                    case "M":
                        System.out.println("masculino");
                        break;
                    case "F":
                        System.out.println("feminino");
                        break;
                    default:
                        System.out.println("caractere invalido");


                }

                scanner.close();
        }
    }
}