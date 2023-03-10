package Exercise15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
    public static void main(String[] args) {
        try {
            File file1 = new File("/Users/sricharan/Documents/Exercise_Github/SricharanJavaExercise/Exercise15/test.txt");
            FileReader reader = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            File newFile = new File("/Users/sricharan/Documents/Exercise_Github/SricharanJavaExercise/Exercise15/newTest.txt");
            FileWriter writer = new FileWriter(newFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String str;
            boolean loop = true;
            while(loop) {
                str = bufferedReader.readLine();
                System.out.println(str);
                int end = str.length()-1;
                if(str.charAt(end) == -1) {
                    bufferedWriter.write(str);
                    loop = false;
                }
                bufferedWriter.write(str);
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            writer.flush();
            writer.close();
            bufferedReader.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

