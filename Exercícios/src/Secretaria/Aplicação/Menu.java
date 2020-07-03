package Secretaria.Aplicação;

import Processamento.Cadastro;

import java.util.Scanner;
public class Menu {

    Cadastro c = new Cadastro();

    public void digitar()   {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a opção desejada:\n 1 - Cadastrar disciplina.\n 2 - Cadastrar aluno.\n 3 - Matricular aluno na disciplina.\n 4 - Mostrar notas do aluno.\n 5 - Mostrar boletim do aluno.");
        int mn = sc.nextInt();

        switch (mn) {
            case 1:
                c.cadastrarDisciplina();
                break;
            case 2:
                c.cadastrarAluno();
                break;
            case 3:
                c.matriculaAluno();
                break;
            case 4:
                c.lancarNotas();
                break;
            case 5:
                c.mostrarBoletim();
                break;
            default:
                System.out.println("Comando Inválido!\n Escolha a opção desejada:\n 1 - Cadastrar disciplina.\n 2 - Cadastrar aluno.\n 3 - Matricular aluno na disciplina.\n 4 - Mostrar notas do aluno.\n 5 - Mostrar boletim do aluno.");
                break;
        }
        digitar();
    }
}