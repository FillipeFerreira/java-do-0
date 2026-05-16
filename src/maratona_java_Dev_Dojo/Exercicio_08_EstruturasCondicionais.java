package maratona_java_Dev_Dojo;

import java.util.Scanner;

public class Exercicio_08_EstruturasCondicionais {

    public static void main(String[] args)
    {
        int idade =18;
        String categoria;
        if (idade <15){
            categoria =  "categoria Infatil"; }
        else if (idade >= 15 && idade <18) {
            categoria ="categoria juvenil";}
        else {
            categoria =("categoria adulta");
        }
        System.out.println(categoria);

    }


}





























