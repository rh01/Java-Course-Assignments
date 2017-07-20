
/**
 * Write a description of batchGrayScaleSaver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// import required module or library
import edu.duke.*;
import java.io.File;
public class batchGrayScaleSaver {
    /*
     * main function for run this program
     */
    public void run(){
        DirectoryResource dr = new DirectoryResource();
        for (File f: dr.selectedFiles()){
            ImageResource image = new ImageResource(f);
            String fname = image.getFileName();
            ImageResource gray = makeGray(image);
            batchSaver(gray, fname);
        }
    }
    
    /*
     * do gray for image,given image and return new gray image
     * 
     * @image raw image
     */
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
    
    /*
     * Save specific image file with "copy" prefix file name
     * 
     * @image ImageResource file  
     * @fname input image name
     */
    public void batchSaver(ImageResource image, String fname){
        String newName = "gray-" + fname;
        //String fname = image.getFileName()
        image.setFileName(newName);
        image.save();
        image.draw();
    }
}
