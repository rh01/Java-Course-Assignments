
/**
 * Write a description of grayscale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class grayscale {
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
}

