public class Cliente {

    protected String nome;
    protected String cpf;
    protected String telefone;
    Compra compra = new Compra();

    public void mostraInfo() {
        System.out.println("Nome do cliente: "+this.nome);
        System.out.println("CPF do cliente: "+this.cpf);
        System.out.println("Detalhes da compra:");
        compra.mostraInfo();
    }
}
