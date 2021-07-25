package main;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setResizable(false); 
		
		/* Frames da aplicacao */
		JPanel dataVacinacao = new DataVacinacao();
		JPanel dadosPais = new DadosPais();
		JPanel dadosEstados = new DadosEstado();
		
		/* Titulo da pagina */
		JLabel lblInformaesSobreCovid = new JLabel("Informações sobre COVID-19");
		lblInformaesSobreCovid.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformaesSobreCovid.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 15));
		lblInformaesSobreCovid.setBounds(86, 12, 264, 33);
		contentPane.add(lblInformaesSobreCovid);

		/* Botao para consultar a data de vacinacao */
		JButton btnDataDeVacinao = new JButton("Data de vacinação");
		btnDataDeVacinao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(dataVacinacao);
				revalidate();
			}
		});
		btnDataDeVacinao.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		btnDataDeVacinao.setBounds(140, 100, 159, 25);
		contentPane.add(btnDataDeVacinao);
		
		/* Botao para consultar os dados por estado */
		JButton btnDadosPorEstado = new JButton("Dados por estado");
		btnDadosPorEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(dadosEstados);
				revalidate();
			}
		});
		btnDadosPorEstado.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		btnDadosPorEstado.setBounds(140, 140, 159, 25);
		contentPane.add(btnDadosPorEstado);
		
		/* Botao para consultar os dados do pais */
		JButton btnDataDeVacinao_1_1 = new JButton("Dados no país");
		btnDataDeVacinao_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(dadosPais);
				revalidate();
			}
		});
		btnDataDeVacinao_1_1.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 12));
		btnDataDeVacinao_1_1.setBounds(140, 180, 159, 25);
		contentPane.add(btnDataDeVacinao_1_1);
		
		/* Muda confifuracao ao fechar uma janela */
		 addWindowListener(new WindowAdapter()
	     {
	            @Override
	            public void windowClosing(WindowEvent e)
	            {
	            	if(getContentPane() == contentPane) {
	            		setDefaultCloseOperation(EXIT_ON_CLOSE);
	            	} else {
	            		setContentPane(contentPane);
	            		setDefaultCloseOperation(0);
	            	}
	            }
	     });
	}
}
