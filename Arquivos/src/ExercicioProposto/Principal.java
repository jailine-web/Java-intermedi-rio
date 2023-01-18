package ExercicioProposto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Principal {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<Produto>();
		
		//Obtendo o caminho do diretório
		System.out.print("Entre com o caminho do arquivo: ");
		String caminhoStr = ler.nextLine();
		
		//Instanciando um file por meio do caminho especificado, encapsula o processo
		File caminhoPasta = new File(caminhoStr);
		
		//Obter o caminho da pasta
		String origemPastaStr = caminhoPasta.getParent();
		
		//Criando a pasta out
		boolean sucesso = new File(origemPastaStr + "\\out").mkdir();
		
		String arquivoDestinoStr = origemPastaStr + "\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoStr))){
			
			String item = br.readLine();
			
			while(item != null) {
				
				String[] campos = item.split(",");
				String nome = campos[0];
				double preco = Double.parseDouble(campos[1]);
				double qtd = Double.parseDouble(campos[2]);
				
				//double p = Double.valueOf(preco).doubleValue();
				
				produtos.add(new Produto(nome, preco, qtd));
				
				item = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestinoStr))){
				
				System.out.println("Total das compras:");
				for (Produto p: produtos) {
					bw.write(p.getNome() + ", "+ String.format("%.2f", p.valorTotal()));
					bw.newLine();
				}
				System.out.println("Arquivo Criado com sucesso na pasta: " + arquivoDestinoStr);
			}
			catch(IOException e ) {
				System.out.println("Erro na escrita do arquivo");
			}
			
		}
		catch(IOException e){
			System.out.println("Erro na leitura do arquivo "+e.getMessage());
		}
		
		
		
		ler.close();
		
	}
}
