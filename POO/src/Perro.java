//clase Perro (hereda de Lobo)

public class Perro extends Lobo
{
    //ATRIBUTOS
    String name;
    String owner;
    int age;

    //CONSTRUCTORES
    //constructor vacío
    public Perro () {
    }
    //constructor con todos los parámetros
    public Perro (String name, String owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    //GETTER Y SETTER
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getOwner () {
        return owner;
    }
    public void setOwner (String owner) {
        this.owner = owner;
    }
    public int getAge () {
        return age;
    }
    public void setAge (int age) {
        this.age = age;
    }

    @Override
    public String toString() {return "Perro [name=" + name + ", owner=" + owner + ", age=" + age + "]";}

    //METODOS
    public void sayOwner()
    {
        System.out.println(this.name + " owner is " +this.owner);
    }

}
