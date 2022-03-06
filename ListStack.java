import java.util.ListResourceBundle;

/**
 * @author
 * Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase que simula la lista stack, hereda de la clase List
 */

public class ListStack<T> extends absStack<T> {
    private abslist<T> listaInterna;
    private FactoryList<T> flist;

    public ListStack(int tipo)
    {
        listaInterna = flist.instanceList(tipo);
    }

    @Override
    public int count() {
        return listaInterna.Count();
    }

    @Override
    public boolean isEmpty() {
        return listaInterna.IsEmpty();
    }

    @Override
    public void push(T value) {
        listaInterna.InsertAtStart(value);
    }

    @Override
    public T pull() {
        return listaInterna.Delete(0);
    }

    @Override
    public T peek() {
        return listaInterna.Get(0);
    }
}
