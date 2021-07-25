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

public class Requests {
	public static DadosPaisModel fetchDadosPaisInfoFromApi() throws RequestException {
		try {
			Gson gson = new Gson();
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://xx9p7hp1p7.execute-api.us-east-1.amazonaws.com/prod/PortalGeralApi"))
					.build();

			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

			DadosPaisModel d = gson.fromJson(response.body(), DadosPaisModel.class);
			
			return d;
		} catch (InterruptedException e) {
			throw new RequestException(e);

		} catch (IOException e) {
			throw new RequestException(e);
		}
	}
	
	/* Permite acessar a API e guardar a resposta de modo adequado */
	public static DadosEstadoModel[] fetchDadosEstadoInfoFromApi() throws RequestException {
		try {
			/* Requisicao */
			Gson gson = new Gson();
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://xx9p7hp1p7.execute-api.us-east-1.amazonaws.com/prod/PortalEstado"))
					.build();

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
