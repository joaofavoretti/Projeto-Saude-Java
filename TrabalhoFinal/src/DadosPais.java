import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class DadosPais extends JFrame {

	private JPanel contentPane;

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

		JTextPane txtpnCasosRecuperados_2 = new JTextPane();
		txtpnCasosRecuperados_2.setToolTipText("Casos recuperados");
		txtpnCasosRecuperados_2.setEditable(false);
		txtpnCasosRecuperados_2.setBounds(231, 93, 188, 21);
		contentPane.add(txtpnCasosRecuperados_2);

		JTextPane txtpnCasosConfirmados = new JTextPane();
		txtpnCasosConfirmados.setToolTipText("Casos confirmados");
		txtpnCasosConfirmados.setText("Casos confirmados:");
		txtpnCasosConfirmados.setEditable(false);
		txtpnCasosConfirmados.setBounds(29, 124, 202, 21);
		contentPane.add(txtpnCasosConfirmados);

		JTextPane txtpnCasosConfirmados_2 = new JTextPane();
		txtpnCasosConfirmados_2.setToolTipText("Casos confirmados");
		txtpnCasosConfirmados_2.setEditable(false);
		txtpnCasosConfirmados_2.setBounds(231, 124, 188, 21);
		contentPane.add(txtpnCasosConfirmados_2);

		JTextPane txtpnEmAcompanhamento = new JTextPane();
		txtpnEmAcompanhamento.setToolTipText("Em acompanhamento");
		txtpnEmAcompanhamento.setText("Em acompanhamento:");
		txtpnEmAcompanhamento.setEditable(false);
		txtpnEmAcompanhamento.setBounds(29, 157, 202, 21);
		contentPane.add(txtpnEmAcompanhamento);

		JTextPane txtpnEmAcompanhamento_2 = new JTextPane();
		txtpnEmAcompanhamento_2.setToolTipText("Em acompanhamento");
		txtpnEmAcompanhamento_2.setEditable(false);
		txtpnEmAcompanhamento_2.setBounds(231, 157, 188, 21);
		contentPane.add(txtpnEmAcompanhamento_2);

		JTextPane txtpnLetaliade = new JTextPane();
		txtpnLetaliade.setToolTipText("Letalidade");
		txtpnLetaliade.setText("Letaliade:");
		txtpnLetaliade.setEditable(false);
		txtpnLetaliade.setBounds(29, 190, 202, 21);
		contentPane.add(txtpnLetaliade);

		JTextPane txtpnLetaliade_2 = new JTextPane();
		txtpnLetaliade_2.setToolTipText("Letalidade");
		txtpnLetaliade_2.setEditable(false);
		txtpnLetaliade_2.setBounds(231, 190, 188, 21);
		contentPane.add(txtpnLetaliade_2);
	}
}
