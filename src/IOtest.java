public class IOtest {

    public static void main(String[] args){
        String linea;

        //pedir que ingresen numero.
        System.out.println("Ingrese un numero por favor");

        linea = System.console().readLine();
        int numero;
        numero = Integer.parseInt(linea);

        System.out.println(numero);
    }

}
