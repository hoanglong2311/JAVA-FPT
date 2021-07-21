
import java.util.ArrayList;
import java.util.Scanner;

public class FresherManagement {

    // declare
    Scanner sc = new Scanner(System.in);
    InputValidation iv = new InputValidation();

    // create Fresher Candidate
    public void createFresher(ArrayList<Candidate> candidateList, Candidate fre_candi) {
        System.out.print("Enter Graduation Time: ");
        String graduation_date = iv.checkGraduationDate(fre_candi);
        System.out.print("Enter Graduation Rank (Excellence/Good/Fair/Poor): ");
        String graduation_rank = iv.checkGraduationRank();
        System.out.print("Enter University: ");
        String university = iv.checkUniversity();

        // add fre_candi to candidateList
        candidateList.add(new Fresher(graduation_date, graduation_rank, university,
                fre_candi.getCandidateID(), fre_candi.getFirstName(),
                fre_candi.getLastName(), fre_candi.getBirthYear(),
                fre_candi.getAddress(), fre_candi.getPhone(),
                fre_candi.getEmail(), fre_candi.getCandidateType()));
        System.out.println("--> Create Fresher Candidate Successful");
    }
}
