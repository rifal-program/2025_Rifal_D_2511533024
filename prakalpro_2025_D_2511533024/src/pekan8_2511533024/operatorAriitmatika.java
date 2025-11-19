package pekan8_2511533024;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class operatorAriitmatika extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtangka1;
    private JTextField txtangka2;
    private JTextField txthasil;

    private void pesanperingatan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
    }

    private void pesanerror(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    operatorAriitmatika frame = new operatorAriitmatika();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public operatorAriitmatika() {
        setTitle("Operator Aritmatika");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 320, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblJudul = new JLabel("Operator Aritmatika");
        lblJudul.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblJudul.setBounds(80, 10, 200, 30);
        contentPane.add(lblJudul);

        JLabel lblAngka1 = new JLabel("Angka 1");
        lblAngka1.setBounds(20, 60, 60, 20);
        contentPane.add(lblAngka1);

        JLabel lblAngka2 = new JLabel("Angka 2");
        lblAngka2.setBounds(20, 90, 60, 20);
        contentPane.add(lblAngka2);

        JLabel lblOperator = new JLabel("Operator");
        lblOperator.setBounds(20, 140, 60, 20);
        contentPane.add(lblOperator);

        JLabel lblHasil = new JLabel("Hasil");
        lblHasil.setBounds(20, 180, 60, 20);
        contentPane.add(lblHasil);

        txtangka1 = new JTextField();
        txtangka1.setHorizontalAlignment(SwingConstants.CENTER);
        txtangka1.setBounds(90, 60, 100, 20);
        contentPane.add(txtangka1);

        txtangka2 = new JTextField();
        txtangka2.setHorizontalAlignment(SwingConstants.CENTER);
        txtangka2.setBounds(90, 90, 100, 20);
        contentPane.add(txtangka2);

        txthasil = new JTextField();
        txthasil.setEditable(false);
        txthasil.setHorizontalAlignment(SwingConstants.CENTER);
        txthasil.setBounds(90, 180, 100, 20);
        contentPane.add(txthasil);

        JComboBox cboperator = new JComboBox();
        cboperator.setModel(new DefaultComboBoxModel(new String[]{"+", "-", "*", "/", "%"}));
        cboperator.setBounds(90, 140, 100, 22);
        contentPane.add(cboperator);

        JButton btnHitung = new JButton("Hitung");
        btnHitung.setBounds(200, 140, 90, 22);
        contentPane.add(btnHitung);

        // Action Listener tombol Hitung
        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtangka1.getText().trim().isEmpty()) {
                    pesanperingatan("Inputkan angka 1");
                } else if (txtangka2.getText().trim().isEmpty()) {
                    pesanperingatan("Inputkan angka 2");
                } else {
                    try {
                        int a = Integer.valueOf(txtangka1.getText());
                        int b = Integer.valueOf(txtangka2.getText());
                        int hasil = 0;

                        int op = cboperator.getSelectedIndex();
                        if (op == 0) hasil = a + b;
                        if (op == 1) hasil = a - b;
                        if (op == 2) hasil = a * b;
                        if (op == 3) hasil = a / b;
                        if (op == 4) hasil = a % b;

                        txthasil.setText(String.valueOf(hasil));

                    } catch (NumberFormatException ex) {
                        pesanerror("Angka 1 dan 2 harus berupa angka valid!");
                    } catch (ArithmeticException ex) {
                        pesanerror("Terjadi kesalahan aritmatika: " + ex.getMessage());
                    }
                }
            }
        });
    }
}
