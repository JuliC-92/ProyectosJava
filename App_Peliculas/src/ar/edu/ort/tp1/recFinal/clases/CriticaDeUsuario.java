package ar.edu.ort.tp1.recFinal.clases;

public class CriticaDeUsuario extends Critica {

	private static final int NOTA_MINIMA = 1;
	private static final int NOTA_MAXIMA = 10;
	private int nota;
	private int utilidad;

	public CriticaDeUsuario(String descripcion, String nombreAutor, String fechaRealizacion, int nota, int utilidad) {
		super(descripcion, nombreAutor, fechaRealizacion);
		setNota(nota);
		setUtilidad(utilidad);
	}

	public int getNota() {
		return nota;
	}

	private void setNota(int nota) throws IllegalArgumentException {
		if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
			throw new IllegalArgumentException("--ERROR--Imposible puntuar con esta nota. ¡Probá con otra!");
		}
		this.nota = nota;
	}

	private void setUtilidad(int utilidad) throws IllegalArgumentException {
		if (utilidad < 0) {
			throw new IllegalArgumentException("Utilidad inválida");
		}
		this.utilidad = utilidad;
	}

	/*
	 * Implementa el metodo de Visualizable declarado en Critica
	 */
	public void visualizarDatos() {
		System.out.println("TÍTULO DE LA CRÍTICA: " + super.getDescripcion() + " -- Autor: " + super.getNombreAutor());
		System.out.println("Fecha: " + super.getFechaRealizacion());
		if (utilidad > 0) {
			System.out.println(utilidad + " usuarios encontraron útil esta crítica.");
		} else {
			System.out.println("Sin utilidad");
		}
		System.out.println("Puntuación: " + nota);
		System.out.println("************");

	}
}
