import java.util.Scanner;

public class ternario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		String mensagem = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
		
		System.out.println(mensagem);
		
		sc.close();
	}

}
