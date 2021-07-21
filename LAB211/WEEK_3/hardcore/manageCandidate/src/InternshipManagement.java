
import java.util.ArrayList;
import java.util.Scanner;


public class InternshipManagement {

    // declare
    Scanner sc = new Scanner(System.in);
    InputValidation iv = new InputValidation();

    // create new Internship Candidate
    public void createInternship(ArrayList<Candidate> candidateList, Candidate int_candi) {
        System.out.print("Enter Major: ");
        String major = iv.checkMajor();
        System.out.print("Enter Semester: ");
        String semester = iv.checkSemester();
        System.out.print("Enter University: ");
        String university = iv.checkUniversity();

        // add Internship Candidate to Candidate List
        candidateList.add(new Internship(major, semester, university,
                int_candi.getCandidateID(), int_candi.getFirstName(),
                int_candi.getLastName(), int_candi.getBirthYear(),
                int_candi.getAddress(), int_candi.getPhone(),
                int_candi.getEmail(), int_candi.getCandidateType()));
        System.out.println("--> Create Internship Candidate Successful");
    }
}
