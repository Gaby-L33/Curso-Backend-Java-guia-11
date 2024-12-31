package ejercicio_7_guia13;

//Dado el método metodoB de la clase B, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//class B {
//public void metodoB() {
//sentencia_b1
//try {
//sentencia_b2
//} catch (MioException e){
//sentencia_b3
//}
//finally
//sentencia_b4
//}
//}
public class Ejercicio_7_Guia13 {

    public static void main(String[] args) {
         ClassB instanciaB = new ClassB();
        try {
            System.out.println("Ejecución sin excepción MioException:");
            instanciaB.metodoB(10, 5);

            System.out.println("Ejecución con excepción MioException:");

            instanciaB.metodoB(10, 0);
        } catch (Exception e) {
            // Captura de la excepción MioException si se produce
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
    
}
