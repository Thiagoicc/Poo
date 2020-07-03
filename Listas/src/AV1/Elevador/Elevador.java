package AV1.Elevador;

public class Elevador {
    private int andarAtual,
                totalAndares,
                capacidadeElevador,
                pessoasAtuais;

    public Elevador(int totalAndares, int capacidadeElevador) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        andarAtual = 0;
        pessoasAtuais = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getPessoasAtuais() {
        return pessoasAtuais;
    }

    public void setPessoasAtuais(int pessoasAtuais) {
        this.pessoasAtuais = pessoasAtuais;
    }

    public void entra() {
        if(pessoasAtuais < capacidadeElevador)
            pessoasAtuais++;
        else
            System.out.println("Lotado");
    }

    public void sai()   {
        if (pessoasAtuais > 0)
            pessoasAtuais--;
        else
            System.out.println("Vazio");
    }

    public void sobe()  {
        if (andarAtual < totalAndares)
            andarAtual++;
        else
            System.out.println("ERROR");
    }

    public void desce() {
        if(andarAtual > 0)
            andarAtual--;
        else
            System.out.println("ERROR");
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "andarAtual=" + andarAtual +
                ", totalAndares=" + totalAndares +
                ", capacidadeElevador=" + capacidadeElevador +
                ", pessoasAtuais=" + pessoasAtuais +
                '}';
    }
}
