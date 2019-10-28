package nl.han.oose.ooad.vagado.vraag;

import nl.han.oose.ooad.vagado.Score;

public abstract class Vraag {

    private int vraagNummer;
    private Score score;

    public abstract boolean checkAntwoord(String gebruikerAntwoord);
}
