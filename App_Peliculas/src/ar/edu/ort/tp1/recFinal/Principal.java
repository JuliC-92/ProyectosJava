package ar.edu.ort.tp1.recFinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.ort.tp1.recFinal.clases.Critica;
import ar.edu.ort.tp1.recFinal.clases.CriticaDeUsuario;
import ar.edu.ort.tp1.recFinal.clases.CriticaProfesional;
import ar.edu.ort.tp1.recFinal.clases.Genero;
import ar.edu.ort.tp1.recFinal.clases.Pelicula;
import ar.edu.ort.tp1.recFinal.clases.Region;
import ar.edu.ort.tp1.recFinal.clases.Sitio;
import ar.edu.ort.tp1.recFinal.clases.Usuario;
import ar.edu.ort.tp1.recFinal.clases.Valoracion;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Esta clase NO DEBE MODIFICARSE; únicamente se debe agregar - donde
		 * corresponda - los bloques necesarios para el manejo de excepciones o errores.
		 * 
		 * Observar y analizar cada método para comprender el envío de parámetros hacia
		 * las otras clases del proyecto.
		 */

		List<Pelicula> peliculasConCritica = generarDatosSitio();

		Sitio unSitio = new Sitio(peliculasConCritica);

		generarUsuarios(unSitio);
		generarUsuarioIncorrecto(unSitio);
		generarCriticaNotaInvalida(peliculasConCritica.get(1));
		generarCriticaDuplicada(peliculasConCritica.get(1));

		visualizarCriticas(unSitio);

	}

	private static List<Pelicula> generarDatosSitio() {
		List<Pelicula> peliculas = crearPeliculasSitio();
		List<Critica> criticas = generarCritica();

		agregarCriticasPelicula(peliculas.get(0), criticas.get(0));
		agregarCriticasPelicula(peliculas.get(0), criticas.get(1));
		agregarCriticasPelicula(peliculas.get(0), criticas.get(2));
		agregarCriticasPelicula(peliculas.get(0), criticas.get(3));
		agregarCriticasPelicula(peliculas.get(0), criticas.get(4));
		agregarCriticasPelicula(peliculas.get(0), criticas.get(5));
		agregarCriticasPelicula(peliculas.get(0), criticas.get(6));
		agregarCriticasPelicula(peliculas.get(0), criticas.get(7));
		agregarCriticasPelicula(peliculas.get(0), criticas.get(8));

		agregarCriticasPelicula(peliculas.get(1), criticas.get(9));
		agregarCriticasPelicula(peliculas.get(1), criticas.get(10));
		agregarCriticasPelicula(peliculas.get(1), criticas.get(11));
		agregarCriticasPelicula(peliculas.get(1), criticas.get(12));
		agregarCriticasPelicula(peliculas.get(1), criticas.get(13));

		agregarCriticasPelicula(peliculas.get(2), criticas.get(14));
		agregarCriticasPelicula(peliculas.get(2), criticas.get(15));
		agregarCriticasPelicula(peliculas.get(2), criticas.get(16));
		agregarCriticasPelicula(peliculas.get(2), criticas.get(17));
		agregarCriticasPelicula(peliculas.get(2), criticas.get(18));
		agregarCriticasPelicula(peliculas.get(2), criticas.get(19));

		agregarCriticasPelicula(peliculas.get(3), criticas.get(20));
		agregarCriticasPelicula(peliculas.get(3), criticas.get(21));

		return peliculas;
	}

	private static List<Pelicula> crearPeliculasSitio() {
		List<Pelicula> peliculas = generarPelicula();
		return peliculas;
	}

	public static List<Critica> generarCritica() {

		Critica c1 = new CriticaDeUsuario("Buen ritmo narrativo", "lawrenceFromArabia", "12/09/2023", 9, 3);
		Critica c2 = new CriticaDeUsuario("No es mala la idea, aunque se queda a medio camino", "ElKubric",
				"13/09/2023", 7, 1);

		Critica c4 = new CriticaDeUsuario("Cuidemos nuestro planeta", "PacMan", "25/09/2023", 10, 0);
		Critica c5 = new CriticaDeUsuario("Punto para la edición", "LucreSan", "04/10/2023", 6, 2);
		Critica c6 = new CriticaDeUsuario("Enorme fiasco y sin sentido", "capitanHowdini", "12/10/2023", 2, 4);

		Critica c7 = new CriticaProfesional("Impacta. No se notan las 3 horas que dura", "Augusto Rojo", "31/10/2023",
				Valoracion.VERDE, "Blog Cinemania.com");
		Critica c8 = new CriticaProfesional("Contundente y bien actuado testimonio", "Cecilia Marabath", "04/11/2023",
				Valoracion.VERDE, "espinof.com");
		Critica c9 = new CriticaProfesional("Sufre más de una vez el peso de su duración", "Marcelo Stiletto",
				"17/11/2023", Valoracion.AMARILLO, "Diario La Nación");
		Critica c10 = new CriticaProfesional("Tiene varios defectos; algunos frustrantes", "David Erlich", "29/11/2023",
				Valoracion.ROJO, "IndieWire");

		Critica c11 = new CriticaDeUsuario("Mala. Y es poco", "PacMan", "01/11/2023", 1, 2);
		Critica c12 = new CriticaDeUsuario("A la altura del desastre", "ElKubric", "04/11/2023", 2, 0);
		Critica c13 = new CriticaDeUsuario("Un insulto a la original", "lawrenceFromArabia", "25/11/2023", 2, 3);

		Critica c14 = new CriticaProfesional("No se comprende que han querido hacer", "Joe Niven", "27/11/2023",
				Valoracion.ROJO, "CinemaStout");
		Critica c15 = new CriticaProfesional("Ritmo nulo y atmósfera inexistente", "Carlos Gunt", "29/11/2023",
				Valoracion.ROJO, "CanalDeCinema");

		Critica c16 = new CriticaDeUsuario("Es buena, pero no convence", "PacMan", "10/09/2023", 6, 2);
		Critica c17 = new CriticaDeUsuario("Un acierto de la industria", "lawrenceFromArabia", " 09/10/2023", 6, 3);
		Critica c18 = new CriticaDeUsuario("Aceptable adaptación, y nada más", "capitanHowdini", "30/10/2023", 4, 2);

		Critica c19 = new CriticaProfesional("Despliegue visual. Enorme", "Joe Niven", "22/11/2023", Valoracion.VERDE,
				"CinemaStout");
		Critica c20 = new CriticaProfesional("¡Un triunfo!", "Carolina Mon ", "25/11/2023", Valoracion.VERDE,
				"El Canal de las estrellas");
		Critica c21 = new CriticaProfesional(" Para tener en cuenta", "Gonza Sella", "27/11/2023", Valoracion.AMARILLO,
				"MagaCine");

		Critica c22 = new CriticaDeUsuario("Promete secuelas", "lawrenceFromArabia", " 09/10/2023", 5, 2);
		Critica c23 = new CriticaDeUsuario("Me aburrió", "capitanHowdini", "30/10/2023", 4, 0);

		return new ArrayList<>(Arrays.asList(new Critica[] { c1, c2, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14,
				c15, c16, c17, c18, c19, c20, c21, c22, c23 }));

	}

	public static void generarCriticaDuplicada(Pelicula pelicula) {
		pelicula.agregarCritica(new CriticaDeUsuario("No es tan buena como parece", "ElKubric", "13/09/2023", 1, 0));
	}

	public static void generarCriticaNotaInvalida(Pelicula pelicula) {
		try {
			pelicula.agregarCritica(new CriticaDeUsuario("Se perfila como un clásico", "Kraquen", "12/09/2023", 11, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void generarUsuarioIncorrecto(Sitio unSitio) {
		try {
			unSitio.agregarUsuario(new Usuario(null, "ig:@lawrence_Aqui", Region.ARG));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void agregarCriticasPelicula(Pelicula unaPeli, Critica critica) {
		unaPeli.agregarCritica(critica);
	}

	public static void generarUsuarios(Sitio unSitio) {
		unSitio.agregarUsuario(new Usuario("lawrenceFromArabia", "ig:@lawrence_Aqui", Region.ARG));
		unSitio.agregarUsuario(new Usuario("PacMan", "ig:@ElPacKer - twitch:pcMan♠", Region.ESP));
		unSitio.agregarUsuario(new Usuario("ElKubrick", "ig:@StanKu", Region.MEX));
		unSitio.agregarUsuario(new Usuario("LucreSan", "YT:lucreSantana", Region.MEX));
		unSitio.agregarUsuario(new Usuario("MilosForeman", "ig:@milongaForeman", Region.URU));
		unSitio.agregarUsuario(new Usuario("capitanHowdini", "ig:cp_Howdini - YT: channel_CPhowdini", Region.ARG));
	}

	public static List<Pelicula> generarPelicula() {

		Pelicula p1 = new Pelicula("Oppenheimer", "C. Nolan", Genero.DRAMA);
		Pelicula p2 = new Pelicula("The Exorcist: Believers", "D.G. Green", Genero.TERROR);
		Pelicula p3 = new Pelicula("Duna", "D. Villenueve", Genero.SCI_FI);
		Pelicula p4 = new Pelicula("Fragmentado", "M. N. Shyamalan", Genero.THRILLER);
		return new ArrayList<>(Arrays.asList(new Pelicula[] { p1, p2, p3, p4 }));

	}

	public static void visualizarCriticas(Sitio unSitio) {
		System.out.println("==VISUALIZANDO CRÍTICAS==");
		unSitio.visualizarDatos();
	}

}