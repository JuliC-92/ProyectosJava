package ar.ort.tp1.parcial1;

import java.util.List;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ZonaSeca extends Zona {

	private static final double TEMP_MAX = 43;
	private static final double INS_MAX = 90;
	private double porcInsolacion;	

	public ZonaSeca(int elevacion, List<Double> temperaturas, Coordenada coordenada, double porcInsolacion) {
		super(elevacion, temperaturas, coordenada);
		this.porcInsolacion = porcInsolacion;
	}

	@Override
	public boolean enRiesgo() {
		/* cuando la temperatura promedio durante todo el año 
		 * supera los 43ºC y el nivel de insolación no supera el 90%.
		 * */
		return tempPromedio() > TEMP_MAX && porcInsolacion < INS_MAX;
	}

}