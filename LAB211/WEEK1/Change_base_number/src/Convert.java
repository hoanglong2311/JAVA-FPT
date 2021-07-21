public class Convert {

    //convert other base to base 10
    public int OtherToDec(String Other, int base) {
        int result =0;
        String HEX = "0123456789ABCDEF";
        Other = Other.toUpperCase();
        for (int i = 0; i < Other.length(); i++) {
            // đổi luôn từng kí tự đó sang dec
            //ví dụ trong other có kí tự A thì tự động result thành 10
            result += HEX.indexOf(Other.charAt(i)) * Math.pow(base, Other.length()-1-i);
            
        }
        return result;
    }


    public String DecToOther(int Dec, int base) {
        String result="";
        String HEX = "0123456789ABCDEF";
        while (Dec>0) {
            result = HEX.charAt(Dec%base) + result;
            Dec /= base;
        }

        return result;
    }
}
