public class excercise4 {

    public static String invertirCadena(String cadena) {

        String invert = "";

        for(int i = cadena.length() -1; i >= 0; i--){
            invert += cadena.charAt(i);
            System.out.println(invert);
        }
        return invert;
    }

    public static void main(String[] args) {
        String cadena = "Hola mundo";


        System.out.println("El texto invertido es: " + invertirCadena(cadena));
    }

}
