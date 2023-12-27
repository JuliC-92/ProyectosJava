package ar.ort.tp1.parcial1;

import java.util.List;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ZonaTropical extends Zona {

	private static final double MM_LLUVIA_ESP = 200;
	private static final double ELEV_MAX = 1000;
	private int mmLlovidos;

	public ZonaTropical(int elevacion, List<Double> temperaturas, Coordenada coordenada, int mmLlovidos) {
		super(elevacion, temperaturas, coordenada);
		this.mmLlovidos = mmLlovidos;
	}
	
	@Override
	public boolean enRiesgo() {
		/* cuando hayan llovido al menos 200 mm y la elevación no supere los 1000 metros. */
		return this.mmLlovidos >= MM_LLUVIA_ESP && getElevacion() < ELEV_MAX;
	}

}