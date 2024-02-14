import java.util.Scanner;

public class entradas2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt(); // qualquer next que n seja o line deixa pendente a quebra de linha
		sc.nextLine();  // sendo necessário o uso de um nextLine apenas para consumo do quebra de linha, ou então o proximo snnaer será consulmido    
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}

}
