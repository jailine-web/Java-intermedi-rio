package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/*
 * Classe que carrega as propriedades/dados que estão no arquivo db.properties
*/

public class DB {

	private static Connection con = null;
	
	//Realiza a conexão com o banco de dados
	public static Connection getConexao() {
		
		if(con == null) {
			try {
				Properties props = carregarPropriedades();
				String url = props.getProperty("dburl");
				con = DriverManager.getConnection(url, props);
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return con;
	}
	//Método que fecha a conexão
	
	public static void fecharConexao() {
		if(con != null) {
			try {
				con.close();
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	//Método que carrega os dados do arquivo properties
	private static Properties carregarPropriedades() {
		
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties prop = new Properties();
			prop.load(fs);
			return prop;
		}
		catch(IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	
	public static void fecharConsulta(Statement st) {
		if(st != null) {
			try {
				st.close();
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	public static void fecharResultado(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	
}
