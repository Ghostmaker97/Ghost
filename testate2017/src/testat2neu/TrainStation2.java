package testat2neu;

public class TrainStation2 {

	public static void main(String[] args) {
		Track gleis1 = new Track(1,100);
		Track gleis2 = new Track(2,75);
		
		Track[] gleisArray = new Track[2];
		
		gleisArray[0] = gleis1;
		gleisArray[1] = gleis2;
		
		Train zug1 = new Train(1,'S',5);
		Train zug2 = new Train(2,'G',10);
		
		Train[] zugArray = new Train[2];
		
		zugArray[0] = zug1;
		zugArray[1] = zug2;
		
		
		
		
		
	}

}
