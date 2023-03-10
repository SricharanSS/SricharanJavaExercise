package Exercise13;

import java.io.File;
import java.util.Scanner;

public class FileViewer {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/sricharan/Documents/Exercise_Github/SricharanJavaExercise/Exercise13/test.txt");
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }

            scan.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
