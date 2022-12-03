import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida!");
		} 
		catch (InputMismatchException e) {
			System.out.println("Tipo inv�lido, digite um n�mero");
		}
		
		System.out.println("Fim do programa");
		sc.close();
	}
}
