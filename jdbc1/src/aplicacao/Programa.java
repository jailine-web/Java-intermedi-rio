package aplicacao;

import java.sql.Connection;

import db.DB;

public class Programa {

	public static void main(String[] args) {
		
		Connection con = DB.getConexao();
		DB.fecharConexao();
		
	}

}
