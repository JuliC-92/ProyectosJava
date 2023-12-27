package ar.edu.ort.tp1.recuperatorio.clases;

public class Principal extends Plato {
	
	private boolean vegetariano;
	private TipoDeCocina tdc;
	
	public Principal(String nombre,
			float costoBase,
			float porcentajeGanancia,
			boolean esVegetariano,
			TipoDeCocina tipoDeCocina) {
		super(nombre, costoBase, porcentajeGanancia);
		this.vegetariano = esVegetariano;
		this.tdc = tipoDeCocina;
		
	}

	@Override
	protected float precioCosto(float costoBase) {
		return costoBase * tdc.getPorcentaje();
	}

	@Override
	protected String textoEspecifico() {
		
		return (vegetariano ? "":"no ")+"vegetariano - Tipo de cocina: " + tdc.getDescripcion();
	}

	@Override
	public TipoDePlato tipo() {
		return TipoDePlato.PRINCIPAL;
	}

}
