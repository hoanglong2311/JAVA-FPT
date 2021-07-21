import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;



public class Counter {
    //Tạo một hashmap dùng để đếm kí tự trong input
    private Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

    //tạo một hashmap dùng để đếm từ trong input
    private Map<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void display() {
        System.out.println(wordCounter);
        System.out.println(charCounter);
    }

    //Giải thích về cách hoạt động:
    
    public void analyze(String content) {
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch)) continue;
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch,1);
            } else {
                charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
            }
        }
        
        // Câu lệnh dùng để hiện ra các key và value trong map
        // System.out.println(charCounter.keySet());
        // System.out.println(charCounter.values());
        


        //câu lệnh dùng để phân tách các word thành các token bằng mặc định delim = space
        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }
    }


}


    



