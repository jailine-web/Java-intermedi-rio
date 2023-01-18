import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaDeArquivos {

	public static void main(String[] args) {

		String[] linhas = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		
		String caminho = "C:\\Users\\Jai\\Documents\\Curso java\\arquivoCriado.txt";
		
		//Cria/recria o arquivo sem adicionar abaixo
		//try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
		
		//Adiciona ao arquivo criado (ao fim do arquivo)
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){
			
			for(String linha: linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
