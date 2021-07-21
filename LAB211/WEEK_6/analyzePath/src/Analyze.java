import java.util.Arrays;

public class Analyze {
    

    public static void mainFunction() {
        System.out.println("===== Analysis Path Program =====");
        System.out.println("Please input Path:");
        String path = Validation.checkValidPath();
        System.out.println("\n");
        System.out.println("----- Result Analysis -----");
        System.out.println("Disk: " + getDisk(path));
        System.out.println("Extension: " + getExtension(path));
        System.out.println("File name: " + getFileName(path));
        System.out.println("Path: " + getPath(path));
        System.out.println("Folders: " + Arrays.toString(getFolder(path)));
        
    }

    public static String getPath(String path) {
        int toNameFile = path.lastIndexOf("\\");
        return path.substring(0, toNameFile);
    }

    public static String getFileName(String path) {
        int positionFrom = path.lastIndexOf("\\");
        int positionTo = path.lastIndexOf(".");
        return path.substring(positionFrom+1, positionTo);
    }


    public static String getExtension(String path) {
        int positionDot = path.lastIndexOf(".");
        return path.substring(positionDot+1, path.length());
    }

    public static String getDisk(String path) {
        int positionColon = path.indexOf("\\");
        return path.substring(0, positionColon);
    }
    // E:\LAB211-OOP with Java Lab\WEEK_6\Lab21P0062\src\lab21p0062
    public static String[] getFolder(String path) {
        int positionColon = path.indexOf("\\");
        int positionDot = path.lastIndexOf("\\");
        String newPath = path.substring(positionColon+1, positionDot);
        String[] splitFile = newPath.split("\\\\");
        return splitFile;
    }
}
