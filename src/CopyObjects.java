public class CopyObjects {

    public static void main(String[] args){

        Roof roof1 = new Roof("Rojo", 12.0, 13.2, 15);
        Roof roof2 = new Roof("azul", 1.0, 2.0, 16);

        System.out.println(roof1);
        System.out.println(roof1.getColor());
        System.out.println(roof1.getHeight());
        System.out.println(roof1.getWidth());
        System.out.println(roof1.getInclination());
        System.out.println(roof2);
        System.out.println(roof2.getColor());
        System.out.println(roof2.getHeight());
        System.out.println(roof2.getWidth());
        System.out.println(roof2.getInclination());
        System.out.println(roof1);
        System.out.println(roof2);

        roof1.copy(roof2);

        System.out.println(roof1);
        System.out.println(roof1.getColor());
        System.out.println(roof1.getHeight());
        System.out.println(roof1.getWidth());
        System.out.println(roof1.getInclination());
        System.out.println(roof2);
        System.out.println(roof2.getColor());
        System.out.println(roof2.getHeight());
        System.out.println(roof2.getWidth());
        System.out.println(roof2.getInclination());
        System.out.println(roof1);
        System.out.println(roof2);
    }
}
