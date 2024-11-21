//This is a class to practice arrays basic stuff.

import java.util.Arrays;
public class ArraysClass {

    public static void main(String[] args){

        String[] names = new String[5];

        System.out.println("||=============================================================||");
        System.out.println("Imprimir un array directamente solo da un espacio de memoria.");
        System.out.println(names);
        System.out.println("||=============================================================||");

        names[0] = "Alex";
        names[1] = "Javier";
        names[2] = "Ricardo";
        names[3] = "Omar";
        names[4] = "Jose";

        System.out.println("||=============================================================||");
        System.out.println("Imprimir un array utilizando herramienta de java Arrays.");
        System.out.println(Arrays.toString(names));
    }
}
