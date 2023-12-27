package ar.edu.ort.tp1.recuperatorio.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class PlatosPorPrecioDesc extends ListaOrdenadaNodos<Float, Plato> {

	@Override
	public int compare(Plato dato1, Plato dato2) {
		return Float.valueOf(dato2.precioVenta()).compareTo(dato1.precioVenta());
	}

	@Override
	public int compareByKey(Float clave, Plato elemento) {
		return -clave.compareTo(elemento.precioVenta());
	}

}
