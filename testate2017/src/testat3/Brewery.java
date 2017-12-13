package testat3;
import java.util.ArrayList;// Import der Liste
public class Brewery {

	public static void main(String[] args) {
		
		ArrayList<Bierflasche> leereFlaschen = new ArrayList<>();//Die liste für die zu erstellenden Bierflaschen
        Bierflasche flasche1 = new Bierflasche(0.5, 4.9);// erste erstellte Bierflasche
        leereFlaschen.add(flasche1);//leere Flasche hinzugefügt

        Bierflasche flasche2 = new Bierflasche(0.5, 5.2);
        leereFlaschen.add(flasche2);

        Bierflasche flasche3 = new Bierflasche(0.5, 3.5);
        leereFlaschen.add(flasche3);

        Abfuellanlage anlage = new Abfuellanlage(1, 10);//Ausgabe aller Daten der Bierflaschen 
        ArrayList<Bierflasche> gefüllteFlaschen = new ArrayList<>();
        System.out.println(leereFlaschen.size());
        System.out.println(gefüllteFlaschen.size());
        Bierflasche curr = leereFlaschen.get(0);
        leereFlaschen.remove(0);//entfernen der leeren Bierflasche
        anlage.auffuellen(curr);
        gefüllteFlaschen.add(curr);//Flasche hinzufügen
        System.out.println(leereFlaschen.size());//Ausgabe
        System.out.println(gefüllteFlaschen.size());
        System.out.println(anlage.fuellstand);
		
		
		
		
	}

}
