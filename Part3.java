
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public Boolean twoOccurrences(String stringa, String stringb){
       int occr_1 = stringb.indexOf(stringa);
       if(occr_1 == -1){
           return false;
       }
       int occr_2 = stringb.indexOf(stringa, occr_1+1);
       if(occr_2 == -1){
           return false;
       }
       return true;       
    }
    public void testing(){
        System.out.println(twoOccurrences("a", "ban"));
        System.out.println(lastPart("an", "banana"));
        
    }
    
    public String lastPart(String stringa, String stringb){
        int index = stringb.indexOf(stringa);
        if(index==-1){return stringb;}
        return stringb.substring(index+ stringa.length(), stringb.length());
    }
}
