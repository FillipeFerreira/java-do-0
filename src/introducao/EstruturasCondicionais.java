package introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {


        boolean banana = true;
        boolean manga = false;


        if (banana && manga) {
            System.out.println(" true e false ?");
        } else if (banana || manga) {
            System.out.println("1 verdadeiro ");

        } else {
            System.out.println("fora do if do banana");
        }

        System.out.println("fora do if");


    }

}