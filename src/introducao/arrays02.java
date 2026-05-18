package introducao;
import java.util.Arrays;
import java.util.Collections;
public class arrays02 {
    public static void main(String[] args) {


        int[] nome = new int[]{1, 3, 4, 5, 5, 12, 312, 3, 123, 12, 312, 321, 321, 312, 31, 23, 12};


        for (int num : nome) {
            System.out.println(num);

        }
        Integer[] numeros = {5, 3, 12, 1, 123, 9, 55};

        Arrays.sort(numeros, Collections.reverseOrder());
        for (int num : numeros) {
            System.out.println(num);

        }
    }
}