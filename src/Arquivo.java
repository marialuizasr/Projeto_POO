import java.io.*;

public class Arquivo {
        public String nomeArquivo;

        private OutputStream os;
        private OutputStreamWriter osw;
        private BufferedWriter bf;

        private InputStream is;
        private InputStreamReader isr;
        private BufferedReader br;

        private String linha;

        public Arquivo(String nomeArquivo){
            this.nomeArquivo = nomeArquivo;

            os = null;
            osw = null;
            bf = null;

            is = null;
            isr = null;
            br = null;
        }

        public void escrever(Cliente cliente) {
            try{
                os = new FileOutputStream(this.nomeArquivo, true);
                osw = new OutputStreamWriter(os);
                bf = new BufferedWriter(osw);

                bf.write("Cliente:" + "\n");
                bf.write(cliente.nome + "\n");
                bf.write(cliente.cpf + "\n");
                bf.write(cliente.telefone + "\n");

            }catch(Exception e){
                System.out.println(e);
            }finally {
                try{
                    bf.close();
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
}
