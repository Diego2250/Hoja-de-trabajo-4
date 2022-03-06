import java.awt.List;

/**
 * @author
 * Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase que implementa Factory para las listas
 */

public class FactoryList<T> {
    public List<T> instanceList(int type){
        List<T> list=null;

        if (type == 1){
            list = new SimpleList<T>();
        }
        else if (type == 2){
            list = new DoubleList<T>();
        }
        return list;
    }
}
