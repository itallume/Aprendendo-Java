package programa;

import entitites.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto;
        produto = new Produto();
        System.out.println("Digte os dados do produto:");
        System.out.print("Nome: ");
        produto.Nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.Preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.Quantidade = sc.nextInt();
        System.out.println();
        System.out.println("Dados do produto: " + produto.Nome + ", R$ " + produto.Preco + ", " + produto.Quantidade + " unidades, Total: R$ " + produto.valorEmEstoque());
        System.out.println();
        System.out.print("Digite a quantidade de produtos para ser adicionado no estoque: ");
        produto.AdicionarProdutos(sc.nextInt());
        System.out.println();
        System.out.println("Dados atualizados do produto: " + produto.Nome + ", R$ " + produto.Preco + ", " + produto.Quantidade + " unidades, Total: R$ " + produto.valorEmEstoque());
        System.out.println();
        System.out.print("Digite a quantidade de produtos para ser removida do estoque: ");
        produto.RemoverProdutos(sc.nextInt());
        System.out.println();
        System.out.println("Dados atualizados do produto: " + produto.Nome + ", R$ " + produto.Preco + ", " + produto.Quantidade + " unidades, Total: R$ " + produto.valorEmEstoque());
        sc.close();
    }
}