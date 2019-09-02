package oraily;

public class TestCL {
    public static void main(String[] args) {
        String s = String.format("My text %,.2f errors", 10000000f);

        System.out.println(s);
    }
}