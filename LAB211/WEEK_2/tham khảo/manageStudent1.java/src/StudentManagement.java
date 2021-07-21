
import java.util.ArrayList;
import java.util.Collections;


public class StudentManagement {

    // Declare
    InputValidation iv = new InputValidation();
    Menu mn = new Menu();

    // Create student
    public void createStudent(int count, ArrayList<Student> list) {
        if (count > 3) {
            System.out.print("Do you want to continue (y/n)? ");
            if (!iv.checkYesNo()) {
                return;
            }
        }

        while (true) {
            System.out.print("Enter ID: ");
            String studentID = iv.checkStudentID();
            System.out.print("Enter Name: ");
            String studentName = iv.checkStudentName();
            if (!iv.checkStudentExistence(list, studentID, studentName)) {
                System.err.println("Existed ID !!!");
                continue;
            }
            System.out.print("Enter Semester: ");
            String semester = iv.checkSemester();
            System.out.print("Enter Course: ");
            String courseName = iv.checkCourseName();

            // check whether student had registered or not
            if (iv.checkRegistered(list, studentID, studentName, semester, courseName)) {
                list.add(new Student(studentID, studentName, semester, courseName));
                count++;
                System.out.println("Register Successful !!!");
                return;
            } else {
                System.err.println("Student already registered !!!");
            }
        }
    }

    // Find By Name Student List
    public ArrayList<Student> findStudentByName(ArrayList<Student> list) {
        ArrayList<Student> studentFindByName_list = new ArrayList<>();
        System.out.print("Enter Student Name to search: ");
        String searchName = iv.checkStudentName();
        for (Student student : list) {
            if (student.getStudentName().contains(searchName)) {
                studentFindByName_list.add(student);
            }
        }
        return studentFindByName_list;
    }

    // Find By ID Student List
    public ArrayList<Student> findStudentByID(ArrayList<Student> list, String studentID) {
        ArrayList<Student> studentFindByID_list = new ArrayList<>();
        for (Student student : list) {
            if (student.getId().equalsIgnoreCase(studentID)) {
                studentFindByID_list.add(student);
            }
        }
        return studentFindByID_list;
    }

    // Get Student in "Find Student By ID" List
    public Student getStudentInSearchList(ArrayList<Student> studentFindByID_list) {
        System.out.println("--- Student List ---");
        System.out.println("-- Found by their ID --");
        int count = 1;
        // Column Title
        System.out.printf("%-5s|%-10s|%-15s|%-10s|%-15s\n",
                "No", "Student ID", "Student Name", "Semester", "Course Name");
        // Display Student Found List
        for (Student student : studentFindByID_list) {
            System.out.printf("%-5s|%-10s|%-15s|%-10s|%-15s\n",
                    count, student.getId(), student.getStudentName(),
                    student.getSemester(), student.getCourseName());
            count++;
        }
        // Choose student to Update or Delete in the list
        System.out.print("Choose a student (their number in the list above): ");
        int choice = iv.validateMenuOption(1, studentFindByID_list.size());
        return studentFindByID_list.get(choice - 1);
    }

    // Find and Sort Function
    public void findAndSort(ArrayList<Student> list) {
        // check empty list
        if (list.isEmpty()) {
            System.out.println("There is no student !!!");
            return;
        }

        ArrayList<Student> studentFindByName_list = findStudentByName(list);
        if (studentFindByName_list.isEmpty()) {
            System.err.println("Not found !!!");
        } else {
            Collections.sort(studentFindByName_list);
            System.out.printf("%-15s|%-15s|%-15s\n", "Student Name", "Semester", "Course Name");
            for (Student student : studentFindByName_list) {
                student.displayInfo();
            }
        }
    }

    // Update or Delete Function
    public void updateOrDelete(ArrayList<Student> list, int count) {
        // check empty list
        if (list.isEmpty()) {
            System.out.println("There is no student !!!");
            return;
        }

        // find student by ID
        System.out.print("Enter ID: ");
        String studentID = iv.checkStudentID();
        ArrayList<Student> findStudentByID_list = new ArrayList<>();
        findStudentByID_list = findStudentByID(list, studentID);
        // student ID not found
        if (findStudentByID_list.isEmpty()) {
            System.err.println("Student ID not found !!!");
            return;
        } else {
            Student chosenStudent = getStudentInSearchList(findStudentByID_list);
            System.out.print("Do you want to update (U) or delete (D) student? ");
            if (iv.checkUpdateDelete()) {
                System.out.println("--- Change Student Information ---");
                System.out.println("--- Modify " + chosenStudent.getId() + " information ---");
                // choose student information to change
                mn.changeStudentInfoMenu();
                int choice = iv.validateMenuOption(1, 4);
                switch (choice) {
                    case 1:
                        // change student name
                        System.out.print("Enter Name: ");
                        String newName = iv.checkStudentName();
                        if (newName.equalsIgnoreCase(chosenStudent.getStudentName())) {
                            System.err.println("Nothing change !!!");
                        } else {
                            chosenStudent.setStudentName(newName);
                            System.out.println("Change Name Successful !!!");
                        }
                        break;
                    case 2:
                        // change student semester
                        System.out.print("Enter Semester: ");
                        String newSemester = iv.checkSemester();
                        if (newSemester.equalsIgnoreCase(chosenStudent.getSemester())) {
                            System.err.println("Nothing change !!!");
                        } else {
                            if (iv.checkRegistered(list, chosenStudent.getId(), chosenStudent.getStudentName(), newSemester, chosenStudent.getCourseName())) {
                                chosenStudent.setSemester(newSemester);
                                System.out.println("Change Semester Successful !!!");
                            } else {
                                System.err.println("Already Registered !!!");
                            }
                        }
                        break;
                    case 3:
                        // change course name
                        System.out.print("Enter Semester: ");
                        String newCourseName = iv.checkCourseName();
                        if (newCourseName.equalsIgnoreCase(chosenStudent.getCourseName())) {
                            System.err.println("Nothing change !!!");
                        } else {
                            if (iv.checkRegistered(list, chosenStudent.getId(), chosenStudent.getStudentName(), chosenStudent.getSemester(), newCourseName)) {
                                chosenStudent.setCourseName(newCourseName);
                                System.out.println("Change Course Name Successful !!!");
                            } else {
                                System.err.println("Already Registered !!!");
                            }
                        }
                        break;
                    case 4:
                        return;
                }
            } else {
                list.remove(chosenStudent);
                count--;
                System.err.println("Delete Student Successful !!!");
            }
        }
    }
}
