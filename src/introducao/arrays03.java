package introducao;


public class arrays03 {
    public static void main(String[] args) {


        int[][] nomes = new int[3][2];

        nomes[0][0] = 0;
        nomes[0][1] = 1;

        nomes[1][0] = 2;
        nomes[1][1] = 3;

        nomes[2][0] = 4;
        nomes[2][1] = 5;

        System.out.println(nomes[0][0]);
        System.out.println(nomes[0][1]);
        System.out.println(nomes[1][0]);
        System.out.println(nomes[1][1]);
        System.out.println(nomes[2][0]);
        System.out.println(nomes[2][1]);


        for (int[] linha : nomes) {
            for (int numero : linha) {
                System.out.println(numero);

            }

        }


    }

}