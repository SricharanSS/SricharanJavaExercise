package Exercise11;
import java.io.File;
import java.io.IOException;

public class RunCommand {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) {
        File dir = new File("/Users/sricharan");

        if(dir.isDirectory()) {
            File[] listDir = dir.listFiles();

            for(int i=0; i<listDir.length; i++) {
                System.out.println(listDir[i].getName());
            }

        }
    }
}
