package ar.edu.ort.tp1.recFinal.clases;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;

public class Pelicula implements Promediable, Visualizable {

	private static final String TXT_DATOS_CRITICA = "\n>>Película: %s ** Cantidad de críticas: %d ** Nota: %.1f ";
	private static final String TXT_DATOS_VALORACION = "\n**Valoración: POSITIVAS: %d, NEUTRAS: %d, NEGATIVAS: %d";

	// Completar aquí;
	private PilaNodos<Critica> criticas;
	private String titulo;
	private String directores;
	private Genero genero;
	private int[] criticasPorValoracion;

	// Completar aquí CONSTRUCTOR
	public Pelicula(String titulo, String directores, Genero genero) {
		setTitulo(titulo);
		setDirectores(directores);
		setGenero(genero);
		criticas = new PilaNodos<>();
		criticasPorValoracion = new int[Valoracion.values().length];
	}

	private void setGenero(Genero genero) throws IllegalArgumentException {
		if (genero == null) {
			throw new IllegalArgumentException("Genero inválido");
		}
		this.genero = genero;
	}

	private void setDirectores(String directores) throws IllegalArgumentException {
		if (directores == null || directores.equals("")) {
			throw new IllegalArgumentException("Director/es inválido/s");
		}
		this.directores = directores;
	}

	private void setTitulo(String titulo) throws IllegalArgumentException {
		if (titulo == null || titulo.equals("")) {
			throw new IllegalArgumentException("Titulo de pelicula inválido");
		}
		this.titulo = titulo;
	}

	public void agregarCritica(Critica critica) {
		criticas.push(critica);
		if (critica instanceof CriticaProfesional) {
			criticasPorValoracion[((CriticaProfesional) critica).getValoracion().ordinal()]++;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	@Override
	public float obtenerPromedioVotacion() {
		float acumulador = 0f;
		int cont = 0;
		float resultado = 0;
		PilaNodos<Critica> criticasAux = new PilaNodos<>();

		while (!criticas.isEmpty()) {
			Critica critica = criticas.pop();
			if (critica instanceof CriticaDeUsuario) {
				cont++;
				acumulador += ((CriticaDeUsuario) critica).getNota();
			}
			criticasAux.push(critica);
		}

		while (!criticasAux.isEmpty()) {
			criticas.push(criticasAux.pop());
		}
		if (cont > 0) {
			resultado = acumulador / cont;
		}
		return resultado;
	}

	@Override
	public void visualizarDatos() {
		System.out.println(">>PELÍCULA: " + titulo + " - Dir:" + directores + " - " + genero + " – Puntaje: "
				+ obtenerPromedioVotacion());

		System.out.println("==De los usuarios==");
		System.out.println("************");

		PilaNodos<Critica> criticasAux = new PilaNodos<>();

		while (!criticas.isEmpty()) {
			Critica critica = criticas.pop();
			if (critica instanceof CriticaDeUsuario) {
				critica.visualizarDatos();
			}
			criticasAux.push(critica);
		}

		while (!criticasAux.isEmpty()) {
			criticas.push(criticasAux.pop());
		}

		System.out.println("==Profesionales==");
		System.out.println("************");

		while (!criticas.isEmpty()) {
			Critica critica = criticas.pop();
			if (critica instanceof CriticaProfesional) {
				critica.visualizarDatos();
			}
			criticasAux.push(critica);
		}

		while (!criticasAux.isEmpty()) {
			criticas.push(criticasAux.pop());
		}
	}

	public void getEstadisticas() {
		System.out.printf(TXT_DATOS_CRITICA, titulo, getCantCriticas(), obtenerPromedioVotacion());
		System.out.printf(TXT_DATOS_VALORACION, criticasPorValoracion[0], criticasPorValoracion[1], criticasPorValoracion[2]);
	}

	/*
	private int getCriticasPorValoracion(String valoracion) {
		PilaNodos<Critica> criticasAux = new PilaNodos<>();
		int cont = 0;
		while (!criticas.isEmpty()) {
			Critica critica = criticas.pop();
			if (critica instanceof CriticaProfesional) {
				if (((CriticaProfesional) critica).getValoracion().equals(valoracion)) {
					cont++;
				}
			}
			criticasAux.push(critica);
		}

		while (!criticasAux.isEmpty()) {
			criticas.push(criticasAux.pop());
		}

		return cont;
	}
	*/

	private int getCantCriticas() {
		PilaNodos<Critica> criticasAux = new PilaNodos<>();
		int cont = 0;
		while (!criticas.isEmpty()) {
			Critica critica = criticas.pop();
			cont++;
			criticasAux.push(critica);
		}

		while (!criticasAux.isEmpty()) {
			criticas.push(criticasAux.pop());
		}

		return cont;
	}

	public int getCriticasProfesionales() {
		PilaNodos<Critica> criticasAux = new PilaNodos<>();
		int cont = 0;
		while (!criticas.isEmpty()) {
			Critica critica = criticas.pop();
			if (critica instanceof CriticaProfesional) {
				cont++;
			}

			criticasAux.push(critica);
		}

		while (!criticasAux.isEmpty()) {
			criticas.push(criticasAux.pop());
		}

		return cont;
	}
}
