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
        Gebruiker gebruiker = new Gebruiker("Henkieeee");
        gebruikers.add(gebruiker);
        gebruikers.add(new Gebruiker("Kees" ));
        gebruikers.add(new Gebruiker("Jan" ));
        Vragenlijst voetbal = new Vragenlijst(1,"Voetbal", new Thema("Sport"));
        gebruiker.addVragenlijst(voetbal);
        puntentelling = new Puntentelling();
        puntentelling.setBerekening(new BerekeningStandaard());
        gebruiker.setLifetimeBest(1, 5);
    }
    
    public List<Vragenlijst> getVragenlijsten(String gebruikersnaam) {
        Gebruiker gebruiker = getGebruiker(gebruikersnaam);
        return gebruiker.getVragenlijsten();
    }

    public void kiesVragenlijst(int vragenlijstNummer, String gebruikersnaam) {
        Gebruiker gebruiker = getGebruiker(gebruikersnaam);
        Vragenlijst vragenlijst = gebruiker.getVragenlijst(vragenlijstNummer);
        quizVragen.genereerQuizVragen(vragenlijst);
    }

    public void toonVraag(int beurt) {
        quizVragen.toonVraag(beurt);
    }

    public void beantwoordVraag(String gebruikersAntwoord, int vraagNummer) {
        quizVragen.checkAntwoord(vraagNummer, gebruikersAntwoord);
    }

    public int berekenPunten(String gebruikersnaam, int vragenlijstNummer) {
        Gebruiker gebruiker = getGebruiker(gebruikersnaam);
        int puntenTotaal = puntentelling.berekenPunten(quizVragen.getVragen());
        if(puntentelling.alleVragenGoed(puntenTotaal)) {
            gebruiker.voegMuntenToe(2);
            System.out.println("Alle vragen goed beantwoord! Je hebt 2 munten verdiend. Je nieuwe saldo is: " + gebruiker.getSaldo());
        }
        if(puntenTotaal > gebruiker.getLifetimeBest(vragenlijstNummer)) {
            gebruiker.setLifetimeBest(vragenlijstNummer, puntenTotaal);
            System.out.println("Nieuw lifetime best!");
        }
        return puntenTotaal;
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
