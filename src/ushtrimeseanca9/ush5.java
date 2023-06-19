package ushtrimeseanca9;

import java.util.Set;
import java.util.HashSet;
public class ush5 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 2, 3, 4, 6 };
		Set<Integer> uniqueNumber = new HashSet<>();
		boolean nqska = false;
		for(int i=0; i<array.length;i++) {
			if( uniqueNumber.contains(array[i])) {
				nqska=true;
				System.out.println("Element i Dublikuar"+array[i]);}
			else {
				uniqueNumber.add(array[i]);
			}
		}if(!nqska) {
			System.out.println(-1);
		}
	}

}
