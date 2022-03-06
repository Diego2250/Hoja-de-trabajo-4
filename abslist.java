/**
 * @author
 * Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase que implementa la interfaz lista llamada abslist para no confundirse con la List de java
 */

public abstract class abslist<T> implements IList<T> {

    protected int count;
    protected Node<T> start;
    protected Node<T> end;

    /**
     * Metodos
     */
    @Override
    /**
     * @param value valor se insertar al inicio
     */
    public abstract void InsertAtStart(T value);

    @Override
    /**
     * @param value valor se insertar al final
     */
    public abstract void InsertAtEnd(T value);

    @Override
    /**
     * @param value valor que se ingresa
     * @param index el indice
     */
    public abstract void Insert(T value, int index);

    @Override
    /**
     * @return el valor del nodo
     * @param index el indice
     */
    public abstract T Delete(int index);

    @Override
    /**
     * @return el valor del nodo
     */
    public abstract T DeleteAtStart();

    @Override
    /**
     * @return el valor del nodo
     */
    public abstract T DeleteAtEnd();

    @Override
    /**
     *
     * @return el valor del indice
     * @param index el indice
     */
    public abstract T Get(int index);

    @Override
    /**
     * @return True si la lista esta vacia, false si la lista esta vacia
     */
    public abstract boolean IsEmpty();

    @Override
    /**
     * @return Cantidad de elementos de la lista
     */
    public abstract int Count();
}
