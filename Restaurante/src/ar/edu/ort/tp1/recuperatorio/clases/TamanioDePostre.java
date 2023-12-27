package ar.edu.ort.tp1.recuperatorio.clases;

public enum TamanioDePostre {

	PEQUENO("Pequeño", 1f), MEDIANO("Mediano", 1.2f), GRANDE("Grande", 1.5f);

	private String 	descripcion;
	private float porcentaje;

	private TamanioDePostre(String descripcion, float porcentaje) {
		this.descripcion	= descripcion;
		this.porcentaje 	= porcentaje;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public float getPorcentaje() {
		return porcentaje;
	}

}
