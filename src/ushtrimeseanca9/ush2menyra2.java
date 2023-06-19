package ushtrimeseanca9;

import java.util.Scanner;

public class ush2menyra2 {

//	2.  Shkruaj një program që gjen nëse një element ndodhet apo jo në array
	//dhe në cilin pozicion ndodhet ai element në array. Në momentin e parë që
	//gjendet ky element të ndalohet iterimi i elementeve të tjerë. Në rast se
	//elementi nuk gjendet, të printohet: “Elementi nuk u gjet”. 
	//Elementi që do kërkohet të merret si input nga përdoruesi dhe inicializimi
	//i arrayt të bëhet po nga përdoruesi. 

	public static void main(String[]args) {


	       Scanner scanner = new Scanner(System.in);
int m ;
	        System.out.println("Vendos madhesine e array: ");
	        m = scanner.nextInt();

	        int arr[] =  new int[m];

	        for (int i = 0; i<m; i++){
	            System.out.println("Vendos elementin " + i);
	            arr[i] = scanner.nextInt();
	        }

	        System.out.println("Vendos elementin qe don qe te gjesh");
	        int elem = scanner.nextInt();

	        int indx= -1;
	        for (int i =0; i<m;i++) {
	            if(arr[i] == elem){
	                indx = i;
	                break;
	            }
	        }

	        if(indx == -1){
	            System.out.println("Elementi nuk u gjet");
	        } else {
	            System.out.println("Elementi nodhet ne pozicionin "+ indx);
	        }
	    }
	}