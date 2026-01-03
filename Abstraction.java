abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow! Meow!");
    }
}

class Bird extends Animal {
    void sound() {
        System.out.println("Chirp! Chirp!");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myBird = new Bird();  

        myDog.sound();
        myCat.sound();
        myBird.sound();
        
    }
}