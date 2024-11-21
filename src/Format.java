import java.util.Scanner;

public class Format {

    public static void main(String[] args){
        String texto1 = "Javi";
        int num1 = 12;

        //Scanner scan = new Scanner(System.in);

        //String texto2 = scan.nextLine();
        //int num2 = scan.nextInt();
        //scan.close();

        System.out.printf("El primer string es: %s y el primer integer es %d \n" , texto1, num1);
        System.out.printf("El primer string es: %10s y el primer integer es %04d" , texto1, num1);
    }
}
