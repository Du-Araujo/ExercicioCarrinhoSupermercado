import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.parseInt;



public class GerenciarProdutos {

    Scanner sc = new Scanner(System.in);
     public static Cesta cesta;

    List<Produto> marketList = new ArrayList<>();






    public GerenciarProdutos(){

        Fornecedor Ambev = new Fornecedor();
        Contato Zezinho = new Contato();
        Zezinho.setNome("Zezinho");
        Zezinho.setEmail("zezinho@ambev.com");
        Zezinho.setTelefone("19-99954504");

        Produto original = new Produto();
        original.setFornecedor(Ambev);
        original.setCodigo(1);
        original.setItem("Cerveja Original");
        original.setPreco(8.65);
        original.setQuantidade(0);

        Produto antartica = new Produto();
        antartica.setFornecedor(Ambev);
        antartica.setCodigo(2);
        antartica.setItem("Cerveja Antartica de Agudos");
        antartica.setPreco(8.33);
        antartica.setQuantidade(0);

        Produto guarana = new Produto();
        guarana.setFornecedor(Ambev);
        guarana.setCodigo(3);
        guarana.setItem("Guarana Antartica");
        guarana.setPreco(8.33);
        guarana.setQuantidade(0);



        marketList.add(original);
        marketList.add(antartica);
        marketList.add(guarana);

    }


    public static void main(String[] args) {
        GerenciarProdutos gp = new GerenciarProdutos();
        cesta = new Cesta();
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n*** MENU PRINCIPAL ***");
            System.out.println("1 - Adicionar Item");
            System.out.println("2 - Finalizar Compra");
            System.out.println("3 - Listar Carrinho");
            System.out.println("4 - Excluir Item do Carrinho");
            System.out.println("51 - Sair");
            opcao = parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    gp.adicionaritem();
                    break;
                case 2:
                    gp.calaculartotal();
                    break;
                case 3:
                    gp.exibirlista();
                    break;
                case 4:
                    gp.excluirItem();
                    break;
                case 51:
                    System.out.println("PROGRAMA FINALIZADO! \n");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA \n");
            }
        } while (opcao != 51);

    }


    public void adicionaritem() {

            System.out.println("LISTA DE PRODUTOS \n" + marketList);

        System.out.println("\nDigite o codigo so item desejado: ");

        Produto produtoescolhido = new Produto();
        produtoescolhido.setCodigo((Integer.parseInt(sc.nextLine())));

        if (marketList.contains(produtoescolhido)) {
            Produto produtoMerc = marketList.get(marketList.indexOf(produtoescolhido));
            System.out.println("Digite a quantide: ");

            produtoescolhido.setItem(produtoMerc.getItem());
            produtoescolhido.setQuantidade(Integer.parseInt(sc.nextLine()));
            produtoescolhido.setPreco(produtoMerc.getPreco());

            cesta.adicionarItem(produtoescolhido);
            System.out.println("Item Adicionado: " + produtoMerc.getItem() + "\n");
        }
        else {
            System.out.println("ITEM NAO IDENTIFICADO! \n");
        }
    }

    public void calaculartotal() {
        double total = 0;
        for (Produto produto : cesta.getCesta()) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        System.out.printf("Total Compra R$: %.2f \n" , total );
    }

    public void exibirlista() {
        for (Produto produto : cesta.getCesta()) {
            System.out.println("\n***************************\nCodigo Item: " + produto.getCodigo());
            System.out.println("Produto: " + produto.getItem());
            System.out.print("Quantidade: " + produto.getQuantidade() + "\n***************************\n");
        }
    }

    public void excluirItem () {

        System.out.println("Digite o codigo do produto a ser Removido:");
        int codigoEscolhido = sc.nextInt();

        for (int i = 0; i< marketList.size();i++)
        {
            if (marketList.get(i).getCodigo() == codigoEscolhido)
            {
                marketList.remove(i);
            }
            else
            {
                System.out.println("CODIGO NAO IDENTIFICADO!");
            }
        }


    }


}