package introducao;

public class tiposPrimitivos {
    public static void main(String[] args) {// Tipos primitivos : int,double, float, char,short, long , boolean.
        int idade = 10;
        double salarioDOuble = 2000.0;
        long numerosGrandes = 100000;
        float salarioFloat = 20.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        char caracter2 = '\u0041';
        var numeros = 12;
        /*---------------------------------------------------------------------------------------------------*/
        System.out.println(idade);
        System.out.println(false);
        System.out.println(salarioFloat);
        System.out.println(salarioDOuble);
        System.out.println(numerosGrandes);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(caracter2 + "Comment");
        System.out.println(numeros);


        /*-----------------------------------------------------------------------------------*/


        String falandoString = "It is not a primitive type";
        System.out.println(falandoString);

    }
}
