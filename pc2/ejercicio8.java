package pc2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio8 {
    public static void main(String[] args) {
       
        List<Integer> numeros = Arrays.asList(10, 5, 8, 12, 7, 6, 15, 20);

       
        List<Integer> resultado = numeros.stream()
                .map(numero -> numero * numero * numero) 
                .filter(cubo -> cubo > 50) 
                .collect(Collectors.toList());

        
        System.out.println("Números cuyo cubo es mayor a 50: " + resultado);
    }
}
