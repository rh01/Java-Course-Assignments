import edu.duke.*;
/**
 * 在这里给出对类 Hello 的描述。
 * 
 * @作者 申恒恒
 * @版本（一个版本号或者一个日期）
 */
public class Hello {
    public void displayWords(){
        URLResource webpage = new URLResource("http://www.dukelearntoprogram.com/java/somefile.txt");
        for(String word: webpage.words()){
            System.out.println(word);
    }
}
}
