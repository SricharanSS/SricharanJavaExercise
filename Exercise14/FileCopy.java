package Exercise14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
    public static void main(String[] args) {
        try {
            File file1 = new File("Exercise14/test.txt");
            FileReader reader = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            File newFile = new File("Exercise14/newTest.txt");
            FileWriter writer = new FileWriter(newFile);
            char ch;
            int c;
            while( (c = bufferedReader.read()) != -1 ) {
                ch = (char) c;
                writer.write(c);
            }
            writer.flush();
            writer.close();
            bufferedReader.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
