public class BusquedaBinaria {


    //Metodo para implementar la búsqueda binaria

    int busquedaBinaria(Integer miarray[], Integer x){

        int l = 0, r = miarray.length -1;
        while (l <= r){
            int m = l + (r - 1)/2;

            if(miarray[m] == x)
                return m;
            if(miarray[m] < x)
                l += m;
            else
                r -= m;
        }
        return -1;
    }



}
