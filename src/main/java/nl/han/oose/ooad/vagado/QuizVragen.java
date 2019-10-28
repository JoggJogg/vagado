package nl.han.oose.ooad.vagado;

import nl.han.oose.ooad.vagado.vraag.Vraag;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class QuizVragen {

    private int tijd;
    private List<Vraag> vragen;
    private List<Vragenlijst> vragenlijsten;

    private static final int AMOUNT_OF_QUESTIONS = 10;

    public List<Vraag> genereerQuizVragen(String naamVragenLijst) {
        Random rand = new Random();
        List<Vraag> vragenlijst = Objects.requireNonNull(getVragenlijst(naamVragenLijst)).getVragen();
        List<Vraag> quizVragenlijst = new ArrayList<>();
        for(int i = 0; i < AMOUNT_OF_QUESTIONS; i++) {
            int randomIndex = rand.nextInt(vragenlijst.size());
            quizVragenlijst.add(vragenlijst.get(randomIndex));
            vragenlijst.remove(randomIndex);
        }
        return quizVragenlijst;
    }

    private Vragenlijst getVragenlijst(String naamVragenLijst) {
        for(Vragenlijst vragenlijst: vragenlijsten) {
            if(vragenlijst.getNaam().equals(naamVragenLijst)) return vragenlijst;
        }
        return null;
    }
}
