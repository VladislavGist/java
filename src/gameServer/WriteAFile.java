package gameServer;

import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("Hi, Foo 2");
            writer.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
