
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class Part4 {
    public void main(){
        URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for(String word : ur.words()){
            
            int index = word.indexOf("youtube.com");
            if(index == -1){
                continue;
            }
            int end = word.indexOf("\"", index+1);
            int start = word.indexOf("\"");
            System.out.println(word.substring(start, end+1));
        }
    }
}
