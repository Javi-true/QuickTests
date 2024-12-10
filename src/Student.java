import java.util.ArrayList;
public class Student {
    //instance fields.
    int id;
    String name;
    int age;
    String major;

    //constructor.
    public Student(int id, String name, int age, String major){
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    //Metodo toString.
    public String toString(){
        return "Student{id: "+id+", name: "+name+", age: "+age+", major: "+major+"}";
    }

    public static void main(String[] args){
        //instanciando objeto de clase Student.
        Student student1 = new Student(12345, "Alex", 30, "Software Engineering");

        //instanciando ArrayList.
        ArrayList<Student> listaEstudiantes = new ArrayList<>();

        //agregando elementos al ArrayList.
        listaEstudiantes.add(student1);

        //imprimiendo con un cilco for-each.
        for (Student i : listaEstudiantes){
            System.out.println(i);
        }
    }
}
