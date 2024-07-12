public class Dog extends Animal{
    String breed;
    int age;
    String color;
    Dog(){
    }
    Dog(Dog d){
        this.breed = d.breed;
        this.age = d.age;
        this.color = d.color;
    }

    public void printDetails(){
        System.out.println("Dog details: ");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}
