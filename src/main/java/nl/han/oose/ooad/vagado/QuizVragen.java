package nl.han.oose.ooad.vagado;

import nl.han.oose.ooad.vagado.vraag.Vraag;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class QuizVragen {

    private int tijd;
    private List<Vraag> vragen;
    private List<Vragenlijst> vragenlijsten;

    private static final int AMOUNT_OF_QUESTIONS = 10;

    public QuizVragen(){
        vragen = new ArrayList();
    };

    public void genereerQuizVragen(Vragenlijst vragenlijst) {
        Random rand = new Random();
        Vragenlijst copiedVragenlijst = vragenlijst;
        for(int i = 0; i < AMOUNT_OF_QUESTIONS; i++) {
            int randomIndex = rand.nextInt(copiedVragenlijst.getVragen().size());
            vragen.add(copiedVragenlijst.getVragen().get(randomIndex));
            copiedVragenlijst.getVragen().remove(randomIndex);
        }
    }

    public List<Vraag> getVragen() {
        return vragen;
    }
}
