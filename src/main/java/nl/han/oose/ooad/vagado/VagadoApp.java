package nl.han.oose.ooad.vagado;

import java.util.List;
import java.util.Scanner;

public class VagadoApp {

    public static void main(String[] args) {
        String gebruikersnaam = "Henkieeee";
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        List<Vragenlijst> vragenlijsten = quiz.getVragenlijsten(gebruikersnaam);
        for(Vragenlijst v : vragenlijsten) {
            System.out.println(v.getNummer() + " Thema: " + v.getThema() + " Naam: " + v.getOnderwerp());
        }
        System.out.println("Kies vragenlijst, vul het nummer van de vragenlijst in: ");
        int vragenlijstNummer = Integer.parseInt(scanner.nextLine());
        quiz.kiesVragenlijst(vragenlijstNummer, gebruikersnaam);
        for(int vraagNummer = 0; vraagNummer < 10; vraagNummer++) {
            quiz.toonVraag(vraagNummer);
            String gebruikersAntwoord = scanner.nextLine();
            quiz.beantwoordVraag(gebruikersAntwoord, vraagNummer);
        }
        int puntenTotaal = quiz.berekenPunten(gebruikersnaam, vragenlijstNummer);

        System.out.println("Je hebt " + puntenTotaal + " punten gescoord!");
    }
}
