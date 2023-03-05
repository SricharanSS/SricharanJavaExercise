package Exercise10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SizeOfFile {
    public static void main(String[] args) throws IOException {

        try {
            Path path = Paths.get("/Users/sricharan/Documents/Exercise_Github/SricharanJavaExercise/Exercise10/TestFile1.txt");
            long size = Files.size(path);

            System.out.println("Size of file is "+size);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
