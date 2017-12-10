package testat3;
import java.util.LinkedList;
public class Brewery {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		Bierflasche flasche1 = new Bierflasche(0.5,4.8);
		list.add("flasche1"+ flasche1);
		
		Bierflasche flasche2 = new Bierflasche(0.5,5.2);
		list.add("flasche2"+ flasche2);
		
		Bierflasche flasche3 = new Bierflasche(0.5,3.5);
		list.add("flasche3"+ flasche3);
		
		System.out.println(list);
		
		
		
		
		
	}

}
