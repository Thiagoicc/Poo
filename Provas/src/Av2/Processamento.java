package Av2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Processamento {
    ArrayList<Cargo> cargos = new ArrayList<>(5);
    ArrayList<Funcionario> funcionarios = new ArrayList<>(15);

    public boolean pesquisarCargo(int x){
        for (Cargo cargo : cargos) {

            if (cargo.getId() == x) {
                return true;
            }
        }
        return false;
    }

    public void addCargo(String nome, int id, double salario) {
            Cargo aux = new Cargo(nome, id, salario);
            cargos.add(aux);
    }

    public void addFuncionario(String nome, int codico, int id)    {
        boolean achou = pesquisarCargo(id);
        if (achou) {
            if (funcionarios.size() < 15) {
                Funcionario aux = new Funcionario(nome, codico, cargos.get(id));
                funcionarios.add(aux);
                JOptionPane.showMessageDialog(null, funcionarios.toString(), "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Limite máximo de funcionários", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "CARGO INEXISTENTE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ordenaFuncSal() {
        Collections.sort(funcionarios);
    }

    public void somaSalario(int x)  {
        double somador = 0;

        for (Funcionario funcionarios : funcionarios) {
            if(funcionarios.getCargos().getId() == x)   {
                double a = funcionarios.getCargos().getSalario();
                somador += a;
            }
        }

        JOptionPane.showMessageDialog(null, "Somatório: do cargo: "+  x  + " R$: "+ somador + " Reais.", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
    }

    public String consultarCargo() {
        return  cargos.toString();
    }

    public String consultarFunc() {
        return  funcionarios.toString();
    }

}
