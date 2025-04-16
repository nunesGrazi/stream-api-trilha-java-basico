package Funcional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

        //Opção 1
        Consumer<Integer> numeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.forEach(numeroPar);

        System.out.println("---");

        //Opção 2 - diretamente no stream
        numeros.forEach(new Consumer<Integer>() {
            public void accept(Integer numero) {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            }
        });

        System.out.println("---");

        //Opção 3 - mais produtiva com lambda
        numeros.forEach(numero -> {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
        });

        System.out.println("---");

        //Opção 4 - Com predicate
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
