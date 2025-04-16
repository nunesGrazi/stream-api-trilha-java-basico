package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, verifique todos os números positivos e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(numero -> numero % 2 != 0)
                .sorted()
                .forEach(System.out::println);
    }
}
