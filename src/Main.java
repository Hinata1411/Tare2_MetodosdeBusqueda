import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Creamos un arreglo desordenado
        Integer[] miarreglo = {1, 5, 2, 6, 3, 7, 8, 10, 4, 9};

        //Primero ordenamos el arreglo
        Arrays.sort(miarreglo);

        //Mostramos el arreglo ordenado en la consola
        System.out.println("Arreglo: " + Arrays.toString(miarreglo));


    }

}