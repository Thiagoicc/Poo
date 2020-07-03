package Av3;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Processamento {
    ArrayList<Funcionario> funcionarios = new ArrayList<>(1);
    ArrayList<Dependente> dependentes = new ArrayList<>(1);

    public boolean pesquisarFun(int x) {
        for (Funcionario funcionarios : funcionarios) {

            if (funcionarios.getCodico() == x) {
                return true;
            }
        }
        return false;
    }

    public void adicionarFunc(String nome, String cargo, double salario, int quantDep, int cod) throws Exception {
        Funcionario aux = new Funcionario(nome, cargo, salario, quantDep, cod);
        funcionarios.add(aux);
    }

    public void adicionarDep(String nome, int id) throws Exception {
        Dependente aux = new Dependente(nome, funcionarios.get(id));
        dependentes.add(aux);
    }

    public void bonusMensal() throws Exception {
        for (Funcionario funcionarios : funcionarios) {

            JOptionPane.showMessageDialog(null, "Nome: " + funcionarios.getNome() + ", Número de dependentes: " + funcionarios.getQuantDep() +
                    ", Bônus: " + (funcionarios.getSalario() * (((double) funcionarios.getQuantDep() * 2) / 100)));
        }
    }

    public void excluir(int id) throws Exception {
        boolean achou = pesquisarFun(id);

        if (achou) {
            funcionarios.removeIf(funcionario -> funcionario.getCodico() == id);
            dependentes.removeIf(dependente -> dependente.funcionario.getCodico() == id);
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário Inexistente");
        }
    }

    public void alteraSal(int id, double sal) throws IndexOutOfBoundsException, NumberFormatException {
        funcionarios.get(id).setSalario(sal);
    }

    public void exibirfunc() {
        for (Funcionario funcionarios : funcionarios) {
            JOptionPane.showMessageDialog(null, funcionarios.toString());
        }
    }

    public void exibirDep() {
        for (Dependente dependente : dependentes) {
            JOptionPane.showMessageDialog(null, dependente.toString());
        }
    }

    public void salvarArq() throws IOException {
        FileWriter arq = new FileWriter("C:\\Users\\thiag\\Desktop\\funcionarios.txt");
        PrintWriter gravarar = new PrintWriter(arq);

        for (Funcionario funcionarios : funcionarios) {
            gravarar.println("Nome: " + funcionarios.getNome() + ", Número de dependentes: " + funcionarios.getQuantDep() +
                    ", Bônus: " + (funcionarios.getSalario() * (((double) funcionarios.getQuantDep() * 2) / 100)));
            gravarar.printf("%n");
        }

        arq.close();

    }
}
