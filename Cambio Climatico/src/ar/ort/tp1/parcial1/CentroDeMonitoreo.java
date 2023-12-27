package ar.ort.tp1.parcial1;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class CentroDeMonitoreo {

	private ArrayList<Zona> zonas;
	
	public CentroDeMonitoreo() {
        this.zonas = new ArrayList<>();
    }
	
	public void agregarZona(Zona z) {
		this.zonas.add(z);
	}

	public double porcentajeDeZonasEnRiesgo() {
		int cant = 0;
        for (Zona z : zonas) {
            if (z.enRiesgo()) {
                cant++;
            }
        }
		return Matematica.porcentaje(cant, zonas.size());
	}

	public void informarRiesgo(Coordenada coord) {
		Zona z = buscarZona(coord);
		if (z == null) {
			System.out.println("No existe zona de coordenadas " + coord);
		} else {
			String siONo = z.enRiesgo() ? " " : " no ";
			System.out.println("La zona situada en " + coord + siONo + "está en riesgo");
		}
	}

	private Zona buscarZona(Coordenada coord) {
		Zona z = null;
		int i = 0;
        while (i < this.zonas.size() && !this.zonas.get(i).situadaEn(coord)) {
            i++;
        }
        if (i < this.zonas.size()) {
        	z = this.zonas.get(i);
        }
        return z;
	}

}