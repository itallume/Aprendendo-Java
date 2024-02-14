import java.util.Scanner;

// Funções em java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorValor = max(a, b, c);

        mostrarResultado(maiorValor);
        sc.close();

    }
    public static int max(int a, int b, int c){
        int aux;
        if (a > b && a > c){
            aux = a;
        }
        else if (b > c){
            aux = b;
        }
        else{
            aux = c;
        }
        return aux;
    }

    public static void mostrarResultado(int value){
        System.out.println("O maior valor é: " + value);
    }
}