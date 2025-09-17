//super keyword example

class Parent {
    String name = "Parent";
    
    void display() {
        System.out.println("This is parent class method");
    }
}

class Child extends Parent {
    @SuppressWarnings("hiding")
    String name = "Child";
    
    @Override
    void display() {
        // Using super to access parent's method
        super.display();
        System.out.println("This is child class method");
        
        // Using super to access parent's variable
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + name);
    }

    public String getName() {
        return name;
    }
}

class SuperDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
