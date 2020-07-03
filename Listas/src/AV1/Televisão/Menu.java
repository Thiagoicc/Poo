package AV1.Televisão;

import java.util.Scanner;

public class Menu {
    Televisão a = new Televisão();
    Controle_Remoto cr = new Controle_Remoto(a);

    public void digitar()   {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a opção desejada:\n 1 - Ligar/Desligar Televisão.\n 2 - Aumentar Volume.\n 3 - Abaixar Volume.\n 4 - Mutar Volume.\n 5 - Aumentar Canal.\n 6 - Diminuir Canal.\n 7 - Escolher Canal.");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                cr.botaoLiga();
                System.out.println(a.toString());
                digitar();
                break;
            case 2:
                cr.aumentaVolume();
                System.out.println(a.toString());
                digitar();
                break;
            case 3:
                cr.abaixaVolume();
                System.out.println(a.toString());
                digitar();
                break;
            case 4:
                cr.botaoMudo();
                System.out.println(a.toString());
                digitar();
                break;
            case 5:
                cr.aumentacanal();
                System.out.println(a.toString());
                digitar();
                break;
            case 6:
                cr.abaixaCanal();
                System.out.println(a.toString());
                digitar();
                break;
            case 7:
                System.out.println("Digite o canal desejado: ");
                    int can = sc.nextInt();
                cr.escolheCanal(can);
                System.out.println(a.toString());
                digitar();
                break;
            default:
                System.out.println("Comando inválido");
        }
        sc.close();
    }
}

