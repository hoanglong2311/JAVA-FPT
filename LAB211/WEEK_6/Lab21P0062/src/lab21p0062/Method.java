package lab21p0062;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Method {

    public static void checkInputPath() {
        System.out.println("Please input Path: ");
        String path = Validation.checkInputString();
        
       
            System.out.println("Disk: " + getDisk(path));
            System.out.println("Extension: " + getExtension(path));
            System.out.println("File name: " + getFileName(path));
            System.out.println("Path: " + getPath(path));
            System.out.println("Folders: " + Arrays.toString(getFolder(path)));
        
    }

    private static String getPath(String path) {
        int toNameFile = path.lastIndexOf("\\");
        return path.substring(0, toNameFile);
    }

    private static String getFileName(String path) {
        int positionFrom = path.lastIndexOf("\\");
        int positionTo = path.lastIndexOf(".");
        return path.substring(positionFrom + 1, positionTo);
    }

    private static String getExtension(String path) {
        int positionDot = path.lastIndexOf(".");
        return path.substring(positionDot + 1);
    }

    private static String getDisk(String path) {
        int positionColon = path.indexOf("\\");
        return path.substring(0, positionColon);
    }

    // private static String getFolder(String path) {
    //     int positionColon = path.indexOf("\\");
    //     int positionLastColon = path.lastIndexOf("\\");
    //     return path.substring(positionColon + 1, positionLastColon);
    // }
    public static String[] getFolder(String path) {
        int positionColon = path.indexOf("\\");
        int positionDot = path.lastIndexOf("\\");
        String newPath = path.substring(positionColon+1, positionDot);
       
        String[] splitFile = newPath.split("\\\\");
        return splitFile;
    }
}
