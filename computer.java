import java.awt.Font;
import javax.swing.*;

public class Computer extends JFrame
{public Computer() {
    setBackground(new Color(240, 240, 240));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(75, 75, 565, 516);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(240, 240, 240));
    contentPane.setForeground(new Color(10, 10, 10));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    JButton btnClear = new JButton("Clear");
    btnClear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            textIP.setText(null);
            textValue.setText(null);
        }
    });
    btnClear.setBounds(8, 240, 258, 41);
    btnClear.setFont(new Font("Calibri", Font.PLAIN, 20));
    btnClear.setBackground(new Color(192, 192, 192));
    contentPane.add(btnClear);
    JButton btnExitApp = new JButton("Exit App");
    btnExitApp.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton CompIP = new JButton("Exit");
            if (JOptionPane.showConfirmDialog(CompIP,"Confirm if
                    you want to exit","CompIP ",
                    JOptionPane.YES_NO_CANCEL_OPTION)==
                    JOptionPane.YES_NO_OPTION){
                System.exit(ABORT);
            }
        }
    });
    btnExitApp.setFont(new Font("Calibri", Font.PLAIN, 20));
    btnExitApp.setBounds(276, 240, 258, 41);
    contentPane.add(btnExitApp);
    JButton btnAdd = new JButton("+");
    btnAdd.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String IP = textIP.getText();
            double Value = Double.parseDouble(textValue.getText());
        };
    });
    btnAdd.setFont(new Font("Calibri", Font.PLAIN, 20));
    btnAdd.setBounds(8, 188, 258, 41);
    contentPane.add(btnAdd);
    JButton btnComputers = new JButton("Show Computers");
    btnComputers.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                String IP = textIP.getText(ALLBITS, ABORT);
            } catch (BadLocationException e1) {
// TODO Auto-generated catch block
                e1.printStackTrace();
            }
            String Value = textValue.getText();
        }
    });
    btnComputers.setFont(new Font("Calibri", Font.PLAIN, 20));
    btnComputers.setBounds(276, 188, 258, 41);
    contentPane.add(btnComputers);
    textIP = new JTextField();
    textIP.setBounds(276, 110, 246, 28);
    contentPane.add(textIP);
    textIP.setColumns(10);
    JLabel lblNewLabel = new JLabel("Value");
    lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
    lblNewLabel.setBounds(8, 149, 188, 28);
    contentPane.add(lblNewLabel);
    textValue = new JTextField();
    textValue.setBounds(276, 149, 246, 28);
    contentPane.add(textValue);
    textValue.setColumns(10);
    JLabel lblNewLabel_1 = new JLabel("IP Adress");
    lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 20));
    lblNewLabel_1.setBounds(8, 97, 188, 41);
    contentPane.add(lblNewLabel_1);
    JLabel lblNewLabel_2 = new JLabel("Computer Lab");
    lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 20));
    lblNewLabel_2.setBounds(209, 29, 220, 41);
    contentPane.add(lblNewLabel_2);
    JSeparator separator = new JSeparator();
    separator.setBounds(8, 81, 536, 2);
    contentPane.add(separator);
}
}
}
