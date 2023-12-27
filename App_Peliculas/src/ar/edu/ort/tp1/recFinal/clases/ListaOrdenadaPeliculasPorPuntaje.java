package ar.edu.ort.tp1.recFinal.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdenadaPeliculasPorPuntaje extends ListaOrdenadaNodos<Float, Pelicula> {

	@Override
	public int compare(Pelicula dato1, Pelicula dato2) {
		return Float.compare(dato2.obtenerPromedioVotacion(), dato1.obtenerPromedioVotacion());
	}

	@Override
	public int compareByKey(Float clave, Pelicula elemento) {
		return Float.compare(elemento.obtenerPromedioVotacion(), clave);
	}

}
