package nl.han.oose.ooad.vagado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gebruiker {

    private String gebruikersnaam;
    private Saldo saldo;
    private List<Vragenlijst> vragenlijsten;
    private Map<Vragenlijst, Integer> lifetimeBest;

    public Gebruiker(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
        saldo = new Saldo();
        saldo.voegMuntenToe(100);
        vragenlijsten = new ArrayList<>();
        lifetimeBest = new HashMap<>();
    }

    public List<Vragenlijst> getVragenlijsten() {
        return vragenlijsten;
    }

    public void addVragenlijst(Vragenlijst v) {
        vragenlijsten.add(v);
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void voegMuntenToe(int munten) {
        saldo.voegMuntenToe(munten);
    }

    public Vragenlijst getVragenlijst(int vragenlijstNummer) {
        for(Vragenlijst v: vragenlijsten) {
            if(v.getNummer() == vragenlijstNummer) return v;
        }
        return null;
    }

    public int getLifetimeBest(int vragenlijstNummer) {
        Vragenlijst vragenlijst = getVragenlijst(vragenlijstNummer);
        int score  = 0;
        try {
            score = lifetimeBest.get(vragenlijst);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return score;
    }

    public void setLifetimeBest(int vragenlijstNummer, int puntenTotaal) {
        Vragenlijst vragenlijst = getVragenlijst(vragenlijstNummer);
        lifetimeBest.remove(vragenlijst);
        lifetimeBest.put(vragenlijst, puntenTotaal);
    }

    public int getSaldo() {
        return saldo.getSaldo();
    }

}
