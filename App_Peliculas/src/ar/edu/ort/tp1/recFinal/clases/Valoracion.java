package ar.edu.ort.tp1.recFinal.clases;


public enum Valoracion {
	VERDE, AMARILLO, ROJO; 
	
	String verde="\033[32m";
	String amarillo="\033[33m"; 
	String rojo= "\033[31m";
	String reset="\u001B[0m";
	
	
	public String establecerValoracion(Valoracion val) {
		return val == VERDE ? verde+"POSITIVA"+reset : 
			   (val == ROJO ? rojo+"NEGATIVA"+reset : amarillo+"NEUTRA"+reset);
	}
}
