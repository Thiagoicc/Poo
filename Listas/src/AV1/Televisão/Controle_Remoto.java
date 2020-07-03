package AV1.Televisão;

public class Controle_Remoto    {
    public Televisão televisão;

    public Controle_Remoto(Televisão televisão) {
        this.televisão = televisão;
    }

    public void abaixaVolume() {
        televisão.abaixaVolume();
    }

    public void aumentaVolume() {
        televisão.aumentaVolume();
    }

    public void botaoMudo() {
        televisão.botaoMudo();
    }

    public void abaixaCanal() {
        televisão.abaixaCanal();
    }

    public void aumentacanal() {
        televisão.aumentacanal();
    }

    public void escolheCanal(int canal) {
        televisão.escolheCanal(canal);
    }

   public void botaoLiga()  {
        televisão.botaoLiga();
   }
}