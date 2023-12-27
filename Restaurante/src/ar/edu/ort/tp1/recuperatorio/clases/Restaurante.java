package ar.edu.ort.tp1.recuperatorio.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class Restaurante {

	private static final String MSG_PLATO_NULO = "No se pudo fabricar  porque era nulo el plato el set de cubierto";
	private static final String MSG_CUBIERTOS = "Error de parametros agregando cubiertos";
	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Platos Principales, %d Entradas y %d Postres\n";
	// TODO A completar
	private String nombre;
	private Cola<Plato> platos;
	private int[][] stock;
	private int[] platosPorTipo;
	private PlatosPorPrecioDesc lista;

	public Restaurante(String nombre) {
		// TODO A completar
		this.nombre = nombre;
		this.platos = new ColaNodos<>();
		stock = new int[TipoDePlato.values().length][SetDeCubierto.values().length];
	}

	// TODO A completar
	public void agregarSetDeCubiertosPorTipoDePlato(TipoDePlato tipoDePlato, SetDeCubierto cubiertoPorPlato,
			int cantidad) {
		stock[tipoDePlato.ordinal()][cubiertoPorPlato.ordinal()] += cantidad;
	}

	public boolean prepararPlato(Plato plato, SetDeCubierto cubiertoPorPlato) {
		// TODO A completar
		boolean retorno = false;
		if (plato != null && hayStock(plato.tipo(), cubiertoPorPlato)) {
			platos.add(plato);
			descontarStock(plato.tipo(), cubiertoPorPlato);
			retorno = true;
		}
		return retorno;
	}

	private boolean hayStock(TipoDePlato tipo, SetDeCubierto cubiertoPorPlato) {
		return stock[tipo.ordinal()][cubiertoPorPlato.ordinal()] > 0;
	}

	private void descontarStock(TipoDePlato tipo, SetDeCubierto cubiertoPorPlato) {
		// TODO Auto-generated method stub
		stock[tipo.ordinal()][cubiertoPorPlato.ordinal()]--;
	}

	public void mostrar() {
		System.out.println("Estadisticas de " + nombre);
		generarDatos();
		System.out.println("Platos por precio de venta:");
		for (Plato plato : lista) {
			plato.mostrar();
		}
		System.out.println("-----");
		System.out.println("Platos por tipo");
		for (int i = 0; i < TipoDePlato.values().length; i++) {
			System.out.println(TipoDePlato.values()[i] + " - " + platosPorTipo[i]);
		}
	}

	private void generarDatos() {
		lista = new PlatosPorPrecioDesc();
		platosPorTipo = new int[TipoDePlato.values().length];
		Plato c = null;
		this.platos.add(c);
		Plato p = this.platos.remove();
		while (p != c) {
			lista.add(p);
			platosPorTipo[p.tipo().ordinal()]++;
			this.platos.add(p);
			p = this.platos.remove();
		}
	}

	// TODO A completar
}
