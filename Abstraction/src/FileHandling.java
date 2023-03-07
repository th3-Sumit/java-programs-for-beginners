import java.io.IOException;
import java.util.Scanner;

public class FileHandling extends MyAbstractClass{

    Scanner sc=new Scanner(System.in);
    @Override
    void fileRead()
    {
        String line=null;
        try
        {
            while(true)
            {
                line=br.readLine();
                if(line==null)
                    break;
                else
                    System.out.println(line);
            }
        }
        catch(IOException e)
        {
        }
    }
    @Override
    void fileWrite()
    {
        String text=null;
        while(true)
        {
            text=sc.nextLine();
            if(text.equals("exit"))
                break;
            else
                pw.println(text);
        }
    }
    public static void main(String args[]) {
        FileHandling f1 = new FileHandling();
        String fname = "d:\\myfile.txt";
        //f1.fileOpen(fname,"read");
        //f1.fileRead();
        //f1.fileClose("read");

        //calling file write operation
        f1.fileOpen(fname, "write");
        f1.fileWrite();
        f1.fileClose("write");


    }
}
