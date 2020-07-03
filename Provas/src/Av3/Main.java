package Av3;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Processamento p = new Processamento();

        int cod = 0;
        String resp;

        do {
            try {
                String escolha = JOptionPane.showInputDialog(null, "1 - Cadastrar Funcionário \n2 - Bônus Mensal Funcionários \n3 - Excluir Funcionário " +
                        "\n4 - Alterar Salário de um Funcionário \n5 - Exibir Funcionários \n6 - Exibir Dependentes \n7 - Sair");

                switch (escolha) {
                    case "1":
                        String nome = JOptionPane.showInputDialog("Digite o nome do funcionario: ");
                        String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionario: ");
                        String salario = JOptionPane.showInputDialog("Digite o salario do funcionario: ");
                        String quantidade = JOptionPane.showInputDialog("Digite a quantidade de dependentes: ");

                        double sal = Double.parseDouble(salario);
                        int quant = Integer.parseInt(quantidade);

                        p.adicionarFunc(nome, cargo, sal, quant, cod);

                        for (int i = 0; i < quant; i++) {
                            String name = JOptionPane.showInputDialog(null, "Digite o nome do dependente");
                            p.adicionarDep(name, cod);
                        }

                        cod++;
                        break;

                    case "2":
                        p.salvarArq();
                        p.bonusMensal();
                        break;

                    case "3":
                        String codEx = JOptionPane.showInputDialog(null, "Digite o codico do funcionario");
                        int codExcluir = Integer.parseInt(codEx);

                        p.excluir(codExcluir);
                        break;

                    case "4":
                        String codAlt = JOptionPane.showInputDialog(null, "Digite o codico do funcionario");
                        String sall = JOptionPane.showInputDialog(null, "Novo salario");

                        int codAlterar = Integer.parseInt(codAlt);
                        double sallario = Double.parseDouble(sall);

                        p.alteraSal(codAlterar, sallario);

                        break;

                    case "5":
                        p.exibirfunc();
                        break;

                    case "6":
                        p.exibirDep();
                        break;

                    case "7":
                        System.exit(0);
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Formato Errado");
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Funcionário inexistente");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Erro de Null Pointer Exception");
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "O caminho do arquivo não foi encontrado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Inesperado: " + e);
            } finally {
                resp = JOptionPane.showInputDialog(null, "Deseja repetir o processo? \n1 - Sim \n2 - Não");
            }

        } while (resp.equals("1"));
    }
}

