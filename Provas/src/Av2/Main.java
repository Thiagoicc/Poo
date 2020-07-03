package Av2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JPanel panel;

    private JTextField main_textField_nome;
    private JTextField main_textField_salario;
    private JTextField main_textField_id;
    private JTextField main_textField_codico;

    private JButton main_button_cadCargo;
    private JButton main_button_cadFuncionario;
    private JButton main_button_ordSalario;
    private JButton main_button_somCargo;

    Processamento p = new Processamento();

    public Main() {
        main_button_cadCargo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double aDouble = Double.parseDouble(main_textField_salario.getText());

                if (p.cargos.size() < 5) {
                    p.addCargo(main_textField_nome.getText(), Integer.parseInt(main_textField_id.getText()), aDouble);
                    JOptionPane.showMessageDialog(null, p.consultarCargo(), "Cadastrado", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Salários dos cargos já cadastrados", "ERROR", JOptionPane.ERROR_MESSAGE);

                }
                main_textField_nome.setText(null);
                main_textField_salario.setText(null);
                main_textField_id.setText(null);
            }
        });

        main_button_cadFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.addFuncionario(main_textField_nome.getText(), Integer.parseInt(main_textField_codico.getText()), Integer.parseInt(main_textField_id.getText()));
                main_textField_nome.setText(null);
                main_textField_codico.setText(null);
                main_textField_id.setText(null);
            }
        });

        main_button_ordSalario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.ordenaFuncSal();
                JOptionPane.showMessageDialog(null, p.consultarFunc(), "Salário Ordenado", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        main_button_somCargo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.somaSalario(Integer.parseInt(main_textField_id.getText()));
                main_textField_id.setText(null);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Departamento Pessoal");
        frame.setContentPane(new Main().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
