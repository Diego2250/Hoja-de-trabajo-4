/**
 * @author
 * Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase que convierte infix a postfix
 */

/**
 * Importar
 */
import java.util.Stack;

/**
 * Creacion de la clase
 */
public class InfixToPostfix {
    private FactoryStack<Character> d;
    absStack<Character> stack;

    public InfixToPostfix(int tipoStack, int tipoLista){
        d = new FactoryStack<Character>();
        stack = d.instanceStack(tipoStack, tipoLista);
    }

    private int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public String converter(String expression){

        String result = "";
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            //check if char is operator
            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.pull();
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pull();
                while(x!='('){
                    result += x;
                    x = stack.pull();
                }
            }else if(c=='('){
                stack.push(c);
            }else{
                //character is neither operator nor (
                result += c;
            }
        }
        for (int i = 0; i <=stack.count() ; i++) {
            result += stack.pull();
        }
        return result;
    }
}