public class Fornecedor {

    private int codigo;

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String fornecedor;
    private Contato contato;

    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) { this.codigo = codigo; }



    public String getEndereco() { return endereco; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getCidade() { return cidade; }

    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    public String getFornecedor() { return fornecedor; }

    public void setFornecedor(String fornecedor) { this.fornecedor = fornecedor; }

    public Contato getContato() { return contato; }

    public void setContato(Contato contato) { this.contato = contato; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fornecedor() {

    }

    public Fornecedor (int codigo, String nome, String endereco, Contato c) {

    }

    public void setFornecedor() {

    }

    public void setNome() {

    }

    public void setEndereco() {

    }

    public void setCidade() {
    }

    public void setEstado() {

    }

    @Override
    public String toString() {
        return "\n" + "Fornecedor{" +
                "Codigo: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Endereco: " + endereco + "\n" +
                "Cidade:" + cidade + "\n" +
                "Estado: " + estado + "\n" ;
    }



}
