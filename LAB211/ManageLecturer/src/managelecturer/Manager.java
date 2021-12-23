package managelecturer;

import java.util.ArrayList;

public class Manager {
    private ArrayList<Lecturer> list =new ArrayList<>();
    void create(){          
        int choice=Validation.inputIntInRange(1, 2,"Choose 1 to create full-time lecturer, 2 to create part-time lecturer: ");
        switch (choice) {
            case 1:
                createFulltime();
                break;
            case 2:
                createPartTime();
                break;
            default:
                break;
        } 
    }
    void createFulltime(){
        do {                    
            FullTimeLecturer l=new FullTimeLecturer();
            l.setId(Validation.inputID(list,"Enter lecturer ID: "));
            l.setName(Validation.inputString("Enter lecturer name: "));
            l.setPhone(Validation.inputPhone("Input lecturer phone: "));
            l.setEmail(Validation.inputEmail("Enter lecturer email: "));
            l.setHourlyWages(Validation.inputInt("Enter lecturer hours wages: "));
            l.setTeachingHoursAllowance(Validation.inputInt("Enter lecturer teaching hours allowance: "));
            l.setMiniHours(Validation.inputInt("Enter lecturer minimum hours: "));
            l.setTravelAllowance(Validation.inputInt("Enter lecturer travel allowance: "));
            l.setEquiqAllowance(Validation.inputInt("Enter lecturer equiment allowance: "));
            l.setType(1);
            list.add(l);
            if (Validation.checkYN("Do you want to continue creating full-time lecturer (Y/N)?: ") !=true ) return;
        } while (true);
    }
    
    void createPartTime(){
        do {                    
            PartTimeLecturer l=new PartTimeLecturer();
            l.setId(Validation.inputID(list,"Enter lecturer ID: "));
            l.setName(Validation.inputString("Enter lecturer name: "));
            l.setPhone(Validation.inputPhone("Input lecturer phone: "));
            l.setEmail(Validation.inputEmail("Enter lecturer email: "));
            l.setHourlyWages(Validation.inputInt("Enter lecturer hours wages: "));
            l.setTeachingHours(Validation.inputInt("Enter lecturer teaching hours: "));
            l.setType(2);
            list.add(l);
            if (Validation.checkYN("Do you want to continue creating part-time lecturer (Y/N)?: ")==false) return;

        } while (true);
    }

    void printLectures(){
        System.out.println("========FULL-TIME LECTURER==========");
        for (Lecturer lecturer:list)
           if (lecturer.getType()==1) System.out.println(lecturer);
        System.out.println("========PART-TIME LECTURER=========");
        for (Lecturer lecturer:list)
            if (lecturer.getType()==2) System.out.println(lecturer);
    }
    
    void printHighestSalary(){
        if (list.isEmpty()){
            System.out.println("Don't have lecturer.");
        }
        else{
            long max=list.get(0).TotalSalary();
            for (Lecturer lecturer:list)
                if (lecturer.TotalSalary()>max){
                    max=lecturer.TotalSalary();
                } 
            for (Lecturer lecturer:list)
                if (lecturer.TotalSalary()==max)
                    System.out.println(lecturer+" | "+lecturer.TotalSalary());
            }
            
    }
}
