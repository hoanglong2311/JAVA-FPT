import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    

    private final static Scanner in = new Scanner(System.in);


    public static String checkInputString() {

        while(true){
            //trim dung de xoa khoang trang thua or dau va cuoi cua string
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("It is empty");
                System.out.println("Enter again");
            } else {
                return result;
            }
        }
        
    }


    public static boolean checkInputYN() {

        while (true) {
            String result = checkInputString();
            //tra ve gia tri true neu nguoi dung nhap vao Y/y
            if (result.equalsIgnoreCase("Y") || result.equalsIgnoreCase("y")) {
                return true;
            }
            //tra ve gia tri false neu nguoi dung nhap vao n/N
            if (result.equalsIgnoreCase("N") || result.equalsIgnoreCase("n")) {
                return false;
            }

            System.err.println("Please input y/Y or n/N.");
            System.out.println("Enter again: ");
        }    
    }

    //check input u/d
    public static boolean checkInputUD() {
        
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.print("Please enter u/U or d/D");
            System.out.print("Enter again: ");

        }
    }


    //check xem  thong tin co thay doi hay khoang
    public static boolean checkChangeInformation(Student student, String id, String name, 
                 String semester, String course) {
        if(id.equalsIgnoreCase(student.getId()) 
            && name.equalsIgnoreCase(student.getStudentName())
            && semester.equalsIgnoreCase(student.getSemester())
            && course.equalsIgnoreCase(student.getCourseName()))
        return false;
        return true;
    }



    //check student exist
    public static boolean checkStudentExist(ArrayList<Student> ls, String id, String sudentName, String semester,
                String courseName) {
        int size = ls.size();
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId()) && sudentName.equalsIgnoreCase(student.getStudentName())
                    && semester.equalsIgnoreCase(student.getSemester())
                    && courseName.equalsIgnoreCase(student.getCourseName())) {
                return false;
            }
        }

        return true;
    }

    //check report exist or not
    public static boolean checkReportExists(ArrayList<Report> lr, String name, String course, int total) {
        for (Report report : lr) {
            if (name.equalsIgnoreCase(report.getStudentName()) 
            && course.equalsIgnoreCase(report.getCourseName())
            && total == report.getTotalCourse()) {
                return false;
            }
        }
        return true;
    }

    //kiem tr xem so nhap vao trong gioi han
    public static int checkInputIntLimit(int min, int max) {
        //lap vong lap cho den khi input nhap vao la dung
        while (true) {
            try{
                int  result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e){
                System.out.println("Please input number in range [" + min + ", " + max + "] ");
                System.out.print("Enter again: ");
            }
        }
    }



    //check id and exist
    public static boolean checkIdExists(ArrayList<Student> ls, String id, String name) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId()) && !name.equalsIgnoreCase(student.getStudentName())) {
                return false;
            }
        }
        return true;
    }

    //check user input course name
    public static String checkInputCourse() {
        
        while (true) {
            String result = checkInputString();
            //kiem tra xem khoa hoc nhap vao co phai 3 khoa hoc java/ .net/ c/c++
            if (result.equalsIgnoreCase("Java") || result.equalsIgnoreCase(".Net")|| result.equalsIgnoreCase("C/C++")) {
                return result;
            }
            System.err.println("Just only 3 course: Java, .Net, .C/C++");
            System.out.println("Enter again: ");
        }
    }

    
}
