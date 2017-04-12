import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 * Created by cmitchell on 3/27/17.
 */
public class Main {

    public static void main(String[] args) throws IOException{

        File thisDirectory = new File (".");

        //System.out.println("The current path is" + thisDirectory.getCanonicalPath());
        listFiles(thisDirectory);
        //String type = thisDirectory.isDirectory() ?"directory" : "file";
        //System.out.println("\t- is a " + type);

        //String isOrIsNot = thisDirectory.canRead() ? "is" : "is not";

        File newFile = new File("damnNewFile.txt");

        if(!newFile.exists()) {
            newFile.createNewFile();
        }
            listFiles(thisDirectory);

            newFile.delete();

            listFiles(thisDirectory);

            private static void listFiles(File dir) throws IOException{
            System.out.println("Contents of " + dir.getCanonicalPath() + "\n");

            for(File file : dir.listFiles()){
            System.out.println("\t-" + file.getCanonicalFile());
        }

            System.out.println("");
        }
    }
}
