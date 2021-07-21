public class Internship extends Candidate {

    // declare
    private String major;
    private String semester;
    private String university;

    public Internship() {
        super();
    }

    public Internship(String major, String semester, String university, String CandidateID, String firstName, String lastName, int birthYear, String address, String phone, String email, int candidateType) {
        super(CandidateID, firstName, lastName, birthYear, address, phone, email, candidateType);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

}
