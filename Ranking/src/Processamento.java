import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Processamento {
    ArrayList<Jogador> jogador = new ArrayList<>(10);

    public void add(String nome, int score){
        Jogador aux = new Jogador(nome, score);
        jogador.add(aux);
    }

    public void ordenar()   {
        Collections.sort(jogador);
    }

    public void lerArq(String arq)    {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\thiag\\Desktop\\"  + arq + ".txt"));
            String linha = br.readLine();

            for(int i = 0; i < 10; i++) {
                System.out.println(linha);
                linha = br.readLine();
            }

        }   catch (Exception ioe)   {
            ioe.printStackTrace();
        }
    }

    public void salvarArq() throws IOException  {
        FileWriter arq = new FileWriter("C:\\Users\\thiag\\Desktop\\placar.txt");
        PrintWriter gravarar = new PrintWriter(arq);

        for (Jogador j : jogador) {
            gravarar.printf(String.valueOf(j));
            gravarar.printf("%n");
        }

        arq.close();

    }
}
