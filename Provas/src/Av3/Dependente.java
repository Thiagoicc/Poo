package Av3;

public class Dependente {
    private String nome;

    Funcionario funcionario;

    public Dependente(String nome) {
        this.nome = nome;
    }

    public Dependente(String nome, Funcionario funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "nome='" + nome + '\'' +
                ", funcionario=" + funcionario +
                '}';
    }
}
