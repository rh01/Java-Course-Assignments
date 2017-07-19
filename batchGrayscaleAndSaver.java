
/**
 * Write a description of batchGrayscaleAndSaver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.File;
public class batchGrayscaleAndSaver {
    public void main(){
        DirectoryResource dr = new DirectoryResource();
        for(File f: dr.selectedFiles()){
            ImageResource input = new ImageResource(f);
            String fname = input.getFileName();
            ImageResource grayImage = makeGray(input);
            saver(fname, grayImage);            
            grayImage.draw();
        }        
    }
    public void saver(String fname, ImageResource image){
        String newName = "gray-" + fname;
        image.setFileName(newName);
        image.save();
    }
    public ImageResource makeGray(ImageResource image){
        ImageResource output = new ImageResource(image.getWidth(), image.getHeight()); 
        for(Pixel p: output.pixels()){
            Pixel inPixel = image.getPixel(p.getX(), p.getY());
            int avg = (inPixel.getRed() + inPixel.getGreen() + inPixel.getBlue())/3;
            p.setRed(avg);
            p.setGreen(avg);
            p.setBlue(avg);
        }
        return output;
    }
}
