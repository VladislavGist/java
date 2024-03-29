package synth;

import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 59, 60);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(128, 1, 59, 60);
            MidiEvent noteOff = new MidiEvent(b, 3);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();

        mini.play();
    }
}
