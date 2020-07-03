package Av1;

import java.util.Scanner;

public class Cadastro {
    Scanner sc = new Scanner(System.in);

    Produtos produtos[] = new Produtos[15];
    int cont = 0;

    public boolean pesquisarCodico(int x){
        for(int i = 0; i < cont; i++){

            if(produtos[i].getCodico() == x){
                return true;
            }
        }
        return false;
    }

    public void cadastrar() {
        if(cont >=0 && cont <= produtos.length - 1) {
            System.out.println("Digite o produto para cadastro:\n1 - Remédio\n2 - Higiene");
            int tipo = sc.nextInt();

            if (tipo == 1) {
                System.out.println("Digite o códico do produto: ");
                int codAux = sc.nextInt();

                System.out.println("Digite a descrição do produto: ");
                sc.nextLine();
                String descAux = sc.nextLine();

                System.out.println("Digite o preço do produto:  ");
                double precoAux = sc.nextDouble();

                System.out.println("Digite o percentual de lucro:   ");
                double perLucroAux = sc.nextDouble();

                System.out.println("Digite a data de vencimento:    ");
                String dataAux = sc.next();

                Remedio aux = new Remedio(codAux, descAux, precoAux, perLucroAux, dataAux);

                produtos[cont] = aux;

                System.out.println("Lucro: " + aux.lucro());

                cont++;
            } else if (tipo == 2) {
                System.out.println("Digite o códico do produto: ");
                int codAux = sc.nextInt();

                System.out.println("Digite a descrição do produto: ");
                sc.nextLine();
                String descAux = sc.nextLine();

                System.out.println("Digite o preço do produto:  ");
                double precoAux = sc.nextDouble();

                Higiene aux = new Higiene(codAux, descAux, precoAux, 30);

                produtos[cont] = aux;

                System.out.println("Lucro: " + aux.lucro());

                cont++;
            } else
                System.out.println("ERROR");
        } else {
            System.out.println("Máximo de produtos cadastrados!");
        }
    }

    public void alterarCadastro()   {
        boolean achou;

        System.out.println("Digite o códico que deseja alterar: ");
           int codAux = sc.nextInt();

           achou = pesquisarCodico(codAux);

           if(!achou)
               System.out.println("Códico inexistente");
           else
               System.out.println("Nova descrição: ");
                sc.nextLine();
                String desAux = sc.nextLine();
                produtos[codAux - 1].setDescricao(desAux);

               System.out.println("Novo preço: ");
                double precoAux = sc.nextDouble();
                produtos[codAux - 1].setPreco(precoAux);

               System.out.println("Novo percentual de lucro: ");
                double perLucAux = sc.nextDouble();
                produtos[codAux - 1].setPercentualLucro(perLucAux);

            System.out.println("Novo lucro: " + produtos[codAux - 1].lucro());
    }

    public void produtoMaisCaro()   {
        double maior = produtos[0].getPreco();
        int indice = 0;

        for (int i = 1; i < cont; i++)   {
            if(produtos[i].getPreco() > maior)  {
                maior = produtos[i].getPreco();
                indice = i;
            }
        }

        System.out.println("Produto de maior preço: " + produtos[indice].toString());
    }

    public void dadosProdutos() {
        for (int i = 0; i < cont; i++)  {
            System.out.println(produtos[i].toString());
        }
    }
}
