import java.io.File;
import java.util.Scanner;

public class InfoDoCaminhoDeUmArquivo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o caminho do arquivo: ");
		String strCaminho = ler.nextLine();
		
		File caminho = new File(strCaminho);
		
		//Obtem apenas o nome do arquivo
		System.out.println("Nome: "+ caminho.getName());
		
		//Obtém apenas o caminho
		System.out.println("Caminho - getParent: "+caminho.getParent());
		
		//Obtém o caminho por completo
		System.out.println("Caminho completo - getPath: " +caminho.getPath());
		
		ler.close();
		
	}
}
