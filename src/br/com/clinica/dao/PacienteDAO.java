package br.com.clinica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.clinica.model.Paciente;
import br.com.clinica.util.ConnectionFactory;

public class PacienteDAO {

	public Paciente paciente;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public PacienteDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("Erro " + e.getMessage());
		}

	}

	// ==================================SAVE==================================================
	public void salvar(Paciente paciente) throws Exception {
		try {

			String sql = "INSERT INTO dadospaciente(MATRICULA, NOME, NASCIMENTO, SEXO, CONVENIO, RG, CPF, EMAIL, ENDERECO, BAIRRO, MUNICIPIO, UF, CEP, CELULAR)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, paciente.getMATRICULA());
			ps.setString(2, paciente.getNOME());
			ps.setString(3, paciente.getNASCIMENTO());
			ps.setString(4, paciente.getSEXO());
			ps.setString(5, paciente.getCONVENIO());
			ps.setString(6, paciente.getRG());
			ps.setString(7, paciente.getCPF());
			ps.setString(8, paciente.getEMAIL());
			ps.setString(9, paciente.getENDERECO());
			ps.setString(10, paciente.getBAIRRO());
			ps.setString(11, paciente.getMUNICIPIO());
			ps.setString(12, paciente.getUF());
			ps.setString(13, paciente.getCEP());
			ps.setString(14, paciente.getCELULAR());
			ps.executeUpdate();

		} catch (Exception e) {
			throw new Exception("Erro ao salvar " + e.getMessage());
		}
		// *******************************************************************
	}

	// *********************UPDADE **********************************************
	public void alterar(Paciente paciente) throws Exception {
		try {
			String sql = "UPDATE dadospaciente SET NOME=?, NASCIMENTO=?, SEXO=?, CONVENIO=?, RG=?, CPF=?, EMAIL=?, ENDERECO=?, BAIRRO=?, MUNICIPIO=?, UF=?, CEP=?, CELULAR=? WHERE MATRICULA=?";

			ps = conn.prepareStatement(sql);
			ps.setString(1, paciente.getNOME());
			ps.setString(2, paciente.getNASCIMENTO());
			ps.setString(3, paciente.getSEXO());
			ps.setString(4, paciente.getCONVENIO());
			ps.setString(5, paciente.getRG());
			ps.setString(6, paciente.getCPF());
			ps.setString(7, paciente.getEMAIL());
			ps.setString(8, paciente.getENDERECO());
			ps.setString(9, paciente.getBAIRRO());
			ps.setString(10, paciente.getMUNICIPIO());
			ps.setString(11, paciente.getUF());
			ps.setString(12, paciente.getCEP());
			ps.setString(13, paciente.getCELULAR());
			ps.setInt(14, paciente.getMATRICULA());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao alterar" + e.getMessage());
		}

		// *******************************************************************
	}

	// *********************** DELETE *********************************************
	public void excluir(int MATRICULA) throws Exception {
		try {
			String sql = "DELETE FROM dadospaciente WHERE MATRICULA=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, MATRICULA);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao excluir" + e.getMessage());
		}

		// *******************************************************************
	}

	// *********************** CONSULTAR ************************************
	public Paciente consultar(String MATRICULA) throws Exception {
		String sql = "SELECT * FROM `dadospaciente` WHERE MATRICULA=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, MATRICULA);
			rs = ps.executeQuery();
			if (rs.next()) {
				int MATRICULA1 = rs.getInt("MATRICULA");
				String NOME = rs.getString("NOME");
				String NASCIMENTO = rs.getString("NASCIMENTO");
				String SEXO = rs.getString("SEXO");
				String CONVENIO = rs.getString("CONVENIO");
				String RG = rs.getString("RG");
				String CPF = rs.getString("CPF");
				String EMAIL = rs.getString("EMAIL");
				String ENDERECO = rs.getString("ENDERECO");
				String BAIRRO = rs.getString("BAIRRO");
				String MUNICIPIO = rs.getString("MUNICIPIO");
				String UF = rs.getString("UF");
				String CEP = rs.getString("CEP");
				String CELULAR = rs.getString("CELULAR");
				paciente = new Paciente(MATRICULA1, NOME, NASCIMENTO, SEXO, CONVENIO, RG, CPF, EMAIL, ENDERECO, BAIRRO,
						MUNICIPIO, UF, CEP, CELULAR);
				// lista.add(paciente);
			}
			return paciente;

		} catch (Exception e) {
			throw new Exception("Erro ao listar!" + e.getMessage()); // Remover depois
		}
	}
	// *******************************************************************

}
