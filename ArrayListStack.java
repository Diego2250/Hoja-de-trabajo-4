import java.util.ArrayList;

/**
 * @author
 * Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase que simula la Arraylist stack, hereda de la clase List
 */


public class ArrayListStack<T> extends Stack<T> {

    private ArrayList<T> miListaInterna;

    public ArrayListStack() {
        miListaInterna = new ArrayList<T>();
    }

    @Override
    public int count() {
        return miListaInterna.size();
    }

    @Override
    public boolean isEmpty() {
        return miListaInterna.isEmpty();
    }

    @Override
    public void push(T value) {
        miListaInterna.add(0, value);
    }

    @Override
    public T pull() {
        return miListaInterna.remove(0);
    }

    @Override
    public T peek() {
        return miListaInterna.get(0);
    }

}
