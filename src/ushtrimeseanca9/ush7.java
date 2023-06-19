package ushtrimeseanca9;

public class ush7 {
	
	static void krahesoArray(int []arr, int arr2[]) {
		boolean valid = true;
		if(arr.length != arr2.length) {
			valid = false;
		}
		if(valid)
			for(int i =0;i<arr.length;i++) {
				if(arr[i] != arr2[i]) {
					valid = false;
				}
			}
		
		if(valid)
			System.out.println("jane te barabart");
		else 
			System.out.println("Nuk jane te barabart");
	}

	public static void main(String[] args) {
		//. Krijo një metodë që merr si parametër dy array
		//dhe printon nëse arrayt janë të “barabarta” apo jo. Psh :  
//Array 1: 8 , 9, 10, 15 
//Array 2: 8, 9, 10, 15 
//janë të barabartë
		
		ush7.krahesoArray(new int[]{8 ,4, 10, 1}, new int[]{8 , 9, 10, 1});

	}

}
