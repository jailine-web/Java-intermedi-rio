package aplicacao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Programa {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement consulta = null;
		ResultSet resultado = null;
		
		
		try {
			con = DB.getConexao();
			consulta = con.createStatement();
			resultado = consulta.executeQuery("Select * from department");
			
			while(resultado.next()) {
				System.out.println(resultado.getInt("Id") + ": "+ resultado.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			DB.fecharResultado(resultado);
			DB.fecharConsulta(consulta);
			DB.fecharConexao();
		}
	}

}
