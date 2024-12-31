package ejercicio_4_guia13;

public class Exception extends DivisionNumero{
     /**
     * Creates a new instance of <code>Exception</code> without detail message.
     */
    public Exception() {
    }

    /**
     * Constructs an instance of <code>Exception</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public Exception(String msg) {
        System.out.println(msg);
        //super(msg);
    }
}
