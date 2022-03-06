import java.util.Scanner;

/**
 * @author
 * Alejandro Azurdia, Diego Morales, Maria Ramirez
 *
 * Clase Main para visualizar los resultados y analizarlos.
 */

public class Main {
    static InfixToPostfix conver;
    static PostfixCalcu calcu;

    public static void main(String[] args){

        //Atributos
        Scanner scan = new Scanner(System.in);
        boolean menu1 = true;
        boolean menu2 = true;
        int type_stack=0;
        int type_list=0;

        while (menu1){
            System.out.println("Porfavor Ingrese el tipo de Stack que quiere usar: ");
            System.out.println("1. ArrayList");
            System.out.println("2. List");
            System.out.println("3. Vector");
            type_stack = Integer.parseInt(scan.nextLine());

            if (type_stack==1 || type_stack==2 || type_stack==3) {
                menu1 = false;
            }
        }

        while (menu2){
            System.out.println("Porfavor ingrese el tipo de lista que quiere usar: ");
            System.out.println("1. Simple");
            System.out.println("2. Doble");
            type_list = Integer.parseInt(scan.nextLine());

            if (type_list==1 || type_list==2) {
                menu2 = false;
            }
        }

        conver = new InfixToPostfix(type_stack, type_list);
        calcu = new PostfixCalcu(type_stack, type_list);


    }
}
