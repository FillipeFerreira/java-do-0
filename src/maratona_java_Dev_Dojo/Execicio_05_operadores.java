package maratona_java_Dev_Dojo;

public class Execicio_05_operadores {

    public static void main(String[] args)
    {



                double contaCorrente = 5000;
                double contaPoupanca = 2500;
                float precoPS6 = 5000;


                if (contaCorrente >= precoPS6 || contaPoupanca >= precoPS6) {
                    System.out.println("Ótimo! Você tem o valor em uma das contas e pode comprar à vista.");
                }
                else if (contaCorrente + contaPoupanca >= precoPS6) {
                    System.out.println("Você pode comprar, mas terá que somar o dinheiro das duas contas.");
                }
                else {
                    System.out.println("Saldo insuficiente. Continue economizando!");
                }
    }
}
























