package synth;

import javax.sound.midi.*;

public class MisucTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Get synth");
        } catch(MidiUnavailableException ex) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        MisucTest1 mt = new MisucTest1();
        mt.play();
    }
}
