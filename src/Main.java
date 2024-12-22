import java.io.File;
public class Main {

    public static void main(String[] args){

        File file = new File("secret.txt");

        if(file.exists()){
            System.out.println("That file exist");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }else{
            System.out.println("That file does not exist");
        }
    }
}
