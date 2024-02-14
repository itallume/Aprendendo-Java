import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int lacos = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < lacos; i++) {

            soma += sc.nextInt();

        }
        System.out.println("Resultado: " + soma);
        sc.close();
    }
}