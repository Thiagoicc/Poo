package AV1.Televisão;

public class Televisão {
    private int volume,
               canal;
    private boolean ligada,
                    mudo;

    public Televisão() {
        volume = 0;
        canal = 0;
        ligada = false;
        mudo = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isMudo() {
        return mudo;
    }

    public void setMudo(boolean mudo) {
        this.mudo = mudo;
    }

    public void abaixaVolume()  {
        if(ligada == true) {
            if (volume > 0 && volume <= 100)
                volume--;
            else
                System.out.println("ERROR");
        }
        else
            System.out.println("ERROR");
    }

    public void aumentaVolume() {
        if(ligada == true) {
            if (volume >= 0 && volume < 100)
                volume++;
            else
                System.out.println("ERROR");
        }
        else
            System.out.println("ERROR");
    }

    public void botaoMudo() {
        if(ligada == true) {
            if (mudo == false)
                mudo = true;
            else
                mudo = false;
        }
        else
            System.out.println("ERROR");
    }

    public void abaixaCanal()  {
        if (ligada == true) {
            if (canal > 0)
                canal--;
            else
                System.out.println("ERROR");
        }
        else
            System.out.println("ERROR");
    }

    public void aumentacanal() {
        if(ligada == true) {
            if (canal >= 0)
                canal++;
        }
        else
            System.out.println("ERROR");
    }

    public void escolheCanal(int canal) {
        if(ligada == true) {
            this.canal = canal;
        }
        else
            System.out.println("ERROR");
    }

    public void botaoLiga()  {
        if(ligada == false)
            ligada = true;
        else
            ligada = false;

    }

    @Override
    public String toString() {
        return "Televisão{" +
                "volume=" + volume +
                ", canal=" + canal +
                ", ligada=" + ligada +
                ", mudo=" + mudo +
                '}';
    }
}
