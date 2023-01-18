
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraAutomatica {

		public static void main(String[] args) {

			String caminho = "C:\\Users\\Jai\\Documents\\Curso java\\src\\Exemplo arquivo\\texto.txt";
			 
			//Maneira otimizada de ler uma arquivo. Try with resource
			try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
								
				String linha = br.readLine();
				
				while(linha != null) {
					System.out.println(linha);
					linha = br.readLine();
				}
				
			}
			catch(IOException e) {
				System.out.println("Erro "+ e.getMessage());
			}
			
		}

	}


