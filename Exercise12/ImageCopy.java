package Exercise12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
    public static void main(String[] args) throws IOException{

        try {
            FileInputStream imageFile = new FileInputStream("Exercise12/Image/test.jpg");
            byte[] imageBuffer = new byte[1024];
            FileOutputStream newImageFile = new FileOutputStream("Exercise12/newTest.jpg");
            int b;
            while( (b = imageFile.read(imageBuffer)) != -1 ) {
                newImageFile.write(imageBuffer,0 ,b);
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
 
    }   
}
