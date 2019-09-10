package oraily;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
//        try {
//            File myFile = new File("/Users/vladislavd/Desktop/Java/java/MyText");
//            FileReader fileReader = new FileReader(myFile);
//
//            BufferedReader reader = new BufferedReader(fileReader);
//
//            String line = null;
//
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            reader.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

        String toTest = "Какой цвет?/Зеленый";
        String[] result = toTest.split("/");

        for(String token:result) {
            System.out.println(token);
        }
    }
}
