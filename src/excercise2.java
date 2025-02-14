import java.util.ArrayList;
import java.util.List;

public class excercise2 {
    public static List<Integer> listasMultiplicacion(List<Integer> numeroA, List<Integer> numeroB) {

        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < numeroA.size(); i++) {
            resultado.add(numeroA.get(i) * numeroB.get(i));    ;
        }
        return resultado;
    }


    public static void main(String[] args) {

        List<Integer> numeroA = List.of(1, 2, 3, 4, 5);
        List<Integer> numeroB = List.of(6, 7, 8, 9, 10);

        List<Integer> resultado = listasMultiplicacion(numeroA, numeroB);

        System.out.printf("El resultado de la operación entre " + numeroA + " y " + numeroB + " es: " + resultado);
    }
}