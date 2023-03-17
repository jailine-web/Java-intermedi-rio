package aplicacao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Programa {

	public static void main(String[] args) {

		Connection con = null;
		Statement s = null;

		try {

			con = DB.getConexao();
			
			con.setAutoCommit(false);
			
			s = con.createStatement();
			
			int linhas1 = s.executeUpdate("UPDATE seller SET "
					+ "BaseSalary = 2090 WHERE departmentId = 1");
			
			
			int linhas2 = s.executeUpdate("UPDATE seller SET "
					+ "BaseSalary = 3090 WHERE departmentId = 2");
		
			con.commit();

			System.out.println("Linha 01 "+ linhas1);
			System.out.println("Linha 02 "+ linhas2);
		}

		catch (SQLException e) {
			try {
				
				con.rollback();
				throw new DbException("Transação não concluída: causa "+e.getMessage());
				
			} 
			catch (SQLException e1) {
				throw new DbException("Erro ao tentar realizar o rollback! causa "+e1.getMessage());
			}
			
		} finally {

			DB.fecharConsulta(s);
			DB.fecharConexao();
		}
	}

}
