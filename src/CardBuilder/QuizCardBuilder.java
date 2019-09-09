package CardBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class QuizCardBuilder {
    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;

    public static void main(String[] args) {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
    }

    public void go() {

    }

    private class NextCardListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {

        }
    }

    private class SaveMemuListener implements ActionListener {
        public void actionPerformed(ActionEvent ex) {

        }
    }

    private class NewMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {

        }
    }

    private void saveFile(File file) {

    }
}
