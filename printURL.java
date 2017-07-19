
/**
 * Write a description of printURL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class printURL {
    public void readURL(){
        URLResource ur = new URLResource("http://www.dukelearntoprogram.com/");
        for(String s : ur.lines()){
            System.out.println(s);
        }
    }
}
