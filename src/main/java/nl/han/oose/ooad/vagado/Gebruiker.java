package nl.han.oose.ooad.vagado;

import java.util.ArrayList;
import java.util.List;

public class Gebruiker {

    private String gebruikersnaam;
    private String wachtwoord;
    private Saldo saldo;
    private List<Vragenlijst> vragenlijsten;

    public Gebruiker(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
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
}
