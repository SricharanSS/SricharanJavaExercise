package Exercise12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
    public static void main(String[] args) throws IOException{

        try {
            FileInputStream imageFile = new FileInputStream("/Users/sricharan/Pictures/test.jpg");
            byte imageBuffer[] = new byte[1024];
            FileOutputStream newImageFile = new FileOutputStream("/Users/sricharan/Documents/Exercise_Github/SricharanJavaExercise/newTest.jpg");
            int b;
            while( (b = imageFile.read(imageBuffer)) != -1 ) {
                newImageFile.write(b);
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
 
    }   
}
