package Livro_Use_A_Cabeca_Java;

import java.util.Arrays;

public class ForAtualizado {

    public static void main(String[] args) {

        String [] nomes = {"fillipe", "luiz", "ana flavia"};

        for ( String nomes2 : nomes ) {

          int nomes3 = Integer.parseInt(nomes2);
            System.out.println(nomes3);
        }

    }
}
