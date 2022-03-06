import java.util.Vector;

/**
 * @author
 * Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase que simula el vector, hereda de la Stack
 */

public class VectorStack<T> extends absStack<T> {
    private Vector<T> core;

    /**
     * Metodos
     */
    public VectorStack(){
        core = new Vector<T>();
    }

    @Override
    public void push(T value){
        core.add(0, value);
    }

    @Override
    public T pull() {
        if(!isEmpty()) {
            return core.remove(0);
        }else {
            return null;
        }

    }

    @Override
    public T peek() {
        if(!isEmpty()) {
            return core.get(0);
        }else{
            return null;
        }
    }

    @Override
    public int count() {
        return core.size();
    }

    @Override
    public boolean isEmpty() {
        return core.isEmpty();
    }

}
