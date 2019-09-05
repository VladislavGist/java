package extend;

public class MyOuter {
    private int x;
    MyInner inner = new MyInner();

    public int doStuff() {
        inner.go();
        return x;
    }

    class MyInner {
        public void go() {
            x = 42;
        }
    }

    public static void main(String[] args) {
        MyOuter m = new MyOuter();

        System.out.println(m.doStuff());
    }
}
