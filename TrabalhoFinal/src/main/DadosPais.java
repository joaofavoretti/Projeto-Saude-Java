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

public class DadosPais extends JPanel {
	
	private JTextPane txtpnCasosRecuperados_2;
	private JTextPane txtpnCasosConfirmados_2;
	private JTextPane txtpnEmAcompanhamento_2;
	private JTextPane txtpnLetaliade_2;
	
	SimpleAttributeSet right = new SimpleAttributeSet();
	
	/**
	 * Testing the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					DadosPais contentPane = new DadosPais();
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
	public DadosPais() {
		this.setBounds(100, 100, 450, 300);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);

		/* Titulo da Pagina */
		JLabel lblDadosNoPas = new JLabel("Dados no país");
		lblDadosNoPas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosNoPas.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 15));
		lblDadosNoPas.setBounds(86, 12, 264, 33);
		this.add(lblDadosNoPas);

		/* Legenda para "Casos Recuperados" */
		JTextPane txtpnCasosRecuperados = new JTextPane();
		txtpnCasosRecuperados.setToolTipText("Casos recuperados");
		txtpnCasosRecuperados.setEditable(false);
		txtpnCasosRecuperados.setText("Casos recuperados:");
		txtpnCasosRecuperados.setBounds(29, 93, 202, 21);
		this.add(txtpnCasosRecuperados);

		/* Numero para "Casos Recuperados" */
		txtpnCasosRecuperados_2 = new JTextPane();
		txtpnCasosRecuperados_2.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 12));
		txtpnCasosRecuperados_2.setToolTipText("Casos recuperados");
		txtpnCasosRecuperados_2.setEditable(false);
		txtpnCasosRecuperados_2.setBounds(231, 93, 188, 21);
		/* Alinha o numero a direita */
		StyledDocument doc_txtpnCasosRecuperados_2 = txtpnCasosRecuperados_2.getStyledDocument();
		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
		doc_txtpnCasosRecuperados_2.setParagraphAttributes(0, doc_txtpnCasosRecuperados_2.getLength(), right, false);
		this.add(txtpnCasosRecuperados_2);

		/* Legenda para "Casos Confirmados" */
		JTextPane txtpnCasosConfirmados = new JTextPane();
		txtpnCasosConfirmados.setToolTipText("Casos confirmados");
		txtpnCasosConfirmados.setText("Casos confirmados:");
		txtpnCasosConfirmados.setEditable(false);
		txtpnCasosConfirmados.setBounds(29, 124, 202, 21);
		this.add(txtpnCasosConfirmados);

		/* Numero para "Casos Confirmados" */
		txtpnCasosConfirmados_2 = new JTextPane();
		txtpnCasosConfirmados_2.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 12));
		txtpnCasosConfirmados_2.setToolTipText("Casos confirmados");
		txtpnCasosConfirmados_2.setEditable(false);
		txtpnCasosConfirmados_2.setBounds(231, 124, 188, 21);
		/* Alinha numero a direita */
		StyledDocument doc_txtpnCasosConfirmados_2 = txtpnCasosConfirmados_2.getStyledDocument();
		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
		doc_txtpnCasosConfirmados_2.setParagraphAttributes(0, doc_txtpnCasosConfirmados_2.getLength(), right, false);
		this.add(txtpnCasosConfirmados_2);

		/* Legenda para "Em acompanhamento" */
		JTextPane txtpnEmAcompanhamento = new JTextPane();
		txtpnEmAcompanhamento.setToolTipText("Em acompanhamento");
		txtpnEmAcompanhamento.setText("Em acompanhamento:");
		txtpnEmAcompanhamento.setEditable(false);
		txtpnEmAcompanhamento.setBounds(29, 157, 202, 21);
		this.add(txtpnEmAcompanhamento);

		/* Numero para "Em acompanhamento" */
		txtpnEmAcompanhamento_2 = new JTextPane();
		txtpnEmAcompanhamento_2.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 12));
		txtpnEmAcompanhamento_2.setToolTipText("Em acompanhamento");
		txtpnEmAcompanhamento_2.setEditable(false);
		txtpnEmAcompanhamento_2.setBounds(231, 157, 188, 21);
		/* Alinha numero a direita */
		StyledDocument doc_txtpnEmAcompanhamento_2 = txtpnEmAcompanhamento_2.getStyledDocument();
		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
		doc_txtpnEmAcompanhamento_2.setParagraphAttributes(0, doc_txtpnEmAcompanhamento_2.getLength(), right, false);
		this.add(txtpnEmAcompanhamento_2);

		/* Legenda para "Letalidade" */
		JTextPane txtpnLetaliade = new JTextPane();
		txtpnLetaliade.setToolTipText("Letalidade");
		txtpnLetaliade.setText("Letalidade:");
		txtpnLetaliade.setEditable(false);
		txtpnLetaliade.setBounds(29, 190, 202, 21);
		this.add(txtpnLetaliade);

		/* Numero para "Letalidade" */
		txtpnLetaliade_2 = new JTextPane();
		txtpnLetaliade_2.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 12));
		txtpnLetaliade_2.setToolTipText("Letalidade");
		txtpnLetaliade_2.setEditable(false);
		txtpnLetaliade_2.setBounds(231, 190, 188, 21);
		/* Alinha numero a direita */
		StyledDocument doc_txtpnLetaliade_2 = txtpnLetaliade_2.getStyledDocument();
		StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
		doc_txtpnLetaliade_2.setParagraphAttributes(0, doc_txtpnLetaliade_2.getLength(), right, false);
		this.add(txtpnLetaliade_2);

		/* Recebe os dados da API */
		this.getInfo();
	}

	/* Permite fazer a requisicao e receber os dados atualizados da API */
	public void getInfo() {
		try {
			DadosPaisModel d = Requests.fetchDadosPaisInfoFromApi();
			
			txtpnCasosRecuperados_2.setText(String.format("%,d", d.getRecuperados()));
			txtpnCasosConfirmados_2.setText(String.format("%,d", d.getTotal()));
			txtpnEmAcompanhamento_2.setText(String.format("%,d", d.getAcompanhamento()));
			txtpnLetaliade_2.setText(d.getLetalidade() + "%");
			
		} catch (RequestException e) {
			System.out.println(e.getMessage());

		} 
	}
}
