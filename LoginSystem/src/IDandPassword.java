import java.util.HashMap;

public class IDandPassword {
    HashMap<String, String> loininfo = new HashMap<String, String>();

    IDandPassword(){
        loininfo.put("Bro", "pizza");
        loininfo.put("Brometheus", "PASSWORD");
        loininfo.put("BroCode", "abc123");

    }
    protected  HashMap getLoginInfo(){
        return loininfo;
    }
}
