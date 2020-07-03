public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int dia,
                mes;

    public Pessoa() {
    }

    public Pessoa(String nome, int dia, int mes) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dia=" + dia +
                ", mes=" + mes +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return (this.nome.compareTo(pessoa.getNome()));
    }


}