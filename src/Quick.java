import java.util.Scanner;
public class Quick {
    public static void main(String[] args){
        //instanciando un objeto scanner.
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el numero que representa al dia de la semana: ");
        byte opcionSeleccionada = scan.nextByte();
        String day = "";
        day.length();
        scan.close();
        switch (opcionSeleccionada){
            case 1:
                day = "lunes";
                break;
            case 2:
                day = "martes";
                break;
            case 3:
                day = "miercoles";
                break;
            case 4:
                day = "jueves";
                break;
            case 5:
                day = "viernes";
                break;
            case 6:
                day = "sabado";
                break;
            case 7:
                day = "domingo";
                break;
            default:
                System.out.println("Error: Opcion invalida!!!");
        }

        System.out.printf("Hoy es: %s", day);
    }
}
