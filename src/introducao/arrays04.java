package introducao;

public class arrays04 {
    public static void main(String[] args) {

        int[][] nomes = new int[3][3];

        nomes[0][0] = 0; nomes[0][1] = 1; nomes[0][2] = 1;
        nomes[1][0] = 2; nomes[1][1] = 3; nomes[1][2] = 3;
        nomes[2][0] = 4; nomes[2][1] = 5; nomes[2][2] = 5;

        // Variáveis para guardar a soma de cada coluna
        int somaColuna0 = 0;
        int somaColuna1 = 0;
        int somaColuna2 = 0;

        // O truque aqui é inverter a lógica comum dos loops:
        // O loop 'j' (colunas) fica por fora e o 'i' (linhas) fica por dentro.
        for (int j = 0; j < 3; j++) {
            int somaAtual = 0;

            for (int i = 0; i < 3; i++) {
                somaAtual += nomes[i][j]; // 'i' muda a linha, 'j' mantém a coluna fixa
            }

            // Salvando o resultado de cada coluna
            if (j == 0) {
                somaColuna0 = somaAtual;
                System.out.println("Soma da Coluna 1 (índice 0): " + somaColuna0);
            } else if (j == 1) {
                somaColuna1 = somaAtual;
                System.out.println("Soma da Coluna 2 (índice 1): " + somaColuna1);
            } else if (j == 2) {
                somaColuna2 = somaAtual;
                System.out.println("Soma da Coluna 3 (índice 2): " + somaColuna2);
            }
        }

        System.out.println("---------------------------------------");

        // Agora vamos descobrir qual é o maior valor usando if/else
        if (somaColuna0 >= somaColuna1 && somaColuna0 >= somaColuna2) {
            System.out.println("A Coluna 1 tem a maior soma: " + somaColuna0);
        } else if (somaColuna1 >= somaColuna0 && somaColuna1 >= somaColuna2) {
            System.out.println("A Coluna 2 tem a maior soma: " + somaColuna1);
        } else {
            System.out.println("A Coluna 3 tem a maior soma: " + somaColuna2);
        }
    }
}






