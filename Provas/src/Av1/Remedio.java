package Av1;

public class Remedio extends Produtos{
    private String dataVenc;

    public Remedio(int codico, String descricao, double preco, double percentualLucro, String dataVenc) {
        super(codico, descricao, preco, percentualLucro);
        this.dataVenc = dataVenc;
    }

    public String getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }

    @Override
    public double lucro()   {
        return getPreco() * getPercentualLucro() /100;
    }
}
