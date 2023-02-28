package ExercicioResolvido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o caminho do arquivo: ");
		String caminho = ler.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			Set<Usuarios> setUsuarios = new HashSet<>();
			
			String linha = br.readLine();
			
			while(linha != null) {
				
				String[] dados = linha.split(" ");
				String nomeusuario = dados[0];
				Date data = Date.from(Instant.parse(dados[1]));
				
				setUsuarios.add(new Usuarios(nomeusuario, data));
				linha = br.readLine();
			}
			
			System.out.println("Total de usuários: "+ setUsuarios.size());
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
		ler.close();
	}

}
