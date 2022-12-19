public class Mercado {
    private String nome;
    private String local;
    private double meta;
    private Vendedor [] vendedores;

    private Comprador[] compradores;

    public Mercado(String nome, String local, Vendedor[] vendedores) {
        this.nome=nome;
        this.local=local;
        this.vendedores=vendedores;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }



}


