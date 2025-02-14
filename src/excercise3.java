import java.util.ArrayList;
import java.util.List;

public class excercise3 {
    public static double calcularPromedio(List<Integer> lista) {
        if (lista.isEmpty()) return 0; // Evita división por 0

        double suma = 0;

        for (int num : lista) {
            suma += num;
        }
        return suma / lista.size();
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(2, 65, 9, 8, 3);

        System.out.printf("El promedio de la lisa " + arr + " es: " + calcularPromedio(arr));

    }

}
