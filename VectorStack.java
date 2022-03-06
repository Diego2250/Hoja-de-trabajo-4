import java.util.Vector;

/**
 * @author
 * Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase que simula el vector, hereda de la Stack
 */

public class VectorStack<T> extends Stack<T> {
    private Vector<T> core;

    /**
     * Metodos
     */
    public VectorStack(){
        core = new Vector<T>();
    }

    @Override
    /**
     * @param value valor que se ingresa
     */
    public void push(T value){
        core.add(0, value);
    }


}
