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

public class DataVacinacao extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox_idade;
	JTextPane lblPrevisao_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataVacinacao frame = new DataVacinacao();
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInformaesSobreCovid = new JLabel("Informações sobre COVID-19");
		lblInformaesSobreCovid.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformaesSobreCovid.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 15));
		lblInformaesSobreCovid.setBounds(86, 12, 264, 33);
		contentPane.add(lblInformaesSobreCovid);
		
		JLabel lblDataDeNascimento = new JLabel("Idade:");
		lblDataDeNascimento.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		lblDataDeNascimento.setBounds(33, 73, 55, 15);
		contentPane.add(lblDataDeNascimento);
		
		comboBox_idade = new JComboBox();
		comboBox_idade.setToolTipText("Ano");
		comboBox_idade.setModel(new DefaultComboBoxModel(new String[] {"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90"}));
		comboBox_idade.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		comboBox_idade.setBounds(77, 68, 88, 24);
		contentPane.add(comboBox_idade);
		
		JLabel lblPrevisao = new JLabel("Previsão: ");
		lblPrevisao.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		lblPrevisao.setBounds(33, 182, 70, 15);
		contentPane.add(lblPrevisao);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idade = Integer.parseInt(comboBox_idade.getSelectedItem().toString());
				if (idade >= 18 && idade <= 33) {
					lblPrevisao_1.setText("Seu grupo poderá iniciar a vacinação da primeira dose entre 1 e 2 meses.");
				} else if(idade >= 34 && idade <= 40) {
					lblPrevisao_1.setText("Seu grupo poderá iniciar a vacinação da primeira dose em até 30 dias.");
				} else if(idade >= 41 && idade <= 44) {
					lblPrevisao_1.setText("Seu grupo poderá iniciar a vacinação da primeira dose em até 14 dias.");
				} else if (idade >= 45 && idade <= 46) {
					lblPrevisao_1.setText("Seu grupo poderá iniciar a vacinação da primeira dose em até 7 dias.");
				} else {
					lblPrevisao_1.setText("Opa, é provavel que você já pode ser vacinado com a primeira dose!");
				}
			}
		});
		btnCalcular.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		btnCalcular.setBounds(31, 120, 117, 25);
		contentPane.add(btnCalcular);
		
		JTextPane txtpnObsPrevisoCalculada = new JTextPane();
		txtpnObsPrevisoCalculada.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 10));
		txtpnObsPrevisoCalculada.setEditable(false);
		txtpnObsPrevisoCalculada.setText("Obs: Previsão calculada utilizando o site https://quandovouservacinado.com/ que utiliza os dados do Estado de São Paulo para realizar a previsão.");
		txtpnObsPrevisoCalculada.setBounds(12, 227, 417, 31);
		contentPane.add(txtpnObsPrevisoCalculada);
		
		lblPrevisao_1 = new JTextPane();
		lblPrevisao_1.setFont(new Font("Noto Sans CJK HK", Font.PLAIN, 12));
		lblPrevisao_1.setBounds(100, 176, 329, 39);
		contentPane.add(lblPrevisao_1);
	}
}
