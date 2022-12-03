import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo("Arquivo.txt");
        Cliente cliente = new Cliente();

        Scanner input = new Scanner(System.in);
        System.out.println("Deseja iniciar uma compra? 1-sim 2-nao");
        int x = input.nextInt();

        while(x == 1) {
            input.nextLine();
            System.out.println("Digite o nome do cliente:");
            cliente.nome = input.nextLine();

            System.out.println("Digite o cpf do cliente:");
            cliente.cpf = input.nextLine();

            System.out.println("Digite o telefone do cliente:");
            cliente.telefone = input.nextLine();

            System.out.println("Armazenando essas informacoes (nome, CPF e telefone) o cliente concorre a premios!");
            System.out.println("O cliente aceita armazenar essas informacoes?");
            System.out.println("1 - sim");
            System.out.println("2 - nao");
            int a = input.nextInt();
            if(a == 1) {
                Cliente c = new Cliente();
                c.nome = cliente.nome;
                c.cpf = cliente.cpf;
                c.telefone = cliente.telefone;
                arquivo.escrever(c);
            }

            System.out.println("Deseja adicionar um produto? 1-sim 2-nao");
            int y = input.nextInt();

            int i = 0;

            while(y == 1) {
                input.nextLine();
                System.out.println("Este produto se encaixa em:");
                System.out.println("1- Perfumaria");
                System.out.println("2- Medicamento");
                int z = input.nextInt();

                if(z == 1) {
                    cliente.compra.produtos[i] = new Perfumaria();
                }

                else if(z == 2) {
                    cliente.compra.produtos[i] = new Medicamento();
                }

                input.nextLine();

                System.out.println("Digite o nome do produto:");
                cliente.compra.produtos[i].nome = input.nextLine();
                System.out.println("Digite o preco do produto:");
                cliente.compra.produtos[i].preco = input.nextFloat();

                cliente.compra.produtos[i].mostraInfo();
                i++;

                System.out.println("Deseja adicionar mais um produto? 1-sim 2-nao");
                y = input.nextInt();
            }

            cliente.compra.calculaTotal();
            System.out.println("Qual o metodo de pagamento desejado?");
            System.out.println("1- cartao de credito");
            System.out.println("2- cartao de debito");
            System.out.println("3- dinheiro");
            System.out.println("4- pix");

            int pag = input.nextInt();

            cliente.compra.metodoDePagamento(pag);

            if(pag == 3) {
                System.out.println("Quantidade entregue pelo cliente:");
                cliente.compra.valorPago = input.nextFloat();
                cliente.compra.calculaTroco();
            }

            cliente.mostraInfo();

            System.out.println("Deseja iniciar uma nova compra? 1-sim 2-nao");
            x = input.nextInt();
        }
    }
}
