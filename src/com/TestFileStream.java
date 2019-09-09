package com;

import gameServer.GameCharacter;

import java.io.*;

public class TestFileStream {
    public static void main(String[] args) {
        try {
            FileInputStream fileStream = new FileInputStream("MyGame.ser");
            ObjectInputStream os = new ObjectInputStream(fileStream);

            Object one = os.readObject();
            Object two = os.readObject();
            Object three = os.readObject();

            GameCharacter elf = (GameCharacter) one;
            GameCharacter troll = (GameCharacter) two;
            GameCharacter magican = (GameCharacter) three;

            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
