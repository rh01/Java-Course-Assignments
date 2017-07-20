
/**
 * Write a program to create new images that are photographic negatives (or inverted images) of selected images and save these new images with filenames 
 * that are related to the original images, such as adding “inverted-” in front of the old filename.
 * In inverting an image, a pixel’s red, blue, and green components are modified to be the exact opposite within the 0 to 255 range.
 * That is, if a pixel’s red, blue, and green values are (34, 198, 240),
 * then that same pixel in the inverted image would have the red, blue and green values of (221, 57, 15). 
 * Note that 255 - 34 is 221, 255 - 198 is 57, and 255 - 240 is 15.
 * 
 * @author shine
 * @version 1
 */
import edu.duke.*;
import java.io.File;
public class imageInversion {
    public void run(){
        DirectoryResource dr = new DirectoryResource();
        for(File f: dr.selectedFiles()){
            ImageResource rawImage = new ImageResource(f);
            String fname = rawImage.getFileName();
            ImageResource inverted = doInversion(rawImage);
            doSaver(inverted, fname);            
        }
    }
    
    public ImageResource doInversion(ImageResource image){
        ImageResource output = new ImageResource(image.getWidth(), image.getHeight());
        for(Pixel p: output.pixels()){
            Pixel inPixel = image.getPixel(p.getX(), p.getY());
            p.setRed(255-inPixel.getRed());
            p.setGreen(255-inPixel.getGreen());
            p.setBlue(255-inPixel.getBlue());
        }
        return output;
    }
    
    public void doSaver(ImageResource image, String fname){
        String newName = "inverted-" + fname;
        image.setFileName(newName);
        image.save();
        image.draw();
    }
}
