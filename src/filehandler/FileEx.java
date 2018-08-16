/*
 * this class creates a file and its method returns the Path object of the file
 * the path object is used to write some text in the file, 
 * with the use of a method found in another class [a class method].
 */
package filehandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Path;
import java.nio.file.Paths;
// import java.lang.SecurityException  -- NEEDS NO IMPORT since it is in lang
import java.util.Scanner;

/**
 * this class creates a file and its method returns the Path object of the file
 * the path object is used to write some text in the file, 
 * with the use of a method found in another class [a class method].
 */
public class FileEx {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.SecurityException
     */
    public static void main(String[] args) throws IOException, SecurityException {
        FileEx fe = new FileEx();
//        FilesEx fh = new FilesEx(); // if umplemFisierul in FilesEx is static, can be used without instantiating FilesEx

        FilesEx.umplemFisierul(fe.constrFisier());
    }

    public Path constrFisier() throws FileAlreadyExistsException, IOException, SecurityException {
        Scanner xerox = new Scanner(System.in);
        char c; // just an "instrumental" variable
        String path; // the path of the file to be created
        String name; // the name of the file [of user chiises only the name, but not the whole path]
        Path pathName; // full identificator/pathy of the file created

        // i will insisitently ask user to choose the way he/she wants to input the path
        do {
            System.out.println("You want to specify a particular path for the file to be created? [Y/N]");
            c = xerox.next().charAt(0);
        } while ((c != 'Y') && (c != 'N'));
        // at this point i know how he/she wants to input the path

        if (c == 'N') { // of the user wants to input only file's name [NOT whole path]
            System.out.println("OK. At least please specify a name for your .txt file to be created");
            name = xerox.next();
            StringBuilder eman = new StringBuilder(name);  // i will check whether the user specified .txt in the name of the file
            eman = eman.reverse();
            if (eman.toString().charAt(0) == 't'
                    && eman.toString().charAt(1) == 'x'
                    && eman.toString().charAt(2) == 't'
                    && eman.toString().charAt(3) == '.') {
                //nothing happens here, the user  included .txt
            } else {
                name = name.concat(".txt");  // if he/she forgot, i added it
            }
            //at this point i will have the path WITHOUT filename.
            //now, create the path+name - the FULL PATH of the file to be created
            path = System.getProperty("user.dir").concat("\\").concat(name);
            pathName = Paths.get(path);
            System.out.println("I will create the " + name + " file with the full path " + path);
            //at this point, i have the identity of the file to be created 
            // [if user chooses NOT to create path, but only name of the file]

            // BUT if he/she chooses Y [to input WHOLE path], the programme expects a path as an input:
        } else {
            System.out.println("OK. Please input the desired path in the format c:\\\\...\\\\xxxx.txt");
            path = xerox.next();
            name = path;
            pathName = Paths.get(path);
            System.out.println("I will create the file with the path " + path);
        }
        // at this moment i have THE FULL PATH to create the file:
        // ; either the current directory when the properties were initialized,
        //, or the path specified by the user [at this point i assume it is correct
        // namely, it is experienced user and noes not forget the name of the file [.txt].

        //now the programme attempts creating the file
        try {
            System.out.println(name);
            File fisier = new File(path); // this does NOT creates the file
            fisier.createNewFile();
            if (fisier.createNewFile()) {
                System.out.println("Great. your file was created.");
            } else {
                System.out.println("Your file was NOT created: File already exists. But you might have Write rights on existing file. ");
            }
        } catch (IOException e) {
            System.out.println("specified path might not exist");

        } catch (SecurityException e) {
            System.out.println("You do not have right to write on the specific folder");
        } finally {
        }
        return pathName;
    }
}
