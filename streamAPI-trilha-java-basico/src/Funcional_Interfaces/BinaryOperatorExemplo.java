package Funcional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        //Opção 1
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream()
            .reduce(0,somar);

        System.out.println(resultado);

        System.out.println("---");

        //Opção 2
        int resultado2 = numeros.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer num1, Integer num2) {
                        return num1 + num2;
                    }
                });

        System.out.println(resultado2);

        System.out.println("---");

        //Opção 3
        int resultado3 = numeros.stream()
                .reduce(0, (num1, num2) -> num1 + num2);

        System.out.println(resultado3);

        System.out.println("---");

        //Opção 4
        int resultado4 = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println(resultado4);
    }
}
