import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creamos un arreglo desordenado
        int[] miarreglo = {1, 13, 4, 10, 50};

        //Primero ordenamos el arreglo
        Arrays.sort(miarreglo);

        //Mostramos el arreglo ordenado en la consola
        System.out.println("Arreglo: " + Arrays.toString(miarreglo));

        //Instanciamos el método de Busqueda Binaria
        BusquedaBinaria buscarBin = new BusquedaBinaria();

        //Pedimos al usuario que ingrese el número a buscar y lo guardamos en la variable buscar
        System.out.println("Ingrese el número a buscar: ");
        Scanner sr = new Scanner(System.in);
        int buscar = sr.nextInt();

        System.out.println("------BÚSQUEDA BINARIA------");
        //Creamos la variable resultadobin para guardar el resultado obtenido
        //y le implementamos el método busquedaBinaria colocandole como parámetros
        //el arreglo y la variable buscar que es el dato a buscar
        int resultadobin = buscarBin.busquedaBinaria(miarreglo, buscar);
        //Con un if verificamos si el número a buscar es igual a -1
        if(resultadobin == -1)
            //Si es igual a -1 significa que el número no existe y se muestra el siguiente mensaje
            System.out.println("El número no se encuentra en la lista de datos");
        else
            //Si no es igual a -1 significa que si existe dentro del arreglo y se muestra el siguiente mensaje
            System.out.println("El elemento encontrado en: " + "indice " + resultadobin);


    }

}