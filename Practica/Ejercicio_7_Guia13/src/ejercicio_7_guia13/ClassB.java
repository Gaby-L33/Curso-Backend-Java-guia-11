package ejercicio_7_guia13;

public class ClassB {
    public void metodoB(int a, int b){
    System.out.println("sentencia_b1 : " + (a+b));

        try {
            System.out.println("sentencia_a2 : " + (a-b));
            throw new MioException("Se produjo una excepción MioException");
        } catch (MioException e) {
            System.out.println(e.toString());
            System.out.println("sentencia_a3 : " + (a*b));
        } finally{
            System.out.println("sentencia_a4 : " + (a/b));            
        }
    }
}
