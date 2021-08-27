
package programacionfuncional;

import java.util.Comparator;


public class MayorAMenor implements Comparator<Integer>{

    /***
     * 
     * Si el primer numero es menor que el segundo, reotorna un numero positivo
     * Si los dos numero son iguales retorna 0
     * Si el primer numero es mayor que el segundo numero retorna un numero negativo
     * 
     */
    
    @Override
    public int compare(Integer t, Integer t1) {
        return -(t.compareTo(t1));
    }

}
