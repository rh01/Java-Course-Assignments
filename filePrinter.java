import edu.duke.*;
import java.io.*;

public class filePrinter {
    public void dirReader(){
        DirectoryResource res = new DirectoryResource();
        for(File f: res.selectedFiles()){
            System.out.println(f);
        }
    }
}
