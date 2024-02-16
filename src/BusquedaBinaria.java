public class BusquedaBinaria {


    //Metodo para implementar la búsqueda binaria

    int busquedaBinaria(int miarray[], int datoabuscar){


        int inicio = 0, totalDatos = miarray.length -1;

        // Ciclo para recorrer el arreglo

        while (inicio <= totalDatos){

            //Se divide el arreglo a la mitad y se guarda en la variable m
            int m = inicio + (totalDatos - inicio)/2;

            //Con un if verificamos que la variable m osea el valor de en medio del array sea igual al número buscado
            if(miarray[m] == datoabuscar)
                return m; //Si es igual, se retorna la variable m

            //Ahora la variable m tiene el valor del centro del array
            //Con un if verificamos si la variable m es menor al número a buscar
            if(miarray[m] < datoabuscar)
                inicio = m + 1; //Si es menor, la variable inicio tomará el valor de m + 1 para excluir el valor de m
                                //y tomar los valores mayores a m
            else
                totalDatos = m - 1; //Si no es menor, la variable totalDatos tomará el valor m - 1 para excluir el valor de m
                                    //y tomar los valores menores a m
        }
        return -1; //si el número a buscar en el arreglo no está se retornará -1 que significa que no existe
    }



}
