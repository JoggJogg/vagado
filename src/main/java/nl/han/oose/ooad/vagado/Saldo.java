package nl.han.oose.ooad.vagado;

public class Saldo {

    private int munten;

    public int getSaldo() {
        return munten;
    }

    public void voegMuntenToe(int munten) {
        this.munten += munten;
    }

}
