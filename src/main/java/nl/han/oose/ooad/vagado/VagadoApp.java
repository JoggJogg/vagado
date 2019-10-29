package nl.han.oose.ooad.vagado;

import nl.han.oose.ooad.vagado.vraag.Vraag;

import java.util.List;
import java.util.Scanner;

public class VagadoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vragenlijst voetbal = new Vragenlijst(1,"Voetbal", new Thema("Sport"));
        Gebruiker speler = new Gebruiker("Henkieeee", "kaas");
        QuizVragen quizvragen = new QuizVragen();
        speler.addVragenlijst(voetbal);
        List<Vragenlijst> vragenlijstenVanGebruiker = speler.getVragenlijsten();
        for(Vragenlijst v : vragenlijstenVanGebruiker) {
            System.out.println(v.getNummer() + " Thema: " + v.getThema() + " Naam: " + v.getNaam());
        }
        System.out.println("Kies vragenlijst, vul het nummer van de vragenlijst in: ");
        String vraaglijstNummer = scanner.nextLine();
        Vragenlijst vragenlijst = speler.getVragenlijsten().get(Integer.parseInt(vraaglijstNummer)-1);
        quizvragen.genereerQuizVragen(vragenlijst);
        List<Vraag> quizvragenlijst = quizvragen.getVragen();
        for (Vraag v : quizvragenlijst) {
            v.toonVraag();
        }
    }
}
