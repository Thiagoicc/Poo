package Av1;

public class Higiene extends Produtos{

    public Higiene(int codico, String descricao, double preco, double percentualLucro) {
        super(codico, descricao, preco, percentualLucro);
    }

    @Override
    public double lucro() {
        return getPreco() * 0.3;
    }
}
