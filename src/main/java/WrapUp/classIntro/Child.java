package WrapUp.classIntro;

public class Child extends Person {
    //Person parent = new Person("Parent", 22); -> not good since all children will have the same parent
    Person parent;
    public Child(String name, int age, Person parent) {
        super(name, age); //call parent constructor
        this.parent = parent;
    }

    public Child(Child anotherChild) {
        super(anotherChild);
        this.parent = anotherChild.parent;
    }

    public void printParent() {
        System.out.println(parent.getName());
    }
}
