package oraily;
import java.util.ArrayList;

public class MakeHippo {
    Integer i;
    int j;

    public static void main(String[] args) {
        MakeHippo t = new MakeHippo();
        t.go();
    }

    public void go() {
        j = i; // error null

        System.out.println(j);
        System.out.println(i);
    }
}
