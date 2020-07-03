package Secretaria.Processamento;

import Secretaria.Base.*;
import java.util.Scanner;

public class Cadastro {
    int option,
        contDisciplina = 0,
        contAluno = 0,
        contMatricula = 0;

    String nomeaux;

    int codicoaux,
        disciaux;

    double cargaaux;

    Aluno[]a = new Aluno[10];
    Disciplina[]d = new Disciplina[5];
    Matricula[] m = new Matricula[30];

    Scanner sc = new Scanner(System.in);

    public boolean pesquisarAlu(int x){
        for(int i = 0; i < contAluno; i++){

            if(a[i].getCodico() == x){
                return true;
            }
        }
        return false;
    }

    public boolean pesquisarDis(int x){
        for(int i = 0; i < contDisciplina; i++){
            if(d[i].getCodico() == x){
                return true;
            }
        }
        return false;
    }

    public boolean pesquisarMat(int x){

        for(int i = 0; i < contMatricula; i++){
            if(m[i].getAluno().getCodico() == x){
                return true;
            }
        }
        return false;
    }

    public void cadastrarDisciplina()   {
        System.out.println("Digite o tipo de disciplina\n1 - Teórica\n2 - Pratica");
        option = sc.nextInt();

        if(option == 1) {
            System.out.println("Digite o nome da disciplina: ");
                nomeaux = sc.next();
            System.out.println("Digite o códico da disciplina: ");
                codicoaux = sc.nextInt();
            System.out.println("Digite a carga horária");
                cargaaux = sc.nextInt();

            d[contDisciplina] = new Disciplina_Teorica(nomeaux, codicoaux, cargaaux);
                contDisciplina++;
        }

        else if(option == 2)    {
            System.out.println("Digite o nome da disciplina: ");
                nomeaux = sc.next();
            System.out.println("Digite o códico da disciplina: ");
                codicoaux = sc.nextInt();
            System.out.println("Digite a carga horária");
                cargaaux = sc.nextInt();

            d[contDisciplina] = new Disciplina_Pratica(nomeaux, codicoaux, cargaaux);
                contDisciplina++;
        }

        else    {
            System.out.println("Error");
        }
    }

    public void cadastrarAluno()    {
        System.out.println("Digite o nome do aluno ");
            nomeaux = sc.next();
        System.out.println("Digite o códico do aluno ");
            codicoaux = sc.nextInt();

        a[contAluno] = new Aluno(nomeaux, codicoaux);
            contAluno++;
    }

    public void matriculaAluno()    {
        boolean achou;

        System.out.println("Digite o códico do aluno: ");
            codicoaux = sc.nextInt();

            achou = pesquisarAlu(codicoaux);

        while (!achou) {
            System.out.println("Digite o códico do aluno: ");
                codicoaux = sc.nextInt();
            achou = pesquisarAlu(codicoaux);
        }

        if (achou)
            System.out.println("O códico do aluno é " + codicoaux);

        System.out.println("Digite o códico da disciplina: ");
            disciaux = sc.nextInt();

            achou = pesquisarDis(disciaux);

        while (!achou) {
            System.out.println("Digite o códico da disciplina: ");
                codicoaux = sc.nextInt();
            achou = pesquisarAlu(codicoaux);
        }

        if (achou)
            System.out.println("O códico da disciplina é " + codicoaux);
            
        System.out.println("Digite o ano letivo do aluno: ");
            int anoaux = sc.nextInt();
        System.out.println("Digite a série do aluno");
            int serieAux = sc.nextInt();

            m[contMatricula] = new Matricula(anoaux, serieAux,d[contDisciplina - 1], a[contAluno - 1]);
                contMatricula++;
    }

    public void lancarNotas()   {
        boolean achou;

        System.out.println("Digite o códico do aluno: ");
            codicoaux = sc.nextInt();

        achou = pesquisarMat(codicoaux);

        while (!achou) {
            System.out.println("Digite o códico do aluno: ");
            codicoaux = sc.nextInt();
            achou = pesquisarAlu(codicoaux);
        }

        if (achou)
            System.out.println("O códico do aluno é " + codicoaux);

        System.out.println("Digite o códico da disciplina: ");
            disciaux = sc.nextInt();
        System.out.println("Digite o ano do aluno: ");
            int anoAux = sc.nextInt();
        System.out.println("Digite a série do aluno: ");
            int serieAux = sc.nextInt();
    }

    public void mostrarBoletim()    {
        System.out.println(m[contMatricula - 1].toString());
    }

}