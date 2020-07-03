package AV1.Agenda;

import java.util.Scanner;

public class Agenda{
    Scanner sc = new Scanner(System.in);

    int contador = 0;

    Pessoa[] pessoas = new Pessoa[10];

    public void armazenaPessoa()    {
        if (contador <= 10 && contador >= 0) {
           System.out.println("Digite o nome da pessoa: ");
                String nomeAux = sc.next();
            System.out.printf("Digite a data de nascimento de %s%n", nomeAux);
                String dataNasAux = sc.next();
            System.out.printf("Digite a altura de %s%n", nomeAux);
                double alturaAux = sc.nextDouble();

            pessoas[contador] = new Pessoa(nomeAux,dataNasAux,alturaAux);
                contador++;
        }
        else
            System.out.println("Vetor Lotado!");
    }

    public void removePessoa()  {
        System.out.println("Digite o nome da pessoa que deseja remover: ");
            String nomeRemove = sc.next();

        for (int i = 0; i < contador; i++)  {
            if (nomeRemove.equals(pessoas[i].getNome()))    {
                pessoas[i] = null;
                System.out.println("Pessoa Removida!");
                contador--;
                break;
            }
            else
                System.out.println("Pessoa não encontrada");
        }
    }

    public void buscaPessoa()    {
        System.out.println("Digite o nome da pessoa que deseja procurar: ");
            String nomeBusca = sc.next();

        for (int i = 0; i < contador; i++)  {
            if (nomeBusca.equals(pessoas[i].getNome())) {
                System.out.printf("%s está na %dº posição%n", nomeBusca, i);
                break;
            }
            else
                System.out.println("Pessoa não encontrada");
        }
    }

    public void imprimeAgenda() {
        for (int i = 0; i < contador; i++)    {
            System.out.println(pessoas[i].toString());
        }
    }

    public void imprimePessoa() {
        System.out.println("Digite a posição da pessoa que deseja mostrar: ");
            int pos = sc.nextInt();

        if(pessoas[pos] != null)    {
            System.out.println(pessoas[pos].toString());
        }
        else
            System.out.println("Posição vazia!");
    }
}
