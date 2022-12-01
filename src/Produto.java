import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Produto {

    private  Fornecedor fornecedor;
    private int codigo;
    private String item;
    private double preco;
    private int quantidade;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public static List<Produto> itens = new ArrayList<>();


    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null  || getClass() != obj.getClass())
            return false;
        Produto produto = (Produto) obj;
        return codigo == produto.codigo;
        }

    @Override
    public String toString() {
        return "\n" + " PRODUTO " + "\n" +
                "codigo: " + codigo + "\n" +
                "Item: " + item + "\n" +
                "Preco R$: " + preco + "\n" +
                "Quantidade: " + quantidade + "\n" ;
    }
}
