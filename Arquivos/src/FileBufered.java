import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBufered {

	public static void main(String[] args) {

		//Leitura manual dos arquivos
		String caminho = "C:\\Users\\Jai\\Documents\\Curso java\\src\\Exemplo arquivo\\texto.txt";
		
		FileReader fr =  null;
		// Mais rápido (otimizado)
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Erro "+ e.getMessage());
		}
		finally {
			
			try {
				
				if(fr != null) {
					fr.close();
				}
				if(br != null) {
					br.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
