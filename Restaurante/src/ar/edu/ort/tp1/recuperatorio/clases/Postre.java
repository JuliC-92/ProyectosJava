package ar.edu.ort.tp1.recuperatorio.clases;

public class Postre extends Plato {

	private TamanioDePostre tamanio;
	
	public Postre(String nombre,
			float costoBase,
			float porcentajeGanancia,
			TamanioDePostre tamanioDePostre) {
		super(nombre, costoBase, porcentajeGanancia);
		// TODO Auto-generated constructor stub
		this.setTamanio(tamanioDePostre);
	}

	private void setTamanio(TamanioDePostre tamanioDePostre) {
		// TODO Auto-generated method stub
		if (tamanioDePostre == null) {
			throw new IllegalArgumentException("Tamaño inválido");
		}
		this.tamanio = tamanioDePostre;
	}

	@Override
	protected float precioCosto(float costoBase) {
		// TODO Auto-generated method stub
		return costoBase * tamanio.getPorcentaje();
	}

	@Override
	protected String textoEspecifico() {
		// TODO Auto-generated method stub
		return "Tamanio del postre: " + tamanio.getDescripcion();
	}
	
	@Override
	public TipoDePlato tipo() {
		return TipoDePlato.POSTRE;
	}

}
