import java.util.List;

public class excercise6 {

    public static boolean estaOrdenada(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> lista1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lista2 = List.of(5, 3, 4, 2, 1);

        System.out.println("La lista 1 es: " + estaOrdenada(lista1));
        System.out.println("La lista 2 es: " + estaOrdenada(lista2));
    }
}
