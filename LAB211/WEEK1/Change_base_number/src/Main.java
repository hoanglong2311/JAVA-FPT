
//Change base number system (16, 10, 2) program. 

public class Main {
    public static void main(String[] args) throws Exception {
        Validate validate = new Validate();
        Convert convert = new Convert();
        
        while (true) {
            int inBase = validate.getBase("Enter base input: ", "Base invalid");
            String value = validate.getValue("Enter value input: ", "Value invalid", inBase);
            int outBase = validate.getBase("Enter base output: ","Base invalid");


            System.out.println("After change base: ");
            System.out.println("The output: ");

            if (inBase == 10) {
                System.out.println(convert.DecToOther(Integer.parseInt(value), outBase));

            } else {
                int decTmp = convert.OtherToDec(value, inBase);
                System.out.println(convert.DecToOther(decTmp, outBase));
            }
            System.out.println("================================");

        }
    }
}
