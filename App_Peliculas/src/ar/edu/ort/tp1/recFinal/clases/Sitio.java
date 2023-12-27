package ar.edu.ort.tp1.recFinal.clases;

import java.util.List;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;


public class Sitio{

	// private static final String MSG_CRITICA_DUPLICADA = "El usuario ya hizo una crítica sobre esta película";
	
	//Completar aquí; 
	private ColaNodos<Usuario> usuarios;
	private ListaOrdenadaPeliculasPorNombre peliculas;
	private ListaOrdenadaPeliculasPorPuntaje peliculasPorPuntaje;
	private int[] usuariosPorRegion;
	
	//Completar aquí CONSTRUCTOR
	public Sitio(List<Pelicula> peliculas) {
		usuarios = new ColaNodos<>();
		this.peliculas = new ListaOrdenadaPeliculasPorNombre();
		this.peliculasPorPuntaje = new ListaOrdenadaPeliculasPorPuntaje();
		this.usuariosPorRegion = new int[Region.values().length];
		
		for (Pelicula pelicula : peliculas) {
			this.peliculas.add(pelicula);
			this.peliculasPorPuntaje.add(pelicula);
		}
	}

	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void visualizarDatos() {
		System.out.println("==Película con mayor puntaje==");
		Pelicula pelicula = obtenerPeliculaMejorPuntaje();
		pelicula.visualizarDatos();
		
		System.out.println("==VISUALIZANDO ESTADÍSTICAS==");
		for (Pelicula pelicula1 : peliculas) {
			pelicula1.getEstadisticas();
		}
		
		System.out.println();
		System.out.println(">>Usuarios por región: ");
		mostrarUsuariosPorRegion();
		
		System.out.println(">>Criticas profesionales por genero: ");
		mostrarCriticasProfesionalesPorGenero();
	}

	
	private void mostrarCriticasProfesionalesPorGenero() {
		int[] criticasProfesionalesPorGenero = new int[Genero.values().length];
		for (Pelicula pelicula : peliculas) {
			criticasProfesionalesPorGenero[pelicula.getGenero().ordinal()] += pelicula.getCriticasProfesionales();
		}
		
		System.out.println("**DRAMA: " + criticasProfesionalesPorGenero[Genero.DRAMA.ordinal()] + " criticas");
		System.out.println("**TERROR: " + criticasProfesionalesPorGenero[Genero.TERROR.ordinal()] + " criticas");
		System.out.println("**SCI_FI: " + criticasProfesionalesPorGenero[Genero.SCI_FI.ordinal()] + " criticas");
		System.out.println("**THRILLER: " + criticasProfesionalesPorGenero[Genero.THRILLER.ordinal()] + " criticas");
	}

	//Completar aquí con métodos
	public Pelicula obtenerPeliculaMejorPuntaje() {
		return peliculasPorPuntaje.get(0);
	}
	
	
	public void mostrarUsuariosPorRegion() {
	    Usuario usuario = null;
	    usuarios.add(usuario);
	    usuario = usuarios.remove();
	    int totalUsuarios = 0;

	    while (usuario != null) {
	        usuariosPorRegion[usuario.getRegion().ordinal()]++;
	        usuarios.add(usuario);
	        totalUsuarios++;
	        usuario = usuarios.remove();
	    }

	    for (Region region : Region.values()) {
	        int usuariosEnRegion = usuariosPorRegion[region.ordinal()];
	        double porcentaje = (usuariosEnRegion / (double) totalUsuarios) * 100;
	        System.out.println("** " + region + ": " + Math.round(porcentaje) + "%");
	    }
	    System.out.println();
	}
}
	

