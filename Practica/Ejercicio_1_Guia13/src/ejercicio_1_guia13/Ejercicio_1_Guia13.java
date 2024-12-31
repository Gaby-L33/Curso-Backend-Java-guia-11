package ejercicio_1_guia13;

import entidad.Persona;
import servicio.ServcioPersona;

public class Ejercicio_1_Guia13 {

    /**
     * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8
     * Servicios, a null y tratar de invocar el método esMayorDeEdad() a través
     * de ese objeto. Luego, englobe el código con una cláusula try-catch para
     * probar la nueva excepción que debe ser controlada.
     */
    public static void main(String[] args) {
         ServcioPersona n1 = new ServcioPersona();

        Persona p1 = new Persona("Juan", 25, "Masculino", 70, 175);
        Persona p3 = null;
        Persona p2 = new Persona("María", 30, "Femenino", 65, 160);

        Persona[] Vector = new Persona[4];

        Vector[0] = p1;
        Vector[1] = p2;
        Vector[2] = p3;

        try {
            for (int i = 0; i < 4; i++) {
                Persona p = Vector[i];
                if (n1.esMayorDeEdad(p)) {
                    System.out.println(n1.getNombre(p) + " : Es Mayor de Edad");
                } else {
                    System.out.println(n1.getNombre(p) + " Es Menor de Edad");
                }
                switch (n1.calcularIMC(p)) {
                    case 1:
                        System.out.println(n1.getNombre(p) + " : Debajo del Peso ideal");
                    case 0:
                        System.out.println(n1.getNombre(p) + " : Peso Ideal");
                    case -1:
                        System.out.println(n1.getNombre(p) + " : Arriva del Peso ideal");
                }
            }
        } catch (Exception e) {
            System.out.println(" Obejeto Vacio");
        }

        /*
        // MAIN EJERCICIO 3 GUIA8 
        // Crear 4 Obtejos de persona
        PersonaServicio n1 = new PersonaServicio();
        Persona p1 = n1.crearPersona();
        Persona p2 = n1.crearPersona();
        
       
        
        
        Persona p3 = n1.crearPersona();
        Persona p4 = n1.crearPersona();

        Persona[] Vector = new Persona[4];

        Vector[0] = p1;
        Vector[1] = p2;
        Vector[2] = p3;
        Vector[3] = p4;

        
        for (int i = 0; i < 4; i++) {
            Persona p = Vector[i];
            if (n1.esMayorDeEdad(p)) {
                System.out.println(n1.getNombre(p) + " : Es Mayor de Edad");
            } else {
                System.out.println(n1.getNombre(p) + " Es Menor de Edad");
            }
            switch (n1.calcularIMC(p)) {
                case 1:
                    System.out.println(n1.getNombre(p) + " : Debajo del Peso ideal");
                case 0:
                    System.out.println(n1.getNombre(p) + " : Peso Ideal");
                case -1:
                    System.out.println(n1.getNombre(p) + " : Arriva del Peso ideal");
            }
        }
    }
        // FINAL DEL MAIN
         */
        
    }

}
