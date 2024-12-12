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

        Animals perro = new Animals("perro", 10, 'M');
        //System.out.println(perro);
        perro.Sound();
    }
}
