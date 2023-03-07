import java.io.File;

public class Files {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        System.out.println(file.exists());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.getName());
        System.out.println(file.getPath());


    }
}