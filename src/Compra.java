public class Compra implements Pagamento {

    protected float valorTotal;
    protected float valorPago;
    protected float troco;
    Produto[] produtos = new Produto[100];

    public void calculaTotal(){
        for (Produto produto : this.produtos) {
            if (produto != null) {
                this.valorTotal += produto.preco;
            }
        }
        System.out.println("Valor total = R$"+this.valorTotal);
    }

    public void mostraInfo() {
        System.out.println("Valor total: R$"+this.valorTotal);
        System.out.println("Valor pago: R$"+this.valorPago);
    }

    public void calculaTroco() {
        this.troco = this.valorPago - this.valorTotal;
        System.out.println("Troco: R$"+this.troco);
    }

    @Override
    public void metodoDePagamento(int cod) {
        if(cod == 1) {
            System.out.println("Cliente pagou com cartao de credito.");
        }
        if(cod == 2) {
            System.out.println("Cliente pagou com cartao de debito.");
        }
        if(cod == 3) {
            System.out.println("Cliente pagou com dinheiro.");
        }
        if(cod == 4) {
            System.out.println("Cliente pagou com pix.");
        }
    }
}
