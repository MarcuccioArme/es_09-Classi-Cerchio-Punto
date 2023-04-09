public class CerchioConCentro_Test {
    public static void main (String[] args) {
        CerchioConCentro C1 = new CerchioConCentro (1.0);

        System.out.println ("Primo Cerchio");
        System.out.println ("Raggio = " + C1.getRaggio());
        System.out.println ("Area = " + C1.Area ());
        System.out.println ("Circonferenza = " + C1.Circonferenza ());

        CerchioConCentro C2 = new CerchioConCentro (3.0);

        System.out.println ("\n\nSecondo Cerchio");
        System.out.println ("Raggio = " + C2.getRaggio());
        System.out.println ("Area = " + C2.Area ());
        System.out.println ("Circonferenza = " + C2.Circonferenza ());
    }
}