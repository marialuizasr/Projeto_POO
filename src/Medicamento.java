public class Medicamento extends Produto {
    public Medicamento(String nome, float preco) {
        super(nome, preco);
    }

    public Medicamento(){

    }

    @Override
    public void mostraInfo() {
        System.out.println("Dados do medicamento:");
        super.mostraInfo();
    }
}
