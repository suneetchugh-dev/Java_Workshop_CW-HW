public class StaticDemo {
    // Non-static variable (instance variable) - each object has its own copy
    String studentName;
    int rollNumber;
    
    // Static variable (class variable) - shared by all objects
    static String schoolName = "ABC School";
    static int totalStudents = 0;
    
    // Constructor
    public StaticDemo(String name, int roll) {
        this.studentName = name;
        this.rollNumber = roll;
        totalStudents++; // Increment total students whenever new object is created
    }
    
    // Method to display student info
    public void displayInfo() {
        System.out.println("Student Name: " + studentName);        // Non-static variable
        System.out.println("Roll Number: " + rollNumber);          // Non-static variable
        System.out.println("School Name: " + schoolName);          // Static variable
        System.out.println("Total Students: " + totalStudents);    // Static variable
        System.out.println("------------------------");
    }
    
    public static void main(String[] args) {
        // Create multiple student objects
        StaticDemo student1 = new StaticDemo("John", 101);
        StaticDemo student2 = new StaticDemo("Alice", 102);
        StaticDemo student3 = new StaticDemo("Bob", 103);
        
        // Each student has their own name and roll number (non-static)
        // But school name and total students count (static) is shared
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        
        // We can access static variables directly through class name
        System.out.println("Accessing static variable directly: " + StaticDemo.schoolName);
        System.out.println("Total number of students: " + StaticDemo.totalStudents);
    }
}