import java.util.Scanner;

public class estrutura_condicional {

	public static void main(String[] args) {
		int hora;
		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else if (hora > 12 && hora < 19) {
			System.out.println("Boa tarde!");
		}
			else if (hora > 18 && hora < 24) {
				System.out.println("Boa noite!");
			}
			else {
				System.out.println("Hora invalida.");
			}
		sc.close();
	}

}
