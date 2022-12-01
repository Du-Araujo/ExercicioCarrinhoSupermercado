import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cesta {
    private List<Produto>  cesta = new ArrayList<>();

    public List<Produto> getCesta(){
        return cesta;
    }

    public void exibirLista (Produto cesta) { GerenciarProdutos.cesta.exibirLista(cesta); }


    public void adicionarItem (Produto produto) { cesta.add(produto); }

    public void excluirItem (Produto produto) { cesta.remove(produto); }

    public void calcularTotal(Produto produtoTotal) {

    }

    public String toString() {
        return "\n" + "Cesta {" + "\n" +
                "Cesta: " + cesta + "\n" +
                '}';
    }

}
