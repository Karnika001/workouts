package Inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.walk();
        dog.run();
        dog.eat();
        System.out.println("\n");
        Fish fish=new Fish("chimi",12,1,2,2,2);
        fish.swim(9);
    }
}
