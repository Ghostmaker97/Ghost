package testat3;

public class Abfuellanlage {
	public double maxfuellmenge;
	public double fuellstand;
	
	
	public Abfuellanlage(double maxfuellmenge, double fuellstand){
		this.maxfuellmenge = maxfuellmenge;
		this.fuellstand = 0;
		
	}

	public void auffuellen(){
		System.out.println(maxfuellmenge);
	}
}
