/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.io.IOException;

/**
 *
 * @author ernst
 */
public class OpenNotepad {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec(
                "c:\\windows\\system32\\notepad.exe");
        Process q = Runtime.getRuntime().exec(
                "c:\\windows\\system32\\notepad.exe");
        Process r = Runtime.getRuntime().exec(
                "c:\\windows\\system32\\notepad.exe");
    }

}
