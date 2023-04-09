public class CerchioConCentro { // definizione della CLASSE
    private Punto Centro; // Il centro del cerchio appartiene alla classe Punto
    private double Raggio;
    // Costruttore centro e Raggio
    public CerchioConCentro (Punto pPunto, double pRaggio) {
        this.setCentro (pPunto);
        this.setRaggio (pRaggio);
    }
    // Costruttore solo Raggio. Per default il centro (0,0)
    public CerchioConCentro (double pRaggio) {
        Punto P;
        P = new Punto(0, 0);
        this.setCentro (P);
        this.setRaggio(pRaggio);
    }
    // costruttore di COPIA
    public CerchioConCentro (CerchioConCentro pCerchio) {
        this.setCentro (pCerchio.getCentro());
        this.setRaggio(pCerchio.getRaggio());
    }
    public void setCentro (Punto c) { // imposta il centro di un cerchio
        this.Centro = c;
    }
    public void setRaggio (double r) { // imposta il raggio di un cerchio
        this.Raggio = r;
    }
    public Punto getCentro () { // ritorna il centro di un cerchio
        return Centro;
    }
    public double getRaggio () { // ritorna il raggio di un cerchio
        return Raggio;
    }
    public double Area () {
        return (Raggio * Raggio * Math.PI);
    }
    public double Circonferenza () {
        return (2 * Raggio * Math.PI);
    }
}