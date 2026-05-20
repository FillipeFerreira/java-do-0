package javaIntroducaoClasses;

public class Test {
    public static void main(String[] args) {
        // Garanta que o package é o mesmo


        // 1. Criando (Instanciando) o objeto pessoa
        Pessoa pessoa = new Pessoa();


        pessoa.nome = "Fillipe";
        pessoa.idade = 25;
        pessoa.sexo = 'M';
        pessoa.medicado = " false";


        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Sexo: " + pessoa.sexo);
        System.out.println("medicado " + pessoa.medicado);

        System.out.println("--------------------------------------");
        Pessoa pessoa01 = new Pessoa();
        pessoa01.nome = "luiz";
        pessoa01.idade = 36;
        pessoa01.sexo = 'm';
        pessoa01.medicado = " True";
        System.out.println("nome " + pessoa01.nome);
        System.out.println("sexo " + pessoa01.sexo);
        System.out.println("idade " + pessoa01.idade);
        System.out.println("medicado  " + pessoa01.medicado);

        System.out.println("--------------------------------------");

        Pessoa pessoa02 = new Pessoa();

        pessoa02.nome = "ana";
        pessoa02.idade = 62;
        pessoa02.sexo = 'f';
        pessoa02.medicado = " True";

        System.out.println("nome " + pessoa02.nome);
        System.out.println("sexo " + pessoa02.sexo);
        System.out.println("nome " + pessoa02.idade);
        System.out.println("medicado " + pessoa02.medicado);

        System.out.println("--------------------------------------");

    }

}

