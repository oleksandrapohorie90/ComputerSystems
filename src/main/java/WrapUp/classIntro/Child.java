package WrapUp.classIntro;

public class Child extends Person {
    //Person parent = new Person("Parent", 22); -> not good since all children will have the same parent
    Person parent;
    public Child(String name, int age, Person parent) {
        super(name, age); //call parent constructor
    }

    public Child(Person anotherPerson) {
        super(anotherPerson);
    }

    public void printParent() {
        System.out.println(parent.getName());
    }
}
