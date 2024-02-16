import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creamos un arreglo desordenado
        int[] miarreglo = {1, 10, 9, 13, 5, 4, 17, 50, 100};

        //Instanciamos el método de Busqueda Binaria
        BusquedaBinaria buscarBin = new BusquedaBinaria();
        //Instanciamos el método de Busqueda Lineal
        BusquedaLineal buscarLin = new BusquedaLineal();

        //Mostramos el arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(miarreglo));
        //Pedimos al usuario que ingrese el número a buscar y lo guardamos en la variable buscar
        System.out.println("Ingrese el número a buscar en el arreglo: ");
        Scanner sr = new Scanner(System.in);
        int buscar = sr.nextInt();


        System.out.println("------BÚSQUEDA LINEAL------");
        //Mostramos el arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(miarreglo));
        //Creamos la variable resultadoLin para guardar el resultado obtenido
        //e implementamos el método busquedaLineal colocandole como parámetros
        //el arreglo y la variable buscar
        int resultadoLin = buscarLin.busquedaLineal(miarreglo, buscar);
        //Con un if verificamos si el resultado a buscar es igual a nulo
        if (resultadoLin == -1)
            //Si es igual a -1 significa que el número no existe y se muestra el siguiente mensaje
            System.out.println("El número no se encuentra en la lista de datos");
        else
            //Si no es igual a -1 significa que si existe dentro del arreglo y se muestra el siguiente mensaje
            System.out.println("El elemento encontrado por búsqueda Lineal esta en el indice: " + resultadoLin);

        System.out.println("------BÚSQUEDA BINARIA------");
        //Primero ordenamos el arreglo
        Arrays.sort(miarreglo);
        //Mostramos el arreglo ordenado en la consola
        System.out.println("Arreglo ordenado: " + Arrays.toString(miarreglo));
        //Creamos la variable resultadoBin para guardar el resultado obtenido
        //e implementamos el método busquedaBinaria colocandole como parámetros
        //el arreglo y la variable buscar que es el dato a buscar
        int resultadoBin = buscarBin.busquedaBinaria(miarreglo, buscar);
        //Con un if verificamos si el número a buscar es igual a -1
        if(resultadoBin == -1)
            //Si es igual a -1 significa que el número no existe y se muestra el siguiente mensaje
            System.out.println("El número no se encuentra en la lista de datos");
        else
            //Si no es igual a -1 significa que si existe dentro del arreglo y se muestra el siguiente mensaje
            System.out.println("El elemento encontrado por búsqueda Binaria esta en el indice " + resultadoBin);





    }

}