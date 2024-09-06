package WrapUp.classIntro;

public class Person {
    //CTRL RETURN - to create a new class
    private String name;
    private int age;

    //parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //copy constr
    public Person(Person anotherPerson) {
        this.name = anotherPerson.name;
        this.age = anotherPerson.age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
