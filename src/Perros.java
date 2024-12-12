public class Perros extends Animals{

    //nuevo campo.
    String raza;

    public Perros(String name, int age, char gender, String raza){
        super(name, age, gender);
        this.raza = raza;
    }

    //sobreescribir toString


    @Override
    public String toString() {
        return "Animals{name = "+name+", age = "+age+", gender = "+gender+", raza = "+raza+"}";
    }

    @Override
    public void Sound() {
        System.out.println("El perro ladra");
    }
}
