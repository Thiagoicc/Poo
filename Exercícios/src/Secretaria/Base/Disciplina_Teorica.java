package Secretaria.Base;

public class Disciplina_Teorica extends Disciplina{
    private Double cargaHorariaTeorica;

    public Disciplina_Teorica(Double cargaHorariaTeorica) {
        this.cargaHorariaTeorica = cargaHorariaTeorica;
    }

    public Disciplina_Teorica(String nome, int codico, Double cargaHorariaTeorica) {
        super(nome, codico);
        this.cargaHorariaTeorica = cargaHorariaTeorica;
    }

    public Double getCargaHorariaTeorica() {
        return cargaHorariaTeorica;
    }

    public void setCargaHorariaTeorica(Double cargaHorariaTeorica) {
        this.cargaHorariaTeorica = cargaHorariaTeorica;
    }
}