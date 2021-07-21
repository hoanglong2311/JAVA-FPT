
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class InputValidation {

    // declare
    Scanner sc = new Scanner(System.in);
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    private static final String EMAIL_VALID = "^[a-zA-Z0-9._]+[@]{1}+[a-zA-Z0-9]+[.]{1}+([a-zA-Z0-9]+[.]{1})*+[a-zA-Z0-9]+$";
    private static final String GRADUATION_VALID = "^(0[1-9]|1[0-2])/[19,20]{2}[0-9]{2}$";

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
                System.err.println("Option must between " + firstOption + " and " + lastOption);
                System.out.print("Your choice: ");
            }
        }
    }

    // check empty string
    public String checkEmptyString() {
        // declare
        String content;

        while (true) {
            content = sc.nextLine().trim();
            if (content.isEmpty()) {
                System.err.println("Must not be empty");
                System.out.print("Enter again: ");
            } else {
                return content;
            }
        }
    }

    // check input ID
    public String checkCandidateID() {
        while (true) {
            String candidateID = checkEmptyString();
            if (!candidateID.matches("^[CA,ca]{2}[0-9]{3}")) {
                System.err.println("Candidate ID format: CAxxx (x from 0 to 9)");
                System.out.print("Enter ID: ");
            } else {
                return candidateID.toUpperCase();
            }
        }
    }

    // check input First Name / Last Name
    public String checkName() {
        while (true) {
            String name = checkEmptyString();
            if (name.length() > 15) {
                System.err.println("Name is too long");
                System.out.print("Enter Name: ");
            } else if (!name.matches("[A-Za-z ]*")) {
                System.err.println("Name contains only alphabet");
                System.out.print("Enter Name: ");
            } else if (name.matches("^[A-Za-z ]*(.)\\1\\1$")) {
                System.err.println("A character must not repeat 3 times");
                System.out.print("Enter Name: ");
            } else {
                return name;
            }
        }
    }

    // check input Birth Year
    public int checkBirthYear() {
        while (true) {
            try {
                int birthYear = Integer.parseInt(sc.nextLine().trim());
                if (birthYear < 1900 || birthYear > currentYear) {
                    throw new NumberFormatException();
                } else {
                    return birthYear;
                }
            } catch (NumberFormatException e) {
                System.err.println("Birth Year from 1900 to now");
                System.out.print("Enter Birth Year: ");
            }
        }
    }

    // check input Address
    public String checkAddress() {
        while (true) {
            String address = checkEmptyString();
            if (address.length() > 50) {
                System.err.println("Address is too long!");
                System.out.print("Enter Address: ");
            } else if (address.length() < 3) {
                System.err.println("Address is too short!");
                System.out.print("Enter Address: ");
            } else if (!address.matches("([A-Za-z0-9 ]+\\s?)*")) {
                System.err.println("Address contains alphabet, number and 1 white space after each word!");
                System.out.print("Enter Address: ");
            } else if (address.matches("^[A-Za-z0-9 ]*(.)\\1\\1[A-Za-z0-9 ]*$")) {
                System.err.println("A character must not repeat 3 times!");
                System.out.print("Enter Address: ");
            } else {
                return address;
            }
        }
    }

    // check input Phone
    public String checkPhone() {
        while (true) {
            String phone = checkEmptyString();
            if (!phone.matches("[0]{1}[1-9]{1}[0-9]{8}")) {
                System.err.println("Phone number format: 0xxxxxxxxx (10 numbers)");
                System.out.print("Enter Phone: ");
            } else {
                return phone;
            }
        }
    }

    // check input Email
    public String checkEmail() {
        while (true) {
            String email = checkEmptyString();
            if (!email.matches(EMAIL_VALID)) {
                System.err.println("Email format: <yourname>@<domain>");
                System.out.print("Enter Email: ");
            } else {
                return email;
            }
        }
    }

    // check input Year of Experience
    public int checkYearOfExp(int birthYear) {
        int age = currentYear - birthYear;
        while (true) {
            try {
                int expInYear = Integer.parseInt(sc.nextLine().trim());
                if (expInYear < 0 || expInYear > 100) {
                    throw new NumberFormatException();
                } else if (expInYear >= age) {
                    throw new NumberFormatException();
                } else {
                    return expInYear;
                }
            } catch (NumberFormatException e) {
                System.err.println("Experience year from 0 to 100 and less than age");
                System.out.print("Enter Year of Experience: ");
            }
        }
    }

    // check input Professional Skill
    public String checkProSkill() {
        while (true) {
            String proSkill = checkEmptyString();
            if (proSkill.length() > 30) {
                System.err.println("Skill name is too long");
                System.out.print("Enter Professional Skill: ");
            } else if (!proSkill.matches("^[A-Za-z ]*")) {
                System.err.println("Skill name contains only alphabet");
                System.out.print("Enter Professional Skill: ");
            } else if (proSkill.matches("^[A-Za-z ]*(.)\\1\\1$")) {
                System.err.println("A character must not repeat 3 times");
                System.out.print("Enter Professional Skill: ");
            } else {
                return proSkill;
            }
        }
    }

    // check Candidate ID whether existed or not
    public boolean checkIDExistence(ArrayList<Candidate> candidateList, String candidateID) {
        for (Candidate candidate : candidateList) {
            if (candidate.getCandidateID().equalsIgnoreCase(candidateID)) {
                System.err.println("ID already existed");
                return false;
            }
        }
        return true;
    }

    // check Graduation Date
    // format mm/yyyy
    public String checkGraduationDate(Candidate candidate) {
        while (true) {
            try {
                String graduation_date = checkEmptyString();
                String graduation_year = graduation_date.substring(3, 7);
                if (!graduation_date.matches(GRADUATION_VALID)) {
                    throw new Exception();
                } else if (Integer.parseInt(graduation_year) <= candidate.getBirthYear()) {
                    System.err.println("Graduate before Birthdate");
                    throw new Exception();
                } else {
                    return graduation_date;
                }
            } catch (Exception e) {
                System.err.println("Format: mm/yyyy");
                System.out.print("Enter Graduation Time: ");
            }
        }
    }

    // check Graduation Rank
    // Excellence/Good/Fair/Poor
    public String checkGraduationRank() {
        while (true) {
            String graduation_rank = checkEmptyString();
            if (!graduation_rank.equalsIgnoreCase("Excellence")
                    && !graduation_rank.equalsIgnoreCase("Good")
                    && !graduation_rank.equalsIgnoreCase("Fair")
                    && !graduation_rank.equalsIgnoreCase("Poor")) {
                System.err.println("Rank: Excellence/Good/Fair/Poor");
                System.out.print("Enter Graduation Rank (Excellence/Good/Fair/Poor): ");
            } else {
                return graduation_rank;
            }
        }
    }

    // check input University Name
    public String checkUniversity() {
        while (true) {
            String university = checkEmptyString();
            if (university.length() > 60) {
                System.err.println("Name is too long");
                System.out.print("Enter University: ");
            } else if (!university.matches("^[A-Za-z ]*")) {
                System.err.println("Name contains only alphabet");
                System.out.print("Enter University: ");
            } else if (university.matches("^[A-Za-z ]*(.)\\1\\1$")) {
                System.err.println("A character must not repeat 3 times");
                System.out.print("Enter University: ");
            } else {
                return university;
            }
        }
    }

    // check input Major
    public String checkMajor() {
        while (true) {
            String major = checkEmptyString();
            if (major.length() > 20) {
                System.err.println("Name is too long");
                System.out.print("Enter Major: ");
            } else if (!major.matches("^[A-Za-z ]*")) {
                System.err.println("Name contains only alphabet");
                System.out.print("Enter Major: ");
            } else if (major.matches("^[A-Za-z ]*(.)\\1\\1$")) {
                System.err.println("A character must not repeat 3 times");
                System.out.print("Enter Major: ");
            } else {
                return major;
            }
        }
    }

    // check input Semester
    public String checkSemester() {
        while (true) {
            String semester = checkEmptyString();
            if (!semester.matches("^[SP,SU,FA]{2}[1-2]{1}[0-9]{1}")) {
                System.err.println("Semester format: SP20 or SU20 or FA20 !!!");
                System.out.print("Enter Semester: ");
            } else {
                return semester;
            }
        }
    }
}
