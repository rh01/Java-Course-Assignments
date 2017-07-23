
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public String findSimpleGene(String dna, int startCodon, int endCodon ){
        String processed_gene = dna.toUpperCase();
        
        while ((endCodon - startCodon ) % 3 !=0){
            if(startCodon == -1){return "";}
            if(endCodon == -1){return "";}
            if(startCodon < endCodon)
            {
                startCodon = dna.indexOf("ATG", startCodon+1);}
            else{
                endCodon = dna.indexOf("TAA", startCodon + 3);
            }           
        }    
        return dna.substring(startCodon, endCodon+3);
    }    
        
     public void testSimpleGene(){
        String s1 = "CGGTAGATGCGCCCDATAATTC";
        System.out.println("Raw Gene: " + s1);
        String s1_ = findSimpleGene(s1, s1.indexOf("ATG"), s1.indexOf("TAA"));
        System.out.println("Find Gene: " + s1_);
        
        String s2 = "CGGTAGATGCGCCCDAGCTAATTC";
        System.out.println("Raw Gene: " + s2);
        String s2_ = findSimpleGene(s2, s2.indexOf("ATG"), s2.indexOf("TAA"));
        System.out.println("Find Gene: " + s2_);
        
        String s3 = "gatgctataat";
        System.out.println("Raw Gene: " + s3);
        String s3_ = findSimpleGene(s3, s3.indexOf("atg"), s3.indexOf("taa"));
        System.out.println("Find Gene: " + s3_);
        
    }
}
