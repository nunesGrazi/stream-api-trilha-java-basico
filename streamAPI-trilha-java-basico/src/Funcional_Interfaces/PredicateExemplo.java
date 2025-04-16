package Funcional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {
    public static void main(String[] args) {
        //Opção 1
        List<String> palavras = Arrays.asList("java","kotlin", "python");

        Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;

        palavras.stream().filter(maisDeCincoLetras).forEach(System.out::println);

        System.out.println("---");

        //Opção 2
        palavras.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String palavra) {
                return palavra.length() > 5;
            }
        }).forEach(System.out::println);

        System.out.println("---");

        //Opção 3
        palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .forEach(System.out::println);


    }
}
