import java.io.FileInputStream;
import java.io.IOException;

public class FileReadOperation {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Programming\\java\\Java_Program\\file_Handlling\\demo.txt");
            System.out.println("file found ");
        }
        catch (IOException e){
            System.out.println("File not found...!!!");

        }


    }

}
