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
<<<<<<< HEAD
        return "Perros { name = "+name+", age = "+age+", gender = "+gender+", raza = "+raza+". }";
=======
        return "Perros {name = "+name+", age = "+age+", gender = "+gender+", raza = "+raza+"}";
>>>>>>> 089d58a167ab4dcd99ccfedf848a464677d77e5c
    }

    @Override
    public void Sound() {
        System.out.println("El perro ladra");
    }
}
