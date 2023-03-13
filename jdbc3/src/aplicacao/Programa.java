package aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
			ps = con.prepareStatement(
					"INSERT INTO seller "
					+ "(Name , Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES"
					+ "(?, ?, ?, ?, ?)");
			
			//troca as interrogações pelos valores abaixo
			ps.setString(1, "Carl Purple");
			ps.setString(2, "carl@gmail.com");
			ps.setDate(3, new java.sql.Date(sdf.parse("22/04/1984").getTime()));
			ps.setDouble(4, 3000.0);
			ps.setInt(5, 4);
			Integer linhasFeitas = ps.executeUpdate();
			System.out.println("Pronto! Linhas afetadas "+ linhasFeitas);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		finally {
			
			DB.fecharConsulta(ps);
			DB.fecharConexao();
			
		}
	}

}
