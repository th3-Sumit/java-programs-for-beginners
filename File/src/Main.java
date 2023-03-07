import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("secret_file.txt");

        if(file.exists()){
            System.out.println("File exists :)");
//            System.out.println(file.getAbsolutePath());
//            System.out.println(file.getPath());


        }
        else
            System.out.println("File not exists. :(");


    //FILEWRITTER  :)
//        try {
//            FileWriter writer = new FileWriter("secret_file.txt");
//            writer.write("Kill the enemy \nkill their king \n ");
//            writer.close();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


    //FILEREADER  :)
        try {
            FileReader reader = new FileReader("secret_file.txt");
            int data = reader.read();
            while (data != -1){
                System.out.println( (char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}