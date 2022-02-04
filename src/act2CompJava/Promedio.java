


package act2CompJava;

import java.util.Scanner;
import java.*;

public class Promedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es el nombre del estudiante : ");
		String nombre = " ";
		nombre = sc.next();
		int[] num = new int [5];			
		calculo  Calculo;
	    Calculo = new calculo();
		
	    CalificacionFinal  CalFin ;
	    CalFin = new CalificacionFinal();
	    
		for (int i = 0; i<= 4; i++ ) {
			System.out.println("Ingrece la calificacion " + (i+1));
			num [i] = sc.nextInt();
			
		}
		
		
	CalFin.califin = num;
	
	System.out.println("Nombre del estudiante : "+ nombre );
	System.out.println("Calificacion 1 : "+ num[0] );
	System.out.println("Calificacion 2 : "+ num[1] );
	System.out.println("Calificacion 3 : "+ num[2] );
	System.out.println("Calificacion 4 : "+ num[3] );
	System.out.println("Calificacion 5 : "+ num[4] );
	System.out.println("Promedio : "+ Calculo.promedio(num));
	System.out.println("Calificacion : "+ CalFin.CalFin() );
	
	}

}
