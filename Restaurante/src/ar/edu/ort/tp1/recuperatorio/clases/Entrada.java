package ar.edu.ort.tp1.recuperatorio.clases;

public class Entrada extends Plato {

	private static final float ADICIONAL_SALSA = 20f;
	private static final float PRECIO_PORCION = 50f;
	private int cantPorciones;
	private boolean incluyeSalsa;

	public Entrada(String nombre, float costoBase, float porcentajeGanancia, int cantidadPorciones,
			boolean incluyeSalsas) {
		super(nombre, costoBase, porcentajeGanancia);
		this.setCantPorciones(cantidadPorciones);
		this.incluyeSalsa = incluyeSalsas;
	}

	private void setCantPorciones(int cantidadPorciones) {
			// TODO Auto-generated method stub
		if (cantidadPorciones<=0)
			throw new IllegalArgumentException("Cantidad de porciones inválida");
		this.cantPorciones = cantidadPorciones;
	}

	@Override
	protected float precioCosto(float costoBase) {
		return costoBase + (cantPorciones * PRECIO_PORCION) + (incluyeSalsa ? ADICIONAL_SALSA:0f);
	}

	@Override
	protected String textoEspecifico() {
		return "Cantidad de porciones: " + cantPorciones + " " + (incluyeSalsa ? "" : "no ") + "incluye salsas";
	}
	
	@Override
	public TipoDePlato tipo() {
		return TipoDePlato.ENTRADA;
	}


}
