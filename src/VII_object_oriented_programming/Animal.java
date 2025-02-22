package VII_object_oriented_programming;

public class Animal {
    String color="white";
    void eat() {
        System.out.println("Eating.......");
    }
}

class Dog extends Animal {
    String color="black";
    void disp() {
//        System.out.println(color);
        System.out.println(super.color);
    }

    void eat() {
        super.eat();
//        System.out.println("Eating bread...");
        System.out.println("something....");
    }
}
