package aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import db.DB;

public class Programa {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DB.getConexao();
			/*
			ps = con.prepareStatement("INSERT INTO seller " + "(Name , Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES" + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

			// troca as interrogações pelos valores abaixo
			ps.setString(1, "Julia Mendes");
			ps.setString(2, "ju@gmail.com");
			ps.setDate(3, new java.sql.Date(sdf.parse("22/04/1984").getTime()));
			ps.setDouble(4, 4000.0);
			ps.setInt(5, 3);
*/
			//Inserindo mais de um atributo
			ps = con.prepareStatement(
					"INSERT INTO department (Name) values ('D1'), ('D2')",
					Statement.RETURN_GENERATED_KEYS);
					
			Integer linhasFeitas = ps.executeUpdate();

			if (linhasFeitas > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Pronto! Id = " + id);
				}
				
			} else {
				System.out.println("Nenhuma linha foi alterada");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		/*catch (ParseException e) {
			e.printStackTrace();
		}*/

		finally {

			DB.fecharConsulta(ps);
			DB.fecharConexao();

		}
	}

}
