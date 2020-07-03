package Secretaria.Base;

public class Disciplina_Pratica extends Disciplina {
    private Double cargaHorariaPratica;

    public Disciplina_Pratica(Double cargaHorariaPratica) {
        this.cargaHorariaPratica = cargaHorariaPratica;
    }

    public Disciplina_Pratica(String nome, int codico, Double cargaHorariaPratica) {
        super(nome, codico);
        this.cargaHorariaPratica = cargaHorariaPratica;
    }

    public Double getCargaHorariaPratica() {
        return cargaHorariaPratica;
    }

    public void setCargaHorariaPratica(Double cargaHorariaPratica) {
        this.cargaHorariaPratica = cargaHorariaPratica;
    }
}