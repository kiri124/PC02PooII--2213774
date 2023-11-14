package pc2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ejercicio10 {
    public static void main(String[] args) {
       
        String[] cadenas = {"apple", "banana", "orange", "banana", "apple", "grape", "orange"};

        Map<String, Long> duplicadosConteo = encontrarDuplicados(cadenas);
        
        duplicadosConteo.forEach((cadena, frecuencia) ->
                System.out.println("Elemento: " + cadena + ", Frecuencia: " + frecuencia));
    }

    private static Map<String, Long> encontrarDuplicados(String[] array) {
        return Arrays.stream(array)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
