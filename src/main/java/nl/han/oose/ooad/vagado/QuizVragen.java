package nl.han.oose.ooad.vagado;

import nl.han.oose.ooad.vagado.vraag.Vraag;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuizVragen {

    private int tijd;
    private List<Vraag> vragen;

    private static final int AMOUNT_OF_QUESTIONS = 10;

    public QuizVragen(){
        vragen = new ArrayList();
    };

    public void genereerQuizVragen(Vragenlijst vragenlijst) {
        Random random = new Random();
        for(int i = 0; i < AMOUNT_OF_QUESTIONS; i++) {
            int randomIndex = random.nextInt(vragenlijst.getVragen().size());
            Vraag randomVraag = vragenlijst.getVragen().get(randomIndex);
            vragen.add(randomVraag);
            vragenlijst.getVragen().remove(randomIndex);
        }
    }

    public void checkAntwoord(int vraagNummer, String gebruikerAntwoord) {
        vragen.get(vraagNummer).checkAntwoord(gebruikerAntwoord);
    }

    public void toonVraag(int vraagNummer) {
        vragen.get(vraagNummer).toonVraag();
    }

    public List<Vraag> getVragen() {
        return vragen;
    }


}
