package DavliAdvice;

import java.io.*;
import java.net.*;

public class DavliAdviceClient {
    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Сегодня ты должен" + advice);

            reader.close();

        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DavliAdviceClient client = new DavliAdviceClient();
        client.go();
    }
}
