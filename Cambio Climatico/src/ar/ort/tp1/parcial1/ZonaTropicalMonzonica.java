package ar.ort.tp1.parcial1;

import java.util.List;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ZonaTropicalMonzonica extends ZonaTropical {

	private static final double TEMP_MIN = 15;
	private IntensidadViento intensidadViento;

	public ZonaTropicalMonzonica(int elevacion, List<Double> temperaturas, Coordenada coordenada, int mmLlovidos,
			IntensidadViento intensidadViento) {
		super(elevacion, temperaturas, coordenada, mmLlovidos);
		this.intensidadViento = intensidadViento;
	}
	
	@Override
	public boolean enRiesgo() {
		/* Igual que las tropicales, pero también puede darse cuando 
		 * alguna temperatura haya sido inferior a 15ºC y el viento sea leve.*/
		return super.enRiesgo() || 
			   (algunaInferiorA(TEMP_MIN) && intensidadViento == IntensidadViento.LEVE);
	}

}