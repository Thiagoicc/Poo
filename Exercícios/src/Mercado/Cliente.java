package Mercado;

public class Cliente    {
    private String nome;
    private int clienteCodico;
    private char sexo;

    public Cliente(String nome, int clienteCodico, char sexo) {
        this.nome = nome;
        this.clienteCodico = clienteCodico;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClienteCodico() {
        return clienteCodico;
    }

    public void setClienteCodico(int clienteCodico) {
        this.clienteCodico = clienteCodico;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean descontoAdicional()  {
        if(sexo == 'f' || sexo == 'F')
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", clienteCodico=" + clienteCodico +
                ", sexo=" + sexo +
                '}';
    }
}