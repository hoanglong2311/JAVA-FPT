import java.util.ArrayList;
import java.util.Collections;

public class Manager {
    public static void menu() {
        System.out.println("1. Create");
        System.out.println("2. Find and Sort");
        System.out.println("3. Update/Delete");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        System.out.println("(Please choose 1 to Create, 2 to Find and Sort, 3 to Update/Delete, 4 to Report and 5 to Exit program).");
    }

    public static void createStudent(int count, ArrayList<Student> ls) {
        if (count >= 3) {
            System.out.print("Do you want to continue (Y/N): ");
            if (!Validation.checkInputYN()) {
                return;
            }
        }


        while (true) {
            System.out.println("Enter id: ");
            String id = Validation.checkInputString();
            System.out.println("Enter Name student: ");
            String studentName = Validation.checkInputString();

            if (!Validation.checkIdExist(ls, id, studentName)) {
            System.err.println("ID has exist student. Pls enter again.");
            continue;
        }
            System.out.println("Enter semester: ");
            String semester = Validation.checkInputString();
            System.out.println("Enter name course: ");
            String courseName = Validation.checkInputCourse();

            if (!Validation.checkStudentExist(ls, id, studentName, semester, courseName)) {
                ls.add(new Student(id, studentName, semester,courseName));
                count++;
                System.out.println("Add student success.");
                return;
            }
            System.err.println("Duplicate.");

        }
    }


    public static ArrayList<Student> listStudentFindByName(ArrayList<Student> ls) {
        ArrayList<Student> listStudentFindByName = new ArrayList<Student>();
        System.out.print("Enter name to search: ");
        String name = Validation.checkInputString();
        for (Student student : ls) {
            if (student.getStudentName().contains(name)) {
                listStudentFindByName.add(student);
            }
        }
        return listStudentFindByName;
    }

    public static void findAndSort(ArrayList<Student> ls) {
        if (ls.isEmpty()){
            System.err.println("List empty.");
            return;
        }

        ArrayList<Student> listStudentFindByName = listStudentFindByName(ls);
        if (listStudentFindByName.isEmpty()) {
            System.err.println("Does not exist.");
        } else {
            Collections.sort(listStudentFindByName);
            System.out.printf("%-15s%-15s%-15s\n", "Student name", "semester", "Course Name" );

            for (Student student : listStudentFindByName) {
                student.print();
            }
        }

    }

    public static ArrayList<Student> getListStudentById(ArrayList<Student> ls,String id) {
        ArrayList<Student> getListStudentById = new ArrayList<>();
        for (Student student : ls) {
            if(id.equalsIgnoreCase(student.getId())) {
                getListStudentById.add(student);
            }
        }
        return getListStudentById;
    }

    public static Student getListStudentByListFound(ArrayList<Student> listStudentFindByName) {
        System.out.println("List Student found: ");
        int count= 1;
        System.out.printf("%-10s%-15s%-15s%-15s\n", "Number", "Student name",
        "semester", "Course Name");
        //hien thi ra danh sach sinh vien tim ra 
        for (Student student : listStudentFindByName) {
            System.out.printf("%-10d%-15s%-15s%-15s\n", count, student.getStudentName(), 
                            student.getSemester(), student.getCourseName());
            count++;
        }
        System.out.print("Enter student: ");
        int choice = Validation.checkInputIntLimit(1, listStudentFindByName.size());
        return listStudentFindByName.get(choice - 1);
        
    }





    public static void updateOrDeleteStudent(int count, ArrayList<Student> ls) {
        if (ls.isEmpty()) {
            System.out.println("List empty.");
            return;
        }

        System.out.print("Enter id: ");
        String id = Validation.checkInputString();
        ArrayList<Student> listStudentFindByName = getListStudentById(ls, id);
        
        //kiem tra xem list co empty khong

        if (listStudentFindByName.isEmpty()) {
            System.err.println("Not found student! ");
            return;
        } else {
            Student student = getListStudentByListFound(listStudentFindByName);
            System.out.print("Do you want to update (U) or delete (D) student: ");
            
            if(Validation.checkInputUD()){
                System.out.print("Enter id: ");
                String idStudent = Validation.checkInputString();
                System.out.print("Enter name student: ");
                String name = Validation.checkInputString();
                System.out.print("Enter semester: ");
                String semester = Validation.checkInputString();
                System.out.print("Enter name course: ");
                String course = Validation.checkInputCourse();
                //kiem tra xem thong tin co thay doi hay khong
                if (!Validation.checkChangeInformation(student, id, name, semester, course))
                    {
                        System.err.println("Nothing changed. ");
                    }

                //kiem tra xem sinh vien co ton tai hay khong 
                if (Validation.checkStudentExist(ls, id, name, semester, course)){
                    student.setId(idStudent);
                    student.setStudentName(name);
                    student.setSemester(semester);
                    student.setCourseName(course);
                    System.err.println("Update success.");
                }
                return;

                } else {
                    ls.remove(student);
                    count--;
                    System.err.println("Delete success.");
                    return;
            }
        }
    }



    public static void report(ArrayList<Student> ls) {
        if(ls.isEmpty()){
            System.out.println("List is empty! Check again! ");
            return;
        }

        ArrayList<Report> lr = new ArrayList<>();
        int size = ls.size();
        for (int i = 0; i < size; i++) {
            int total = 0;
            for (Student student : ls) {
                String id = student.getId();
                String courseName = student.getCourseName();
                String studentName = student.getStudentName();
                for (Student studentCountTotal : ls) {
                    if (id.equalsIgnoreCase(studentCountTotal.getId())
                    && courseName.equalsIgnoreCase(studentCountTotal.getCourseName())) {
                        total++;
                        //duyet trong mang neu chung id va chung course Name thif se tawng total len 1
                    }
                }
                if (Validation.checkReportExists(lr, studentName, courseName, total)) {
                    lr.add(new Report(student.getStudentName(), studentName, total));
                    
                }
            }
            
        }
        //in report 
        for (int i = 0; i < lr.size(); i++) {
            System.out.printf("%-15s|%-10s|%-5d\n", lr.get(i).getStudentName(),
            lr.get(i).getCourseName(), lr.get(i).getTotalCourse());
        }
        
    }



}
