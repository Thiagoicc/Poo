package Mercado;

public class Compra {
    private Produto produto;
    private Cliente cliente;
    private int quantidade;
    private double valorTotal;

    public Compra(Produto produto, Cliente cliente, int quantidade) {
        this.produto = produto;
        this.cliente = cliente;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double descontoFinal()   {
        if(cliente.descontoAdicional() == true)
            return (produto.calcDesc() * 0.95) * quantidade;
        else
            return produto.calcDesc() * quantidade;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "produto=" + produto +
                ", cliente=" + cliente +
                ", quantidade=" + quantidade +
                ", valorTotal=" + valorTotal +
                '}';
    }
}