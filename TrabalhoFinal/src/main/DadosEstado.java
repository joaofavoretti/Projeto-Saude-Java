package main;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;

import com.google.gson.Gson;

import models.DadosEstadoModel;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class DadosEstado extends JPanel {

	private JTextPane[] txtNumero;
	private JTextPane[] txtEstado;
	private JScrollPane scroll;
	SimpleAttributeSet right = new SimpleAttributeSet();
	private DadosEstadoModel[] data;

	/**
	 * Testing the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					DadosEstado contentPane = new DadosEstado();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setBounds(100, 100, 450, 300);
					frame.setContentPane(contentPane);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DadosEstado() {
		this.setLayout(null);
		
		JPanel scrollData = new JPanel();
		scrollData.setPreferredSize(new Dimension(435, 27*33+12));
		scrollData.setLayout(null);
			
		txtNumero = new JTextPane[27];
		txtEstado = new JTextPane[27];
		// Recebe os dados atualizados da API
		fetchInfoFromApi();
		
		/* Titulo da pagina */
		JLabel lblDadosPorEstado = new JLabel("Dados por estado               Mostrar: ");
		lblDadosPorEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosPorEstado.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 15));
		lblDadosPorEstado.setBounds(30, 12, 264, 33);
		this.add(lblDadosPorEstado);
		
		/* Caixa com as opcoes de informação */
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Casos", "Obitos", "Novos Casos", "Novos Obitos"}));
		comboBox.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		comboBox.setBounds(300, 12, 110, 33);
		this.add(comboBox);
		
		/* Atualiza os numeros com base na opcao escolhida */
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipo = comboBox.getSelectedItem().toString();
				int valor = 0;
				for(int i = 0; i < 27; i++) {
					if (tipo == "Casos")
						valor = data[i].getCasos();
					else if (tipo == "Obitos")
						valor = data[i].getObitos();
					else if (tipo == "Novos Casos")
						valor = (int) data[i].getIncidencia();
					else if (tipo == "Novos Obitos")
						valor = (int) data[i].getIncidenciaObito();
	
					txtNumero[i].setText(String.format("%,d", valor));
				}
				
				/* Posciona o scroll no comeco */
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
					   public void run() { 
					       scroll.getVerticalScrollBar().setValue(0);
					   }
				});
			}
		});
		
		/* Cria os componentes para mostrar a informação
		   de cada estado */
		for(int i = 0; i < 27; i++) {
			txtEstado[i] = new JTextPane();
			txtNumero[i] = new JTextPane();
			
			/* Configura o componente que mostra a sigla do estado */
			txtEstado[i].setToolTipText(data[i].getName());
			txtEstado[i].setText(data[i].getName() + ":");
			txtEstado[i].setEditable(false);
			txtEstado[i].setBounds(16, i*33+12, 202, 21);
			scrollData.add(txtEstado[i]);
			
			/* Configura o componente que mostra o numero */
			txtNumero[i].setToolTipText(data[i].getName());
			txtNumero[i].setText(String.format("%,d", data[i].getCasos()));
			txtNumero[i].setEditable(false);
			txtNumero[i].setBounds(216, i*33+12, 188, 21);
			
			/* Alinha o numero a direita */
			StyledDocument style = txtNumero[i].getStyledDocument();
			StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
			style.setParagraphAttributes(0, style.getLength(), right, false);
			scrollData.add(txtNumero[i]);
		}
		
		/* Cria e configura o componente do 'scroll' */
		scroll = new JScrollPane(scrollData);
		scroll.setVisible(true);
		scroll.setBounds(0, 60, 435, 205);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.getVerticalScrollBar().setMinimum(0);
		this.add(scroll);
	}
	
	/* Permite acessar a API e guardar a resposta de modo adequado */
	public void fetchInfoFromApi() {
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
			data = gson.fromJson(result, DadosEstadoModel[].class);
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}
}
