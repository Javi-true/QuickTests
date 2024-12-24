public class CastingTest {

    public static void main(String[] args){

        //programa para probar el casting.

        int myInt = 10;

        System.out.println("El numero contenido es: "+ myInt);

        double mydouble = (double) myInt;

        System.out.println("El numero contenido nuevo es: "+mydouble);

        myInt = (int) mydouble;

        System.out.println("Y lo regresamos: "+ myInt);
    }
}
