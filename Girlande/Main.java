public class Main {

    public static void main(String[] args) {
        // Erzeugen der Girlande
        Girlande g = new Girlande();
        
        // Einfuegen verschiedener Elemente
        g.obenEinfuegen(new Figur("Kreis","rot"));
        g.untenEinfuegen(new Figur("Rechteck","blau"));
        g.obenEinfuegen(new Figur("Stern","gelb"));
        
        // Ausgabe
        g.listenDatenAusgeben();
        
        // Entnehmen des obersten Element
        g.obenEntnehmen();
        
        // Ausgabe
        g.listenDatenAusgeben();
        
        
    }
}
