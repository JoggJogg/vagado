package nl.han.oose.ooad.vagado;

public class Quiz {

    private int puntenTotaal;
    private QuizVragen quizVragen;
    private Puntentelling puntentelling;
    private Gebruiker gebruiker;

    public Quiz() {
        this.quizVragen = new QuizVragen();
    }

    public void genereerQuizVragen(Vragenlijst vragenlijst) {
        quizVragen.genereerQuizVragen(vragenlijst);
    }


}
