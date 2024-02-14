import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senhaCorreta = "abc"; 
		int tentativas = 3;
		while (true) {
			System.out.println("Digite a senha: ");
			String senhaDigitada = sc.nextLine();
			if (senhaDigitada.equals(senhaCorreta)) {
				System.out.println("Senha correta! Acesso liberado.");
				break;
			}
			else {
				tentativas -= 1;
				if (tentativas <= 0) {
					System.out.println("Muitas tentativas, senha bloqueada.");
					break;
				}
				System.out.println("Senha incorreta. Restam " + tentativas + " tentativas.");
			}
		}
		sc.close();

	}

}
