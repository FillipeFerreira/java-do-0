package introducao.Metodos;

public class calculadora {

    public void somaDoisNumeros() {

        System.out.println(10 + 10);


    }

    public void subritraiDoisNumeros() {

        System.out.println(1 - 0);


    }

    public void MultiplicarDoisNumeros(int num, int num2, int num3) {

        System.out.println(num * num2 * num3);

    }

    public void somaArray(int[] numeros) {

        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);

    }

    public  void somaVarArgs (int ... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }
        System.out.println(soma);

    }

}


