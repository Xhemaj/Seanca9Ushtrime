package ushtrimeseanca9;

public class ush6 {
// Shkruaj një program që gjen elementin e dytë më të madh në një array 1D. 
	public static void main(String[] args) {
	int [] numbers = {4 , 2 , 13, 12};
	int s = numbers[0];// ruajm elementin qe ka vleren me te madhe
	int n = numbers[0];// ruan elementin e dyte me te vogel
	for(int i = 0;i<numbers.length;i++) {
		if(numbers[i] > s)
		{
			s = numbers[i];
		}
		
		if(n < numbers[i] && numbers[i] < s) {
			n = numbers[i];
		}
	}
	
	
	System.out.println("Elementi i dyte me i vogel eshte " + n);
	

	}

}
