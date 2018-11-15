package myMath;

import java.util.Comparator;

/**
 * Does the sorting process, using the equation
 * @author Raam and sapir
 * *id: 204548523

 */
public class Monom_Comperator implements Comparator<Monom> {

	
	public int compare(Monom m1, Monom m2){
		if(m2.get_power()>m1.get_power())
			return 1;
		else if(m2.get_power()==m1.get_power()){
			return 0;
		}
		else
			return -1;
	}
}
