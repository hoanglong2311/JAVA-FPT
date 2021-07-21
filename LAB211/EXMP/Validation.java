import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    

    private final static Scanner in = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
        if (result.isEmpty()) {
            System.err.println("It is empty!");
            System.out.print("Enter again: ");
        } else {
            return result;
            } 
        }        
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();

            if (result.equalsIgnoreCase("Y") || result.equalsIgnoreCase("y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N") || result.equalsIgnoreCase("n")) {
                return false;
            }

            System.err.println("Please enter y/Y or N/n");
            System.out.print("Enter again: ");
        }


    }



    public static boolean checkIdExist(ArrayList<Student> ls, String id, String name) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId()) && !name.equalsIgnoreCase(student.getStudentName())) {
                return false;
            }
        }
        return true;
    }

    public static String checkInputCourse() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Java") || result.equalsIgnoreCase(".Net") || result.equalsIgnoreCase("C/C++")) {
                return result;
            }

            System.err.println(": Java, .Net,C/C++");
            System.out.print("Enter again: ");
        }
    }

    public static boolean checkStudentExist(ArrayList<Student> ls, String id, String studentName, String semester, String courseName) {
        // int size = ls.size();
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId()) && studentName.equalsIgnoreCase(student.getStudentName())
                    && semester.equalsIgnoreCase(student.getSemester()) && courseName.equalsIgnoreCase(student.getCourseName())   ) {
                return true;
            }
        }
        return false;
    }

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

    public static boolean checkChangeInformation(Student student, String id, String name, 
                 String semester, String course) {
        if(id.equalsIgnoreCase(student.getId()) 
            && name.equalsIgnoreCase(student.getStudentName())
            && semester.equalsIgnoreCase(student.getSemester())
            && course.equalsIgnoreCase(student.getCourseName()))
        return false;

        return true;
    }

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

}
