
public class Experience extends Candidate {

    // declare
    private int expInYear;
    private String proSkill;

    public Experience() {
        super();
    }

    public Experience(int expInYear, String proSkill, String CandidateID, String firstName, String lastName, int birthYear, String address, String phone, String email, int candidateType) {
        super(CandidateID, firstName, lastName, birthYear, address, phone, email, candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

}
