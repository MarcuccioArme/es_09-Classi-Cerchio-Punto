public class Punto { // definizione della CLASSE Punto
    // definizione degli Attributi
    private double X;
    private double Y;
    // definizione dei Metodi
    public Punto () { // centro nell'origine
        setX(0); // this.X = 0;
        setY(0); // this.Y = 0;
    }
    public Punto (double x, double y) { // coordinate passate come parametri
        setX(x);
        setY(y);
    }
    public Punto (Punto p) { // Costruttore di copia
        X = p.getX(); // setX(p.getX()); // this.X = p.getX();
        Y = p.getY(); // setY(p.getY()); // this.Y = p.getY();
    }
    public void setX (double x) { // Metodo Set per l'attributo X
        this.X = x;
    }
    public void setY (double y) { // Metodo Set per l'attributo Y
        this.Y = y;
    }
    public double getX () {
        return this.X;
    }
    public double getY () {
        return this.Y;
    }
    public double distanza (Punto P) { // Metodo Query: Distanza
        double dx = this.X-P.getX();
        double dy = this.Y-P.getY();
        return Math.sqrt ((dx*dx) + (dy*dy));
    }
    public boolean equals (Punto P) { // Metodo Query: Equals
        return ((X==P.X) && (Y==P.Y));
    }
    public String toString () {
        return ( "(" + X + "; " + Y + ")" ); // ottengo in output (x; y)
    }

    // test della classe Punto
    public static void main (String[] args) {
        Punto p1 = new Punto(1.,1.);
        Punto p2 = new Punto(2.,2.);
        Punto p3 = new Punto(p1);
        System.out.println("P1=" + p1.toString());
        System.out.println("P2=" + p2.toString());
        System.out.println("P3=" + p1.toString());
        System.out.println("Distanza P1-P2: "+ p1.distanza(p2));
        System.out.println("Distanza P1-P3: "+ p1.distanza(p3));
        if (p1.equals(p2))
            System.out.println("P1 e P3 coincidono");
        else
            System.out.println("P1 e P3 non coincidono");

    }
}