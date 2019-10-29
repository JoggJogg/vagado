package nl.han.oose.ooad.vagado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private int puntenTotaal;
    private QuizVragen quizVragen;
    private Puntentelling puntentelling;
    private List<Gebruiker> gebruikers;
    private Scanner scanner;

    public Quiz() {
        scanner = new Scanner(System.in);
        this.quizVragen = new QuizVragen();
        this.gebruikers = new ArrayList<>();
        Gebruiker speler = new Gebruiker("Henkieeee");
        gebruikers.add(speler);
        gebruikers.add(new Gebruiker("Kees" ));
        gebruikers.add(new Gebruiker("Jan" ));
        Vragenlijst voetbal = new Vragenlijst(1,"Voetbal", new Thema("Sport"));
        speler.addVragenlijst(voetbal);
    }

    public void speelQuiz(String gebruikersnaam) {
        Gebruiker speler = getGebruiker(gebruikersnaam);
        List<Vragenlijst> vragenlijstenVanGebruiker = speler.getVragenlijsten();
        for(Vragenlijst v : vragenlijstenVanGebruiker) {
            System.out.println(v.getNummer() + " Thema: " + v.getThema() + " Naam: " + v.getNaam());
        }
        System.out.println("Kies vragenlijst, vul het nummer van de vragenlijst in: ");
        String vraaglijstNummer = scanner.nextLine();
        Vragenlijst vragenlijst = speler.getVragenlijsten().get(Integer.parseInt(vraaglijstNummer)-1);
        genereerQuizVragen(vragenlijst);
        toonVraag(1);
    }


    public void genereerQuizVragen(Vragenlijst vragenlijst) {
        quizVragen.genereerQuizVragen(vragenlijst);
    }


    public void toonVraag(int beurt) {
        quizVragen.toonVraag(beurt);
    }

    private Gebruiker getGebruiker(String gebruikersnaam) {
        for (Gebruiker g: gebruikers) {
            if(g.getGebruikersnaam().equals(gebruikersnaam)) {
                return g;
            }
        }
        return null;
    }
}
