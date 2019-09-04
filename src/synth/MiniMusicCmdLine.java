package synth;

import javax.sound.midi.*;

public class MiniMusicCmdLine {
    private void play(int instr, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192,  1, instr,0);
            MidiEvent changeInstr = new MidiEvent(first, 1);
            track.add(changeInstr);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1 , note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);
            player.setSequence(seq);
            player.start();
        }
        catch(Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();

        if (args.length < 2) {
            System.out.println("Требуется 2 аргумента");
        } else {
            int instr = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);

            mini.play(instr, note);
        }
    }
}
