package gameServer;

import java.io.*;

public class GameServerTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elph", new String[] {"Luk", "Siber", "Castet"});
        GameCharacter two = new GameCharacter(200,"Troll", new String[] {"Hends", "Topor"});
        GameCharacter three = new GameCharacter(120,"Mag", new String[] {"Magic books", "Nevidimost"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Gase.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        one = null;
        two = null;
        three = null;

        try {
           ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
           GameCharacter oneRestore = (GameCharacter) is.readObject();
           GameCharacter twoRestore = (GameCharacter) is.readObject();
           GameCharacter threeRestore = (GameCharacter) is.readObject();

           System.out.println(oneRestore.getType());
           System.out.println(twoRestore.getType());
           System.out.println(threeRestore.getType());
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
