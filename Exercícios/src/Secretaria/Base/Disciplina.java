package Secretaria.Base;

public class Disciplina {
    private String nome;
    private int codico;

    public Disciplina() {
    }

    public Disciplina(String nome, int codico) {
        this.nome = nome;
        this.codico = codico;
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
}