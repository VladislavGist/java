package animals;

public class EntryPoint {
    public static void main(String[] args) {
        Lion l = new Lion();

        String lionSay = l.makeNoise();

        System.out.println(lionSay);
    }
}
