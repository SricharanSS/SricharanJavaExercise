package Exercise11;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class RunCommand {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File location = new File("/Users/sricharan/Documents/Exercise_Github/SricharanJavaExercise/Exercise10/");

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.directory(location);
        processBuilder.command("zsh","-c","ls");

        Process process = processBuilder.start();

        OutputStream outputStream = process.getOutputStream();
        InputStream inputStream = process.getInputStream();

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while( bufferedReader.readLine() != 0 ) {
                System.out.println(bufferedReader.readLine());
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
