
package managelecturer;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    private static Scanner sc=new Scanner(System.in);
    private static final String EMAIL_VALID = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";
    private static final String VALID_PHONE = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
            + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";
    
    static int inputIntInRange(int min,int max, String s){
        do {            
            try {
                System.out.print(s);
                int number=Integer.parseInt(sc.nextLine());
                if (number<min||number>max) throw new Exception();
                return number;
            } catch (Exception e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        } while (true);
    } 
    
    static String inputString(String s){
        do {            
            try {
                System.out.print(s);
                String string=sc.nextLine().trim().replaceAll("\\s+", " ").trim();
                if (string.isEmpty()) throw new Exception();
                return string;
            } catch (Exception e) {
                System.err.println("String must be non-empty.");
            }
        } while (true);
    }
    
    static String inputID(ArrayList<Lecturer> list,String s){
        do {            
            try {
                String id=inputString(s);
                for (Lecturer l:list)
                    if (l.getId().toUpperCase().equalsIgnoreCase(id.toUpperCase()))
                        throw new Exception();
                return id;
            } catch (Exception e) {
                System.err.println("ID is exist.");
            }
        } while (true);
    }
    
    static String inputPhone(String s){
        do {            
            try {
                String phone=inputString(s);
                if (!phone.matches(VALID_PHONE)) throw new Exception();
                return phone;
            } catch (Exception e) {
                System.err.println("Phone: is number with minimum 10 characters.");
            }
        } while (true);
    }
    
    static String inputEmail(String s){
        do {            
            try {
                String email=inputString(s);
                if (!email.matches(EMAIL_VALID)) throw new Exception();
                return email;
            } catch (Exception e) {
                System.err.println("Email with format <account name>@<domain>. (eg: annguyen@fpt.edu.vn)");
            }
        } while (true);
    }
    
    static int inputInt(String s){
        do {            
            try {
                System.out.print(s);
                int number=Integer.parseInt(sc.nextLine());
                return number;
            } catch (Exception e) {
                System.err.println("Please input a integer number.");
            }
        } while (true);
    }
    
    static boolean checkYN(String s){
        do {            
            try {
                System.out.print(s);
                String str=sc.nextLine().trim().toUpperCase();
                if (str.equalsIgnoreCase("Y")) return true;
                else if (str.equalsIgnoreCase("N")) return false;
                else throw new Exception();
            } catch (Exception e) {
                System.err.println("Please input Y or N.");
            }
        } while (true);
    }
}