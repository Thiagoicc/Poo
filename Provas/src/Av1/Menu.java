package Av1;

import java.util.Scanner;
public class Menu {

    Cadastro c = new Cadastro();

    public void digitar()   {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a opção desejada:\n1 - Cadastrar Produto\n2 - Alterar Cadastro\n3 - Mostrar Produtos Cadastrados\n4 - Mostrar Produto Mais Caro");
        int mn = sc.nextInt();

        switch (mn) {
            case 1:
                c.cadastrar();
                break;
            case 2:
                c.alterarCadastro();
                break;
            case 3:
                c.dadosProdutos();
                break;
            case 4:
                c.produtoMaisCaro();
                break;
            default:
                System.out.println("Comando Inválido\n Digite a opção desejada:\n1 - Cadastrar Produto\n2 - Alterar Cadastro" +
                        "\n3 - Mostrar Produtos Cadastrados\n4 - Mostrar Produto Mais Caro");
                break;
        }
        digitar();
    }
}
