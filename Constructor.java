class Student {
    String name;
    int age;

    // Constructor
    Student() {
        System.out.println("Default Constructor Called");
        // System.out.println("Student Name: " + name + ", Age: " + age);
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy Constructor Called");
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

}
public class Constructor {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student(student1);
    }
}
