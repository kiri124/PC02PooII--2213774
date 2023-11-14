package pc2;

import java.util.Arrays;
import java.util.List;

public class AleComienzan5 {
    public static void main(String[] args) {
       
        List<Integer> numeros = Arrays.asList(53200,56, 300, 4, 5, 6, 7, 8, 59, 10);
//ejercicio 2
        
        numeros.stream()
               .filter(numero -> numero.toString().startsWith("5"))
               .forEach(System.out::println);
    }
}
