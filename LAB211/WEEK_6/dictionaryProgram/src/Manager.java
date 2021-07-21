import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Manager {
    

    public static void addNewWord(HashMap<String, String> hm) {
        System.out.println("------------- Add -------------");
        System.out.print("Enter English: ");
        String english = Validate.checkInputString();
        if (!Validate.checkKeywordExist(hm, english)) {
            if (!Validate.checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter Vietnamese: ");
        String vietnam = Validate.checkInputString();
        hm.put(english, vietnam);
        System.err.println("Successful.");
    }

    public static void deleteWord(HashMap<String, String> hm) {
        System.out.println("------------ Delete ----------------");
        System.out.print("Enter English: ");
        String english = Validate.checkInputString();
        if (Validate.checkKeywordExist(hm, english)) {
            System.err.println("Can't find");
            return;
        } else {
            // hm.remove(english);
            // System.err.println("Successful.");
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                if (entry.getKey().equalsIgnoreCase(english)) {
                    // System.out.println("Vietnamese: " + entry.getValue());
                    hm.remove(entry.getKey());
                    System.err.println("Successful.");
                    return;
                }
            }
        }
        
    }

    public static void translate(HashMap<String, String> hm) {
        System.out.println("------------- Translate ------------");
        System.out.print("Enter english: ");
        String english = Validate.checkInputString();
        if (Validate.checkKeywordExist(hm, english)) {
            System.err.println("Can't find");
            return;
        } else {
            Set<Map.Entry<String, String>> entries = hm.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                if (entry.getKey().equalsIgnoreCase(english)) {
                    System.out.println("Vietnamese: " + entry.getValue());
                    return;
                }
            }
        }
    }
}
