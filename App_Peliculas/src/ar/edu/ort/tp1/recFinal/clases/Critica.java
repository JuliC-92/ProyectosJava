package ar.edu.ort.tp1.recFinal.clases;

public abstract class Critica implements Visualizable {
	private String descripcion;
	private String nombreAutor;
	private String fechaRealizacion;

	public Critica(String descripcion, String nombreAutor, String fechaRealizacion) {
		setDescripcion(descripcion);
		setNombreAutor(nombreAutor);
		setFechaRealizacion(fechaRealizacion);
	}

	private void setDescripcion(String descripcion) throws IllegalArgumentException {
		if (descripcion == null || descripcion.equals("")) {
			throw new IllegalArgumentException("Descripción inválida");
		}
		this.descripcion = descripcion;
	}

	private void setNombreAutor(String nombreAutor) throws IllegalArgumentException {
		if (nombreAutor == null || nombreAutor.equals("")) {
			throw new IllegalArgumentException("Nombre de autor inválido");
		}
		this.nombreAutor = nombreAutor;
	}

	private void setFechaRealizacion(String fechaRealizacion) throws IllegalArgumentException {
		if (fechaRealizacion == null || fechaRealizacion.equals("")) {
			throw new IllegalArgumentException("Fecha de realización inválida");
		}
		this.fechaRealizacion = fechaRealizacion;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected String getNombreAutor() {
		return nombreAutor;
	}

	protected String getFechaRealizacion() {
		return fechaRealizacion;
	}

}
