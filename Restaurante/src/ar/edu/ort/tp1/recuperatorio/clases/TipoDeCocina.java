package ar.edu.ort.tp1.recuperatorio.clases;

public enum TipoDeCocina {

	ITALIANA("Italiana", 1.2f), ASIATICA("Asiática",1.3f), MEXICANA("Mexicana",1.4f);

	private String descripcion;
	private float porcentaje;

	private TipoDeCocina(String descripcion, float porcentaje) {
		this.descripcion 	= descripcion;
		this.porcentaje 	= porcentaje;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public float getPorcentaje() {
		return porcentaje;
	}

}
