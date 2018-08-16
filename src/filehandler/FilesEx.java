/*
 * This class is creating a file IN THE CURRENT DIRRECTORY 
 * and writes some text in it. It has two methods, one of them [used 
 * for the imput of text and writing the text to the file] is STATIC
 * so that other classes can use it without instantiating FilesEx.
 */
package filehandler;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import static java.nio.file.Files.isWritable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * This class is creating a file IN THE CURRENT DIRRECTORY and writes some text
 * in it. It has two methods, one of them [used for the imput of text and
 * writing the text to the file] is STATIC so that other classes can use it
 * without instantiating FilesEx.
 */
public class FilesEx {

    /**
     * @param args the command line arguments
     * @throws java.nio.file.FileAlreadyExistsException
     * @throws java.io.IOException
     * @throws java.lang.SecurityException
     */
    public static void main(String[] args) throws FileAlreadyExistsException, IOException, SecurityException {
        FilesEx fh = new FilesEx();

        FilesEx.umplemFisierul(fh.construimFisierul());
        // !! umplemFisierul method is defined as STATIC 
        // so that it can be used by other classes 
        // without instantiating FilesEx.

    }

    public Path construimFisierul() throws FileAlreadyExistsException, IOException, SecurityException {
        Scanner xerox = new Scanner(System.in);
        //start with the name of the file to be created [not the path, just file's name]:
        System.out.println("Please specify a name for your file to be created [incl .txt]");
        String name = xerox.next();

        // we concat file's name to the current directory [user directory]
        // NOTE: this is only for Windows systems, due to separator!
        Path file = Paths.get(System.getProperty("user.dir").concat("//").concat(name));

        try { // attempt creating an empty file with default permissions:
            Files.createFile(file);
        } catch (FileAlreadyExistsException x) {
            System.out.println("file named " + file.toString() + " already exists");
            // if file already exists, the user must be informed whether it has writing permissions
            // and about the consequences of writing new text to the existing file
            if (isWritable(file)) {
                System.out.println("You DO have write permission on the existing file; "
                        + "Anything you write will ERASE existing content!!!");
            } else {
                System.out.println("You do NOT have write permission on the existing file");
            }

        } catch (IOException x) {
            // Some other sort of failure [like host not using Windows SO - incorrect path.
            System.out.println("createFile error:I/O error ");
        } catch (UnsupportedOperationException x) { // NO NEED HERE IN OUR CASE, given the simple structure of the file
            //  if the array contains an attribute that cannot be set atomically when creating the file
            System.out.println("attribute that cannot be set atomically when creating the file ");
        } catch (SecurityException x) {
            //  the default provider, and a security manager is installed, the checkWrite method is invoked to check write access to the new file.
            System.out.println("no Write permission in the folder");
        }
        return file;  //Returns the PATH of the file created
    }

    public static void umplemFisierul(Path file) throws IOException {  //FileWriter constructor can throw I/O Exception
        Scanner xerox = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        while (true) {  // this is an infinite loop, for exit input space bar+enter
            System.out.print("Enter text (' ' = space+Enter to exit):");
            String increment = xerox.nextLine();
            input = input.append(increment);
            System.out.println("You just entered:" + increment);

            if (" ".equals(increment)) {

                try (//Write Content  -- this is try-with-resources, not try/catch
                        FileWriter writer = new FileWriter(file.toString())) {
                    writer.write(input.toString());
                } catch (FileNotFoundException x) {
                    // in case there is no file to write in 
                    // [wrong path passed to method, when FileEx is used]
                    System.out.println("write to file error:File Not Found ");
                } catch (IOException x) {
                    // Some  sort of failure.
                    System.out.println("write to file error: other I/O error ");
                }

                System.out.println("Bye!");
                break;

            }

        }

    }

}
