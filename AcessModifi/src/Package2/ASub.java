package Package2;
import Package1.*;

public class ASub extends A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.Message);
        System.out.println(c.PublicMess);
//        System.out.println(c.PrivateMess);
        System.out.println(c.protectedMess);

    }
}
