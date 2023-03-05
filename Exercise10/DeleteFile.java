package Exercise10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args){

        try {
            Files.deleteIfExists( Paths.get("/Users/sricharan/Documents/Exercise_Github/SricharanJavaExercise/Exercise10/TestFile1.txt") );
            System.out.println("File deleted!");
        }
        catch(IOException e) {
            System.out.println("File not deleted!");
            System.out.println(e.getMessage());
        }

    }
}
