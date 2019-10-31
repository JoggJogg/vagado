package nl.han.oose.ooad.vagado;

public class OpenVraag extends Vraag {

    private Antwoord[] antwoorden;

    public OpenVraag(String vraag, Antwoord[] antwoorden) {
        super(vraag);
        this.antwoorden = antwoorden;
    }

    @Override
    public void checkAntwoord(String userAntwoord) {
        userAntwoord = userAntwoord.toLowerCase();
        for(Antwoord antwoord: antwoorden) {
            punten.setGoedBeantwoord(antwoord.checkAntwoord(userAntwoord));
            break;
        }
        if(punten.isGoedBeantwoord()) System.out.println("GOED!");
        else System.out.println("FOUT");
    }

    @Override
    public void toonVraag() {
        System.out.println(super.getVraag());
    }
}
