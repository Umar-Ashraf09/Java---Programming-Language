
class Student {

    public String name;
    public static String studentClass;

}

public class Static1 {

    public static void main(String[] args) {

        Student.studentClass = "Web Development Fundamentals";
        System.out.println(Student.studentClass);

        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Umar";
        student2.name = "Ashraf";

        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}