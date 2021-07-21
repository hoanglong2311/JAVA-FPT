
public class Fresher extends Candidate {

    // delcare
    private String graduation_date;
    private String graduation_rank;
    private String university;

    public Fresher() {
        super();
    }

    public Fresher(String graduation_date, String graduation_rank, String university, String CandidateID, String firstName, String lastName, int birthYear, String address, String phone, String email, int candidateType) {
        super(CandidateID, firstName, lastName, birthYear, address, phone, email, candidateType);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.university = university;
    }

    public String getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

}
