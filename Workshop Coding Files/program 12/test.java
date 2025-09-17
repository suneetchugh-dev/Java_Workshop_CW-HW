class Animal {
    // Constructor with name parameter
    Animal(String name) {
        System.out.println("Animal Constructor called with name: " + name);
    }
}

class Dog extends Animal {
    // Constructor calls parent constructor using super
    Dog() {
        super("Tommy"); // Calling parent constructor with name "Tommy"
        System.out.println("Dog Constructor called");
    }
}

// Main class should start with capital letter as per Java conventions
class test {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Creating new Dog instance
    }
}