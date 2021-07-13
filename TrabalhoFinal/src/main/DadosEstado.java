package main;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
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

public class DadosEstado extends JFrame {

	private JPanel contentPane;
	private JTextPane txtpnCasosConfirmados_0;
	private JTextPane txtpnCasosConfirmados_6;
	private JTextPane txtpnCasosConfirmados_1;
	private JTextPane txtpnCasosConfirmados_11;
	private JTextPane txtpnCasosConfirmados_3;
	private JTextPane txtpnCasosConfirmados_5;
	private JTextPane txtpnCasosConfirmados_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosEstado frame = new DadosEstado();
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDadosPorEstado = new JLabel("Dados por estado");
		lblDadosPorEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosPorEstado.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 15));
		lblDadosPorEstado.setBounds(86, 12, 264, 33);
		contentPane.add(lblDadosPorEstado);
		
		JTextPane txtpnEspritoSanto = new JTextPane();
		txtpnEspritoSanto.setToolTipText("Espírito Santo");
		txtpnEspritoSanto.setText("Espírito Santo:");
		txtpnEspritoSanto.setEditable(false);
		txtpnEspritoSanto.setBounds(26, 161, 202, 21);
		contentPane.add(txtpnEspritoSanto);
		
		JTextPane txtpnMinasGerais = new JTextPane();
		txtpnMinasGerais.setToolTipText("Minas Gerais");
		txtpnMinasGerais.setText("Minas Gerais:");
		txtpnMinasGerais.setEditable(false);
		txtpnMinasGerais.setBounds(26, 128, 202, 21);
		contentPane.add(txtpnMinasGerais);
		
		JTextPane txtpnRioDeJaneiro = new JTextPane();
		txtpnRioDeJaneiro.setToolTipText("Rio de Janeiro");
		txtpnRioDeJaneiro.setText("Rio de Janeiro:");
		txtpnRioDeJaneiro.setEditable(false);
		txtpnRioDeJaneiro.setBounds(26, 97, 202, 21);
		contentPane.add(txtpnRioDeJaneiro);
		
		JTextPane txtpnCasosConfirmados_0 = new JTextPane();
		txtpnCasosConfirmados_0.setToolTipText("São Paulo");
		txtpnCasosConfirmados_0.setEditable(false);
		txtpnCasosConfirmados_0.setBounds(226, 64, 188, 21);
		contentPane.add(txtpnCasosConfirmados_0);
		
		JTextPane txtpnSoPaulo = new JTextPane();
		txtpnSoPaulo.setToolTipText("São Paulo");
		txtpnSoPaulo.setText("São Paulo:");
		txtpnSoPaulo.setEditable(false);
		txtpnSoPaulo.setBounds(26, 64, 202, 21);
		contentPane.add(txtpnSoPaulo);
		
		JTextPane txtpnRioGrandeDoSul = new JTextPane();
		txtpnRioGrandeDoSul.setToolTipText("Rio Grande do Sul");
		txtpnRioGrandeDoSul.setText("Rio Grande do Sul:");
		txtpnRioGrandeDoSul.setEditable(false);
		txtpnRioGrandeDoSul.setBounds(26, 194, 202, 21);
		contentPane.add(txtpnRioGrandeDoSul);
		
		JTextPane txtpnSantaCatarina = new JTextPane();
		txtpnSantaCatarina.setToolTipText("Santa Catarina");
		txtpnSantaCatarina.setText("Santa Catarina:");
		txtpnSantaCatarina.setEditable(false);
		txtpnSantaCatarina.setBounds(26, 227, 202, 21);
		contentPane.add(txtpnSantaCatarina);
		
		JTextPane txtpnParana = new JTextPane();
		txtpnParana.setToolTipText("Paraná");
		txtpnParana.setText("Paraná:");
		txtpnParana.setEditable(false);
		txtpnParana.setBounds(26, 260, 202, 21);
		contentPane.add(txtpnParana);
		
		JTextPane txtpnCasosConfirmados_6 = new JTextPane();
		txtpnCasosConfirmados_6.setToolTipText("Rio de Janeiro");
		txtpnCasosConfirmados_6.setEditable(false);
		txtpnCasosConfirmados_6.setBounds(226, 97, 188, 21);
		contentPane.add(txtpnCasosConfirmados_6);
		
		JTextPane txtpnCasosConfirmados_1 = new JTextPane();
		txtpnCasosConfirmados_1.setToolTipText("Minas Gerais");
		txtpnCasosConfirmados_1.setEditable(false);
		txtpnCasosConfirmados_1.setBounds(226, 128, 188, 21);
		contentPane.add(txtpnCasosConfirmados_1);
		
		JTextPane txtpnCasosConfirmados_11 = new JTextPane();
		txtpnCasosConfirmados_11.setToolTipText("Espírito Santo");
		txtpnCasosConfirmados_11.setEditable(false);
		txtpnCasosConfirmados_11.setBounds(226, 161, 188, 21);
		contentPane.add(txtpnCasosConfirmados_11);
		
		JTextPane txtpnCasosConfirmados_3 = new JTextPane();
		txtpnCasosConfirmados_3.setToolTipText("Rio Grande do Sul");
		txtpnCasosConfirmados_3.setEditable(false);
		txtpnCasosConfirmados_3.setBounds(226, 194, 188, 21);
		contentPane.add(txtpnCasosConfirmados_3);
		
		JTextPane txtpnCasosConfirmados_5 = new JTextPane();
		txtpnCasosConfirmados_5.setToolTipText("Santa Catarina");
		txtpnCasosConfirmados_5.setEditable(false);
		txtpnCasosConfirmados_5.setBounds(226, 227, 188, 21);
		contentPane.add(txtpnCasosConfirmados_5);
		
		JTextPane txtpnCasosConfirmados_2 = new JTextPane();
		txtpnCasosConfirmados_2.setToolTipText("Paraná");
		txtpnCasosConfirmados_2.setEditable(false);
		txtpnCasosConfirmados_2.setBounds(226, 260, 188, 21);
		contentPane.add(txtpnCasosConfirmados_2);
		
		fetchInfoFromApi();
	}
	
	public void fetchInfoFromApi() {
		try {
			Gson gson = new Gson();
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://xx9p7hp1p7.execute-api.us-east-1.amazonaws.com/prod/PortalEstado"))
					.build();

			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

			// LOG response body
			// System.out.println(response.body());
			
			DadosEstadoModel[] d; 
			for (int i = 0; i < 26; i++) {
				d[i] = gson.fromJson(response.body(), DadosEstadoModel.class);
			}
			txtpnCasosConfirmados_0.setText(String.format("%,d", d[0].getCasos()));
			txtpnCasosConfirmados_6.setText(String.format("%,d", d[6].getCasos()));
			txtpnCasosConfirmados_1.setText(String.format("%,d", d[1].getCasos()));
			txtpnCasosConfirmados_11.setText(String.format("%,d", d[11].getCasos()));
			txtpnCasosConfirmados_3.setText(String.format("%,d", d[3].getCasos()));
			txtpnCasosConfirmados_5.setText(String.format("%,d", d[5].getCasos()));
			txtpnCasosConfirmados_2.setText(String.format("%,d", d[2].getCasos()));
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}
}
