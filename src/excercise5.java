import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class excercise5 {
    public static List<Integer> eliminarDuplicados(List<Integer> arr) {
        Set<Integer> set = new LinkedHashSet<>(arr);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 2, 3, 4, 4, 5);

        System.out.println("La lista es: " + eliminarDuplicados(numeros));
    }
}