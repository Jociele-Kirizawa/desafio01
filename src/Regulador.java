public class Regulador {

   public static void aplicar( Mercado[]mercados){

      for (int i = 0; i< mercados.length; i++){
          Vendedor[] vendedores1 = mercados[i].getVendedores();
          for(int j =0; j< vendedores1.length; j++){
              if (mercados[i].getMeta()<=vendedores1[j].getValor()){
                  vendedores1[j].setBonificacao(vendedores1[j].getValor()*0.1);
              }
              System.out.printf("Vendedor %s recebeu bonificação %.2f\n", vendedores1[j].getNome(), vendedores1[j].getBonificacao());
          }


      }

   }
}
