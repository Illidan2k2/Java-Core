import javax.lang.model.type.DeclaredType;
import java.io.*;

public class DemoFile {
    //Try-catch resource
    public static void DeclareFile(){
        File f = new File("Komu");
        try (FileOutputStream file = new FileOutputStream(f)) {
            System.out.println();
            throw new IOException();
        } catch(IOException io){
            System.out.println();
        }
    }
    // Auto close the file
    public static void main(String[] args) {
        DeclareFile();
    }
}
