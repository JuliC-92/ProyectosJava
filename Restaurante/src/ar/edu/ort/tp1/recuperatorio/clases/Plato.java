package ar.edu.ort.tp1.recuperatorio.clases;

public abstract class Plato implements Mostrable {

	private static final String MSG_GANANCIA_INVALIDA = "Ganancia invalida";
	private static final String MSG_COSTO_INVALIDO = "Monto base invalido";
	private static final String MSG_NOMBRE_INVALIDO = "Nombre invalido";
	private String nombre;
	private float montoBase;
	private float porcentajeGanancia;
	//TODO A completar

	public Plato(String nombre, float montoBase, float porcentajeGanancia) {
		this.setNombre(nombre);
		this.setMontoBase(montoBase);
		this.setPorcentajeGanancia(porcentajeGanancia);
	}

	public void setNombre(String nombre) {
		//TODO A completar
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException(MSG_NOMBRE_INVALIDO);
		}
		this.nombre = nombre;
	}

	public void setMontoBase(float montoBase) {
		//TODO A completar
		if (montoBase <= 0)
			throw new IllegalArgumentException(MSG_COSTO_INVALIDO);
		this.montoBase = montoBase;
	}

	public void setPorcentajeGanancia(float porcentajeGanancia) {
		//TODO A completar
		if (porcentajeGanancia < 0) {
			throw new IllegalArgumentException(MSG_GANANCIA_INVALIDA);
		}
		this.porcentajeGanancia = porcentajeGanancia;
	}
	
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.printf("Plato: %s - Nombre: %s - Precio de venta: $%.2f - %s\n" , getClass().getSimpleName(), nombre, precioVenta(), textoEspecifico());
	}

	public float precioVenta() {
		return precioCosto(montoBase) * ( 1 + porcentajeGanancia);
	}

	protected abstract float precioCosto(float costoBase);

	protected abstract String textoEspecifico();
	
	public abstract TipoDePlato tipo();
}
