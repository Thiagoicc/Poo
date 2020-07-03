import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Agenda {
    ArrayList<Pessoa> pessoas = new ArrayList<>(15);

    public void add(String nome, int dia, int mes) throws NumberFormatException{
        Pessoa aux = new Pessoa(nome, dia, mes);
        pessoas.add(aux);
    }

    public void delet(String nome) {
        pessoas.removeIf(pessoa -> pessoa.getNome().equals(nome));
    }

    public void changeDate(String nome, int dia, int mes) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                pessoa.setDia(dia);
                pessoa.setMes(mes);
            }
        }
    }

    public void conferDate(int dia, int mes) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getDia() == dia && pessoa.getMes() == mes)
                JOptionPane.showMessageDialog(null, pessoa, "Data dos Aniversariantes", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void conferMonth(int mes) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getMes() == mes)
                JOptionPane.showMessageDialog(null, pessoa, "Data dos Aniversariantes", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void conferFirstLetter(char l) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().charAt(0) == l)
                JOptionPane.showMessageDialog(null, pessoa, "Aniversariantes com a inicial " + l, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String sortName() {
        Collections.sort(pessoas);

        for (int i = 0; i < pessoas.size(); i++) {
            return pessoas.toString();
        }
        return "ERROR";
    }

    public String sortMonth() {
        pessoas.sort(new Comparador());

        for (int i = 0; i < pessoas.size(); i++) {
            return pessoas.toString();
        }
        return "ERROR";
    }

    public void consultar() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println(" ");
    }

    public String ver() {
        for (int i = 0; i < pessoas.size(); i++) {
            return pessoas.toString();
        }

        return "ERROR";
    }
}


