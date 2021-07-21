import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Doctor> ld = new ArrayList<Doctor>();
        ld.add(new Doctor("DOC 1", "Nghia", "Orthopedics", 3));
        ld.add(new Doctor("DOC 2", "Phuong", "Obstetrics", 2));
        ld.add(new Doctor("DOC 3", "Lien", "Orthodontic", 1));

        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    DoctorList.addDoctor(ld);
                    System.out.println();
                    break;
                case 2:
                    DoctorList.updateDoctor(ld);
                    System.out.println();
                    break;
                case 3:
                    DoctorList.deleteDoctorByCode(ld);
                    System.out.println();
                    break;
                case 4:
                    DoctorList.searchDoctorByName(ld);
                    System.out.println();
                    break;    
                case 5:
                    return; 

            }

        }
    
    
    
    
    }
}
