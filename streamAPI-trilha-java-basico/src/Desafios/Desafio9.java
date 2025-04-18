package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        //Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean distintos = numeros.stream().distinct().count() == numeros.size();

        System.out.println("Todos os números são distintos? " + distintos);

    }
}
