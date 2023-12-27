package ar.edu.ort.tp1.examen.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;
//TODO
public class ListaTareasPorDescripcion extends ListaOrdenadaNodos<String, Tarea> {

	@Override
	public int compare(Tarea dato1, Tarea dato2) {
		return dato1.getDescripcion().compareTo(dato2.getDescripcion());
	}

	@Override
	public int compareByKey(String clave, Tarea elemento) {
		return clave.compareTo(elemento.getDescripcion());
	}

}
