package Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio14 {
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(Desafio14::ehPrimo)
                .max(Comparator.naturalOrder())
                .ifPresent(primo -> System.out.println("O maior número primo é: " + primo));
    }
}
