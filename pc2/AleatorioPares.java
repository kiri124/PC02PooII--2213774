package pc2;
import java.util.Arrays;
import java.util.List;

public class AleatorioPares {
    public static void main(String[] args) {
     
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //ejercicio 1
        numeros.stream()
               .filter(numero -> numero % 2 == 0)
               .forEach(System.out::println);
    }
}

