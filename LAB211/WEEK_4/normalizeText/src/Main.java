
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            int countLine = NormalizeText.countLine();
            int count = 1;
            String path = "E:/LAB211-OOP with Java Lab/WEEK_4/normalizeText/src/test.txt";
            br = new BufferedReader(new FileReader(new File(path)));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)));
            String line;
            //write until end file
            while ((line = br.readLine()) != null) {
                //check line empty
                if (NormalizeText.isLineEmpty(line)) {
                    continue;
                }
                line = NormalizeText.formatOneSpace(line);
                line = NormalizeText.formatSpecialCharacters(line);
                line = NormalizeText.afterDotUpperCase(line);
                line = NormalizeText.noSpaceQuotes(line);
                line = NormalizeText.firstUpercase(line);
                line = NormalizeText.lastAddDot(line);
                pw.print(line);
                if (count < countLine) {
                    pw.print(System.getProperty("line.separator"));
                }
                count++;
            }
            br.close();
            pw.close();
            System.out.println("Normalize successful.");
        } catch (FileNotFoundException ex) {
            System.err.println("Can't not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
