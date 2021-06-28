package main;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JButton btnDataDeVacinao = new JButton("Data de vacinação");
		btnDataDeVacinao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataVacinacao dv = new DataVacinacao();
				dv.setVisible(true);
			}
		});
		btnDataDeVacinao.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		btnDataDeVacinao.setBounds(140, 100, 159, 25);
		contentPane.add(btnDataDeVacinao);
		
		JButton btnDadosPorEstado = new JButton("Dados por estado");
		btnDadosPorEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DadosEstado de = new DadosEstado();
				de.setVisible(true);
			}
		});
		btnDadosPorEstado.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		btnDadosPorEstado.setBounds(140, 140, 159, 25);
		contentPane.add(btnDadosPorEstado);
		
		JButton btnDataDeVacinao_1_1 = new JButton("Dados no país");
		btnDataDeVacinao_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DadosPais dp = new DadosPais();
				dp.setVisible(true);
			}
		});
		btnDataDeVacinao_1_1.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		btnDataDeVacinao_1_1.setBounds(140, 180, 159, 25);
		contentPane.add(btnDataDeVacinao_1_1);
	}
}
