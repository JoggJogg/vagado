package nl.han.oose.ooad.vagado;

public class MeerkeuzeVraag extends Vraag {

    private Antwoord antwoord;
    Alternatief[] alternatieven;

    public MeerkeuzeVraag(String vraag, Alternatief[] mogelijkheden, Antwoord antwoord) {
        super(vraag);
        alternatieven = mogelijkheden;
        this.antwoord = antwoord;
    }

    @Override
    public void checkAntwoord(String gebruikerAntwoord) {
        gebruikerAntwoord = gebruikerAntwoord.toUpperCase();
        punten.setGoedBeantwoord(antwoord.checkAntwoord(gebruikerAntwoord));
        if(punten.isGoedBeantwoord()) System.out.println("GOED!");
        else System.out.println("FOUT");
    }

    @Override
    public void toonVraag() {
        System.out.println(super.getVraag());
        for(int i = 0; i < alternatieven.length; i++) {
            System.out.println(alternatieven[i].letter + " " + alternatieven[i].alternatief);
        }
    }
}
