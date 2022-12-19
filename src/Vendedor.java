import java.util.Random;

public class Vendedor {
    private String nome;
    private double valor;
    private double bonificacao;




    public Vendedor(String nome){
        this.nome = nome;
        this.valor = 0;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
