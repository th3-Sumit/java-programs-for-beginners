import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseClickEvent extends MouseAdapter
{
    Caesar frame;
    MouseClickEvent(Caesar frm)
    {
        frame=frm;
    }
    public void mouseClicked(MouseEvent eobj)
    {
        String plainText=frame.t1.getText();
        int keySize = Integer.parseInt(frame.t2.getText());
        int len=plainText.length();
        int i, code, seq;
        String cipher="";
        for(i=0;i<len;i++)
        {

            code = (int)(plainText.charAt(i));
            if(code!=32)
            {
                seq = code - 97;
                seq= (seq+keySize)%26;
                code = seq + 97;
            }
            cipher=cipher + (char)code;
        }
        frame.t3.setText(cipher);
    }
}




