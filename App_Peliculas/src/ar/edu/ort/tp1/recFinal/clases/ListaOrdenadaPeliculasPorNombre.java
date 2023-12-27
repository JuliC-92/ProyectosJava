package ar.edu.ort.tp1.recFinal.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdenadaPeliculasPorNombre extends ListaOrdenadaNodos<String, Pelicula> {
	

	@Override
	public int compare(Pelicula dato1, Pelicula dato2) {
		return dato1.getTitulo().compareTo(dato2.getTitulo());
	}

	@Override
	public int compareByKey(String clave, Pelicula elemento) {
		return clave.compareTo(elemento.getTitulo());
	}

}
