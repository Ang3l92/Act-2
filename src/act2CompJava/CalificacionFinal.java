package act2CompJava;

public class CalificacionFinal {
	static int califin[];
	public char  CalFin () {
		int suma=0;
		for (int i = 0; i<= 4; i++ ) {
			
		       int total = (califin[i]) + suma;
			suma = total; 
		}
		
		
		int promedio = suma/5;
		char calificacion = ' ';
		
		
		if (promedio<= 50) {
			calificacion = 'F';
			
		}
		else if (promedio<= 60) {
			calificacion = 'E';
		}
		else if (promedio<= 70) {
			calificacion = 'D';
		}
		else if (promedio<= 80) {
			calificacion = 'C';
		}
		else if (promedio<= 90) {
			calificacion = 'B';
		}
		else  {
			calificacion = 'A';
		}
		
			
		return calificacion;
	}
}
