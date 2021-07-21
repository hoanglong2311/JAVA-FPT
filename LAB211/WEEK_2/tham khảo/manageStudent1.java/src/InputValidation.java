import java.util.ArrayList;
import java.util.Scanner;

public class InputValidation {

    // declare
    Scanner sc = new Scanner(System.in);

    // check input option menu
    public int validateMenuOption(int firstOption, int lastOption) {
        // declare
        int option;

        while (true) {
            try {
                option = Integer.parseInt(sc.nextLine().trim());
                if (option < firstOption || option > lastOption) {
                    throw new NumberFormatException();
                }
                return option;
            } catch (NumberFormatException e) {
                System.out.println("Option must between " + firstOption + " and " + lastOption);
                System.out.print("Your choice: ");
            }
        }
    }

    // check user input string
    // not empty
    public String checkString() {
        // declare
        String content;

        while (true) {
            content = sc.nextLine().trim();
            if (content.isEmpty()) {
                System.err.println("Must not be empty !!!");
                System.out.print("Enter content again: ");
            } else {
                return content;
            }
        }
    }

    // check user continue option (Y/N)
    public boolean checkYesNo() {
        // declare
        String option;

        while (true) {
            option = checkString();
            // yes option
            if (option.equalsIgnoreCase("Y")) {
                return true;
            }
            // no option
            if (option.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.print("Do you want to continue (y/n)? ");
        }
    }

    // check user Update or Delete option (U/D)
    public boolean checkUpdateDelete() {
        while (true) {
            String option = checkString();
            // update option
            if (option.equalsIgnoreCase("U")) {
                return true;
            }
            // delete option
            if (option.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Input (U) to Update or (D) to Delete !!!");
            System.out.print("Do you want to update (U) or delete (D) student? ");
        }
    }

    // check student ID format
    public String checkStudentID() {
        // declare
        String studentID;

        while (true) {
            studentID = checkString();
            if (!studentID.matches("^[DE,de]{2}[0-9]{5,6}")) {
                System.err.println("Student ID Format: DE15000 or DE150191 !!!");
                System.out.print("Enter ID: ");
            } else {
                return studentID.toUpperCase();
            }
        }
    }

    // check student Name
    public String checkStudentName() {
        // declare
        String studentName;

        while (true) {
            studentName = checkString();
            if (studentName.length() > 50) {
                System.err.println("Student name is too long!");
                System.out.print("Enter Name: ");
            } else if (studentName.length() < 3) {
                System.err.println("Student name is too short!");
                System.out.print("Enter Name: ");
            } else if (!studentName.matches("([A-Za-z]+\\s?)*")) {
                System.err.println("Student Name contains only alphabet and 1 white space after each word!");
                System.out.print("Enter Name: ");
            } else if (studentName.matches("^[A-Za-z ]*(.)\\1\\1[A-Za-z ]*$")) {
                System.err.println("A character must not repeat 3 times!");
                System.out.print("Enter Name: ");
            } else {
                return studentName;
            }
        }
    }

    // check student Existence
    public boolean checkStudentExistence(ArrayList<Student> list, String studentID, String studentName) {
        for (Student student : list) {
            if (studentID.equalsIgnoreCase(student.getId())
                    && !studentName.equalsIgnoreCase(student.getStudentName())) {
                return false;
            }
        }
        return true;
    }

    // check student Semester
    public String checkSemester() {
        // declare
        String semester;

        while (true) {
            semester = sc.nextLine().trim();
            if (!semester.matches("^[SP,SU,FA]{2}[1-2]{1}[0-9]{1}")) {
                System.err.println("Semester format: SP21 or SU21 or FA21 !!!");
                System.out.print("Enter Semester: ");
            } else {
                return semester;
            }
        }
    }

    // check Course Name
    public String checkCourseName() {
        while (true) {
            String courseName = checkString();
            if (courseName.equalsIgnoreCase("java")
                    || courseName.equalsIgnoreCase(".net")
                    || courseName.equalsIgnoreCase("c/c++")) {
                return courseName.toUpperCase();
            } else {
                System.err.println("There are only three courses: Java, .Net, C/C++");
                System.out.print("Enter Course: ");
            }
        }
    }

    // check whether student registered or not
    public boolean checkRegistered(ArrayList<Student> list, String studentID, String studentName, String semester, String courseName) {
        for (Student student : list) {
            if (studentID.equalsIgnoreCase(student.getId())
                    && studentName.equalsIgnoreCase(student.getStudentName())
                    && semester.equalsIgnoreCase(student.getSemester())
                    && courseName.equalsIgnoreCase(student.getCourseName())) {
                return false;
            }
        }
        return true;
    }

    // check report Existence
    public boolean checkReportExistence(ArrayList<Report> list, String studentName, String courseName, int totalLearnTime) {
        for (Report report : list) {
            if (studentName.equalsIgnoreCase(report.getStudentName())
                    && courseName.equalsIgnoreCase(report.getCourseName())
                    && totalLearnTime == report.getTotalCourse()) {
                return false;
            }
        }
        return true;
    }
}
