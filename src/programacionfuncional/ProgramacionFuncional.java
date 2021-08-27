package programacionfuncional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProgramacionFuncional {

    public static void main(String[] args) {
        
        // Lambda
        List<Integer> listadoNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        Integer numeroA = 10;
        Integer numeroB = 12;
        // System.out.println(numeroA.compareTo(numeroB));
        
        // Primer implementacion
        // Clase que implementa comparator
        // listadoNumeros.sort(new MayorAMenor());
        
        // Segunda Implementacion
        // Clase Anonima
        /*
        listadoNumeros.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1) {
                return -(t.compareTo(t1));
            }
        });
        */
        
        // Tercera implemntacion
        // Lambda
        // listadoNumeros.sort((Integer numberA, Integer numberB)-> -(numberA.compareTo(numberB)));
        // listadoNumeros.sort((numberA, numberB)-> -(numberA.compareTo(numberB)));
        
        // Cuarta implementacion
        Comparator<Integer> comparador = (numberA, numberB)-> -(numberA.compareTo(numberB));
        // listadoNumeros.sort(comparador);
        
        
        /*
        for(Integer numero : listadoNumeros){
            System.out.println(numero);
        }

        */
        
        // forEach
        //listadoNumeros.forEach(n -> System.out.println(n));
        
        // forEach referencia a metodos ::
        // listadoNumeros.forEach(System.out::println);
        
        // forEach usando bloques de sentencias o instrucciones 
        /*
        listadoNumeros.forEach( numero -> {
            numero = numero + 2;
            System.out.println(numero);
        });
        */
        
        
        // Streams
        // Flujo de datos o informacion
        // Imprimir relementos de una lista
        //listadoNumeros.stream().forEach(n -> System.out.println(n));
        
        
        // Imprimir los numeros mayores o iguales a 5
        /*
        listadoNumeros
                .stream()
                .filter(n -> n >= 5)
                .forEach(n -> System.out.println(n));
        */
        
        // Imprimir los numero mayores o iguales a 5 y ordenarlos inversamente
        /*
        listadoNumeros
                .stream()
                .filter(n -> n >= 5)
                .sorted(comparador)
                .forEach(n -> System.out.println(n));
        */
        
        // Transformacion
        /*
        listadoNumeros
                .stream()
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));
        */
        
        // combinaciones
        listadoNumeros
                .stream()
                .filter(n -> n >= 5)               
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));
    }
    
}
