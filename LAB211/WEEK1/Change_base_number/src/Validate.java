


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Validate {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public int getBase(String msg, String err) {
        
        while(true){
            
            try {
                System.out.println(msg);
                int base = Integer.parseInt(in.readLine());
                if(base == 2 || base == 10 || base == 16) return base;

            } catch (IOException ex) {
                //TODO: handle exception
                ex.printStackTrace(System.out);
            }
            System.out.println(err);
        }
    }
public String getValue(String msg,String err, int base) {
        while(true) {
            
            try {
                System.out.println(msg);
                String value = in.readLine();   
                switch (base) {
                    case 2:
                        if(value.matches("[0-1]+")) // chi la so 0 va 1
                            return value;
                        break;
                    case 10:
                        if(value.matches("[0-9]+")) // chi la so 0 den 9
                        return value;
                    break;
                    case 16:
                        if(value.matches("[0-9a-fA-F]+")) // chi la so 0 den 9 va a den f
                        return value;
                    break;
                    default:
                        break;
                } 
            } catch (IOException e) {
                //TODO: handle exception
                e.printStackTrace(System.out);
            }
            System.out.println(err);

        }

    }

}
