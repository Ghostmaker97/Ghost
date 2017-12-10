package testat2neu;

public class Train {
	  public int id; // Eindeutige Zugnummer, Ganzzahlig 
	  public char type; // Typ des Zugs, hier als Char; String m�gl. 
	  public int numberOfWagons; /* Anzahl der Wagons am zug, auch ganzzahlig */ 
	  
	  public Train(int id, char type, int numberOfWagons) { 
		  this.id = id; 
		  this.type = type; 
		  this.numberOfWagons = numberOfWagons; 
	  }
	  /* Berechnet die gesamte Zugl�nge basierend auf der L�nge der Wagons multipliziert mit der Anzahl der Wagons zzgl. Lok */ 
	  public double getTrainLength(double wagonLength){
		  return (1 + numberOfWagons) * wagonLength; 
	  }
}
