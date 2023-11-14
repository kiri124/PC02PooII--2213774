package pc2;

import java.util.Arrays;
import java.util.List;

public class elementosPresentes {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long totalElementos = numeros.stream().count();

        System.out.println("Número total de elementos: " + totalElementos);
    }
}
