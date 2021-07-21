import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Analyze {
    
    private static final  HashMap<String, ArrayList<Integer>> hmNumber = new HashMap<>();
    private static final  HashMap<String, String> hmString = new HashMap<>();

    public static boolean checkSquareNumber(int n) {
        int temp = (int)Math.sqrt(n);
         if(temp*temp == n) {
             return true;
         }
         else {
             return false;
         }
     }
    
    public static void getNumber(String inputString) {
        // HashMap<String, ArrayList<Integer>> hmNumber = new HashMap<>();
        ArrayList<Integer> liPerfectSquare = new ArrayList<>();
        ArrayList<Integer> liOdd = new ArrayList<>();
        ArrayList<Integer> liEven = new ArrayList<>();
        ArrayList<Integer> liAll = new ArrayList<>();



        String number = inputString.replaceAll("\\D+", ",");
        if (number.charAt(0) == ',') {
            number = number.substring(1);
        }
        if (number.charAt(number.length() - 1) == ',') {
            number = number.substring(0, number.length() - 1);
        }
        
        String[] listNumber = number.split(",");
        int lenNumber = listNumber.length;


        for (int i = 0; i < lenNumber; i++) {
            int numberCheck = Integer.parseInt(listNumber[i]);
            if (numberCheck % 2 == 1) {
                liOdd.add(numberCheck);
            }
            if (numberCheck % 2 == 0) {
                liEven.add(numberCheck);
            }
            if (checkSquareNumber(numberCheck)) {
                liPerfectSquare.add(numberCheck);
            }
            liAll.add(numberCheck);
        }

        hmNumber.put("Perfect Square Numbers: ", liPerfectSquare);
        hmNumber.put("Odd Numbers: ", liOdd);
        hmNumber.put("Even Numbers: ", liEven);
        hmNumber.put("All Numbers: ", liAll);
        
        // for (Map.Entry m : hmNumber.entrySet()) {
        //     System.out.println(m.getKey() + " " + m.getValue());
        // }
    }

    public static void getCharacter(String inputString) {
        // HashMap<String, String> hmString = new HashMap<>();

        String uppercase = inputString.replaceAll("\\W|[0-9]|[a-z]", "");
        String lowercase = inputString.replaceAll("\\W|[0-9]|[A-Z]", "");
        String special = inputString.replaceAll("\\w", "");
        String allCharacter = inputString.replaceAll("\\d|\\W", "");
        allCharacter += special;
        hmString.put("Uppercase: ", uppercase);
        hmString.put("Lowercase: ", lowercase);
        hmString.put("Special: ", special);
        hmString.put("All Character: ", allCharacter);


        // for (Map.Entry m : hmString.entrySet()) {
        //     System.out.println(m.getKey() + " " + m.getValue());
        // }
    }




    public static void display() {
        System.out.println("===== Analysis String program ====");
        System.out.println("-----Result Analysis------");
        for (Map.Entry m : hmNumber.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        for (Map.Entry m : hmString.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }

}
