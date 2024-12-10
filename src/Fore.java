import java.util.ArrayList;

public class Fore {
    public static void main(String[] args){

       // String[] nombres = {"Javier", "Alejandro", "Arturo", "Adan", "Alexander", "Alberto", "Beto", "Juan"};
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("cat");
        nombres.add("dog");
        nombres.add("bird");

        for (String i: nombres){
            System.out.println(i);
        }
    }
}
