import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Processing {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    
    public static void formatName(ArrayList<CSV> ls) {
        for (int i = 0; i < ls.size(); i++) {
            String name = ls.get(i).getName().trim();
            name = name.toLowerCase().replaceAll("\\s+", ",");
            String[] parts = name.split(",");
            StringBuffer sBuffer = new StringBuffer();
            for (int j = 0; j < parts.length; j++){
                sBuffer.append(Character.toUpperCase(parts[j].charAt(0))).append(parts[j].substring(1)).append(" ");
            } 
            ls.get(i).setName(sBuffer.toString().trim());
        }
        System.err.println("Format: Done");
    }

    public static void formatAddresses(ArrayList<CSV> ls) {
        for (int i = 0; i < ls.size(); i++) {
            String address = ls.get(i).getAddress().trim();
            address = address.toLowerCase().replaceAll("\\s+", ",");
            String[] arStrings = address.split(",");
            StringBuffer sBuffer = new StringBuffer();
            for (int j = 0; j < arStrings.length; j++){
                sBuffer.append(Character.toUpperCase(arStrings[j].charAt(0))).append(arStrings[j].substring(1)).append(" ");
            }
            ls.get(i).setAddress(sBuffer.toString().trim());
        }

        System.out.println("Format is done !!!");
    }

    public static void importFile(ArrayList<CSV> ls) {
        String line = "";
        BufferedReader fileReader = null;
        String a ="";
        while (true) {
            System.out.print("Enter Path: ");
            String path = Validation.checkInputString();
            a = path; 
            File file = new File(path);
            if (file.exists() && file.isFile()) break;
        }
        try {
            fileReader = new BufferedReader(new FileReader(path));
            while ((line = fileReader.readLine()) != null) {
                String[] split = line.split(COMMA_DELIMITER);
                ls.add(new CSV(Integer.parseInt(split[0]), split[1], split[2], split[3], split[4]));
            }
            System.out.println("Import: Done");
        } catch (FileNotFoundException e) {
            //TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void exportFile(ArrayList<CSV> ls) {
        FileWriter fileWriter = null;
        System.out.print("Enter Path: ");
        String path = Validation.checkInputString();
        try {
            fileWriter = new FileWriter(path,true);
            for (CSV csv : ls) {
                fileWriter.append(String.valueOf(csv.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(csv.getName()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(csv.getEmail()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(csv.getPhone()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(csv.getAddress()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void print(ArrayList<CSV> ls) {
        for (int i = 0; i < ls.size(); i++) {
            System.out.printf("%d,%s,%s,%s,%s\n", ls.get(i).getId(),
                    ls.get(i).getName(), ls.get(i).getEmail(), ls.get(i).getPhone(),
                    ls.get(i).getAddress());
        }
    }

}
