package Exercise16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            System.out.println("Writing Object to File.....");
            ObjectOutputStream objectWriter = new ObjectOutputStream(new FileOutputStream("Exercise16/DateFile.txt"));
            LocalDate date = LocalDate.now();
            objectWriter.writeObject(date);

            System.out.println("Reading Object from File.....");
            ObjectInputStream objectReader = new ObjectInputStream(new FileInputStream("Exercise16/DateFile.txt"));
            LocalDate newDate = (LocalDate)objectReader.readObject();
            System.out.println(newDate);
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
