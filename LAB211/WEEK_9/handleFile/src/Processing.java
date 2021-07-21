import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Processing {
    

    public static void checkPath() {
        System.out.println("----------------- Check Path -----------------");
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            System.out.println("Path to File.");
        } else if (file.exists() && file.isDirectory()) {
            System.out.println("Path to Directory.");
        } else{
            System.out.println("Path doesn't exist");
        }
    }

    public static void getAllFileNameJavaInDirectory() {
        System.out.println("----------------- Get file name with type Java -----------------");
        ArrayList<String> listFileName = new ArrayList<String>();
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isDirectory()){
            File[] listFile = file.listFiles();
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isFile() && listFile[i].getName().endsWith(".java")) {
                    listFileName.add(listFile[i].getName());
                }
            }
        } else {
            System.out.println("Path doesn't exist'");
            return;
        }
        System.out.println("Result "+ listFileName.size() + " file!");
        for (int i = 0; i < listFileName.size(); i++) {
            System.out.println(listFileName.get(i));
        }
    }

    public static void getFilewithSizeGreaterThanInput() {
        System.out.println("----------------- Get file with size greater than input-----------------");
        ArrayList<String> listFileName = new ArrayList<String>();
        System.out.print("Enter size: ");
        int size = Validation.checkInputInt();
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();

        File  file = new File(path);
        if (file.exists()  && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isFile() && listFiles[i].length() > (size*1024)) {
                    listFileName.add(listFiles[i].getName());
                }
            }
        } else {
            System.out.println("Path doesn't exist");
            return;
        }
        System.out.println("Result "+ listFileName.size() + " file!");
        for (int i = 0; i < listFileName.size(); i++) {
            System.out.println(listFileName.get(i));
        }
    }

    public static void writeMoreContentToFile() throws IOException {
        System.out.println("----------------- Write more content to file-----------------");
        System.out.print("Enter content: ");
        String content = Validation.checkInputString();
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()){
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(" "+ content);
            writer.close();
            System.out.println("write done!");
        } else {
            System.out.println("Path doesn't exist");
            return;
        }
    }

    public static void countCharacters() throws IOException {
        System.out.println("----------------- Read file amd count characters -----------------");
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()){
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            int count = 0;
            while (line!= null) {
                // StringTokenizer st = new StringTokenizer(line, "\\W");
                // System.out.println("Tổng số token: " + st.countTokens());
                // while (st.hasMoreTokens()) {
                //     System.out.println(st.nextToken());
                // }
                // count = st.countTokens();
                
                String[] parts = line.split(" +");
                for (String string : parts) {
                    count++; 
                }
                line = reader.readLine();  
            }
            reader.close();
            System.out.println("Total: " + count);
        } else {
            System.out.println("Path doesn't exist");
            return;
            
        }
    }

}
