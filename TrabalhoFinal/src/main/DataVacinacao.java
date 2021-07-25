package main;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
/**
 * Classe java para exibir o possível período de vacinacao por idade
 */
public class DataVacinacao extends JPanel {

	private JComboBox comboBox_idade;
	JTextPane lblPrevisao_1;
	
	/**
	 * Testing the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					DataVacinacao contentPane = new DataVacinacao();
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
	public DataVacinacao() {
		this.setBounds(100, 100, 450, 300);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		
		/* Titulo da pagina */
		JLabel lblInformaesSobreCovid = new JLabel("Data de Vacinação");
		lblInformaesSobreCovid.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformaesSobreCovid.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 15));
		lblInformaesSobreCovid.setBounds(86, 18, 264, 33);
		this.add(lblInformaesSobreCovid);
		
		/* Legenda da caixa de opcoes */
		JLabel lblDataDeNascimento = new JLabel("Idade:");
		lblDataDeNascimento.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		lblDataDeNascimento.setBounds(48, 80, 55, 15);
		this.add(lblDataDeNascimento);
		
		/* Caixa de opcoes para selecionar a idade */
		comboBox_idade = new JComboBox();
		comboBox_idade.setToolTipText("Ano");
		comboBox_idade.setModel(new DefaultComboBoxModel(new String[] {"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90"}));
		comboBox_idade.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		comboBox_idade.setBounds(92, 75, 88, 24);
		this.add(comboBox_idade);
		
		/* Legenda da previsao */
		JLabel lblPrevisao = new JLabel("Previsão: ");
		lblPrevisao.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		lblPrevisao.setBounds(25, 150, 70, 15);
		this.add(lblPrevisao);
		
		/* Botao 'Calcular' e acao ao pressionar */
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idade = Integer.parseInt(comboBox_idade.getSelectedItem().toString());
				if (idade >= 18 && idade <= 26) {
					lblPrevisao_1.setText("Seu grupo poderá iniciar a vacinação da primeira dose entre 1 e 2 meses.");
				} else if(idade >= 27 && idade <= 32) {
					lblPrevisao_1.setText("Seu grupo poderá iniciar a vacinação da primeira dose em até 30 dias.");
				} else if(idade >= 33 && idade <= 35) {
					lblPrevisao_1.setText("Seu grupo poderá iniciar a vacinação da primeira dose em até 14 dias.");
				} else if (idade >= 36 && idade <= 36) {
					lblPrevisao_1.setText("Seu grupo poderá iniciar a vacinação da primeira dose em até 7 dias.");
				} else {
					lblPrevisao_1.setText("Opa, é provavel que você já pode ser vacinado com a primeira dose!");
				}
			}
		});
		btnCalcular.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		btnCalcular.setBounds(260, 75, 117, 24);
		this.add(btnCalcular);
		
		/* Observacao sobre a previsao */
		JTextPane txtpnObsPrevisoCalculada = new JTextPane();
		txtpnObsPrevisoCalculada.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 10));
		txtpnObsPrevisoCalculada.setEditable(false);
		txtpnObsPrevisoCalculada.setText("Obs: Previsão calculada manualmente utilizando o site https://quandovouservacinado.com/. Atualizado no dia 25/07.");
		txtpnObsPrevisoCalculada.setBounds(12, 227, 417, 31);
		this.add(txtpnObsPrevisoCalculada);
		
		/* Campo para mostrar a previsao */
		lblPrevisao_1 = new JTextPane();
		lblPrevisao_1.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 12));
		lblPrevisao_1.setBounds(95, 144, 300, 39);
		this.add(lblPrevisao_1);
	}
}
