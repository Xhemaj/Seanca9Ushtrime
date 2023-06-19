package ushtrimeseanca9;

public class ush4 {
//4. Shkruaj një program që fshin elementin e parë të një 
	//array pa përdorur një array tjetër ndihmës. 
//Rikujtesë: madhësia e një array nuk mund të ndryshojë, kështu  
//Nëse array ka fillimisht vlerat: {1, 4, 9, 10} atëherë nëse do 
	//fshijme elementin e parë, array duhet që pas fshirjes të ketë
	//trajtën {4, 9, 10, 10}. Pra të bëhet zhvendosja e elementeve 
	//pasaardhës në një index më përpara. 
	public static void main(String[] args) {
		int [] numra = {1,2,3,4};
		for(int i =0; i<numra.length;i++) {
			if(i == numra.length - 1){
				break;
			}
			else {
				numra[i] = numra[i+1];
			}
		}
		
		for(int i =0; i<numra.length;i++) {
			System.out.println(numra[i]);
		}
	}

}
