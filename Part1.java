
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/*
 * Finds the index position of the start codon “ATG”. If there is no “ATG”, return the empty string.
 * Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. If there is no such “TAA”, return the empty string.
 * If the length of the substring between the “ATG” and “TAA” is a multiple of 3, then return the substring that starts with that “ATG” and ends with that “TAA”.
 * @parameter dna, representing a string of DNA. 
 */
import edu.duke.*;
import java.io.File;
public class Part1 {
    public String findSimpleGene(String dna){
        // Finds the index position of the start codon “ATG”.
       int start_index = dna.indexOf("ATG");
        // If there is no “ATG”, return the empty string.
        if(start_index == -1){
            return "";
        }
        // Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. 
        // If there is no such “TAA”, return the empty string.
        int end_index = dna.indexOf("TAA", start_index + 3);
        if(end_index==-1){
            return "";
        }
        
        if((end_index - start_index) % 3 == 0){
            return dna.substring(start_index, end_index+3);
        }
        else{
            return "";
        }
        
    }
    
    public void testSimpleGene(){
        String s1 = "CGGTAGATGCGCCCDATAATTC";
        System.out.println("Raw Gene: " + s1);
        String s1_ = findSimpleGene(s1);
        System.out.println("Find Gene: " + s1_);
        
        String s2 = "CGGTAGATGCGCCCDAGCTAATTC";
        System.out.println("Raw Gene: " + s2);
        String s2_ = findSimpleGene(s2);
        System.out.println("Find Gene: " + s2_);
        
    }
}
