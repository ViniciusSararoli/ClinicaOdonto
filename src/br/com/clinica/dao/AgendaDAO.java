package br.com.clinica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.clinica.model.Agenda;
import br.com.clinica.util.ConnectionFactory;

public class AgendaDAO {

	public Agenda agenda;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private int rs1;

	public AgendaDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("Erro" + e.getMessage());
		}

	}

	// **************************SAVE*************************************
	public void salvarAg(Agenda agenda) throws Exception {
		try {
			String sql = "INSERT INTO agenda(Data, Nome80, Acao80, Nome83, Acao83, Nome90, Acao90, Nome93,"
					+ " Acao93, Nome10, Acao10, Nome103, Acao103, Nome11, Acao11, Nome113, Acao113, Nome12,"
					+ " Acao12, Nome13, Acao13, Nome133, Acao133, Nome14, Acao14, Nome143, Acao143, Nome15,"
					+ " Acao15, Nome153, Acao153, Nome16, Acao16, Nome163, Acao163, Nome17, Acao17, Nome173,"
					+ " Acao173, Nome18, Acao18) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, agenda.getDia());
			ps.setString(2, agenda.getNome8());
			ps.setString(3, agenda.getA8());
			ps.setString(4, agenda.getNome83());
			ps.setString(5, agenda.getA83());
			ps.setString(6, agenda.getNome9());
			ps.setString(7, agenda.getA9());
			ps.setString(8, agenda.getNome93());
			ps.setString(9, agenda.getA93());
			ps.setString(10, agenda.getNome10());
			ps.setString(11, agenda.getA10());
			ps.setString(12, agenda.getNome103());
			ps.setString(13, agenda.getA103());
			ps.setString(14, agenda.getNome11());
			ps.setString(15, agenda.getA11());
			ps.setString(16, agenda.getNome113());
			ps.setString(17, agenda.getA113());
			ps.setString(18, agenda.getNome12());
			ps.setString(19, agenda.getA12());
			ps.setString(20, agenda.getNome13());
			ps.setString(21, agenda.getA13());
			ps.setString(22, agenda.getNome133());
			ps.setString(23, agenda.getA133());
			ps.setString(24, agenda.getNome14());
			ps.setString(25, agenda.getA14());
			ps.setString(26, agenda.getNome143());
			ps.setString(27, agenda.getA143());
			ps.setString(28, agenda.getNome15());
			ps.setString(29, agenda.getA15());
			ps.setString(30, agenda.getNome153());
			ps.setString(31, agenda.getA153());
			ps.setString(32, agenda.getNome16());
			ps.setString(33, agenda.getA16());
			ps.setString(34, agenda.getNome163());
			ps.setString(35, agenda.getA163());
			ps.setString(36, agenda.getNome17());
			ps.setString(37, agenda.getA17());
			ps.setString(38, agenda.getNome173());
			ps.setString(39, agenda.getA173());
			ps.setString(40, agenda.getNome18());
			ps.setString(41, agenda.getA18());

			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Salvar" + e.getMessage());
		}
	}

	// **************************UPDATE*************************************
	public void alterarAg(Agenda agenda) throws Exception {
		try {
			String sql = "UPDATE `agenda` SET Nome80=?, Acao80=?, Nome83=?, Acao83=?, Nome90=?, Acao90=?, Nome93=?,"
					+ " Acao93=?, Nome10=?, Acao10=?, Nome103=?, Acao103=?, Nome11=?, Acao11=?, Nome113=?, Acao113=?, Nome12=?,"
					+ " Acao12=?, Nome13=?, Acao13=?, Nome133=?, Acao133=?, Nome14=?, Acao14=?, Nome143=?, Acao143=?, Nome15=?,"
					+ " Acao15=?, Nome153=?, Acao153=?, Nome16=?, Acao16=?, Nome163=?, Acao163=?, Nome17=?, Acao17=?, Nome173=?,"
					+ " Acao173=?, Nome18=?, Acao18=? WHERE Data=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, agenda.getNome8());
			ps.setString(2, agenda.getA8());
			ps.setString(3, agenda.getNome83());
			ps.setString(4, agenda.getA83());
			ps.setString(5, agenda.getNome9());
			ps.setString(6, agenda.getA9());
			ps.setString(7, agenda.getNome93());
			ps.setString(8, agenda.getA93());
			ps.setString(9, agenda.getNome10());
			ps.setString(10, agenda.getA10());
			ps.setString(11, agenda.getNome103());
			ps.setString(12, agenda.getA103());
			ps.setString(13, agenda.getNome11());
			ps.setString(14, agenda.getA11());
			ps.setString(15, agenda.getNome113());
			ps.setString(16, agenda.getA113());
			ps.setString(17, agenda.getNome12());
			ps.setString(18, agenda.getA12());
			ps.setString(19, agenda.getNome13());
			ps.setString(20, agenda.getA13());
			ps.setString(21, agenda.getNome133());
			ps.setString(22, agenda.getA133());
			ps.setString(23, agenda.getNome14());
			ps.setString(24, agenda.getA14());
			ps.setString(25, agenda.getNome143());
			ps.setString(26, agenda.getA143());
			ps.setString(27, agenda.getNome15());
			ps.setString(28, agenda.getA15());
			ps.setString(29, agenda.getNome153());
			ps.setString(30, agenda.getA153());
			ps.setString(31, agenda.getNome16());
			ps.setString(32, agenda.getA16());
			ps.setString(33, agenda.getNome163());
			ps.setString(34, agenda.getA163());
			ps.setString(35, agenda.getNome17());
			ps.setString(36, agenda.getA17());
			ps.setString(37, agenda.getNome173());
			ps.setString(38, agenda.getA173());
			ps.setString(39, agenda.getNome18());
			ps.setString(40, agenda.getA18());
			ps.setInt(41, agenda.getDia());
			rs1 = ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Alterar" + e.getMessage());
		}
	}

	// ************************SELECT*****************************************
	public Agenda consultarAg(String Dia) throws Exception {

		String sql = "SELECT * FROM `agenda` WHERE Data=?";

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, Dia);
			rs = ps.executeQuery();
			if (rs.next()) {

				int Dia1 = rs.getInt("Data");
				String Nome80 = rs.getString("Nome80");
				String A80 = rs.getString("Acao80");
				String Nome83 = rs.getString("Nome83");
				String A83 = rs.getString("Acao83");
				String Nome90 = rs.getString("Nome90");
				String A90 = rs.getString("Acao90");
				String Nome93 = rs.getString("Nome93");
				String A93 = rs.getString("Acao93");
				String Nome10 = rs.getString("Nome10");
				String A10 = rs.getString("Acao10");
				String Nome103 = rs.getString("Nome103");
				String A103 = rs.getString("Acao103");
				String Nome11 = rs.getString("Nome11");
				String A11 = rs.getString("Acao11");
				String Nome113 = rs.getString("Nome113");
				String A113 = rs.getString("Acao113");
				String Nome12 = rs.getString("Nome12");
				String A12 = rs.getString("Acao12");
				String Nome13 = rs.getString("Nome13");
				String A13 = rs.getString("Acao13");
				String Nome133 = rs.getString("Nome113");
				String A133 = rs.getString("Acao133");
				String Nome14 = rs.getString("Nome14");
				String A14 = rs.getString("Acao14");
				String Nome143 = rs.getString("Nome143");
				String A143 = rs.getString("Acao143");
				String Nome15 = rs.getString("Nome15");
				String A15 = rs.getString("Acao15");
				String Nome153 = rs.getString("Nome153");
				String A153 = rs.getString("Acao153");
				String Nome16 = rs.getString("Nome16");
				String A16 = rs.getString("Acao16");
				String Nome163 = rs.getString("Nome163");
				String A163 = rs.getString("Acao163");
				String Nome17 = rs.getString("Nome17");
				String A17 = rs.getString("Acao17");
				String Nome173 = rs.getString("Nome173");
				String A173 = rs.getString("Acao173");
				String Nome18 = rs.getString("Nome18");
				String A18 = rs.getString("Acao18");

				agenda = new Agenda(Dia1, Nome80, A80, Nome83, A83, Nome90, A90, Nome93, A93, Nome10, A10, Nome103,
						A103, Nome11, A11, Nome113, A113, Nome12, A12, Nome13, A13, Nome133, A133, Nome14, A14, Nome143,
						A143, Nome15, A15, Nome153, A153, Nome16, A16, Nome163, A163, Nome17, A17, Nome173, A173,
						Nome18, A18);
			}
			return agenda;

		} catch (Exception e) {
			throw new Exception("Erro ao Listar" + e.getMessage());
		}
	}

}
