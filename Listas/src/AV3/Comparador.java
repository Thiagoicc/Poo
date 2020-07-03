import java.util.Comparator;

public class Comparador implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa, Pessoa t1) {
        return Integer.compare(pessoa.getMes(), t1.getMes());
    }
}
