package nl.han.oose.ooad.vagado;

import java.util.Scanner;

public class VagadoApp {

    public static void main(String[] args) {
        String gebruikersnaam = "Henkieeee";

        Scanner scanner = new Scanner(System.in);

        Quiz quiz = new Quiz();

        quiz.toonVragenlijsten(gebruikersnaam);

        System.out.println("Kies vragenlijst, vul het nummer van de vragenlijst in: ");
        String vragenlijstNummer = scanner.nextLine();
        quiz.kiesVragenlijst(Integer.parseInt(vragenlijstNummer), gebruikersnaam);

        for(int vraagNummer = 0; vraagNummer < 10; vraagNummer++) {
            quiz.toonVraag(vraagNummer);
            String gebruikersAntwoord = scanner.nextLine();
            quiz.beantwoordVraag(gebruikersAntwoord, vraagNummer);
        }

        quiz.berekenPuntenTotaal();
    }
}
