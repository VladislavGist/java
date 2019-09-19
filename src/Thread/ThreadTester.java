package Thread;

class MyRunnable implements Runnable {
    public void run() {
        go();
    }

    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.println("Вершина стека");
    }
}

public class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        try {
            myThread.sleep(1000);
            myThread.start();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("main");
    }
}
