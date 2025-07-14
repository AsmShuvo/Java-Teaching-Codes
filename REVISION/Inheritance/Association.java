class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void enroll(Student st) {
        System.out.println(st.name + " enrolled in " + courseName);
    }
}

public class Association {
    public static void main(String[] args) {
        Student s = new Student("Alice");
        Course c = new Course("Java");
        c.enroll(s);
    }
}
