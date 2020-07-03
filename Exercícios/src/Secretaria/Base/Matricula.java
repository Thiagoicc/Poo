package Secretaria.Base;

public class Matricula {
    private int anoLetivo,
            serie;

    private Double notaAv1,
            notaAv2,
            notaAv3,
            notaAv4;

    private Disciplina disciplina;
    private Aluno aluno;

    public Matricula() {
    }

    public Matricula(int anoLetivo, int serie, Disciplina disciplina, Aluno aluno) {
        this.anoLetivo = anoLetivo;
        this.serie = serie;
        this.disciplina = disciplina;
        this.aluno = aluno;
        notaAv1 = 0.0;
        notaAv2 = 0.0;
        notaAv3 = 0.0;
        notaAv4 = 0.0;
    }

    public Matricula(Double notaAv1, Double notaAv2, Double notaAv3, Double notaAv4) {
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
        this.notaAv3 = notaAv3;
        this.notaAv4 = notaAv4;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Double getNotaAv1() {
        return notaAv1;
    }

    public void setNotaAv1(Double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public Double getNotaAv2() {
        return notaAv2;
    }

    public void setNotaAv2(Double notaAv2) {
        this.notaAv2 = notaAv2;
    }

    public Double getNotaAv3() {
        return notaAv3;
    }

    public void setNotaAv3(Double notaAv3) {
        this.notaAv3 = notaAv3;
    }

    public Double getNotaAv4() {
        return notaAv4;
    }

    public void setNotaAv4(Double notaAv4) {
        this.notaAv4 = notaAv4;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Base.Matricula{" +
                "anoLetivo=" + anoLetivo +
                ", serie=" + serie +
                ", notaAv1=" + notaAv1 +
                ", notaAv2=" + notaAv2 +
                ", notaAv3=" + notaAv3 +
                ", notaAv4=" + notaAv4 +
                ", disciplina=" + disciplina.getNome() +
                ", aluno=" + aluno.getNome() +
                '}';
    }
}