package br.com.clinica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.clinica.model.Receita;
import br.com.clinica.util.ConnectionFactory;

public class ReceitaDAO {

	private Receita receita;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public ReceitaDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("Erro" + e.getMessage());
		}

	}

	// **************************SAVE*************************************
	public void salvar(Receita receita) throws Exception {
		try {
			String sql = "INSERT INTO receita(MATRICULA, MEDICAMENTO, QUANTIDADE, PRESCRICAO)" + "VALUES (?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, receita.getMATRICULA());
			ps.setString(2, receita.getMEDICAMENTO());
			ps.setString(3, receita.getQUANTIDADE());
			ps.setString(4, receita.getPRESCRICAO());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Salvar" + e.getMessage());
		}
	}

	// **************************UPDATE*************************************
	public void alterar(Receita receita) throws Exception {
		try {
			String sql = "UPDATE receita SET  MEDICAMENTO=?, QUANTIDADE=?, PRESCRICAO=? WHERE MATRICULA=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, receita.getMEDICAMENTO());
			ps.setString(2, receita.getQUANTIDADE());
			ps.setString(3, receita.getPRESCRICAO());
			ps.setInt(4, receita.getMATRICULA());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Alterar" + e.getMessage());
		}
	}

	// **************************DELETE*************************************
	public void excluir(int MATRICULA) throws Exception {
		try {
			String sql = "DELETE FROM receita WHERE MATRICULA=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, MATRICULA);
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Excluir" + e.getMessage());
		}
	}
	// ************************LIST*****************************************

	public List listarTodos() throws Exception {
		List<Receita> lista = new ArrayList<Receita>();
		try {
			ps = conn.prepareStatement("SELECT * FROM receita");
			rs = ps.executeQuery();
			while (rs.next()) {
				int MATRICULA = rs.getInt("MATRICULA");
				String MEDICAMENTO = rs.getString("MEDICAMENTO");
				String QUANTIDADE = rs.getString("QUANTIDADE");
				String PRESCRICAO = rs.getString("PRESCRICAO");
				receita = new Receita(MATRICULA, MEDICAMENTO, QUANTIDADE, PRESCRICAO);
				lista.add(receita);
			}
			return lista;

		} catch (Exception e) {
			throw new Exception("Erro ao Listar" + e.getMessage());
		}
	}

	// ************************SELECT*****************************************
	public Receita consultar(int MATRICULA) throws Exception {
		try {
			ps = conn.prepareStatement("SELECT * FROM receita WHERE MATRICULA=?");
			ps.setInt(1, MATRICULA);
			rs = ps.executeQuery();
			if (rs.next()) {
				String MEDICAMENTO = rs.getString("MEDICAMENTO");
				String QUANTIDADE = rs.getString("QUANTIDADE");
				String PRESCRICAO = rs.getString("PRESCRICAO");
				receita = new Receita(MATRICULA, MEDICAMENTO, QUANTIDADE, PRESCRICAO);
			}
			return receita;

		} catch (Exception e) {
			throw new Exception("Erro ao Listar" + e.getMessage());
		}
	}

}
