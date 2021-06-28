package main;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import com.google.gson.Gson;

import models.DadosPaisModel;

import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class DadosPais extends JFrame {

	private JPanel contentPane;
	
	private JTextPane txtpnCasosRecuperados_2;
	private JTextPane txtpnCasosConfirmados_2;
	private JTextPane txtpnEmAcompanhamento_2;
	private JTextPane txtpnLetaliade_2;
	
	SimpleAttributeSet right = new SimpleAttributeSet();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosPais frame = new DadosPais();
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
	public DadosPais() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDadosNoPas = new JLabel("Dados no país");
		lblDadosNoPas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosNoPas.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 15));
		lblDadosNoPas.setBounds(86, 12, 264, 33);
		contentPane.add(lblDadosNoPas);

		JTextPane txtpnCasosRecuperados = new JTextPane();
		txtpnCasosRecuperados.setToolTipText("Casos recuperados");
		txtpnCasosRecuperados.setEditable(false);
		txtpnCasosRecuperados.setText("Casos recuperados:");
		txtpnCasosRecuperados.setBounds(29, 93, 202, 21);
		contentPane.add(txtpnCasosRecuperados);

		txtpnCasosRecuperados_2 = new JTextPane();
		txtpnCasosRecuperados_2.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 12));
		txtpnCasosRecuperados_2.setToolTipText("Casos recuperados");
		txtpnCasosRecuperados_2.setEditable(false);
		txtpnCasosRecuperados_2.setBounds(231, 93, 188, 21);
		/* Align right */
		StyledDocument doc_txtpnCasosRecuperados_2 = txtpnCasosRecuperados_2.getStyledDocument();
		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
		doc_txtpnCasosRecuperados_2.setParagraphAttributes(0, doc_txtpnCasosRecuperados_2.getLength(), right, false);
		contentPane.add(txtpnCasosRecuperados_2);

		JTextPane txtpnCasosConfirmados = new JTextPane();
		txtpnCasosConfirmados.setToolTipText("Casos confirmados");
		txtpnCasosConfirmados.setText("Casos confirmados:");
		txtpnCasosConfirmados.setEditable(false);
		txtpnCasosConfirmados.setBounds(29, 124, 202, 21);
		contentPane.add(txtpnCasosConfirmados);

		txtpnCasosConfirmados_2 = new JTextPane();
		txtpnCasosConfirmados_2.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 12));
		txtpnCasosConfirmados_2.setToolTipText("Casos confirmados");
		txtpnCasosConfirmados_2.setEditable(false);
		txtpnCasosConfirmados_2.setBounds(231, 124, 188, 21);
		/* Align right */
		StyledDocument doc_txtpnCasosConfirmados_2 = txtpnCasosConfirmados_2.getStyledDocument();
		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
		doc_txtpnCasosConfirmados_2.setParagraphAttributes(0, doc_txtpnCasosConfirmados_2.getLength(), right, false);
		contentPane.add(txtpnCasosConfirmados_2);

		JTextPane txtpnEmAcompanhamento = new JTextPane();
		txtpnEmAcompanhamento.setToolTipText("Em acompanhamento");
		txtpnEmAcompanhamento.setText("Em acompanhamento:");
		txtpnEmAcompanhamento.setEditable(false);
		txtpnEmAcompanhamento.setBounds(29, 157, 202, 21);
		contentPane.add(txtpnEmAcompanhamento);

		txtpnEmAcompanhamento_2 = new JTextPane();
		txtpnEmAcompanhamento_2.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 12));
		txtpnEmAcompanhamento_2.setToolTipText("Em acompanhamento");
		txtpnEmAcompanhamento_2.setEditable(false);
		txtpnEmAcompanhamento_2.setBounds(231, 157, 188, 21);
		/* Align right */
		StyledDocument doc_txtpnEmAcompanhamento_2 = txtpnEmAcompanhamento_2.getStyledDocument();
		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
		doc_txtpnEmAcompanhamento_2.setParagraphAttributes(0, doc_txtpnEmAcompanhamento_2.getLength(), right, false);
		contentPane.add(txtpnEmAcompanhamento_2);

		JTextPane txtpnLetaliade = new JTextPane();
		txtpnLetaliade.setToolTipText("Letalidade");
		txtpnLetaliade.setText("Letalidade:");
		txtpnLetaliade.setEditable(false);
		txtpnLetaliade.setBounds(29, 190, 202, 21);
		contentPane.add(txtpnLetaliade);

		txtpnLetaliade_2 = new JTextPane();
		txtpnLetaliade_2.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 12));
		txtpnLetaliade_2.setToolTipText("Letalidade");
		txtpnLetaliade_2.setEditable(false);
		txtpnLetaliade_2.setBounds(231, 190, 188, 21);
		/* Align right */
		StyledDocument doc_txtpnLetaliade_2 = txtpnLetaliade_2.getStyledDocument();
		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
		doc_txtpnLetaliade_2.setParagraphAttributes(0, doc_txtpnLetaliade_2.getLength(), right, false);
		contentPane.add(txtpnLetaliade_2);

		fetchInfoFromApi();
	}

	public void fetchInfoFromApi() {
		try {
			Gson gson = new Gson();
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://xx9p7hp1p7.execute-api.us-east-1.amazonaws.com/prod/PortalGeralApi"))
					.build();

			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

			// LOG response body
			// System.out.println(response.body());

			DadosPaisModel d = gson.fromJson(response.body(), DadosPaisModel.class);
			
			txtpnCasosRecuperados_2.setText(String.format("%,d", d.getRecuperados()));
			txtpnCasosConfirmados_2.setText(String.format("%,d", d.getTotal()));
			txtpnEmAcompanhamento_2.setText(String.format("%,d", d.getAcompanhamento()));
			txtpnLetaliade_2.setText(d.getLetalidade() + "%");
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}
}
