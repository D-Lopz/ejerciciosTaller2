//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gu
import java.util.ArrayList;
import java.util.List;


public class exercise1 {

    public static List<Double> listaPotencia(List<Integer> arr, int potencia){

        List<Double> resultado = new ArrayList<>();

        for (int num : arr) {
            resultado.add(Math.pow(num, potencia));
        }
        return resultado;
    }

    public static void main(String[] args) {

        List<Integer> arr = List.of(2, 3, 4, 5);
        int potencia = 3;

        List<Double> resultado = listaPotencia(arr, potencia);
        System.out.println(resultado);
    }
}
