public class Animals {
    //instance fields or state.
    String name;
    int age;
    char gender;

    //constructor.
    public Animals(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //toString().
    public String toString(){
        return "Animals{name = "+name+", age = "+age+", gender = "+gender+"}";
    }

    //sound method.
    public void Sound(){
        System.out.println("Animals make sounds");
    }

    public static void main(String[] args){

        Perros perro1 = new Perros("Juanito", 1, 'M', "Pug");
        System.out.println(perro1);
        perro1.Sound();
    }
}
