import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivos {

	public static void main(String[] args) {
		
		//Encapsula o processo de acessar o arquivo e o caminho: P�e-se duas \\ para indicar que � uma \ (Pois uma \ � utilizada para outras a��es como: \n)
		File arquivo =  new File("C:\\Users\\Jai\\Documents\\Curso java\\src\\Exemplo arquivo\\texto.txt");
		Scanner ler = null;
		
		try {
			ler = new Scanner(arquivo);
			//identificar se ainda existe uma nova linha no arquivo
			while(ler.hasNextLine()) {
				System.out.println(ler.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Erro " + e.getMessage());
		}
		//para fechar o scanner dando certo ou n�o a opera��o
		finally {
			if(ler != null) {
				ler.close();
			}
		}
		
	}
}
