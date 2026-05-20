package javaIntroducaoClasses;

public class Test {
    public static void main(String[] args) {
        // Garanta que o package é o mesmo


        // 1. Criando (Instanciando) o objeto pessoa
        Pessoa pessoa = new Pessoa();

        // 2. Colocando dados nela (Atenção com as aspas!)
        pessoa.nome = "Fillipe"; // Texto usa aspas duplas ""
        pessoa.idade = 25;       // Número não usa aspas
        pessoa.sexo = 'M';       // Se no seu objeto for 'char', usa aspas simples ''
        // pessoa.sexo = "M";    // Se no seu objeto for 'String', usa aspas duplas ""

        // 3. Imprimindo os dados para ver se funcionou
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Sexo: " + pessoa.sexo);

        System.out.println("--------------------------------------");
        Pessoa pessoa01 = new Pessoa();
        pessoa01.nome = "luiz";
        pessoa01.idade = 36;
        pessoa01.sexo = 'm';
        System.out.println("nome " +pessoa01.nome );
        System.out.println("sexo " +pessoa01.idade );
        System.out.println("nome " +pessoa01.sexo );

        System.out.println("--------------------------------------");

        Pessoa pessoa02 = new Pessoa();

        pessoa02.nome = "ana";
        pessoa02.idade = 62;
        pessoa02.sexo = 'f';

        System.out.println("nome " +pessoa02.nome );
        System.out.println("sexo " +pessoa02.idade );
        System.out.println("nome " +pessoa02 .sexo );
    }

}

