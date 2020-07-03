package Av2;

public class Funcionario implements Comparable<Funcionario>{
    private String nome;
    private int codico;
    private Cargo cargos;

    public Funcionario(String nome, int codico, Cargo cargos) {
        this.nome = nome;
        this.codico = codico;
        this.cargos = cargos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodico() {
        return codico;
    }

    public void setCodico(int codico) {
        this.codico = codico;
    }

    public Cargo getCargos() {
        return cargos;
    }

    public void setCargos(Cargo cargos) {
        this.cargos = cargos;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", codico=" + codico +
                ", cargos=" + cargos +
                '}';
    }

    @Override
    public int compareTo(Funcionario e) {
        return Double.compare(cargos.getSalario(), e.cargos.getSalario());
    }
}
