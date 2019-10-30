package nl.han.oose.ooad.vagado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private QuizVragen quizVragen;
    private Puntentelling puntentelling;
    private List<Gebruiker> gebruikers;

    public Quiz() {
        this.quizVragen = new QuizVragen();
        this.gebruikers = new ArrayList<>();
        Gebruiker speler = new Gebruiker("Henkieeee");
        gebruikers.add(speler);
        gebruikers.add(new Gebruiker("Kees" ));
        gebruikers.add(new Gebruiker("Jan" ));
        Vragenlijst voetbal = new Vragenlijst(1,"Voetbal", new Thema("Sport"));
        speler.addVragenlijst(voetbal);
        puntentelling = new Puntentelling();
        puntentelling.setBerekening(new BerekeningStandaard());
    }


    public void toonVragenlijsten(String gebruikersnaam) {
        Gebruiker speler = getGebruiker(gebruikersnaam);
        List<Vragenlijst> vragenlijstenVanGebruiker = speler.getVragenlijsten();
        for(Vragenlijst v : vragenlijstenVanGebruiker) {
            System.out.println(v.getNummer() + " Thema: " + v.getThema() + " Naam: " + v.getNaam());
        }
    }

    public void kiesVragenlijst(int vragenlijstNummer, String gebruikersnaam) {
        Gebruiker gebruiker = getGebruiker(gebruikersnaam);
        for(Vragenlijst vragenlijst: gebruiker.getVragenlijsten()) {
            if(vragenlijst.getNummer() == vragenlijstNummer) {
                quizVragen.genereerQuizVragen(vragenlijst);            }
        }
    }

    public void toonVraag(int beurt) {
        quizVragen.toonVraag(beurt);
    }

    public void beantwoordVraag(String gebruikersAntwoord, int vraagNummer) {
        quizVragen.checkAntwoord(vraagNummer, gebruikersAntwoord);
    }

    public int berekenPuntenTotaal() {
        return puntentelling.berekenPunten(quizVragen.getVragen());
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
