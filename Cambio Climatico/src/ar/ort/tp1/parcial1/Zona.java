package ar.ort.tp1.parcial1;

import java.util.ArrayList;
import java.util.List;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Zona implements Monitoreable {

	private int elevacion;
	private List<Double> temperaturas;
	private Coordenada coordenada;	

	public Zona(int elevacion, List<Double> temperaturas, Coordenada coordenada) {
		super();
		this.elevacion = elevacion;
		this.temperaturas = new ArrayList<>(temperaturas); // Arraylist copia, para encapsular las temps
		this.coordenada = coordenada;
	}

	public double tempPromedio() {
        double acu = 0;
        for (Double temperatura : temperaturas) {
            acu += temperatura;
        }
        return Matematica.promedio(acu, temperaturas.size());
	}

	public boolean algunaInferiorA(double cuanto) {
		int i = 0;
        while (i < this.temperaturas.size() && this.temperaturas.get(i) >= cuanto) {
            i++;
        }
        return i < this.temperaturas.size();
	}
	
	public int getElevacion() {
        return elevacion;
    }

	public boolean situadaEn(Coordenada coord) {
		return this.coordenada.coincideCon(coord);
	}

}