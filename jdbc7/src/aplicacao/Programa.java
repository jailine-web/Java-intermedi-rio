package aplicacao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Programa {

	public static void main(String[] args) {

		Connection con = null;
		Statement s = null;

		try {

			con = DB.getConexao();
			s = con.createStatement();
			
			int linhas1 = s.executeUpdate("UPDATE seller SET "
					+ "BaseSalary = 2090 WHERE departmentId = 1");
			
			int x = 1;
			
			if(x< 2) {
				throw new SQLException("Erro falso");
			}
			
			int linhas2 = s.executeUpdate("UPDATE seller SET "
					+ "BaseSalary = 3090 WHERE departmentId = 2");
			

		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {

			DB.fecharConsulta(s);
			DB.fecharConexao();
		}
	}

}
