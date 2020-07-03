package AV1.Elevador;

import java.util.Scanner;

public class Menu {
    Elevador a = new Elevador(10, 8);

    public void digitar()   {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a opção desejada:\n 1 - Entrar Pessoa.\n 2 - Sair Pessoa.\n 3 - Subir Andar.\n 4 - Descer Andar.");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                a.entra();
                System.out.println(a.toString());
                digitar();
                break;
            case 2:
                a.sai();
                System.out.println(a.toString());
                digitar();
                break;
            case 3:
                a.sobe();
                System.out.println(a.toString());
                digitar();
                break;
            case 4:
                a.desce();
                System.out.println(a.toString());
                digitar();
                break;
            default:
                System.out.println("Comando inválido");
        }
        sc.close();
    }
}
