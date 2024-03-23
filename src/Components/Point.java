package Components;

public class Point {
    public double abscisse ;
    public double ordonnée ;

    public Point(double abscisse, double ordonnée) {
        this.abscisse = abscisse;
        this.ordonnée = ordonnée;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnée() {
        return ordonnée;
    }

    public void setOrdonnée(double ordonnée) {
        this.ordonnée = ordonnée;
    }
}
