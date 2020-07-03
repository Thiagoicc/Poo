package Av3;

public class Funcionario {
    private String nome, cargo;

    private int codico, quantDep;

    private double salario;

    public Funcionario(String nome, String cargo, double salario, int quantDep, int codico) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.quantDep = quantDep;
        this.codico = codico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCodico() {
        return codico;
    }

    public void setCodico(int codico) {
        this.codico = codico;
    }

    public int getQuantDep() {
        return quantDep;
    }

    public void setQuantDep(int quantDep) {
        this.quantDep = quantDep;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", codico=" + codico +
                ", quantDep=" + quantDep +
                ", salario=" + salario +
                '}';
    }
}
