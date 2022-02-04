package act2CompJava;

public class calculo {
	
public int  promedio (int calfi[] ) {
	int suma=0;
	for (int i = 0; i<= 4; i++ ) {
		
	       int total = (calfi[i]) + suma;
		suma = total; 
	}
	int promedio = suma/5;
	return promedio ;
	
}

	
	
}
