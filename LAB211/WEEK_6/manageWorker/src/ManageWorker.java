import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class ManageWorker {
    

    public static void addWorker(ArrayList<Worker> lw) {
        System.out.println();
        System.out.println("--------- Add Worker ----------");
        System.out.print("Enter Code: ");
        String code = Validation.checkInputString();
        if (!Validation.checkIdExist(lw, code)){
            System.out.println("This id is exist");
            return;
        }
        System.out.print("Enter Name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter Age: ");
        int age = Validation.checkInputIntLimitInt(18, 50);
        System.out.print("Enter Salary: ");
        int salary = Validation.checkInputSalary();
        System.out.print("Enter work location: ");
        String workLocation = Validation.checkInputString();

        if (!Validation.checkWorkerExist(lw, code, name, age, salary, workLocation)) {
            System.err.println("Duplicated with existed code in DB") ;
        } else {
            lw.add(new Worker(code ,name,  age,  salary, workLocation));
            System.out.println("Add succeeded.");
        }
    }

    public static Worker getWorkerByCode(ArrayList<Worker> lw, String code) {
        for (Worker worker : lw) {
            if (code.equalsIgnoreCase(worker.getId())) {
                return worker;
            }
        }
        return null;
    }


    public static void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status) {
        if (lw.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.println();
        System.out.println("------- Up/Down Salary --------");
        System.out.print("Enter code: ");
        String id = Validation.checkInputString();
        Worker worker = getWorkerByCode(lw, id);
        if (worker == null) {
            System.err.println("Not exist worker.");
        } else {
            int salaryCurrent = worker.getSalary();
            int salaryUpdate;
            //check user want to update salary
            if (status == 1) {
                System.out.print("Enter salary: ");
                while (true) {     
                    int amount = Validation.checkInputSalary();
                    salaryUpdate = salaryCurrent + amount;
                    if (salaryUpdate <= salaryCurrent) {
                        System.err.println("Must be greater than current salary.");
                        System.out.print("Enter again: ");
                    } else {
                        break;
                    }
                }
                lh.add(new History(worker.getId(), worker.getName(), worker.getAge(), salaryUpdate, worker.getWorkLocation(), "UP", getCurrentDate())); 
            } else {
                System.out.print("Enter salary: ");
                while (true) {
                    int amount = Validation.checkInputSalary();
                    salaryUpdate = salaryCurrent - amount;
                    if (salaryUpdate >= salaryCurrent) {
                        System.err.println("Must be smaller than current salary.");
                        System.out.print("Enter again: ");
                    } else {
                        break;
                    }
                }
                lh.add(new History(worker.getId(), worker.getName(), worker.getAge(), salaryUpdate, worker.getWorkLocation(), "DOWN", getCurrentDate()));
            }
            worker.setSalary(salaryUpdate);
            System.err.println("Update success");
        }
    }



    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }


    public static void printHistory(History history) {
        System.out.printf("%-5s%-15s%-5d%-10d%-10s%-20s\n", history.getId(),
                history.getName(), history.getAge(), history.getSalary(),
                history.getStatus(), history.getDate());
    }



    public static void printListHistory(ArrayList<History> lh) {
        System.out.println();
        System.out.println("--------------------Display Information Salary-----------------------");
        
        if (lh.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.printf("%-5s%-15s%-5s%-10s%-10s%-20s\n", "Code", "Name", "Age",
                "Salary", "Status", "Date");
        Collections.sort(lh);
        //print history from first to last list
        for (History history : lh) {
            printHistory(history);
        }
    }

}
