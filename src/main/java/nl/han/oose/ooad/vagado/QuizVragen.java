package nl.han.oose.ooad.vagado;

import nl.han.oose.ooad.vagado.vraag.Vraag;

import java.util.ArrayList;
import java.util.List;
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
        for(int i = 0; i < AMOUNT_OF_QUESTIONS; i++) {
            int randomIndex = rand.nextInt(vragenlijst.getVragen().size());
            vragen.add(vragenlijst.getVragen().get(randomIndex));
            vragenlijst.getVragen().remove(randomIndex);
        }
    }

    public void checkAntwoord(int vraagNummer, String antwoord) {
        vragen.get(vraagNummer).checkAntwoord(antwoord);
    }

    public void toonVraag(int beurt) {
        vragen.get(beurt).toonVraag();
    }

    public List<Vraag> getVragen() {
        return vragen;
    }
}
