package WrapUp.classIntro;

public class Main {
    //psvm
    public static void main(String[] args) {
        Person alex = new Person("Alex", 30);
        Person copy = new Person(alex);

        copy.setName("Olga");
        System.out.println("My copy object name is " + copy.getName());

        Child myChild = new Child("Baby", 2, new Person("newParent", 30));
        myChild.printParent();
    }
}
