public class Jogador implements Comparable<Jogador>{
    private String nome;
    private int score;

    public Jogador(String nome, int score) {
        this.nome = nome;
        this.score = score;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Jogador e) {
        return Integer.compare(e.getScore(), score);
    }
}
