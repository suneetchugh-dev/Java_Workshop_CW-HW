class Animal {
    protected String name;
    
    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor called with name: " + name);
    }
    
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog() {
        super("Tommy");
        System.out.println("Dog Constructor called");
    }
    
    void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}

class test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();    // Using the dog object to call methods
        dog.fetch();        // Demonstrating dog-specific behavior
    }
}