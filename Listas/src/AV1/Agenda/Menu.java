package AV1.Agenda;

import java.util.Scanner;

public class Menu {
    Agenda agenda = new Agenda();

    public void digitar()   {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a opção desejada:\n 1 - Armazenar Pessoa.\n 2 - Remover Pessoa.\n 3 - Buscar Pessoa.\n 4 - Imprimir Agenda.\n 5 - Imprimir Pessoa.\n 6 - Imprimir Agenda e Encerrar Programa");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                agenda.armazenaPessoa();
                digitar();
                break;
            case 2:
                agenda.removePessoa();
                digitar();
                break;
            case 3:
                agenda.buscaPessoa();
                digitar();
                break;
            case 4:
                agenda.imprimeAgenda();
                digitar();
                break;
            case 5:
                agenda.imprimePessoa();
                digitar();
                break;
            case 6:
                agenda.imprimeAgenda();
                break;
            default:
                System.out.println("Comando inválido");
        }
        sc.close();
    }
}

