package maratona_java_Dev_Dojo;

public class Execicio_03_operadores {

    public static void main(String[] args)
    {
        //operadores  + - / * //numeros inteiros.

        int numeros  = 10;
        int numero3  = 20;

        System.out.println( numero3 * numeros);
        System.out.println( numero3 / numeros);
        System.out.println( numero3 + numeros);
        System.out.println( numero3 - numeros);

        System.out.println("---------------------------------------------------------------------------");

        int resto = 21 % 2;

        System.out.println(resto);

        System.out.println("----------------------------------------------------------------------------");

        //  < >  <= >=  atribuicao    comparacao == diferente !

        boolean isDezMaiorQueVinte = 10 > 20 ;
        boolean isDezIgualAvinte = 10 == 20 ;
        boolean isDezMenorQueVinte = 10 > 20 ;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte ="+isDezMaiorQueVinte);
        System.out.println("isDezIgualAvinte ="+isDezIgualAvinte);
        System.out.println("isDezMenorQueVinte ="+isDezMenorQueVinte);
        System.out.println("isDezDiferenteVinte = "+isDezDiferenteVinte);


        System.out.println("----------------------------------------------------------------------------");

        // && (and) || (or )



    }
}