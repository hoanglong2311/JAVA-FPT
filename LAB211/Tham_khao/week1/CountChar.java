import java.util.*;
public class CountChar{

    public static void main(String[] a){
        List<String> list = new ArrayList<String>();
        String sn = "hello world hello world asdadw wadaw ga ga g a ga ga";
        StringTokenizer st = new StringTokenizer(sn," ");
        int dem=0;
        int[] dem1= new int[st.countTokens()+1];
        String s;  
        while (st.hasMoreTokens()) {  
            s = st.nextToken();
            if (list.indexOf(s)==-1){
                list.add(s);
                dem1[dem++] = 1;
            } else {
                dem1[list.indexOf(s)]++;
            }
            
        }

        dem=0;
        for (String i : list) {
            System.out.print(i + " = " + dem1[dem++]+", ");
        }

        System.out.println();
        char[] aaa = sn.toCharArray();
        int[] dem2= new int[255];
        for (char i:aaa){
            dem2[i]++;
        }

        for (char i ='a'; i<'z'; i++ ){
            if (dem2[i]>0 ) System.out.print(i + " = " + dem2[i]+ ", ");
        }

    }
}