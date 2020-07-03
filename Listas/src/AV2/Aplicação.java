import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicação {
    private JPanel panel;

    private JButton buttonCadastrar;
    private JButton buttonDeletar;
    private JButton buttonTrocarData;
    private JButton buttonConsultarNiver;
    private JButton buttonNiverMes;
    private JButton buttonPrimeiraLetra;
    private JButton ordenarPorNomeButton;
    private JButton ordenarPorMêsButton;
    private JButton sairButton;

    private JTextField textFieldNome;
    private JTextField textFieldDia;
    private JTextField textFieldMes;

    private JLabel labelNome;
    private JLabel labelDia;
    private JLabel labelMes;


    Agenda agenda = new Agenda();

    public Aplicação() {
        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                agenda.add(textFieldNome.getText(), Integer.parseInt(textFieldDia.getText()),Integer.parseInt(textFieldMes.getText()));

                textFieldNome.setText("");
                textFieldDia.setText("");
                textFieldMes.setText("");

                JOptionPane.showMessageDialog(null, agenda.ver(), "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        buttonDeletar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                agenda.delet(textFieldNome.getText());
                textFieldNome.setText("");
                JOptionPane.showMessageDialog(null, agenda.ver(), "Deletado", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        buttonTrocarData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                agenda.changeDate(textFieldNome.getText(), Integer.parseInt(textFieldDia.getText()),Integer.parseInt(textFieldMes.getText()));

                textFieldNome.setText("");
                textFieldDia.setText("");
                textFieldMes.setText("");

                JOptionPane.showMessageDialog(null, agenda.ver(), "Data Alterada", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        buttonConsultarNiver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                agenda.conferDate(Integer.parseInt(textFieldDia.getText()),Integer.parseInt(textFieldMes.getText()));

                textFieldDia.setText("");
                textFieldMes.setText("");

            }
        });

        buttonNiverMes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                agenda.conferMonth(Integer.parseInt(textFieldMes.getText()));

                textFieldMes.setText("");
            }
        });

        buttonPrimeiraLetra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                agenda.conferFirstLetter(textFieldNome.getText().charAt(0));

                textFieldNome.setText("");
            }
        });

        ordenarPorNomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, agenda.sortName(), "Organizado por Nome", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        ordenarPorMêsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, agenda.sortMonth(), "Organizado por Mês", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Aniversário");
        frame.setContentPane(new Aplicação().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
