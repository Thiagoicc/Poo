package AV1.Agenda;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
    private String nome,
                   dataNascimento;
    private double altura;

    public Pessoa(String nome, String dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calculaIdade()  {
        Calendar cal = GregorianCalendar.getInstance();

        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH) + 1;
        int anoAtual = cal.get(Calendar.YEAR);

        String[] dataNascimentovect = dataNascimento.split("/");

        int diaNascimento = Integer.parseInt(dataNascimentovect[0]);
        int mesNascimento = Integer.parseInt(dataNascimentovect[1]);
        int anoNascimento = Integer.parseInt(dataNascimentovect[2]);

        int idade = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento)    {
            idade--;
        }

        else if(diaAtual < diaNascimento)    {
            idade--;
        }

        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + calculaIdade() +
                ", dataNascimento='" + dataNascimento + '\'' +
                String.format(", altura= %.2f", altura) +
                '}';
    }
}