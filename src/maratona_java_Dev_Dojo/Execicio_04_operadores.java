package maratona_java_Dev_Dojo;

public class Execicio_04_operadores {

    public static void main(String[] args)
    {
        // && (and) || (or )

        int idade = 32;
        float salario = 3500f;
        boolean isDentroDaLei = idade  > 30 && salario < 4612;
        boolean isDentroDaileiMenorQueTrinta = idade <30 && salario >= 3381;
        System.out.println("isDentroDaLei"+ isDentroDaLei);
        System.out.println("isDentroDaileiMenorQueTrinta"+ isDentroDaileiMenorQueTrinta);


        System.out.println("--------------------------------------------------------------------");




    }
}