import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String program;
    private String semester;
    private List<String> courses;

    public Student(String name, String program, String semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(String course) {
        courses.add(course);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses registered:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }

    public static void main(String[] args) {
        // Creating some courses
        String javaCourse = "Java Programming";
        String pythonCourse = "Python Programming";
        String dataScienceCourse = "Data Science";

        // Creating students
        Student student1 = new Student("John Doe", "Computer Science", "Spring 2024");
        Student student2 = new Student("Jane Smith", "Information Technology", "Fall 2023");

        // Registering courses for students
        student1.registerCourse(javaCourse);
        student1.registerCourse(dataScienceCourse);
        student2.registerCourse(javaCourse);
        student2.registerCourse(pythonCourse);

        // Displaying information for students
        System.out.println("Information for Student 1:");
        student1.displayInfo();
        System.out.println("\nInformation for Student 2:");
        student2.displayInfo();
    }
}