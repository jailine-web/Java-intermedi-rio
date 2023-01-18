import java.io.File;
import java.util.Scanner;

public class ManipularPastas {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o caminho da pasta: ");
		String strCaminho =ler.nextLine();
		
		File caminho = new File(strCaminho);
		
		//Pegando só as pastas a partir de um caminho(diretorio)
		File[] pastas = caminho .listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for(File folder : pastas) {
			System.out.println(folder);
		}
		
		System.out.println();
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("Arquivos");
		for(File arquivo: arquivos) {
			System.out.println(arquivo);
		}
		
		//Cria subpasta no diretório digitado
		boolean sucesso = new File(strCaminho + "\\Pasta nova").mkdir();
		System.out.println("Diretório criado com sucesso "+ sucesso);
		
	}
}
