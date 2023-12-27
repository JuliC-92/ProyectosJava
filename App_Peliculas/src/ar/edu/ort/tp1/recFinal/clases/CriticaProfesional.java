package ar.edu.ort.tp1.recFinal.clases;

public class CriticaProfesional extends Critica {

	private Valoracion valoracion;
	private String medio;

	public CriticaProfesional(String descripcion, String nombreAutor, String fechaRealizacion, Valoracion valoracion,
			String medio) {
		super(descripcion, nombreAutor, fechaRealizacion);
		setValoracion(valoracion);
		setMedio(medio);
	}

	protected Valoracion getValoracion() {
		return valoracion;
	}

	private void setMedio(String medio) throws IllegalArgumentException {
		if (medio == null || medio.equals("")) {
			throw new IllegalArgumentException("Medio inválido");
		}
		this.medio = medio;
	}

	private void setValoracion(Valoracion valoracion) throws IllegalArgumentException {
		if (valoracion == null) {
			throw new IllegalArgumentException("Valoración inválida");
		}
		this.valoracion = valoracion;
	}

	/*
	 * Implementa el metodo de Visualizable declarado en Critica
	 */
	@Override
	public void visualizarDatos() {
		System.out.println("TÍTULO DE LA CRÍTICA: " + super.getDescripcion() + " -- Autor: " + super.getNombreAutor());
		System.out.println("Fecha: " + super.getFechaRealizacion());
		System.out.println("#" + medio + "-- VALORACION: " + valoracion.establecerValoracion(valoracion));
		System.out.println("************");

	}
}
