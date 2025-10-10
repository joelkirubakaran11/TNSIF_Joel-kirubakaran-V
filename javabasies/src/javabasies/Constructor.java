class Person {
    String name;
    int age;

    Person(String n, int a) { 
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        p1.display();
    }
}
