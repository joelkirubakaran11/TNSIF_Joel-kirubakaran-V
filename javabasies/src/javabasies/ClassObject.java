class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Student s1 = new Student(); // object creation
        s1.name = "Alice";
        s1.age = 21;
        s1.display();
    }
}
