package Funcional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo {
    public static void main(String[] args) {
        //Opção 1
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Function<Integer, Integer> dobrar = numero -> numero * 2; //crio a função que recebe um número e retorna o quadrado dele

        List<Integer> numerosQuadrados = numeros.stream()
                .map(dobrar) //chamo a função com o stream
                .toList();

        numerosQuadrados.forEach(System.out::println);

        System.out.println("---");

        //Opção 2
        List<Integer> numerosQuadrados2 = numeros.stream()
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer numero) {
                        return numero * 2;
                    }
                })
                .toList();

        numerosQuadrados2.forEach(System.out::println);

        System.out.println("---");

        //Opção 3
        List<Integer> numerosQuadrados3 = numeros.stream()
                .map(n -> n * 2)
                .toList();

        numerosQuadrados3.forEach(System.out::println);
    }
}
