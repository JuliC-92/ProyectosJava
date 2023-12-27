package ar.edu.ort.tp1.examen.clases;
//TODO
public class TareaAuditoria extends TareaVencible {

	private final static String EXTERNA = "Externa";
	private final static String INTERNA = "Interna";
	private boolean externa;
	
	public TareaAuditoria(String descripcion, int diaInicio, int mesInicio, int anioInicio, Prioridad prioridad,
			int diaVto, int mesVto, int anioVto, boolean externa) {
		super(descripcion, diaInicio, mesInicio, anioInicio, prioridad, diaVto, mesVto, anioVto);
		this.externa = externa;
	}

	@Override
	public Tipo getTipo() {
		return Tipo.AUDITORIA;
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.print(" - ");
		System.out.println(externa ? EXTERNA : INTERNA);
	}
	
}
