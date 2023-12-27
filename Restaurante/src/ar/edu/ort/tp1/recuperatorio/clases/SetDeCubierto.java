package ar.edu.ort.tp1.recuperatorio.clases;

public enum SetDeCubierto {

	SET_MIXTO("Cuchillo + Tenedor"), SET_LIQUIDO("Cuchara + Tenedor"), SET_CUCHARA("Cuchara"), SET_COMPLETO("Cuchara + Tenedor + Cuchillo");
	
	private String nombre;
	
	private SetDeCubierto(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
}
