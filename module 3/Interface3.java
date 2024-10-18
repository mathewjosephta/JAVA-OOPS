//Extending an Interface (Instead of Implements)

// Define the College interface
interface College {
    String getCollegeName(); // Method to get college name
}

// Define the Department interface extending College
interface Department extends College {
    String getDepartmentName(); // Method to get department name
}

// Implement the Student class
class Student implements Department {
    String collegeName;
    String departmentName;

    // Constructor
    Student(String collegeName, String departmentName) {
        this.collegeName = collegeName;
        this.departmentName = departmentName;
    }

    // Implement getCollegeName method
    @Override
    public String getCollegeName() {
        return collegeName;
    }

    // Implement getDepartmentName method
    @Override
    public String getDepartmentName() {
        return departmentName;
    }
}

// Main class to demonstrate the implementation
public class InterfaceExtendsDemo {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student("ABC College", "Computer Science");

        // Print college and department names using getter methods
        System.out.println("College Name: " + s1.getCollegeName());
        System.out.println("Department Name: " + s1.getDepartmentName());
    }
}
