import java.awt.List;

/**
 * @author
 * Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase que implementa Factory para los stacks
 */

public class FactoryStack<T> {
    public Stack<T> instanceStack(int type, int type_list){
        Stack<T> stack=null;

        if (type == 1){
            stack = new ArrayListStack<T>();
        }
        else if (type == 2){
            stack = new ListStack<T>(type_list);
        }
        else if (type == 3){
            stack = new VectorStack<T>();
        }
        return stack;
    }
}
