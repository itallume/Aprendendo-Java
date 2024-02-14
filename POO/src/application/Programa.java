package application;
import entites.Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double areaX, areaY;
        Triangulo X, Y;
        X = new Triangulo();
        Y = new Triangulo();
        String maiorArea;

        System.out.println("Digite as medidas do triângulo X: ");
        X.a = sc.nextDouble();
        X.b = sc.nextDouble();
        X.c = sc.nextDouble();
        areaX = X.area();

        System.out.println("Digte as medidas do triângulo Y: ");
        Y.a = sc.nextDouble();
        Y.b = sc.nextDouble();
        Y.c = sc.nextDouble();
        areaY = Y.area();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        maiorArea = (areaX > areaY) ? "X" : "Y" ;
        System.out.println("Maior Área: " + maiorArea);

        sc.close();
    }
}
