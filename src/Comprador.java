import java.util.Random;

public class Comprador {
    int compras=0;
    private String nome_comprador;


    public Comprador(String nome_comprador) {
        this.nome_comprador = nome_comprador;
    }

    public String getNome_comprador(){
        return nome_comprador;
    }

    static Random aleatorio = new Random();

    public void pagamento(Vendedor vendedor) {
        vendedor.setValor(100 + aleatorio.nextDouble(900));
        compras++;
    }
    public int getCompras(){
        return compras;
    }


}




