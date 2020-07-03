package Mercado;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Produto[]p = new Produto[1];
        Cliente[]c = new Cliente[1];
        Compra  []x = new Compra[1];

        for (int i = 0; i < p.length; i++) {
            System.out.println("Digite o códico do produto: ");
                int codigoaux = sc.nextInt();
            System.out.println("Digite o preço do produto: ");
                double precoaux = sc.nextDouble();

            while(precoaux < 20 || precoaux > 350) {
                System.out.println("Digite o preço do produto: ");
                precoaux = sc.nextDouble();
            }
            p[i] = new Produto(codigoaux,precoaux);
        }

        for(int i = 0 ; i < c.length; i++) {
            System.out.println("Digite o nome do cliente: ");
                String nomeaux = sc.next();
            System.out.println("Digite o código do cliente: ");
                int codigoaux = sc.nextInt();
            System.out.println("Digite o sexo do cliente: ");
                char sexoaux = sc.next().charAt(0);

            while(sexoaux != 'F' && sexoaux !='f' && sexoaux != 'M' && sexoaux !='m')
            {
                System.out.println("Digite o sexo do cliente: ");
                sexoaux = sc.next().charAt(0);
            }
            c[i] = new Cliente(nomeaux,codigoaux,sexoaux);
        }

        for(int i = 0 ; i < x.length; i++) {
            System.out.print("Digite o códico do produto:");
            int numaux = sc.nextInt();
            System.out.print("Digite o códico do cliente:");
            int codaux = sc.nextInt();
            System.out.println("Digite a quantidade do Produto:");
            int quant = sc.nextInt();

            x[i] = new Compra(p[i], c[i], quant);
        }

        for (int i = 0 ; i < 1; i++)    {
            System.out.print("O valor total da compra é: ");
            System.out.println(x[i].descontoFinal());
            System.out.println(x[i].toString());
            System.out.println(c[i].toString());
            System.out.println(p[i].toString());
        }
    }
}
