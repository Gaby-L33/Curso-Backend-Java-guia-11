package ejercicio_2_guia13;

import java.util.Scanner;

public class Ejercicio_2_Guia13 {

    /**
     * Definir una Clase que contenga algún tipo de dato de tipo array y agregue
     * el código para generar y capturar una excepción
     * ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {

            Hangar h1 = new Hangar(032, "Hangar 01X2");

            System.out.println("Hangar nombre : " + h1.getNombreHangar());
            System.out.println("Hangar numero de Serie : " + h1.getNumHangar());
            for (int i = 0; i < 10; i++) {
                System.out.println("La Posicion es : " + i);
                String nombre = h1.getNombresAviones()[i];
                System.out.println("El Nombre del Avion es : " + nombre);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Indice Fuera de Rango " + e);
        } 
        System.out.println("-- FIN DE PROGRAMA --");
    }

}
