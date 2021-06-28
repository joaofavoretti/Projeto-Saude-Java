package models;

public class DadosPaisConfirmadosModel {
	private String total;
	private String titulo;
	private int novos;
	private String incidencia;
	private String recuperados;
	private String acompanhamento;
	private String percent;

	public DadosPaisConfirmadosModel(String total, String titulo, int novos, String incidencia, String recuperados,
			String acompanhamento, String percent) {

		this.total = total;
		this.titulo = titulo;
		this.novos = novos;
		this.incidencia = incidencia;
		this.recuperados = recuperados;
		this.acompanhamento = acompanhamento;
		this.percent = percent;
	}

	public String getTotal() {
		return total;
	}

	public String getRecuperados() {
		return recuperados;
	}

	public String getAcompanhamento() {
		return acompanhamento;
	}

}
