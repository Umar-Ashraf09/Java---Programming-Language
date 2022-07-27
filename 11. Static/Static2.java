
class Student {

    public String name;
    public static String studentClass;

    public void studentName() {
        System.out.println(name);
    }

}

public class Static2 {

    public static void main(String[] args) {

        Student.studentClass = "Web Development Fundamentals";
        System.out.println(Student.studentClass);

        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Umar";
        student2.name = "Ashraf";
        student1.studentName();
        student2.studentName();
        
    }
}