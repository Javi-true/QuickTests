import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader i1 = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i1);
        System.out.println("Introduce un numero entero: ");
        int myInt = Integer.parseInt(br.readLine());
        System.out.println("Tu numero entero es: "+myInt);
        System.out.println("-----------------------------");
        System.out.println("Introduce un numero double: ");
        double myDouble = Double.parseDouble(br.readLine());
        System.out.println("Tu numero double es: "+myDouble);
        System.out.println("-----------------------------");
        System.out.println("Introduce un string: ");
        String string1 = br.readLine();
        System.out.println("Tu string dice: "+ string1);
        System.out.println("-----------------------------");

        myInt = (int) myDouble;

        System.out.println("Nuevo contenedor: "+ myInt);
    }
}
