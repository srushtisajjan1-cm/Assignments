class Student {
    int roll;
    String name;
    static String college = "SNPSU College";

    static void changeCollege() {
        college = "SNPSU College";
    }

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student.changeCollege();

        Student s1 = new Student(1, "srushti");
        Student s2 = new Student(2, "srujju");

        s1.display();
        s2.display();
    }
}