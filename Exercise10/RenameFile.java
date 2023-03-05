package Exercise10;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File file = new File("/Users/sricharan/Documents/Exercise_Github/SricharanJavaExercise/Exercise10/TestFile.txt");

        File newFile = new File("/Users/sricharan/Documents/Exercise_Github/SricharanJavaExercise/Exercise10/TestFile1.txt");

        if(file.renameTo(newFile)) {
            System.out.println("Rename Successful");
        }
        else {
            System.out.println("Rename Failed");
        }
    }
}
