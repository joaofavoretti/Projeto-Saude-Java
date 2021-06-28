import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class DadosEstado extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDadosPorEstado = new JLabel("Dados por estado");
		lblDadosPorEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosPorEstado.setFont(new Font("Noto Sans CJK HK", Font.BOLD, 15));
		lblDadosPorEstado.setBounds(86, 12, 264, 33);
		contentPane.add(lblDadosPorEstado);
		
		JTextPane txtpnLetaliade_2 = new JTextPane();
		txtpnLetaliade_2.setToolTipText("Espírito Santo");
		txtpnLetaliade_2.setEditable(false);
		txtpnLetaliade_2.setBounds(228, 194, 188, 21);
		contentPane.add(txtpnLetaliade_2);
		
		JTextPane txtpnEspritoSanto = new JTextPane();
		txtpnEspritoSanto.setToolTipText("Espírito Santo");
		txtpnEspritoSanto.setText("Espírito Santo");
		txtpnEspritoSanto.setEditable(false);
		txtpnEspritoSanto.setBounds(26, 194, 202, 21);
		contentPane.add(txtpnEspritoSanto);
		
		JTextPane txtpnEmAcompanhamento_2 = new JTextPane();
		txtpnEmAcompanhamento_2.setToolTipText("Minas Gerais");
		txtpnEmAcompanhamento_2.setEditable(false);
		txtpnEmAcompanhamento_2.setBounds(228, 161, 188, 21);
		contentPane.add(txtpnEmAcompanhamento_2);
		
		JTextPane txtpnMinasGerais = new JTextPane();
		txtpnMinasGerais.setToolTipText("Minas Gerais");
		txtpnMinasGerais.setText("Minas Gerais:");
		txtpnMinasGerais.setEditable(false);
		txtpnMinasGerais.setBounds(26, 161, 202, 21);
		contentPane.add(txtpnMinasGerais);
		
		JTextPane txtpnRioDeJaneiro = new JTextPane();
		txtpnRioDeJaneiro.setToolTipText("Rio de Janeiro");
		txtpnRioDeJaneiro.setText("Rio de Janeiro:");
		txtpnRioDeJaneiro.setEditable(false);
		txtpnRioDeJaneiro.setBounds(26, 128, 202, 21);
		contentPane.add(txtpnRioDeJaneiro);
		
		JTextPane txtpnCasosConfirmados_2 = new JTextPane();
		txtpnCasosConfirmados_2.setToolTipText("Rio de Janeiro");
		txtpnCasosConfirmados_2.setEditable(false);
		txtpnCasosConfirmados_2.setBounds(228, 128, 188, 21);
		contentPane.add(txtpnCasosConfirmados_2);
		
		JTextPane txtpnSoPaulo = new JTextPane();
		txtpnSoPaulo.setToolTipText("São Paulo");
		txtpnSoPaulo.setText("São Paulo:");
		txtpnSoPaulo.setEditable(false);
		txtpnSoPaulo.setBounds(26, 97, 202, 21);
		contentPane.add(txtpnSoPaulo);
		
		JTextPane txtpnCasosRecuperados_2 = new JTextPane();
		txtpnCasosRecuperados_2.setToolTipText("São Paulo");
		txtpnCasosRecuperados_2.setEditable(false);
		txtpnCasosRecuperados_2.setBounds(228, 97, 188, 21);
		contentPane.add(txtpnCasosRecuperados_2);
	}
}
