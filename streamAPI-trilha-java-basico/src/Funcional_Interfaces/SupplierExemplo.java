package Funcional_Interfaces;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        //Opção 1
        Supplier<String> saudacao = () -> "Olá";

        List<String> listaSaudacao = Stream.generate(saudacao)
                .limit(5) //no maximo de 5
                .toList(); //coloca dentro da lista

        listaSaudacao.forEach(System.out::println);

        System.out.println("---");

        //Opção 2
        List<String> listaSaudacao2 = Stream.generate(new Supplier<String>() {
            public String get() {
                return "Olá";
            }
        }).limit(5).toList();

        listaSaudacao2.forEach(System.out::println);

        System.out.println("---");

        //Opção 3
        List<String> listaSaudacao3 = Stream.generate(() -> "Olá")
                .limit(5).toList();

        listaSaudacao3.forEach(System.out::println);
    }
}
