package pc2;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Valor3Veces {
    public static void main(String[] args) {
      
        Integer[] numeros = {10, 2, 3, 401, 50, 10, 2, 2, 3};

        List<Integer> listaNumeros = Arrays.asList(numeros);

        boolean hayRepetidos = tieneRepetidos(listaNumeros, 3);

        System.out.println("¿Hay valores que aparecen al menos tres veces? " + hayRepetidos);
    }

    private static boolean tieneRepetidos(List<Integer> lista, int cantidadRequerida) {
    
        Map<Integer, Long> conteoPorNumero = lista.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                 
        return conteoPorNumero.values().stream().anyMatch(contador -> contador >= cantidadRequerida);
    }
}
