package br.com.clinica.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.clinica.dao.AgendaDAO;
import br.com.clinica.dao.PacienteDAO;
import br.com.clinica.dao.ReceitaDAO;
import br.com.clinica.model.Agenda;
import br.com.clinica.model.Paciente;
import br.com.clinica.model.Receita;

public class Clinica extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtConvenio;
	private JTextField txtMatricula3;
	private JTextField txtMedicamento3;
	private JTextField txtPrescricao3;

	private PacienteDAO pacientedao;
	protected TextComponent txtMunicipio;
	private JTextField txtNascimento;
	protected TextComponent txtRg;
	protected TextComponent txtCpf;
	protected TextComponent txtCelular1;
	private JComboBox cmbUf;
	private JComboBox cmbSexo;
	private JTextField txtMatricula1;
	private JTextField txtRg1;
	private JTextField txtCpf1;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtMunicipio1;
	private JTextField txtCep;
	private JTextField txtCelular;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_12;
	private JTextField txtNome80;
	private JComboBox cmbA13;
	private JLabel lblNewLabel_15;
	private JTextField txtNome13;
	private JLabel lblNewLabel_14;
	private JTextField txtNome133;
	private JComboBox cmbA133;
	private JLabel lblNewLabel_16;
	private JTextField txtNome14;
	private JComboBox cmbA14;
	private JLabel lblNewLabel_17;
	private JTextField txtNome143;
	private JComboBox cmbA143;
	private JLabel lblNewLabel_18;
	private JTextField txtNome15;
	private JComboBox cmbA15;
	private JLabel lblNewLabel_19;
	private JTextField txtNome153;
	private JComboBox cmbA153;
	private JLabel lblNewLabel_20;
	private JTextField txtNome16;
	private JComboBox cmbA16;
	private JLabel lblNewLabel_21;
	private JTextField txtNome163;
	private JComboBox cmbA163;
	private JLabel lblNewLabel_22;
	private JTextField txtNome17;
	private JComboBox cmbA17;
	private JLabel lblNewLabel_23;
	private JTextField txtNome173;
	private JComboBox cmbA173;
	private JLabel lblNewLabel_24;
	private JTextField txtNome18;
	private JComboBox cmbA18;
	private JTextField txtNome83;
	private JTextField txtNome90;
	private JTextField txtNome93;
	private JTextField txtNome10;
	private JTextField txtNome103;
	private JTextField txtNome11;
	private JTextField txtNome113;
	private JTextField txtNome12;
	private JComboBox cmbA113;
	private JComboBox cmbA11;
	private JComboBox cmbA103;
	private JComboBox cmbA10;
	private JComboBox cmbA83;
	private JButton btnLimpar1_1;
	private JButton btnSalvar1_1;
	private JButton btnAlterar1_1;
	private JComboBox cmbA12;
	private JComboBox cmbA80;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_3;
	private JButton btnConsultar1_1;
	private JLabel lblNewLabel_8;
	private JTextField txtData;
	protected AgendaDAO agendadao;
	private JComboBox cmbA90;
	private JComboBox cmbA93;
	protected ReceitaDAO receitaDao;
	private JTextField txtNome03;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clinica frame = new Clinica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ParseException
	 */
	public Clinica() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 598, 21);
		contentPane.add(menuBar);

		JMenu mnNewMenu = new JMenu("Dados Pessoais");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ******************************************************
				System.exit(0);
				// ******************************************************
			}
		});
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Buscar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ==================== Listar TOPO ==================================
				try {
					// conexao
					pacientedao = new PacienteDAO();

					PacienteDAO mostrar = new PacienteDAO();
					mostrar.consultar(txtMatricula1.getText());

					txtNome.setText(mostrar.paciente.getNOME());
					txtNascimento.setText(mostrar.paciente.getNASCIMENTO());
					cmbSexo.setSelectedItem(mostrar.paciente.getSEXO());
					txtConvenio.setText(mostrar.paciente.getCONVENIO());
					txtRg1.setText(mostrar.paciente.getRG());
					txtCpf1.setText(mostrar.paciente.getCPF());
					txtEmail.setText(mostrar.paciente.getEMAIL());
					txtEndereco.setText(mostrar.paciente.getENDERECO());
					txtBairro.setText(mostrar.paciente.getBAIRRO());
					txtMunicipio1.setText(mostrar.paciente.getMUNICIPIO());
					cmbUf.setSelectedItem(mostrar.paciente.getUF());
					txtCep.setText(mostrar.paciente.getCEP());
					txtCelular.setText(mostrar.paciente.getCELULAR());

					JOptionPane.showMessageDialog(null, "Listado com Sucesso !");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao Listar!!");
				}

			}
			// ===========================================================

		});
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu.add(mntmNewMenuItem_2);

		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);

		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// ******************************************************
				System.exit(0);
				//
			}
		});
		mntmNewMenuItem
				.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.ALT_MASK));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu.add(mntmNewMenuItem);

		mnNewMenu_2 = new JMenu("Agenda");
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_2);

		mntmNewMenuItem_3 = new JMenuItem("Limpar\r\n");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ====================== LIMPAR TOPO =======================================

				txtNome80.setText("");
				txtNome83.setText("");
				txtNome90.setText("");
				txtNome93.setText("");
				txtNome10.setText("");
				txtNome103.setText("");
				txtNome11.setText("");
				txtNome113.setText("");
				txtNome12.setText("");
				txtNome13.setText("");
				txtNome133.setText("");
				txtNome14.setText("");
				txtNome143.setText("");
				txtNome15.setText("");
				txtNome153.setText("");
				txtNome16.setText("");
				txtNome163.setText("");
				txtNome17.setText("");
				txtNome173.setText("");
				txtNome18.setText("");

				cmbA80.setSelectedItem(null);
				cmbA83.setSelectedItem(null);
				cmbA90.setSelectedItem(null);
				cmbA93.setSelectedItem(null);
				cmbA10.setSelectedItem(null);
				cmbA103.setSelectedItem(null);
				cmbA11.setSelectedItem(null);
				cmbA113.setSelectedItem(null);
				cmbA12.setSelectedItem(null);
				cmbA13.setSelectedItem(null);
				cmbA133.setSelectedItem(null);
				cmbA14.setSelectedItem(null);
				cmbA143.setSelectedItem(null);
				cmbA15.setSelectedItem(null);
				cmbA153.setSelectedItem(null);
				cmbA16.setSelectedItem(null);
				cmbA163.setSelectedItem(null);
				cmbA17.setSelectedItem(null);
				cmbA173.setSelectedItem(null);
				cmbA18.setSelectedItem(null);

				// ====================================================================
			}
		});
		mntmNewMenuItem_3
				.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_2.add(mntmNewMenuItem_3);

		JMenu mnNewMenu_1 = new JMenu("Ajuda");
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sobre");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// *****************************************
				JOptionPane.showMessageDialog(null, "Sistema desenvolvido para clínica odontológica.");
				// ****************************************
			}
		});
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_MASK));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNewMenu_1.add(mntmNewMenuItem_1);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 63, 584, 396);
		contentPane.add(tabbedPane);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel label = new JLabel("Matr\u00EDcula");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(71, 25, 98, 20);
		panel_2.add(label);

		JLabel label_1 = new JLabel("Nome");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(161, 25, 70, 20);
		panel_2.add(label_1);

		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(161, 43, 349, 20);
		panel_2.add(txtNome);

		JLabel label_2 = new JLabel("Nascimento");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(71, 74, 86, 20);
		panel_2.add(label_2);

		JLabel label_3 = new JLabel("Sexo");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(161, 74, 86, 20);
		panel_2.add(label_3);

		JLabel label_4 = new JLabel("Convenio");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(257, 74, 86, 20);
		panel_2.add(label_4);

		txtConvenio = new JFormattedTextField(new MaskFormatter("########"));
		txtConvenio.setColumns(10);
		txtConvenio.setBounds(257, 92, 115, 20);
		panel_2.add(txtConvenio);

		JLabel label_5 = new JLabel("RG");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(382, 74, 128, 20);
		panel_2.add(label_5);

		JLabel label_6 = new JLabel("CPF");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(71, 123, 46, 20);
		panel_2.add(label_6);

		JLabel label_7 = new JLabel("E-mail");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(189, 123, 55, 20);
		panel_2.add(label_7);

		JLabel label_8 = new JLabel("Endere\u00E7o");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(71, 172, 86, 20);
		panel_2.add(label_8);

		JLabel label_9 = new JLabel("Bairro");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(382, 172, 98, 20);
		panel_2.add(label_9);

		JLabel label_10 = new JLabel("Municipio");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(71, 226, 57, 20);
		panel_2.add(label_10);

		JLabel label_11 = new JLabel("UF");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_11.setBounds(189, 226, 31, 20);
		panel_2.add(label_11);

		JLabel label_12 = new JLabel("CEP");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_12.setBounds(257, 226, 98, 20);
		panel_2.add(label_12);

		JLabel label_13 = new JLabel("Celular");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_13.setBounds(382, 226, 46, 20);
		panel_2.add(label_13);

		JButton btnSalvar1 = new JButton("");
		btnSalvar1.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeSalvar.png"));
		btnSalvar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// =============================== Salvar ======================================
				try {

					Paciente paciente = new Paciente();
					paciente.setMATRICULA(Integer.parseInt(txtMatricula1.getText()));
					paciente.setNOME(txtNome.getText());
					paciente.setNASCIMENTO(txtNascimento.getText());
					paciente.setSEXO((String) cmbSexo.getSelectedItem());
					paciente.setCONVENIO(txtConvenio.getText());
					paciente.setRG(txtRg1.getText());
					paciente.setCPF(txtCpf1.getText());
					paciente.setEMAIL(txtEmail.getText());
					paciente.setENDERECO(txtEndereco.getText());
					paciente.setBAIRRO(txtBairro.getText());
					paciente.setMUNICIPIO(txtMunicipio1.getText());
					paciente.setUF((String) cmbUf.getSelectedItem());
					paciente.setCEP(txtCep.getText());
					paciente.setCELULAR(txtCelular.getText());

					pacientedao = new PacienteDAO();
					pacientedao.salvar(paciente);
					JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro ao Salvar!!" + e.getMessage());

				}

				// ===================================================================================
			}
		});
		btnSalvar1.setBounds(173, 290, 36, 36);
		panel_2.add(btnSalvar1);

		JButton btnConsultar1 = new JButton("");
		btnConsultar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ============================ Listar ==================================
				try {
					// conexao
					pacientedao = new PacienteDAO();

					PacienteDAO mostrar = new PacienteDAO();
					mostrar.consultar(txtMatricula1.getText());

					txtNome.setText(mostrar.paciente.getNOME());
					txtNascimento.setText(mostrar.paciente.getNASCIMENTO());
					cmbSexo.setSelectedItem(mostrar.paciente.getSEXO());
					txtConvenio.setText(mostrar.paciente.getCONVENIO());
					txtRg1.setText(mostrar.paciente.getRG());
					txtCpf1.setText(mostrar.paciente.getCPF());
					txtEmail.setText(mostrar.paciente.getEMAIL());
					txtEndereco.setText(mostrar.paciente.getENDERECO());
					txtBairro.setText(mostrar.paciente.getBAIRRO());
					txtMunicipio1.setText(mostrar.paciente.getMUNICIPIO());
					cmbUf.setSelectedItem(mostrar.paciente.getUF());
					txtCep.setText(mostrar.paciente.getCEP());
					txtCelular.setText(mostrar.paciente.getCELULAR());

					JOptionPane.showMessageDialog(null, "Listado com Sucesso !");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao Listar!!");
				}

			}
			// ===========================================================
		});
		btnConsultar1
				.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeConsultar.png"));
		btnConsultar1.setBounds(217, 290, 36, 36);
		panel_2.add(btnConsultar1);

		JButton btnAlterar1 = new JButton("");
		btnAlterar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ========================= ATUALIZAR ==================================

				try {
					// objetos para pegar dados da tela
					Paciente paciente = new Paciente();

					paciente.setNOME(txtNome.getText());
					paciente.setNASCIMENTO(txtNascimento.getText());
					paciente.setSEXO((String) cmbSexo.getSelectedItem());
					paciente.setCONVENIO(txtConvenio.getText());
					paciente.setRG(txtRg1.getText());
					paciente.setCPF(txtCpf1.getText());
					paciente.setEMAIL(txtEmail.getText());
					paciente.setENDERECO(txtEndereco.getText());
					paciente.setBAIRRO(txtBairro.getText());
					paciente.setMUNICIPIO(txtMunicipio1.getText());
					paciente.setUF((String) cmbUf.getSelectedItem());
					paciente.setCEP(txtCep.getText());
					paciente.setCELULAR(txtCelular.getText());
					paciente.setMATRICULA(Integer.parseInt(txtMatricula1.getText()));

					// conexao
					pacientedao = new PacienteDAO();

					// alterar
					pacientedao.alterar(paciente);
					JOptionPane.showMessageDialog(null, "Alterado com Sucesso !");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao Alterar!!" + e1.getMessage());
				}

				// ======================================================================
			}
		});
		btnAlterar1.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeAlterar.png"));
		btnAlterar1.setBounds(257, 290, 36, 36);
		panel_2.add(btnAlterar1);

		JButton btnExcluir1 = new JButton("");
		btnExcluir1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ====================== EXCLUIR =======================================

				try {
					// conexao
					pacientedao = new PacienteDAO();

					// excluir
					int excluir = Integer.parseInt(txtMatricula1.getText());
					pacientedao.excluir(excluir);
					JOptionPane.showMessageDialog(null, "Excluido com sucesso !");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao excluir" + e1.getMessage());

				}

				// ======================================================================
			}
		});
		btnExcluir1.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeExcluir.png"));
		btnExcluir1.setBounds(297, 290, 36, 36);
		panel_2.add(btnExcluir1);

		JButton btnLimpar1 = new JButton("");
		btnLimpar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ====================== LIMPAR =======================================

				txtMatricula1.setText("");
				txtNome.setText("");
				txtNascimento.setText("");
				cmbSexo.setSelectedItem(null);
				txtConvenio.setText("");
				txtRg1.setText("");
				txtCpf1.setText("");
				txtEmail.setText("");
				txtEndereco.setText("");
				txtBairro.setText("");
				txtMunicipio1.setText("");
				cmbUf.setSelectedItem(null);
				txtCep.setText("");
				txtCelular.setText("");

				// ====================================================================
			}
		});
		btnLimpar1.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeLimpar.png"));
		btnLimpar1.setBounds(336, 290, 36, 36);
		panel_2.add(btnLimpar1);

		txtNascimento = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtNascimento.setColumns(10);
		txtNascimento.setBounds(71, 92, 77, 20);
		panel_2.add(txtNascimento);

		cmbUf = new JComboBox();
		cmbUf.setModel(new DefaultComboBoxModel(
				new String[] { "UF", "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL",
						"SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF" }));
		cmbUf.setBounds(189, 250, 48, 20);
		panel_2.add(cmbUf);

		cmbSexo = new JComboBox();
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] { "", "Masculino", "Feminino" }));
		cmbSexo.setBounds(161, 92, 86, 20);
		panel_2.add(cmbSexo);

		txtMatricula1 = new JTextField();
		txtMatricula1.setColumns(10);
		txtMatricula1.setBounds(71, 43, 78, 20);
		panel_2.add(txtMatricula1);

		txtRg1 = new JFormattedTextField(new MaskFormatter("##.###.###-#"));
		txtRg1.setBounds(382, 92, 128, 20);
		panel_2.add(txtRg1);
		txtRg1.setColumns(10);

		txtCpf1 = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		txtCpf1.setBounds(71, 141, 98, 20);
		panel_2.add(txtCpf1);
		txtCpf1.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(189, 141, 321, 20);
		panel_2.add(txtEmail);
		txtEmail.setColumns(10);

		txtEndereco = new JTextField();
		txtEndereco.setBounds(71, 195, 301, 20);
		panel_2.add(txtEndereco);
		txtEndereco.setColumns(10);

		txtBairro = new JTextField();
		txtBairro.setBounds(382, 195, 128, 20);
		panel_2.add(txtBairro);
		txtBairro.setColumns(10);

		txtMunicipio1 = new JTextField();
		txtMunicipio1.setBounds(71, 250, 98, 20);
		panel_2.add(txtMunicipio1);
		txtMunicipio1.setColumns(10);

		txtCep = new JFormattedTextField(new MaskFormatter("#####-###"));
		txtCep.setBounds(257, 250, 115, 20);
		panel_2.add(txtCep);
		txtCep.setColumns(10);

		txtCelular = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
		txtCelular.setBounds(382, 250, 128, 20);
		panel_2.add(txtCelular);
		txtCelular.setColumns(10);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Agenda", null, panel, null);
		panel.setLayout(null);

		lblNewLabel = new JLabel("08:00");
		lblNewLabel.setBounds(10, 70, 46, 14);
		panel.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("08:30");
		lblNewLabel_1.setBounds(10, 95, 46, 14);
		panel.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("09:00");
		lblNewLabel_2.setBounds(10, 120, 46, 14);
		panel.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("09:30");
		lblNewLabel_3.setBounds(10, 145, 46, 14);
		panel.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("10:00");
		lblNewLabel_4.setBounds(10, 170, 46, 14);
		panel.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("10:30");
		lblNewLabel_5.setBounds(10, 195, 46, 14);
		panel.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("11:00");
		lblNewLabel_6.setBounds(10, 220, 46, 14);
		panel.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("11:30");
		lblNewLabel_7.setBounds(10, 245, 46, 14);
		panel.add(lblNewLabel_7);

		lblNewLabel_12 = new JLabel("12:00");
		lblNewLabel_12.setBounds(10, 270, 46, 14);
		panel.add(lblNewLabel_12);

		txtNome80 = new JTextField();
		txtNome80.setBounds(45, 64, 122, 20);
		panel.add(txtNome80);
		txtNome80.setColumns(10);

		cmbA13 = new JComboBox();
		cmbA13.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA13.setBounds(177, 289, 106, 20);
		panel.add(cmbA13);

		lblNewLabel_15 = new JLabel("13:00");
		lblNewLabel_15.setBounds(10, 295, 46, 14);
		panel.add(lblNewLabel_15);

		txtNome13 = new JTextField();
		txtNome13.setColumns(10);
		txtNome13.setBounds(45, 289, 122, 20);
		panel.add(txtNome13);

		lblNewLabel_14 = new JLabel("13:30");
		lblNewLabel_14.setBounds(293, 70, 46, 14);
		panel.add(lblNewLabel_14);

		txtNome133 = new JTextField();
		txtNome133.setColumns(10);
		txtNome133.setBounds(331, 64, 122, 20);
		panel.add(txtNome133);

		cmbA133 = new JComboBox();
		cmbA133.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA133.setBounds(463, 64, 106, 20);
		panel.add(cmbA133);

		lblNewLabel_16 = new JLabel("14:00");
		lblNewLabel_16.setBounds(293, 95, 46, 14);
		panel.add(lblNewLabel_16);

		txtNome14 = new JTextField();
		txtNome14.setColumns(10);
		txtNome14.setBounds(331, 89, 122, 20);
		panel.add(txtNome14);

		cmbA14 = new JComboBox();
		cmbA14.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA14.setBounds(463, 89, 106, 20);
		panel.add(cmbA14);

		lblNewLabel_17 = new JLabel("14:30");
		lblNewLabel_17.setBounds(293, 120, 46, 14);
		panel.add(lblNewLabel_17);

		txtNome143 = new JTextField();
		txtNome143.setColumns(10);
		txtNome143.setBounds(331, 114, 122, 20);
		panel.add(txtNome143);

		cmbA143 = new JComboBox();
		cmbA143.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA143.setBounds(463, 114, 106, 20);
		panel.add(cmbA143);

		lblNewLabel_18 = new JLabel("15:00");
		lblNewLabel_18.setBounds(293, 145, 46, 14);
		panel.add(lblNewLabel_18);

		txtNome15 = new JTextField();
		txtNome15.setColumns(10);
		txtNome15.setBounds(331, 139, 122, 20);
		panel.add(txtNome15);

		cmbA15 = new JComboBox();
		cmbA15.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA15.setBounds(463, 139, 106, 20);
		panel.add(cmbA15);

		lblNewLabel_19 = new JLabel("15:30");
		lblNewLabel_19.setBounds(293, 170, 46, 14);
		panel.add(lblNewLabel_19);

		txtNome153 = new JTextField();
		txtNome153.setColumns(10);
		txtNome153.setBounds(331, 164, 122, 20);
		panel.add(txtNome153);

		cmbA153 = new JComboBox();
		cmbA153.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA153.setBounds(463, 164, 106, 20);
		panel.add(cmbA153);

		lblNewLabel_20 = new JLabel("16:00");
		lblNewLabel_20.setBounds(293, 195, 46, 14);
		panel.add(lblNewLabel_20);

		txtNome16 = new JTextField();
		txtNome16.setColumns(10);
		txtNome16.setBounds(331, 189, 122, 20);
		panel.add(txtNome16);

		cmbA16 = new JComboBox();
		cmbA16.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA16.setBounds(463, 189, 106, 20);
		panel.add(cmbA16);

		lblNewLabel_21 = new JLabel("16:30");
		lblNewLabel_21.setBounds(293, 220, 46, 14);
		panel.add(lblNewLabel_21);

		txtNome163 = new JTextField();
		txtNome163.setColumns(10);
		txtNome163.setBounds(331, 214, 122, 20);
		panel.add(txtNome163);

		cmbA163 = new JComboBox();
		cmbA163.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA163.setBounds(463, 214, 106, 20);
		panel.add(cmbA163);

		lblNewLabel_22 = new JLabel("17:00");
		lblNewLabel_22.setBounds(293, 245, 46, 14);
		panel.add(lblNewLabel_22);

		txtNome17 = new JTextField();
		txtNome17.setColumns(10);
		txtNome17.setBounds(331, 239, 122, 20);
		panel.add(txtNome17);

		cmbA17 = new JComboBox();
		cmbA17.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA17.setBounds(463, 239, 106, 20);
		panel.add(cmbA17);

		lblNewLabel_23 = new JLabel("17:30");
		lblNewLabel_23.setBounds(293, 270, 46, 14);
		panel.add(lblNewLabel_23);

		txtNome173 = new JTextField();
		txtNome173.setColumns(10);
		txtNome173.setBounds(331, 264, 122, 20);
		panel.add(txtNome173);

		cmbA173 = new JComboBox();
		cmbA173.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA173.setBounds(463, 264, 106, 20);
		panel.add(cmbA173);

		lblNewLabel_24 = new JLabel("18:00");
		lblNewLabel_24.setBounds(293, 295, 46, 14);
		panel.add(lblNewLabel_24);

		txtNome18 = new JTextField();
		txtNome18.setColumns(10);
		txtNome18.setBounds(331, 289, 122, 20);
		panel.add(txtNome18);

		cmbA18 = new JComboBox();
		cmbA18.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA18.setBounds(463, 289, 106, 20);
		panel.add(cmbA18);

		txtNome83 = new JTextField();
		txtNome83.setColumns(10);
		txtNome83.setBounds(45, 89, 122, 20);
		panel.add(txtNome83);

		txtNome90 = new JTextField();
		txtNome90.setColumns(10);
		txtNome90.setBounds(45, 114, 122, 20);
		panel.add(txtNome90);

		txtNome93 = new JTextField();
		txtNome93.setColumns(10);
		txtNome93.setBounds(45, 139, 122, 20);
		panel.add(txtNome93);

		txtNome10 = new JTextField();
		txtNome10.setColumns(10);
		txtNome10.setBounds(45, 164, 122, 20);
		panel.add(txtNome10);

		txtNome103 = new JTextField();
		txtNome103.setColumns(10);
		txtNome103.setBounds(45, 189, 122, 20);
		panel.add(txtNome103);

		txtNome11 = new JTextField();
		txtNome11.setColumns(10);
		txtNome11.setBounds(45, 214, 122, 20);
		panel.add(txtNome11);

		txtNome113 = new JTextField();
		txtNome113.setColumns(10);
		txtNome113.setBounds(45, 239, 122, 20);
		panel.add(txtNome113);

		txtNome12 = new JTextField();
		txtNome12.setColumns(10);
		txtNome12.setBounds(45, 264, 122, 20);
		panel.add(txtNome12);

		cmbA113 = new JComboBox();
		cmbA113.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA113.setBounds(177, 239, 106, 20);
		panel.add(cmbA113);

		cmbA11 = new JComboBox();
		cmbA11.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA11.setBounds(177, 214, 106, 20);
		panel.add(cmbA11);

		cmbA103 = new JComboBox();
		cmbA103.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA103.setBounds(177, 189, 106, 20);
		panel.add(cmbA103);

		cmbA10 = new JComboBox();
		cmbA10.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA10.setBounds(177, 164, 106, 20);
		panel.add(cmbA10);

		cmbA83 = new JComboBox();
		cmbA83.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA83.setBounds(177, 89, 106, 20);
		panel.add(cmbA83);

		btnLimpar1_1 = new JButton("");
		btnLimpar1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ============================ LIMPAR =================================
				txtNome80.setText("");
				txtNome83.setText("");
				txtNome90.setText("");
				txtNome93.setText("");
				txtNome10.setText("");
				txtNome103.setText("");
				txtNome11.setText("");
				txtNome113.setText("");
				txtNome12.setText("");
				txtNome13.setText("");
				txtNome133.setText("");
				txtNome14.setText("");
				txtNome143.setText("");
				txtNome15.setText("");
				txtNome153.setText("");
				txtNome16.setText("");
				txtNome163.setText("");
				txtNome17.setText("");
				txtNome173.setText("");
				txtNome18.setText("");

				cmbA80.setSelectedItem(null);
				cmbA83.setSelectedItem(null);
				cmbA90.setSelectedItem(null);
				cmbA93.setSelectedItem(null);
				cmbA10.setSelectedItem(null);
				cmbA103.setSelectedItem(null);
				cmbA11.setSelectedItem(null);
				cmbA113.setSelectedItem(null);
				cmbA12.setSelectedItem(null);
				cmbA13.setSelectedItem(null);
				cmbA133.setSelectedItem(null);
				cmbA14.setSelectedItem(null);
				cmbA143.setSelectedItem(null);
				cmbA15.setSelectedItem(null);
				cmbA153.setSelectedItem(null);
				cmbA16.setSelectedItem(null);
				cmbA163.setSelectedItem(null);
				cmbA17.setSelectedItem(null);
				cmbA173.setSelectedItem(null);
				cmbA18.setSelectedItem(null);

				// ====================================================================
			}
		});
		btnLimpar1_1.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeLimpar.png"));
		btnLimpar1_1.setBounds(333, 320, 36, 36);
		panel.add(btnLimpar1_1);

		btnSalvar1_1 = new JButton("");
		btnSalvar1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// ========================= SALVAR AGENDA ===================================
				try {

					Agenda agenda = new Agenda();
					agenda.setDia(Integer.parseInt(txtData.getText()));
					// agenda.setDia(txtData.getText());
					agenda.setNome8(txtNome80.getText());
					agenda.setA8((String) cmbA80.getSelectedItem());
					agenda.setNome83(txtNome83.getText());
					agenda.setA83((String) cmbA83.getSelectedItem());
					agenda.setNome9(txtNome90.getText());
					agenda.setA9((String) cmbA90.getSelectedItem());
					agenda.setNome93(txtNome93.getText());
					agenda.setA93((String) cmbA93.getSelectedItem());
					agenda.setNome10(txtNome10.getText());
					agenda.setA10((String) cmbA10.getSelectedItem());
					agenda.setNome103(txtNome103.getText());
					agenda.setA103((String) cmbA103.getSelectedItem());
					agenda.setNome11(txtNome11.getText());
					agenda.setA11((String) cmbA11.getSelectedItem());
					agenda.setNome113(txtNome113.getText());
					agenda.setA113((String) cmbA113.getSelectedItem());
					agenda.setNome12(txtNome12.getText());
					agenda.setA12((String) cmbA12.getSelectedItem());
					agenda.setNome13(txtNome13.getText());
					agenda.setA13((String) cmbA13.getSelectedItem());
					agenda.setNome133(txtNome133.getText());
					agenda.setA133((String) cmbA133.getSelectedItem());
					agenda.setNome14(txtNome14.getText());
					agenda.setA14((String) cmbA14.getSelectedItem());
					agenda.setNome143(txtNome143.getText());
					agenda.setA143((String) cmbA143.getSelectedItem());
					agenda.setNome15(txtNome15.getText());
					agenda.setA15((String) cmbA15.getSelectedItem());
					agenda.setNome153(txtNome153.getText());
					agenda.setA153((String) cmbA153.getSelectedItem());
					agenda.setNome16(txtNome16.getText());
					agenda.setA16((String) cmbA16.getSelectedItem());
					agenda.setNome163(txtNome163.getText());
					agenda.setA163((String) cmbA163.getSelectedItem());
					agenda.setNome17(txtNome17.getText());
					agenda.setA17((String) cmbA17.getSelectedItem());
					agenda.setNome173(txtNome173.getText());
					agenda.setA173((String) cmbA173.getSelectedItem());
					agenda.setNome18(txtNome18.getText());
					agenda.setA18((String) cmbA18.getSelectedItem());

					agendadao = new AgendaDAO();
					agendadao.salvarAg(agenda);
					JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao Salvar!!" + e1.getMessage());

				}

				// ========================================================================================
			}
		});
		btnSalvar1_1.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeSalvar.png"));
		btnSalvar1_1.setBounds(197, 321, 36, 36);
		panel.add(btnSalvar1_1);

		btnAlterar1_1 = new JButton("");
		btnAlterar1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ========================= ATUALIZAR ==================================

				try {
					// objetos para pegar dados da tela
					Agenda agenda = new Agenda();

					agenda.setNome8(txtNome80.getText());
					agenda.setA8((String) cmbA80.getSelectedItem());
					agenda.setNome83(txtNome83.getText());
					agenda.setA83((String) cmbA83.getSelectedItem());
					agenda.setNome9(txtNome90.getText());
					agenda.setA9((String) cmbA90.getSelectedItem());
					agenda.setNome93(txtNome93.getText());
					agenda.setA93((String) cmbA93.getSelectedItem());
					agenda.setNome10(txtNome10.getText());
					agenda.setA10((String) cmbA10.getSelectedItem());
					agenda.setNome103(txtNome103.getText());
					agenda.setA103((String) cmbA103.getSelectedItem());
					agenda.setNome11(txtNome11.getText());
					agenda.setA11((String) cmbA11.getSelectedItem());
					agenda.setNome113(txtNome113.getText());
					agenda.setA113((String) cmbA113.getSelectedItem());
					agenda.setNome12(txtNome12.getText());
					agenda.setA12((String) cmbA12.getSelectedItem());
					agenda.setNome13(txtNome13.getText());
					agenda.setA13((String) cmbA13.getSelectedItem());
					agenda.setNome133(txtNome133.getText());
					agenda.setA133((String) cmbA133.getSelectedItem());
					agenda.setNome14(txtNome14.getText());
					agenda.setA14((String) cmbA14.getSelectedItem());
					agenda.setNome143(txtNome143.getText());
					agenda.setA143((String) cmbA143.getSelectedItem());
					agenda.setNome15(txtNome15.getText());
					agenda.setA15((String) cmbA15.getSelectedItem());
					agenda.setNome153(txtNome153.getText());
					agenda.setA153((String) cmbA153.getSelectedItem());
					agenda.setNome16(txtNome16.getText());
					agenda.setA16((String) cmbA16.getSelectedItem());
					agenda.setNome163(txtNome163.getText());
					agenda.setA163((String) cmbA163.getSelectedItem());
					agenda.setNome17(txtNome17.getText());
					agenda.setA17((String) cmbA17.getSelectedItem());
					agenda.setNome173(txtNome173.getText());
					agenda.setA173((String) cmbA173.getSelectedItem());
					agenda.setNome18(txtNome18.getText());
					agenda.setA18((String) cmbA18.getSelectedItem());
					agenda.setDia(Integer.parseInt(txtData.getText()));

					// conexao
					agendadao = new AgendaDAO();

					// alterar
					agendadao.alterarAg(agenda);
					JOptionPane.showMessageDialog(null, "Alterado com Sucesso !");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao Alterar!!" + e1.getMessage());
				}

				// ======================================================================
			}
		});
		btnAlterar1_1.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeAlterar.png"));
		btnAlterar1_1.setBounds(287, 321, 36, 36);
		panel.add(btnAlterar1_1);

		cmbA12 = new JComboBox();
		cmbA12.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA12.setBounds(177, 264, 106, 20);
		panel.add(cmbA12);

		cmbA80 = new JComboBox();
		cmbA80.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA80.setBounds(177, 64, 106, 20);
		panel.add(cmbA80);

		btnConsultar1_1 = new JButton("");
		btnConsultar1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ======================= Consultar AGENDA =================================

				try {
					// conexao
					agendadao = new AgendaDAO();

					AgendaDAO mostrarAg = new AgendaDAO();
					mostrarAg.consultarAg(txtData.getText());

					txtNome80.setText(mostrarAg.agenda.getNome8());
					cmbA80.setSelectedItem(mostrarAg.agenda.getA8());

					txtNome83.setText(mostrarAg.agenda.getNome83());
					cmbA83.setSelectedItem(mostrarAg.agenda.getA83());

					txtNome90.setText(mostrarAg.agenda.getNome9());
					cmbA90.setSelectedItem(mostrarAg.agenda.getA9());

					txtNome93.setText(mostrarAg.agenda.getNome93());
					cmbA93.setSelectedItem(mostrarAg.agenda.getA93());

					txtNome10.setText(mostrarAg.agenda.getNome10());
					cmbA10.setSelectedItem(mostrarAg.agenda.getA10());

					txtNome103.setText(mostrarAg.agenda.getNome103());
					cmbA103.setSelectedItem(mostrarAg.agenda.getA103());

					txtNome11.setText(mostrarAg.agenda.getNome11());
					cmbA11.setSelectedItem(mostrarAg.agenda.getA11());

					txtNome113.setText(mostrarAg.agenda.getNome113());
					cmbA113.setSelectedItem(mostrarAg.agenda.getA113());

					txtNome12.setText(mostrarAg.agenda.getNome12());
					cmbA12.setSelectedItem(mostrarAg.agenda.getA12());

					txtNome13.setText(mostrarAg.agenda.getNome13());
					cmbA13.setSelectedItem(mostrarAg.agenda.getA13());

					txtNome133.setText(mostrarAg.agenda.getNome133());
					cmbA133.setSelectedItem(mostrarAg.agenda.getA133());

					txtNome14.setText(mostrarAg.agenda.getNome14());
					cmbA14.setSelectedItem(mostrarAg.agenda.getA14());

					txtNome143.setText(mostrarAg.agenda.getNome143());
					cmbA143.setSelectedItem(mostrarAg.agenda.getA143());

					txtNome15.setText(mostrarAg.agenda.getNome15());
					cmbA15.setSelectedItem(mostrarAg.agenda.getA15());

					txtNome153.setText(mostrarAg.agenda.getNome153());
					cmbA153.setSelectedItem(mostrarAg.agenda.getA153());

					txtNome16.setText(mostrarAg.agenda.getNome16());
					cmbA16.setSelectedItem(mostrarAg.agenda.getA16());

					txtNome163.setText(mostrarAg.agenda.getNome163());
					cmbA163.setSelectedItem(mostrarAg.agenda.getA163());

					txtNome17.setText(mostrarAg.agenda.getNome17());
					cmbA17.setSelectedItem(mostrarAg.agenda.getA17());

					txtNome173.setText(mostrarAg.agenda.getNome173());
					cmbA173.setSelectedItem(mostrarAg.agenda.getA173());

					txtNome18.setText(mostrarAg.agenda.getNome18());
					cmbA18.setSelectedItem(mostrarAg.agenda.getA18());

					JOptionPane.showMessageDialog(null, "Listado com Sucesso !");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao Listar!!" + e1.getMessage());
				}

				// ========================================================================================
			}
		});
		btnConsultar1_1
				.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeConsultar.png"));
		btnConsultar1_1.setBounds(243, 320, 36, 36);
		panel.add(btnConsultar1_1);

		lblNewLabel_8 = new JLabel("DATA");
		lblNewLabel_8.setBounds(215, 14, 46, 14);
		panel.add(lblNewLabel_8);

		txtData = new JTextField();
		txtData.setBounds(253, 11, 86, 20);
		panel.add(txtData);
		txtData.setColumns(10);

		cmbA90 = new JComboBox();
		cmbA90.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA90.setBounds(177, 114, 106, 20);
		panel.add(cmbA90);

		cmbA93 = new JComboBox();
		cmbA93.setModel(new DefaultComboBoxModel(
				new String[] { "", "Tratamento", "Limpeza", "Aparelho", "Manuten\u00E7\u00E3o" }));
		cmbA93.setBounds(177, 139, 106, 20);
		panel.add(cmbA93);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Receituario", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel label_20 = new JLabel("Matr\u00EDcula");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_20.setBounds(52, 11, 98, 20);
		panel_1.add(label_20);

		txtMatricula3 = new JTextField();
		txtMatricula3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
////////////////////////////////////////////////////////////////////////////////////

				try {
					pacientedao = new PacienteDAO();

					PacienteDAO mostrar = new PacienteDAO();
					mostrar.consultar(txtMatricula3.getText());
					txtNome03.setText(mostrar.paciente.getNOME());

					JOptionPane.showMessageDialog(null, "Ação feita com sucesso !");
				} catch (Exception i) {
					JOptionPane.showMessageDialog(null, "Erro na ação" + i.getMessage());

				}
			}
/////////////////////////////////////////////////////////////////////////////////////////////

		});
		txtMatricula3.setColumns(10);
		txtMatricula3.setBounds(52, 29, 111, 20);
		panel_1.add(txtMatricula3);

		JLabel label_21 = new JLabel("Nome");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_21.setBounds(173, 11, 340, 20);
		panel_1.add(label_21);

		JLabel label_23 = new JLabel("Medicamento");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_23.setBounds(52, 51, 98, 20);
		panel_1.add(label_23);

		txtMedicamento3 = new JTextField();
		txtMedicamento3.setColumns(10);
		txtMedicamento3.setBounds(52, 72, 150, 20);
		panel_1.add(txtMedicamento3);

		JLabel label_24 = new JLabel("Qtd. Caixas");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_24.setBounds(210, 51, 90, 20);
		panel_1.add(label_24);

		JComboBox cmbQtd3 = new JComboBox();
		cmbQtd3.setModel(
				new DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		cmbQtd3.setBounds(212, 72, 88, 20);
		panel_1.add(cmbQtd3);

		JLabel label_25 = new JLabel("Prescri\u00E7\u00E3o");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_25.setBounds(310, 51, 188, 20);
		panel_1.add(label_25);

		txtPrescricao3 = new JTextField();
		txtPrescricao3.setColumns(10);
		txtPrescricao3.setBounds(310, 72, 203, 20);
		panel_1.add(txtPrescricao3);

		TextArea txtReceita3 = new TextArea();
		txtReceita3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtReceita3.setBounds(52, 110, 461, 163);
		panel_1.add(txtReceita3);

		JButton btnSalvar3 = new JButton("");
		btnSalvar3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				// ============================= SALVAR RECEITA ===================
				try {

					Receita receita = new Receita();
					receita.setMATRICULA(Integer.parseInt(txtMatricula3.getText()));
					receita.setMEDICAMENTO(txtMedicamento3.getText());
					receita.setQUANTIDADE((String) cmbQtd3.getSelectedItem());
					receita.setPRESCRICAO(txtPrescricao3.getText());

					receitaDao = new ReceitaDAO();
					receitaDao.salvar(receita);

					JOptionPane.showMessageDialog(null, "Salvo com sucesso !");
				} catch (Exception i) {
					JOptionPane.showMessageDialog(null, "Erro ao salvar" + i.getMessage());

				}

			}

			// ============================= =============================

		});
		btnSalvar3.setIcon(new ImageIcon("C:\\\\Users\\\\Vinicius Sararoli\\\\eclipse-workspace\\\\Clinica\\\\Icones\\IconeSalvar.png"));
		btnSalvar3.setBounds(166, 301, 36, 36);
		panel_1.add(btnSalvar3);

		JButton btnAlterar3 = new JButton("");
		btnAlterar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ============================= ALTERAR RECEITA ==================

				try {

					Receita receita = new Receita();

					receita.setMATRICULA(Integer.parseInt(txtMatricula3.getText()));
					receita.setMEDICAMENTO(txtMedicamento3.getText());
					receita.setQUANTIDADE((String) cmbQtd3.getSelectedItem());
					receita.setPRESCRICAO(txtPrescricao3.getText());

					// conexao
					receitaDao = new ReceitaDAO();

					// alterar
					receitaDao.alterar(receita);
					JOptionPane.showMessageDialog(null, "Alterado com Sucesso !");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao Alterar!!" + e1.getMessage());
				}

			}

			// =============================// =============================//

		});
		btnAlterar3.setIcon(new ImageIcon("C:\\\\Users\\\\Vinicius Sararoli\\\\eclipse-workspace\\\\Clinica\\\\Icones\\IconeAlterar.png"));
		btnAlterar3.setBounds(256, 301, 36, 36);
		panel_1.add(btnAlterar3);

		JButton btnConsultar3 = new JButton("");
		btnConsultar3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// ====================== CONSULTAR RECEITA =============================

				try {
					List<Receita> lista = new ArrayList<Receita>();
					receitaDao = new ReceitaDAO();

					lista = receitaDao.listarTodos();
					for (Receita receita : lista) {
						txtReceita3.append("\n" + "Matricula do paciente........." + receita.getMATRICULA() + "\n");
						txtReceita3.append("Medicamento do paciente......." + receita.getMEDICAMENTO() + "\n");
						txtReceita3.append("Quantidade do medicamento....." + receita.getQUANTIDADE() + "\n");
						txtReceita3.append("Precrisão do medico..........." + receita.getPRESCRICAO() + "\n");
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao Consultar!" + e1.getMessage());
				}

			}
			// =============================// =============================//

		});
		btnConsultar3
				.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeConsultar.png"));
		btnConsultar3.setBounds(210, 301, 36, 36);
		panel_1.add(btnConsultar3);

		JButton btnExcluir3 = new JButton("");
		btnExcluir3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ======================= EXCLUIR RECEITA ============
				try {
					// conexao
					receitaDao = new ReceitaDAO();

					// excluir
					int excluir = Integer.parseInt(txtMatricula3.getText());
					receitaDao.excluir(excluir);
					JOptionPane.showMessageDialog(null, "Excluido com sucesso !");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao excluir" + e1.getMessage());

				}

			}
			// =============================// ======================

		});
		btnExcluir3.setIcon(new ImageIcon("C:\\\\Users\\\\Vinicius Sararoli\\\\eclipse-workspace\\\\Clinica\\\\Icones\\IconeExcluir.png"));
		btnExcluir3.setBounds(302, 301, 36, 36);
		panel_1.add(btnExcluir3);

		JButton btnLimpar3 = new JButton("");
		btnLimpar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMatricula3.setText("");
				txtNome03.setText("");
				txtMedicamento3.setText("");
				cmbQtd3.setSelectedIndex(0);
				txtPrescricao3.setText("");
				txtReceita3.setText("");

			}
		});
		btnLimpar3.setIcon(new ImageIcon("C:\\Users\\Vinicius Sararoli\\eclipse-workspace\\Clinica\\Icones\\IconeLimpar.png"));
		btnLimpar3.setBounds(348, 301, 36, 36);
		panel_1.add(btnLimpar3);

		txtNome03 = new JTextField();
		txtNome03.setEditable(false);
		txtNome03.setBounds(173, 29, 340, 20);
		panel_1.add(txtNome03);
		txtNome03.setColumns(10);
	}
}