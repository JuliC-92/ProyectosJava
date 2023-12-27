package ar.edu.ort.tp1.recuperatorio;

import ar.edu.ort.tp1.recuperatorio.clases.Entrada;
import ar.edu.ort.tp1.recuperatorio.clases.Postre;
import ar.edu.ort.tp1.recuperatorio.clases.Principal;
import ar.edu.ort.tp1.recuperatorio.clases.Restaurante;
import ar.edu.ort.tp1.recuperatorio.clases.TipoDeCocina;
import ar.edu.ort.tp1.recuperatorio.clases.TipoDePlato;
import ar.edu.ort.tp1.recuperatorio.clases.SetDeCubierto;
import ar.edu.ort.tp1.recuperatorio.clases.TamanioDePostre;

public class Recuperatorio {

	private static final String MSG_ERROR = "Error preparando plato: %s\n";

	public static void main(String[] args) {

		Restaurante deliciasGastronomicas = new Restaurante("Delicias Gastronómicas");

		cargarCubiertos(deliciasGastronomicas);

		Object[][] entradas = { { "Entrada César", 10.5f, 0.2f, 2, true, SetDeCubierto.SET_CUCHARA },
				{ "Hummus con pan de pita", 12.0f, 0.15f, 3, false, SetDeCubierto.SET_COMPLETO },
				{ "Tartaletas de espinacas y queso feta", 8.5f, 0.25f, 6, true, SetDeCubierto.SET_LIQUIDO },
				{ "", 15.0f, 0.18f, 1, false, SetDeCubierto.SET_MIXTO },
				{ "Bruschetta de tomate y albahaca", 9.5f, 0.22f, 0, true, SetDeCubierto.SET_LIQUIDO },
				{ "Calamares a la romana", 11.0f, 0.20f, 5, false, SetDeCubierto.SET_CUCHARA } };

		for (Object[] entrada : entradas) {
			pedirEntrada(deliciasGastronomicas, (String) entrada[0], (Float) entrada[1], (Float) entrada[2],
					(Integer) entrada[3], (boolean) entrada[4], (SetDeCubierto) entrada[5]);
		}

		pedirEntradaNula(deliciasGastronomicas, SetDeCubierto.SET_LIQUIDO);
		pedirEntradaNula(deliciasGastronomicas, SetDeCubierto.SET_MIXTO);

		Object[][] principales = {
				{ "Lomo saltado", 10.5f, 0.2f, true, TipoDeCocina.ITALIANA, SetDeCubierto.SET_LIQUIDO },
				{ "Pescado a la parrilla con salsa de limón", 12.0f, 0.15f, false, TipoDeCocina.ASIATICA,
						SetDeCubierto.SET_LIQUIDO },
				{ "Sopa de Vegetales", 8.5f, 0.25f, true, null, SetDeCubierto.SET_LIQUIDO },
				{ "Risotto de champiñones", 15.0f, 0.18f, false, TipoDeCocina.ITALIANA, SetDeCubierto.SET_LIQUIDO },
				{ "", 9.5f, 0.22f, true, TipoDeCocina.ITALIANA, SetDeCubierto.SET_LIQUIDO },
				{ "Tacos con todo", 11.0f, 0.20f, false, TipoDeCocina.MEXICANA, SetDeCubierto.SET_LIQUIDO } };

		for (Object[] principal : principales) {
			pedirPlatoPrincipal(deliciasGastronomicas, (String) principal[0], (Float) principal[1],
					(Float) principal[2], (boolean) principal[3], (TipoDeCocina) principal[4],
					(SetDeCubierto) principal[5]);
		}

		Object[][] postres = { { "Tiramisú", 10.5f, 0.2f, TamanioDePostre.PEQUENO, SetDeCubierto.SET_CUCHARA },
				{ "Mousse de chocolate", 12.0f, 0.15f, TamanioDePostre.GRANDE, SetDeCubierto.SET_MIXTO },
				{ "", 8.5f, 0.25f, TamanioDePostre.MEDIANO, SetDeCubierto.SET_LIQUIDO },
				{ "Cheesecake de fresa", 15.0f, 0.18f, null, SetDeCubierto.SET_LIQUIDO },
				{ "Pastel de manzana", 9.5f, 0.22f, TamanioDePostre.PEQUENO, SetDeCubierto.SET_CUCHARA },
				{ "Helado de vainilla con salsa de caramelo", 11.0f, 0.20f, TamanioDePostre.GRANDE,
						SetDeCubierto.SET_LIQUIDO } };

		for (Object[] postre : postres) {
			pedirPostre(deliciasGastronomicas, (String) postre[0], (Float) postre[1], (Float) postre[2],
					(TamanioDePostre) postre[3], (SetDeCubierto) postre[4]);
		}

		System.out.println("--------------------------------------");
		deliciasGastronomicas.mostrar();
	}

	private static void cargarCubiertos(Restaurante restaurante) {
		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.ENTRADA, SetDeCubierto.SET_CUCHARA, 2);
		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.ENTRADA, SetDeCubierto.SET_LIQUIDO, 1);
		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.ENTRADA, SetDeCubierto.SET_MIXTO, 1);
		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.ENTRADA, SetDeCubierto.SET_COMPLETO, 2);

		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.PRINCIPAL, SetDeCubierto.SET_COMPLETO, 2);
		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.PRINCIPAL, SetDeCubierto.SET_MIXTO, 2);
		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.PRINCIPAL, SetDeCubierto.SET_LIQUIDO, 2);
		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.PRINCIPAL, SetDeCubierto.SET_CUCHARA, 2);

		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.POSTRE, SetDeCubierto.SET_COMPLETO, 4);
		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.POSTRE, SetDeCubierto.SET_MIXTO, 1);
		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.POSTRE, SetDeCubierto.SET_LIQUIDO, 2);
		restaurante.agregarSetDeCubiertosPorTipoDePlato(TipoDePlato.POSTRE, SetDeCubierto.SET_CUCHARA, 2);
	}

	private static void pedirEntradaNula(Restaurante laRestaurante, SetDeCubierto setDeCubierto) {
		// TODO A completar
		try {
			laRestaurante.prepararPlato(null, setDeCubierto);
		} catch (IllegalArgumentException e) {
			System.out.printf(MSG_ERROR, e.getMessage());
		}
	}

	private static void pedirPlatoPrincipal(Restaurante laRestaurante, String nombre, float costoBase,
			float porcentajeGanancia, boolean esVegetariano, TipoDeCocina tipoDeCocina, SetDeCubierto setDeCubierto) {
		// TODO A completar
		try {
			System.out.println(laRestaurante.prepararPlato(
					new Principal(nombre, costoBase, porcentajeGanancia, esVegetariano, tipoDeCocina), setDeCubierto));
		} catch (IllegalArgumentException e) {
			System.out.printf(MSG_ERROR, e.getMessage());
		}
	}

	private static void pedirEntrada(Restaurante laRestaurante, String nombre, float costoBase,
			float porcentajeGanancia, int cantidadPorciones, boolean incluyeSalsas, SetDeCubierto setDeCubierto) {
		// TODO A completar
		try {
			System.out.println(laRestaurante.prepararPlato(
					new Entrada(nombre, costoBase, porcentajeGanancia, cantidadPorciones, incluyeSalsas),
					setDeCubierto));
		} catch (

		IllegalArgumentException e) {
			System.out.printf(MSG_ERROR, e.getMessage());
		}
	}

	private static void pedirPostre(Restaurante laRestaurante, String nombre, float costoBase, float porcentajeGanancia,
			TamanioDePostre tamanioDePostre, SetDeCubierto setDeCubierto) {
		// TODO A completar
		try {
			System.out.println(laRestaurante
					.prepararPlato(new Postre(nombre, costoBase, porcentajeGanancia, tamanioDePostre), setDeCubierto));
		} catch (IllegalArgumentException e) {
			System.out.printf(MSG_ERROR, e.getMessage());
		}
	}

}
