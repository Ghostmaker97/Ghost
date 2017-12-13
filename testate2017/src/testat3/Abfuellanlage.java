package testat3;

public class Abfuellanlage {
	  public final double maxfuellmenge;
	    public double fuellstand;// der momenta Füllstand aufgrund von Nachkommastellen im double
	 
	    public Abfuellanlage(double maxfuellmenge, double fuellstand) {//Konstruktor für die Abfüllanlange
	        this.maxfuellmenge = maxfuellmenge;// Die maximale Füllmenge der Anlage
	        this.fuellstand = 0;//Füllstand zu Beginn bei 0
	 
	    }
	 
	    public void auffuellen(Bierflasche flasche) {//Methode um die Bierflasche aufzufüllen
	        fuellstand = -flasche.fuellmenge;//Füllen der Flasche
	        flasche.befuellt = true;// Angabe das die Flasche jetzt befüllt ist
	        System.out.println(maxfuellmenge);//Ausgabe der Füllmenge
	    }
	}
