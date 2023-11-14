package pc2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Descendente {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 7, 3, 10, 6, 4, 9);

        List<Integer> valoresOrdenadosDescendente = numeros.stream()
                .sorted((a, b) -> b.compareTo(a))
            .collect(Collectors.toList());      
        valoresOrdenadosDescendente.forEach(System.out::println);
    }
}
