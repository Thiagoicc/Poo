package Mercado;

public class Produto    {
    private int prodCodico;
    private double prodPreco;

    public Produto(int prodCodico, double prodPreco) {
        this.prodCodico = prodCodico;
        this.prodPreco = prodPreco;
    }

    public int getProdCodico() {
        return prodCodico;
    }

    public void setProdCodico(int prodCodico) {
        this.prodCodico = prodCodico;
    }

    public double getProdPreco() {
        return prodPreco;
    }

    public void setProdPreco(double prodPreco) {
        this.prodPreco = prodPreco;
    }

    public double calcDesc()    {
        if (prodPreco >= 100)
            return  prodPreco * 0.85;
        else
            return  prodPreco * 0.95;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "prodCodico=" + prodCodico +
                ", prodPreco=" + prodPreco +
                '}';
    }
}