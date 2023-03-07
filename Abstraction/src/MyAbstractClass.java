import java.io.*;
public abstract class MyAbstractClass
{
    FileInputStream fis;
    FileOutputStream fos;
    BufferedReader br;
    PrintWriter pw;
    void fileOpen(String fname,String mode)
    {
        try
        {
            if(mode.equals("read"))
            {
                fis=new FileInputStream(fname);
                br = new BufferedReader(new InputStreamReader(fis));
            }
            else if(mode.equals("write"))
            {
                fos=new FileOutputStream(fname);
                pw=new PrintWriter(fos, true);
            }
        }
        catch(IOException e)
        {
        }
    }
    void fileClose(String mode)
    {
        try
        {
            if(mode.equals("read"))
            {
                fis.close();
                br.close();
            }
            else if(mode.equals("write"))
            {
                fos.close();
                pw.close();
            }
        }
        catch(IOException e)
        {}
    }
    abstract void fileRead();
    abstract void fileWrite();
}