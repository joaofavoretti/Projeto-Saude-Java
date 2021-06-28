package models;

public class DadosPaisObitosModel {
	private String total;
	private String titulo;
	private int novos;
	private String incidencia;
	private String letalidade;
	private String mortalidade;
	private String percent;

	public DadosPaisObitosModel(String total, String titulo, int novos, String incidencia, String letalidade,
			String mortalidade, String percent) {
		super();
		this.total = total;
		this.titulo = titulo;
		this.novos = novos;
		this.incidencia = incidencia;
		this.letalidade = letalidade;
		this.mortalidade = mortalidade;
		this.percent = percent;
	}

	public String getLetalidade() {
		return letalidade;
	}

}
