package Av1;

public abstract class Produtos {
    private int codico;
    private String descricao;
    private double preco,
            percentualLucro;

    public Produtos(int codico, String descricao, double preco, double percentualLucro) {
        this.codico = codico;
        this.descricao = descricao;
        this.preco = preco;
        this.percentualLucro = percentualLucro;
    }

    public int getCodico() {
        return codico;
    }

    public void setCodico(int codico) {
        this.codico = codico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualLucro() {
        return percentualLucro;
    }

    public void setPercentualLucro(double percentualLucro) {
        this.percentualLucro = percentualLucro;
    }

    public abstract double lucro();

    @Override
    public String toString() {
        return "Produtos{" +
                "codico=" + codico +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", percentualLucro=" + percentualLucro +
                '}';
    }
}
