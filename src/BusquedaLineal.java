

public class BusquedaLineal {

    //Búsqueda de forma lineal o secuencial
    int busquedaLineal(int[] miarreglo, int datoabuscar){
        //Creamos una variable in llamada valor y la convertimos en Integer para que sea nula
        int valor = -1;
        //Con un ciclo for recorremos el arreglo
        //Inciando con la variable i en 0, si i es menor al número total de datos i va aumentando de 1 en 1
        //hasta encontrar el número a buscar
        for(int i = 0; i < miarreglo.length; i++){
            //Con un if comparamos cada elemento del arreglo con el número a buscar
            if (datoabuscar == miarreglo[i]){
                //si este es igual la variable valor ya no es nula y toma el valor de i y sale del ciclo
                valor = i;
                break;
            }
        }
        return valor; //Se retorna la variable valor
    }

}
