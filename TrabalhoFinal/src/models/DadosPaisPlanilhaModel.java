package models;

public class DadosPaisPlanilhaModel {
	private String usuario;
	private String nome;
	private String usuario_id;
	private String status;
	private DadosPaisPlanilhaArquivoModel arquivo;
	private String createdAt;
	private String updatedAt;
	private String objectId;

	public DadosPaisPlanilhaModel(String usuario, String nome, String usuario_id, String status,
			DadosPaisPlanilhaArquivoModel arquivo, String createdAt, String updatedAt, String objectId) {
		super();
		this.usuario = usuario;
		this.nome = nome;
		this.usuario_id = usuario_id;
		this.status = status;
		this.arquivo = arquivo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.objectId = objectId;
	}

}
