package models;

public class DadosPaisModel {
	private DadosPaisConfirmadosModel confirmados;
	private DadosPaisObitosModel obitos;
	private String dt_updated;
	private DadosPaisPlanilhaModel planilha;

	public DadosPaisModel(DadosPaisConfirmadosModel confirmados, DadosPaisObitosModel obitos, String dt_updated,
			DadosPaisPlanilhaModel planilha) {
		super();
		this.confirmados = confirmados;
		this.obitos = obitos;
		this.dt_updated = dt_updated;
		this.planilha = planilha;
	}
	
	public int getRecuperados() {
		return Integer.parseInt(confirmados.getRecuperados());
	}
	
	public int getTotal() {
		return Integer.parseInt(confirmados.getTotal());
	}
	
	public int getAcompanhamento() {
		return Integer.parseInt(confirmados.getAcompanhamento());
	}
	
	public String getLetalidade() {
		return obitos.getLetalidade();
	}

}
