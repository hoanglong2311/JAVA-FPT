
public class Student implements Comparable<Student> {

    // declare
    private String id;
    private String studentName;
    private String semester;
    private String courseName;

    // constructors
    public Student() {
    }

    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    // getters & setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Compare Student by studentName
    @Override
    public int compareTo(Student stu) {
        return stu.studentName.compareTo(this.studentName);
    }

    // display Student's information
    public void displayInfo() {
        System.out.printf("%-15s|%-15s|%-15s\n", studentName, semester, courseName);
    }

}
