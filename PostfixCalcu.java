/**
 * @author Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase que realiza los calculos de un postfix
 **/

/**
 * Importar arraylist
 */
import java.util.Arrays;

/**
 * Creacion de la clase
 */
public class PostfixCalcu implements IPosfixCalcu {
    private Stack<String> stack;
    private String[] numeros;
    private String[] operadores;
    public PostfixCalcu() {
        numeros = new String[] {"0","1","2","3","4","5","6","7","8","9"};
        operadores = new String[] {"-","+","*","/"};
    }

    @Override
    public int Evaluate(String expresion) {
        stack = new Stack<String>();
        int Tot=0;
        boolean bandera=false;
        try {
            String[] carac = expresion.split(" ");
            for(int i=0;i<carac.length;i++) {
                if(Arrays.stream(numeros).anyMatch(carac[i]::equals)) {
                    stack.push(carac[i]);
                }else if(Arrays.stream(operadores).anyMatch(carac[i]::equals)) {
                    if(stack.count()>=2) {
                        int n2 = Integer.parseInt(stack.pull());
                        int n1 = Integer.parseInt(stack.pull());
                        int res = 0;
                        switch (carac[i]) {
                            case "-":
                                res = n1-n2;
                                break;
                            case "+":
                                res = n1+n2;
                                break;
                            case "*":
                                res = n1*n2;
                                break;
                            case "/":
                                res = n1/n2;
                                break;
                            default:
                                break;
                        }
                        stack.push(res+"");
                    } else {
                        System.out.println("Faltan operandos para realizar las operaciones correspondientes");
                        bandera = true;
                    }
                }else {
                    System.out.println("Los caracteres son invalidos, no se puede realizar las operaciones");
                }
            }
            if(stack.count()==1) {
                Tot = Integer.parseInt(stack.pull());
            }else {
                System.out.println("Faltan operadores para realizar las operacciones");
            }
        }catch(Exception e) {
            System.out.println("Math ERROR");
        }
        if(bandera) {
            return 0;
        }else {
            return Tot;
        }
    }
}
