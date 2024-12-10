import java.util.Random;
public class RandomNum {
    public static void main(String[] args){
        //primer metodo.
        double randomDouble = Math.random() * 10;
        int intCasting = (int) randomDouble + 1;

        //System.out.print(intCasting);

        //segundo metodo, clase Random.
        Random random1 = new Random();

        int intRandom = random1.nextInt(10) + 1;
        System.out.print(intRandom);
    }
}
