package nl.han.oose.ooad.vagado;

import java.util.ArrayList;
import java.util.List;

public class Gebruiker {

    private String gebruikersnaam;
    private Saldo saldo;
    private List<Vragenlijst> vragenlijsten;

    public Gebruiker(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
        saldo = new Saldo();
        saldo.setSaldo(200);
        vragenlijsten = new ArrayList<>();
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
}
