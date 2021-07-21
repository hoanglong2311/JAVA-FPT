import java.util.ArrayList;
import java.util.Calendar;

public class Manager {
    

    //display Menu 

    public static int menu() {
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intership");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }

    public static void createCandidate(ArrayList<Candidate> candidates, int type) {
        
        while (true) {
            System.out.println("Enter id: ");
            String id = Validation.checkInputString();
            System.out.println("Enter first name: ");
            String firstName = Validation.checkInputString();
            System.out.println("Enter last name: ");
            String lastName = Validation.checkInputString();
            System.out.println("Enter birth date: ");
            int birthDate = Validation.checkInputIntLimit(1900, Calendar.getInstance().get(Calendar.YEAR));
            System.out.println("Enter address: ");
            String address = Validation.checkInputString();
            System.out.println("Enter phone number: ");
            String phoneNumber = Validation.checkInputPhone();
            System.out.println("Enter email: ");
            String email = Validation.checkInputEmail();
            Candidate candidate = new Candidate(id, firstName, lastName,birthDate , address, phoneNumber, email, type);

            if (Validation.checkIdExists(candidates, id)) {
                switch (type) {
                    case 0:
                        createExperience(candidates, candidate);
                        break;
                    case 1:
                        createFresher(candidates, candidate);
                        break;
                    case 2:
                        createInternship(candidates, candidate);
                        break;
                    default:
                        break;
                }
            } else return;
            System.out.print("Do you want to continue (Y/N): ");
            if(!Validation.checkInputYN()){
                return;
            }
        }
    }


    public static void createExperience(ArrayList<Candidate> candidates, Candidate candidate) {
        System.out.println("Enter year of experience: ");
        int yearExperience = Validation.checkInputExprience(candidate.getBirthDate());

        System.out.println("Enter professional skill: ");
        String professionalSkill = Validation.checkInputString();
                candidates.add(new Experience(yearExperience,professionalSkill, 
                candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate() ) );

        System.err.println("Create sucess. ");
    }

    public static void createFresher(ArrayList<Candidate> candidates, Candidate candidate) {
        System.out.print("Enter graduation date: ");
        String graduationDate = Validation.checkInputString();
        System.out.print("Enter graduation rank: ");
        String graduationRank = Validation.checkInputGraduationRank();
        candidates.add(new Fresher(graduationDate, graduationRank, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }

    public static void createInternship(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter major: ");
        String major = Validation.checkInputString();
        System.out.print("Enter semester: ");
        String semester = Validation.checkInputString();
        System.out.print("Enter university: ");
        String university = Validation.checkInputString();
        candidates.add(new Internship(major, semester, university, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }

    
    
    public static void searchCandidates(ArrayList<Candidate> candidates) {
        printListnameCandidates(candidates);
        System.out.print("Enter candidates name (Firt name or last name): ");
        String nameSearch = Validation.checkInputString();
        System.out.print("Enter type of candidate: ");
        int typeSearch = Validation.checkInputIntLimit(0,2);
        for (Candidate candidate : candidates) {
            if (candidate.getTypeCandidate()== typeSearch && 
                (candidate.getFirstName().contains(nameSearch) || candidate.getLastName().contains(nameSearch))) {
                System.out.println(candidate.toString());
            }
        }
    }

    public static void printListnameCandidates(ArrayList<Candidate> candidates) {
        System.err.println("Experience candidates");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());

            }
        }
        System.err.println("Fresher candidates");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());

            }
        }
        System.err.println("Intership candidates");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Internship) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());

            }
        }

    }

}
