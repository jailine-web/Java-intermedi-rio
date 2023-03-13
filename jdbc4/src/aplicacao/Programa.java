package aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Programa {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DB.getConexao();
			
			ps = con.prepareStatement(
					"UPDATE seller "
					+"SET BaseSalary = BaseSalary + ?"
					+"Where (DepartmentId = ?)"
					);
			
			ps.setDouble(1, 200.0);
			ps.setInt(2, 2);
			
			int linhasAfetadas = ps.executeUpdate();
			
			System.out.println("Pronto! Linhas afetadas: "+ linhasAfetadas);
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.fecharConsulta(ps);
			DB.fecharConexao();
		}
	}

}
