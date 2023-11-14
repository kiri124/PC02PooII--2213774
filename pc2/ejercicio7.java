package pc2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio7 {
    public static void main(String[] args) {
        // Arrays de cadenas
        String[] A = {"1", "2", "3", "4", "5", "8", "23"};
        String[] B = {"4", "6", "8", "0", "2"};

        // Concatenar los arrays
        String[] AB = concatArrays(A, B);

        // Imprimir el resultado
        System.out.println(Arrays.toString(AB));
    }

    private static String[] concatArrays(String[] A, String[] B) {
        // Convertir los arrays a listas
        List<String> listaA = new ArrayList<>(Arrays.asList(A));
        List<String> listaB = Arrays.asList(B);

        // Concatenar las listas
        listaA.addAll(listaB);

        // Convertir la lista resultante a un array
        return listaA.toArray(new String[0]);
    }
}
