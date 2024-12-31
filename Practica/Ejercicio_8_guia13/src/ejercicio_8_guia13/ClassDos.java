package ejercicio_8_guia13;

public class ClassDos {
    private static int metodoDos() {
        int valor=0;        
        try{
        valor = valor + 1;
        valor = valor + Integer.parseInt ("W");
        valor = valor + 1;
        System.out.println("Valor final del try: " + valor) ;
        } catch ( NumberFormatException e ) {
        valor = valor + Integer.parseInt ("42");
        System.out.println("Valor final del catch: " + valor) ;
        } finally {
        valor = valor + 1;
        System.out.println("Valor final del finally: " + valor) ;
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor) ;
        return valor;
    }
    
    public static void main(String[] args) {
               
        try{
        System.out.println(metodoDos( )) ;
        } catch(Exception e) {
        System.err.println ("Excepcion en metodo( )" ) ;
        e.printStackTrace();
        }        
    }

}
