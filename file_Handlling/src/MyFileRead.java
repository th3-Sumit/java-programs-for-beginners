import java.io.*;

public class MyFileRead {


    public static void main(String[] args) {
        try{
            int ch;
            String line;

            FileInputStream fis = new FileInputStream("D:\\Programming\\java\\Java_Program\\file_Handlling\\demo.txt");
            System.out.println("file found ...!!!");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);



            // Reading charecter by charecter
            while (true ){
                line = br.readLine();
                ch = fis.read();
                if (line == null)
                    break;

                else {
                    System.out.print(line);
                    line = null;
                }
            }

        }
        catch (FileNotFoundException e){
            System.out.println("file not found");

        }
        catch (IOException e){
            System.out.println("IOexception");

        }

    }
}
