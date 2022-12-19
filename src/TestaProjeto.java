import com.sun.tools.javac.Main;
//Em cada Mercado eu fiz uma tribuição de vendedores diferentes
//no primeiro, fiz manualmente
//no segundo, pelo for
//no terceiro via scanner
import java.util.Random;
import java.util.Scanner;

public class TestaProjeto {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner scan = new Scanner(System.in);
       double somaConfianca=0;
       double somaFlores=0;
       double somaFrutas=0;


       Comprador [] compradores = new Comprador[10];
       for (int i =0; i< compradores.length; i++){
           compradores[i]= new Comprador( "Comprador número " + String.valueOf(i));
       }

        Vendedor[] vendedorConfianca = new Vendedor[10];
        vendedorConfianca[0] = new Vendedor("Jociele");
        compradores[aleatorio.nextInt(9)].pagamento(vendedorConfianca[0]);
        vendedorConfianca[1]=new Vendedor("Antonio");
        compradores[aleatorio.nextInt(9)].pagamento(vendedorConfianca[1]);
        vendedorConfianca[2] = new Vendedor("Gabriel");
        compradores[aleatorio.nextInt(9)].pagamento(vendedorConfianca[2]);
        vendedorConfianca[3]=new Vendedor("Juliano");
        compradores[aleatorio.nextInt(9)].pagamento(vendedorConfianca[3]);
        vendedorConfianca[4] = new Vendedor("Heloisa");
        compradores[aleatorio.nextInt(9)].pagamento(vendedorConfianca[4]);
        vendedorConfianca[5]=new Vendedor("Leticia");
        compradores[aleatorio.nextInt(9)].pagamento(vendedorConfianca[5]);
        vendedorConfianca[6] = new Vendedor("Caio");
        compradores[aleatorio.nextInt(9)].pagamento(vendedorConfianca[6]);
        vendedorConfianca[7]=new Vendedor("Lucas");
        compradores[aleatorio.nextInt(9)].pagamento(vendedorConfianca[7]);
        vendedorConfianca[8] = new Vendedor("Simone");
        compradores[aleatorio.nextInt(9)].pagamento(vendedorConfianca[8]);
        vendedorConfianca[9]=new Vendedor("Michele");
        compradores[aleatorio.nextInt(9)].pagamento(vendedorConfianca[9]);

        Comprador maiorComprador = compradores[0];
        for (int i=0; i<  compradores.length; i++){
            if( maiorComprador.getCompras() < compradores[i].getCompras()){
                maiorComprador = compradores[i];
            }

        }

        Mercado mercadoConfianca = new Mercado("Confiança", "Sorocaba",vendedorConfianca);
        mercadoConfianca.setMeta(300);

        Vendedor maiorConfianca = vendedorConfianca[0];

        for (int i = 0; i < vendedorConfianca.length; i++) {
            somaConfianca += vendedorConfianca[i].getValor();
            if( maiorConfianca.getValor()< vendedorConfianca[i].getValor()){
                maiorConfianca = vendedorConfianca[i];
            }
            System.out.printf("O vendedor %s, vendeu %.2f\n",vendedorConfianca[i].getNome(), vendedorConfianca[i].getValor());
        }



        Vendedor[] vendedorFlores = new Vendedor[10];

        for (int i= 0 ; i<vendedorFlores.length; i++ ){
            vendedorFlores[i]= new Vendedor("Vendedor de Flores " + String.valueOf(i));
            compradores[aleatorio.nextInt(9)].pagamento(vendedorFlores[i]);
            somaFlores += vendedorFlores[i].getValor();

            System.out.printf( "%s :  vendeu: %.2f\n", vendedorFlores[i].getNome() , vendedorFlores[i].getValor());
        }
        Vendedor maiorFlores = vendedorFlores[0];

        for (int i= 1 ; i<vendedorFlores.length; i++ ) {
            vendedorFlores[i] = new Vendedor("Vendedor de Flores " + String.valueOf(i));
            compradores[aleatorio.nextInt(9)].pagamento(vendedorFlores[i]);
            if (maiorFlores.getValor() < vendedorFlores[i].getValor()) {
                maiorFlores = vendedorFlores[i];

            }
        }

        Mercado mercadoFlores = new Mercado("Flores", "São Paulo", vendedorFlores);
        mercadoFlores.setMeta(500);


        Vendedor[]vendedorFrutas = new Vendedor[10];
        for( int i =0;i < vendedorFrutas.length; i++){
            System.out.println("Digite o nome do vendedor: ");
            vendedorFrutas[i]=new Vendedor(scan.nextLine());
            compradores[aleatorio.nextInt(9)].pagamento(vendedorFrutas[i]);

       }
        Mercado mercadoFrutas = new Mercado("Frutas", "Marília", vendedorFrutas);
        mercadoFrutas.setMeta(700);
         Vendedor maiorFrutas = vendedorFrutas[0];
        for (int i =0; i<vendedorFrutas.length;i++){
            somaFrutas += vendedorFrutas[i].getValor();
            if( maiorFrutas.getValor() < vendedorFrutas[i].getValor() ){
                maiorFrutas = vendedorFrutas[i];
            }
            System.out.printf("%s : vendeu: %.2f ", vendedorFrutas[i].getNome(), vendedorFrutas[i].getValor());

        }
        String nome_Mercado_maior_venda = " ";
        if ( somaConfianca > somaFrutas){
            if (somaConfianca > somaFlores){
              nome_Mercado_maior_venda = mercadoConfianca.getNome();
            }else{
               nome_Mercado_maior_venda = mercadoFlores.getNome();
            }
        }else if (somaFrutas>somaFlores){
            nome_Mercado_maior_venda = mercadoFrutas.getNome();
        }else{
            nome_Mercado_maior_venda = mercadoFlores.getNome();
        }

        Vendedor topVendas = maiorConfianca;
        if (maiorConfianca.getValor()> maiorFrutas.getValor()){
            if (maiorConfianca.getValor()> maiorFlores.getValor()){
                topVendas = maiorConfianca;

            }else if (maiorFrutas.getValor()>maiorFlores.getValor()){
                topVendas= maiorFrutas;
            }else{
                topVendas = maiorFlores;
            }

        }

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("LISTA DE VENDEDORES COM E SEM BONITICAÇÃO");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        Mercado[] mercados = {mercadoConfianca,mercadoFlores,mercadoFrutas};
        Regulador.aplicar(mercados);


        System.out.println("--------------------------------------------------");
        System.out.println("---------TOTAL DE VENDA DE CADA MERCADO-----------");
        System.out.println("--------------------------------------------------");
        System.out.printf("O total de vendas do Mercado confiança foi %.2f", somaConfianca);
        System.out.println(" ");
        System.out.printf("O maior vendedor do Mercado Confiança %s", maiorConfianca.getNome());
        System.out.println(" ");
        System.out.println("--------------------------------------------------");

        System.out.println(" ");
        System.out.printf("O total de vendas do mercado Flores foi de %.2f", somaFlores);
        System.out.println(" ");
        System.out.printf(" O maior vendedor do mercado Flores foi %s", maiorFlores.getNome());
        System.out.println(" ");
        System.out.println("___________________________________________________");

        System.out.println(" ");
        System.out.printf("O total de venda do Mercado Frutas foi de %.2f", somaFrutas);
        System.out.println(" ");
        System.out.printf("O maior Vendedor do Mercado Frutas foi %s" , maiorFrutas.getNome());
        System.out.println(" ");
        System.out.println("__________________________________________________");

        System.out.println(" " );
        System.out.printf(" O TOP vendedor foi %s", topVendas.getNome());
        System.out.println(" ");
        System.out.println("__________________________________________________");

        System.out.println(" ");
        System.out.printf(" O mercado com mais LUCRATIVO foi: %s ", nome_Mercado_maior_venda);
        System.out.println(" ");
        System.out.println("---------------------------------------------------");
        System.out.println(" ");

        System.out.printf("O Comprador que mais comprou foi %s ", maiorComprador.getNome_comprador());
        System.out.println(" ");
    }

}
