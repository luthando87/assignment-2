package ComputerIP;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
public class CompIP<Computers> extends JFrame {
    private JPanel contentPane;
    private JTextField textIP;
    private JTextField textValue;
    /**
     Computer
     +IP Adress
     + Value of computer
     layout
     +border
     +JFrame
     +JPanel
     settings
     +button
     +JTextField
     +JLabel
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CompIP frame = new CompIP();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    ArrayList<Computers> computerlist;
    String header[] = new String[] {"IP","Value"};
    /**
     * Create the frame.
     */
    public CompIP() {
        setBackground(new Color(243, 255, 162));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(22, 22, 450, 461);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(132, 126, 213));
        contentPane.setForeground(new Color(15, 15, 15));
        contentPane.setBorder(new EmptyBorder(7, 7, 7, 7));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textIP.setText(null);
                textValue.setText(null);
            }

