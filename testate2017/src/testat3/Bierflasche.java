package testat3;

public class Bierflasche {
	
	 public boolean befuellt;//boolean ob die Bierflasche voll oder leer ist
	 public final double fuellmenge;// Fuellmenge für die Flasche im double aufgrund von Nachkommastellen
	 public double alkohol;//double für den Alkoholwert mit Nachkommastellen
	 
	    public Bierflasche(double fuellmenge, double alkohol) {// Konstruktor für die Bierflassche
	        this.befuellt = false;// Bierflasche ist anfangs leer somit false
	        this.fuellmenge = fuellmenge;//Füllmenge für die Bierflasche mit this um die Werte zu übernehmen
	        this.alkohol = alkohol;// Angabe für den prozentualen Alkoholwert
		
		
	}

}
