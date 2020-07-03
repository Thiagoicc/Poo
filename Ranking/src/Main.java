import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Processamento p = new Processamento();

        p.add("Thiago",9);
        p.add("Luan Gadelha",12);
        p.add("Marcos",3);
        p.add("Marcela",1);
        p.add("André",27);

        p.ordenar();
        p.salvarArq();
        p.lerArq("placar");

    }
}
