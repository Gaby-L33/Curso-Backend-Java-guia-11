package entidades;

public class Cascos extends Dispositivo{
     public Cascos() {
    }

    public Cascos( boolean estado) {
        super(estado);
    }
    
    public int usarCascos() {
        /**
         * Al utilizar un dispositivo existe un 30% de posibilidades de que se
         * dañe
         */
        if (Math.random() <= 0.3) {
            estado = false;
            return consumo;
        } else {
            return consumo;
        }
    }
}
