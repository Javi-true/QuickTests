import java.util.Scanner;
public class ScannerExamples {

    public static void main(String[] args){
        //creando objeto Scanner.
        Scanner scan1 = new Scanner(System.in);

        //Pidiendo numero.
        System.out.print("Ingrese un numero entero: ");
        int num1 = scan1.nextInt();

        //Consumiento salto de linea.
        scan1.nextLine();

        //Pidiendo nombre.
        System.out.print("Ingrese su nombre: ");
        String name = scan1.nextLine();

        //Pidiendo color.
        System.out.print("Ingrese un color: ");
        String color = scan1.nextLine();

        //Cerrando.
        scan1.close();

        //imprimir.
        System.out.printf("Su nombre es: %s, su numero es: %d, y su color es: %s",name,num1,color);
    }
}
