 package ar.edu.ort.tp1.recFinal.clases;

public class Usuario{
	
	private static final String MSG_REGION_INVALIDA = "Region inválida";
	private static final String MSG_RED_SOCIAL_INVALIDA = "Red social inválida";
	private static final String MSG_NOMBRE_INVALIDO = "Tu nombre de usuario no puede estar vacío";
	
	//Completar aquí
	private String nombre;
	private String redSocial;
	private Region region;
	
	public Usuario(String nombre, String redSocial, Region region) {
		//Completar aquí CONSTRUCTOR;
		setNombre(nombre);	
		setRedSocial(redSocial);
		setRegion(region);
	}

	private void setNombre(String nombre) throws IllegalArgumentException {
		if(nombre == null || nombre.equals("")) {
			throw new IllegalArgumentException(MSG_NOMBRE_INVALIDO);
		}
		this.nombre = nombre;
	}

	private void setRedSocial(String redSocial) throws IllegalArgumentException {
		if(redSocial == null || redSocial.equals("")) {
			throw new IllegalArgumentException(MSG_RED_SOCIAL_INVALIDA);
		}
		this.redSocial = redSocial;
	}

	public Region getRegion() {
		return region;
	}

	//Completar aquí con métodos

	private void setRegion(Region region) throws IllegalArgumentException {
		if(region == null) {
			throw new IllegalArgumentException(MSG_REGION_INVALIDA);
		}		
		this.region = region;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", redSocial=" + redSocial + ", region=" + region + "]";
	}
	
}
