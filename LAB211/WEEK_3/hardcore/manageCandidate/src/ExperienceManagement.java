
import java.util.ArrayList;
import java.util.Scanner;


public class ExperienceManagement {

    // declare
    Scanner sc = new Scanner(System.in);
    InputValidation iv = new InputValidation();

    // Create Experience Candidate
    public void createExperience(ArrayList<Candidate> candidateList, Candidate exp_candi) {
        System.out.print("Enter Year of Experience: ");
        int expInYear = iv.checkYearOfExp(exp_candi.getBirthYear());
        System.out.print("Enter Professional Skill: ");
        String proSkill = iv.checkProSkill();

        // add exp_candi to candidateList
        candidateList.add(new Experience(expInYear, proSkill, exp_candi.getCandidateID(),
                exp_candi.getFirstName(), exp_candi.getLastName(),
                exp_candi.getBirthYear(), exp_candi.getAddress(),
                exp_candi.getPhone(), exp_candi.getEmail(),
                exp_candi.getCandidateType()));
        System.out.println("Create Successful");
    }
}
