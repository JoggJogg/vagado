package nl.han.oose.ooad.vagado.vraag;

public class MeerkeuzeVraag extends Vraag {

    private Antwoord antwoord;
    Keuzemogelijkheid[] keuzeMogelijkheden;

    public MeerkeuzeVraag(int vraagnummer, String vraag, Keuzemogelijkheid[] mogelijkheden, Antwoord antwoord) {
        super(vraagnummer, vraag);
        keuzeMogelijkheden = mogelijkheden;
        this.antwoord = antwoord;
    }

    @Override
    public void checkAntwoord(String gebruikerAntwoord) {
        goedBeantwoord = antwoord.checkAntwoord(gebruikerAntwoord);
        if(goedBeantwoord) System.out.println("GOED!");
        else System.out.println("FOUT");
    }

    @Override
    public void toonVraag() {
        System.out.println(super.getVraag());
        for(int i = 0; i < keuzeMogelijkheden.length; i++) {
            System.out.println(keuzeMogelijkheden[i].letter + " " + keuzeMogelijkheden[i].mogelijkheid);
        }
    }
}
