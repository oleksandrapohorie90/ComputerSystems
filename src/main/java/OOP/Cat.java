package OOP;

public class Cat extends Animal{
    String breed;
    int age;
    String color;
    Cat(){
    }
    Cat(Cat cat){
        this.breed = cat.breed;
        this.age = cat.age;
        this.color = cat.color;
    }

    public void printDetails(){
        System.out.println("OOP.Dog details: ");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}
