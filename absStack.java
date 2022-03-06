/**
 * @author
 * Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase del Stack
 */

/**
 * Importar el ArrayList
 */
import java.util.ArrayList;

/**
 * Creacion de la clase
 **/
public class absStack<T> implements Istack<T> {
    private ArrayList<T> core;
    public absStack () {
        core = new ArrayList<T>();
    }
    @Override
    public void push(T value) {
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