package ejercicio_3_guia13;

import java.util.Scanner;

public class Ejercicio_3_Guia13 {

    /**
     * Defina una clase llamada DivisionNumero. En el método main utilice un
     * Scanner para leer dos números en forma de cadena. A continuación, utilice
     * el método parseInt() de la clase Integer, para convertir las cadenas al
     * tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
     * una división con los dos numeros y mostrar el resultado.
     */
    public static void main(String[] args) {
        try {

           Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese el primer numero : ");
            String num1 = leer.nextLine();
            System.out.println("Ingrese el segundo numero : ");
            String num2 = leer.nextLine();

            DivisionNumero n = new DivisionNumero();

            System.out.println("Division : " + n.parseInt(num2, num1));

        } catch (ArithmeticException e) {
            System.out.println("Error Aritmetico : " + e);
        } catch (Exception e) {
            System.out.println("Error General : " + e);
        }
    }

}
