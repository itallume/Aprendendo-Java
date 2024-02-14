
public class Main {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);  // o modulo Math do java é onde contem funções matematicas, sendo uma delas o sqrt que é a raiz quadrada
		B = Math.sqrt(y);
		C = Math.sqrt(100.0 );
		
		System.out.println("Raiz quadrada de " + x + ": " + A );
		System.out.println("Raiz quadrada de " + y + ": " + B);
		System.out.println("Raiz quadrada de 100: " + C);
		
		A = Math.pow(x, y);  // o modulo Math do java é onde contem funções matematicas, sendo uma delas o pow que é a potenciação 
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " Elevado a " + y + " é: " + A);
		System.out.println(x + " Elevado ao quadrado é: " + B);
		System.out.println("5 Elevado ao quadrado é: " + C);
	}

}
