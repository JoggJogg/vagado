package nl.han.oose.ooad.vagado;

import nl.han.oose.ooad.vagado.vraag.Vraag;

import java.util.List;

public class Vragenlijst {

    private String naam;
    private Thema thema;
    private List<Vraag> vragen;
    private int lifetimeBest;

    public String getNaam() {
        return naam;
    }

    public List<Vraag> getVragen() {
        return vragen;
    }
}
