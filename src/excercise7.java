import java.util.List;
import java.util.ArrayList;

public class excercise7 {

    public static List<Integer> combinarListas(List<Integer> arr1, List<Integer> arr2) {

        List<Integer> result = new ArrayList<>(arr1);
        result.addAll(arr2);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 6, 8, 9);
        List<Integer> list2 = List.of(3, 6, 5, 9, 7);

        System.out.printf("La lista " + list1 + " combinada con la lista " + list2 + " da como resultado: " + combinarListas(list1, list2));
    }
}
