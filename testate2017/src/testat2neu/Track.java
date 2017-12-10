package testat2neu;

public class Track {
	public int id; // Eindeutige Gleisnummer, ganzzahlig
	public boolean occupied; // Angabe ob Gleis belegt oder nicht 
	public Train train; /* Falls ein Zug auf dem Gleis steht, ist der hier gespeichert */ 
	public double length; /* Gleisl�nge, um sp�ter zu pr�fen, ob lange Z�ge auf das Gleis passen */ 
	
	/* Konstruktor f�r Basiswerte. Kein Zug bei Erstellung auf dem Gleis */
	public Track(int id, double length) { 
		this.id = id;
		this.length = length; 
		this.occupied = true; /* Wir stellen aus Sicherheitsgr�nden sicher, dass kein Zug da parken darf */ 
		 
	}
	/* Die Methode gibt auf der Konsole aus, ob das Gleis belegt ist. */   
	public void isTrackOccupied(){ 
		System.out.println("Das Gleis " + id + " ist belegt: " + occupied); 
		
	}
}
