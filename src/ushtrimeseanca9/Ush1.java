package ushtrimeseanca9;
import java.util.Scanner;
public class Ush1 {
//1.  Shkruaj një program që gjen mesataren e elementeve të një array 1D. 
	//Të dhënat e arrayt dhe madhësia e arrayt të merren si input nga përdoruesi.
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Sa ngjyra te preferuara ke?");
		int a=in.nextInt();
		String[] colors= new String[a];
		System.out.println("Bukur ti ke "+a+" ngjyra te preferuara. Shkruaj ngjyrat:");
		for(int i=0;i<a; i++) {
			colors[i] = in.next();
		}
		System.out.println("Ngjyrat qe ke zgjedhur jane:");
		for(int i=0;i<a; i++) {
			System.out.println(colors[i]);
in.close();		}

	}

}
