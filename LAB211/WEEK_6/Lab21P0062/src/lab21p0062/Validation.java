/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21p0062;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    private static final Scanner in = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again:");
            } else {
                return result;
            }
        }
    }

}
