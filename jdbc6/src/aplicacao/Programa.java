package aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbExcecaoDeIntegridade;

public class Programa {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DB.getConexao();
			
			ps = con.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ? ");
			
			ps.setInt(1, 5);
			
			int linhasAfetadas = ps.executeUpdate();
			
			System.out.println("Pronto! Linhas afetadas: " + linhasAfetadas);
		}
		
		catch(SQLException e) {
			throw new DbExcecaoDeIntegridade(e.getMessage());
		}
		
		finally {
			DB.fecharConsulta(ps);
			DB.fecharConexao();
		}
	}

}
