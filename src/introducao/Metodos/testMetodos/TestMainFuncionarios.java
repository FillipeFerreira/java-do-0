package introducao.Metodos.testMetodos;

import static introducao.Metodos.testMetodos.funcionarios.*;

public class TestMainFuncionarios {

    public static void main(String[] args) {
        funcionarios funcionarios00 = new funcionarios();
        funcionarios funcionarios01 = new funcionarios();
        funcionarios funcionarios02 = new funcionarios();


        funcionarios00.nome = "fillipe";
        funcionarios00.idade = 32;
        funcionarios00.salario = new double[]{22,43224,34222};;

        funcionarios01.nome = "mario";
        funcionarios01.idade = 42;
        funcionarios01.salario = new double[]{22223,43224,342};;

        funcionarios02.nome = "fernando";
        funcionarios02.idade = 22;
        funcionarios02.salario = new double[]{23222,43224,342};


        funcionarios00.imprime();
        funcionarios01.imprime();
        funcionarios02.imprime();

        System.out.print("media salarial ");
        System.out.print("media de idade");


        System.out.println("---------------");
        funcionarios.imprimirmediasalario(funcionarios00.salario);
        funcionarios.imprimirmediasalario(funcionarios01.salario);
        funcionarios.imprimirmediasalario(funcionarios02.salario);


    }
}
