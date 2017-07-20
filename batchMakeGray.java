
/**
 * Write a description of batchMakeGray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class batchMakeGray {
    public ImageResource doGray(ImageResource input){
        // ImageResource input =  new ImageResource();
        ImageResource output = new ImageResource(input.getWidth(), input.getHeight());
        for(Pixel p: output.pixels()){
            // int x = p.getX();
            // y = p.getY();
            Pixel inPixel = input.getPixel(p.getX(), p.getY());
            int avg = (inPixel.getRed() + inPixel.getGreen() + inPixel.getBlue())/3;
            p.setRed(avg);
            p.setGreen(avg);
            p.setBlue(avg);            
        }        
        return output;
    }
    public void textGray(){
        ImageResource irs = new ImageResource();
        ImageResource gray = doGray(irs); 
        gray.draw();
        
    }
    public void selectAndConvert(){
        DirectoryResource dr = new DirectoryResource();
        for(File f: dr.selectedFiles()){
            ImageResource ir = new ImageResource(f);
            ImageResource gray = doGray(ir);
            gray.draw();
        }
    }

}

