package models;

public class DadosEstadoModel {
	private String id;
	private String nome;
	private int casosAcumulado;
	private int obitosAcumulado;
	private String populacaoTCU2019;
	private String incidencia;
	private String incidenciaObito;
	
	
	public DadosEstadoModel(String id, String nome, int casosAcumulado, int obitosAcumulado, String populacaoTCU2019,
			String incidencia, String incidenciaObito) {
		this.id = id;
		this.nome = nome;
		this.casosAcumulado = casosAcumulado;
		this.obitosAcumulado = obitosAcumulado;
		this.populacaoTCU2019 = populacaoTCU2019;
		this.incidencia = incidencia;
		this.incidenciaObito = incidenciaObito;

	}
	
	public String getName() {
		return nome;
	}
	
	public String getId() {
		return id;
	}
	
	public int getCasos() {
		return casosAcumulado;
	}
	
	public int getObitos() {
		return obitosAcumulado;
	}
	
	public int getIncidencia() {
		return Integer.parseInt(incidencia);
	}
	
	public int getIncidenciaObito() {
		return Integer.parseInt(incidenciaObito);
	}
	
	public String getPopulacao() {
		return populacaoTCU2019;
	}
	
}