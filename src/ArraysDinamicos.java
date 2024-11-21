import java.util.ArrayList;
public class ArraysDinamicos {

    public static void main(String[] args){

        ArrayList<String> shoppingCart = new ArrayList<String>();

        shoppingCart.add("Chicles");
        shoppingCart.add("Agua mineral");

        System.out.println(shoppingCart.get(0));
        System.out.println(shoppingCart);

        System.out.println(shoppingCart.size());
    }
}
