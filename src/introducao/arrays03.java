package introducao;


public class arrays03 {
    public static void main(String[] args) {


        int[][] nomes = new int[3][3];

        nomes[0][0] = 0;
        nomes[0][1] = 1;
        nomes[0][2] = 1;

        nomes[1][0] = 2;
        nomes[1][1] = 3;
        nomes[1][2] = 3;

        nomes[2][0] = 4;
        nomes[2][1] = 5;
        nomes[2][2] = 5;


        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[i].length; j++) {
                System.out.println(nomes[i][j]);
            }

            System.out.println("--------------------------------------------------------------");
                for (int [] o:nomes ){
                    for (int j :o)
                        System.out.println(j);
                }


        }

            }


        }










