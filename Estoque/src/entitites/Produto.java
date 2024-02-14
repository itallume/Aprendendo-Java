package entitites;

public class Produto {
    public String Nome;
    public double Preco;
    public int Quantidade;

    public double valorEmEstoque(){
        return Preco * Quantidade;
    }

    public void AdicionarProdutos(int NumProdutos){
        Quantidade += NumProdutos;
    }

    public void RemoverProdutos(int NumProdutos){
        Quantidade -= NumProdutos;
    }
}
