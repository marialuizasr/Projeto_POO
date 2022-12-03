public abstract class Produto {

    protected String nome;
    protected float preco;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {

    }

    public void mostraInfo() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Preco: R$"+this.preco);
    }
}
