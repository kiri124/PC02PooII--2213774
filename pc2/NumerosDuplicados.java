package pc2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumerosDuplicados {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 7);

        //ejercicio 3
        Map<Integer, Long> conteoPorNumero = numeros.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        conteoPorNumero.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
