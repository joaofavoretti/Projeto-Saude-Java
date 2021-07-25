package main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

import models.DadosEstadoModel;
import models.DadosPaisModel;
/*
 * Classe utilizada para realizar as requisicoes.
 * Para permitir a abstração nas telas, essa classe é responsavel por criar
 * os métodos e retornar os objetos adequados para as telas utilizarem
 */
public class Requests {
	/* Permite fazer a requisicao dos dados sobre o pais e retornar o objeto da response */
	public static DadosPaisModel fetchDadosPaisInfoFromApi() throws RequestException {
		try {
			/* Cria o objeto gson utilizado para fazer o parse da requisicao */
			Gson gson = new Gson();
			
			/* Cria o client para realizar a requisicao */
			HttpClient client = HttpClient.newHttpClient();
			
			/* Endereco utilizado para adquirir as informações gerais sobre o país. */
			String requestUri = "https://xx9p7hp1p7.execute-api.us-east-1.amazonaws.com/prod/PortalGeralApi";
			
			/* Cria a request da requisicao utilizada */
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(requestUri))
					.build();

			/* Recebimento das informações da requisicao */
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

			/* Objeto d criado depois do parse pelo JSON da requisicao */
			String result = response.body();
			DadosPaisModel d = gson.fromJson(result, DadosPaisModel.class);
			
			return d;
		
			/* Cuidando das possíveis exceções que podem ser criadas durante a requisicao */
		} catch (InterruptedException e) {
			throw new RequestException(e);

		} catch (IOException e) {
			throw new RequestException(e);
		}
	}
	
	/* Permite acessar a API e retornar o resultado obtido */
	public static DadosEstadoModel[] fetchDadosEstadoInfoFromApi() throws RequestException {
		try {
			/* Cria o objeto gson utilizado para fazer o parse da requisicao */
			Gson gson = new Gson();
			
			/* Cria o client para realizar a requisicao */
			HttpClient client = HttpClient.newHttpClient();

			/* Endereco utilizado para adquirir as informações gerais sobre o país. */
			String requestUri = "https://xx9p7hp1p7.execute-api.us-east-1.amazonaws.com/prod/PortalEstado";
			
			/* Cria a request da requisicao utilizada */
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(requestUri))
					.build();
	
			/* Recebimento das informações da requisicao */
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			
			
			/* 'Parse' da lista de objetos retornados pela requisicao 
		 	Os dados são armazenados conforme o modelo 'DadosEstadoModel'*/
			String result = response.body();
			DadosEstadoModel[] d = gson.fromJson(result, DadosEstadoModel[].class);
			
			return d;
			
		} catch (InterruptedException e) {
			throw new RequestException(e);

		} catch (IOException e) {
			throw new RequestException(e);
		}
	}
}
