package DavliAdvice;

import java.io.*;
import java.net.*;

public class DavliAdviceServer {
    String[] adviceList = {"Ешьте меньшими порциями", "Купите облегающие джинсы", "Нет они не делают вас полнее",
    "Два слова не годится", "Будьте честные хоты бы сегодня", "Возможно вам стоит подобрать другую прическу"};

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(42424);

            while(true) {
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DavliAdviceServer server = new DavliAdviceServer();

        server.go();
    }
}
