public class Perfumaria extends Produto {

    public Perfumaria(){

    }
    public Perfumaria(String nome, float preco) {
        super(nome, preco);
    }

    @Override
    public void mostraInfo() {
        System.out.println("Dados do produto de perfumaria:");
        super.mostraInfo();
    }
}
