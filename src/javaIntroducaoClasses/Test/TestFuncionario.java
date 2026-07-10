package javaIntroducaoClasses.Test;

public class TestFuncionario {

    public static void main(String[] args) {
        FuncionariosSalarios funcionariosSalarios00 = new FuncionariosSalarios();


        funcionariosSalarios00.nome = "Fillipe";
        funcionariosSalarios00.idade = 33;
        funcionariosSalarios00.salarios = new double[]{0, 20, 10,0};

        double somaSalarios = 0;





        for (int i = 0; i < funcionariosSalarios00.salarios.length; i++) {
            somaSalarios += funcionariosSalarios00.salarios[i];


        }double mediaSalarios =  somaSalarios / funcionariosSalarios00.salarios.length;

            funcionariosSalarios00.imprimir();
              System.out.printf("A media dos salarios e: R$ %.2f%n", mediaSalarios);


    }
}
