import java.util.ArrayList;

public class DoctorList {

    //cho phép người dùng add thêm doctor vào
    
    public static void addDoctor(ArrayList<Doctor> ld) {
        System.out.println("--------- Add Doctor ----------");
        System.out.print("Enter Code: ");
        String code = Validation.checkInputString();
        if (!Validation.checkCodeExist(ld, code)) {
            System.err.println("Code exists.");
            return;
        }
        System.out.print("Enter Name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter Specialization: ");
        String specialization = Validation.checkInputString();
        System.out.print("Enter availability: ");
        int availability = Validation.checkInputInt();
        //kiểm tra xem có bị trùng với thông tin đã có sẵn hay không
        if (!Validation.checkDuplicate(ld, code, name, specialization, availability)) {
            System.err.println("Duplicate.");
            return;
        }
        ld.add(new Doctor(code, name, specialization, availability));
        System.err.println("Add successful.");
    }

    public static void updateDoctor(ArrayList<Doctor> ld) {
        System.out.println("--------- Update Doctor -------");
        System.out.print("Enter Code: ");
        String code = Validation.checkInputString();
        if (Validation.checkCodeExist(ld, code)) {
            System.err.println("Doctor code doesn’t exist");
            return;
        }
        System.out.print("Enter Name: ");
        String name = Validation.checkInputString();
        Doctor doctor = getDoctorByCode(ld, code);
        System.out.print("Enter Specialization: ");
        String specialization = Validation.checkInputString();
        System.out.print("Enter availability: ");
        int availability = Validation.checkInputInt();
        if(!Validation.checkChangeInfo(doctor, code, name, specialization)){
            System.err.println("Nothing changed.");
            return;
        }
        doctor.setCode(code);
        doctor.setName(name);
        doctor.setSpecialization(specialization);
        doctor.setAvailability(availability);
        System.err.println("Update successful");
    }

    public static Doctor getDoctorByCode(ArrayList<Doctor> ld, String code) {
        for (Doctor doctor : ld) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

    public static void deleteDoctorByCode(ArrayList<Doctor> ld) {
        System.out.println("--------- Delete Doctor -------");
        System.out.print("Enter Code: ");
        String code =Validation.checkInputString();
        Doctor doctor = getDoctorByCode(ld, code);
        if (doctor == null) {
            System.err.println("Doctor code doesn’t exist");
            return;
        } else {
            ld.remove(doctor);
            System.err.println("Delete successful.");
        }
    }

    private static ArrayList<Doctor> listFoundByName(ArrayList<Doctor> ld, String name) {
        ArrayList<Doctor> listFoundByName = new ArrayList<Doctor>();
        for (Doctor doctor : ld) {
            if (doctor.getName().toLowerCase().contains(name.toLowerCase())) {
                listFoundByName.add(doctor);
            }
        }
        return listFoundByName;
    }

    public static void searchDoctorByName(ArrayList<Doctor> ld) {
        System.out.println("---------- Search Doctor --------");
        System.out.print("Enter name: ");
        String name = Validation.checkInputString();
        ArrayList<Doctor> listFoundByName =  listFoundByName(ld, name);
        if (listFoundByName.isEmpty()) {
            System.err.println("Cant found any doctor");
        } else {
            System.out.println("--------- Result ------------");
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
            "Specialization", "Availability");
            for (Doctor doctor : listFoundByName) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(),
                        doctor.getAvailability());
            }
        }

    }

}
