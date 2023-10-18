class Student {
    private String name;
    private int age;
    private char grade;

    // Constructor
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for grade
    public char getGrade() {
        return grade;
    }

    // Display student information
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        // Create a student object
        Student student1 = new Student("John Doe", 18, 'A');

        // Display student information
        System.out.println("Student Information:");
        student1.displayStudentInfo();
    }
}
