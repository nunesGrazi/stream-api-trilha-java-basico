package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        //Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosQuadrados = numeros.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(numerosQuadrados);
    }
}
