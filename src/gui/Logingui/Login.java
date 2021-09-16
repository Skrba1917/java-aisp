package gui.Logingui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
	private JLabel lblTitle = new JLabel("Dobrodosli u TAXI SLUZBU");
    private JLabel lblMusterija = new JLabel("Musterija");
    private JLabel lblVozac = new JLabel("Vozac");
    private JLabel lblDispecer = new JLabel("Dispecer");
    private ImageIcon iconMusterija = new ImageIcon("src/ikonice/Screenshot_2.jpg");
    private JButton btnMusterija = new JButton(iconMusterija);
    private ImageIcon iconVozac = new ImageIcon("src/ikonice/Screenshot_1.jpg");
    private JButton btnVozac = new JButton(iconVozac);
    private ImageIcon iconDispecer = new ImageIcon("src/ikonice/Screenshot_3.jpg");
    private JButton btnDispecer = new JButton(iconDispecer);
    private JPanel mainPanel;

    public Login(taxisluzba.TaxiSluzba taxiSluzba){
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,725,475);
        mainPanel = new JPanel();
        mainPanel.setBorder(new EmptyBorder(3,3,3,3));
        setContentPane(mainPanel);
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(null);

        btnDispecer.setBounds(60,180,150,150);
        btnDispecer.setBackground(Color.WHITE);
        mainPanel.add(btnDispecer);
        btnMusterija.setBounds(270,180,150,150);
        btnMusterija.setBackground(Color.WHITE);
        mainPanel.add(btnMusterija);
        btnVozac.setBounds(480,180,150,150);
        btnVozac.setBackground(Color.WHITE);
        mainPanel.add(btnVozac);

        lblTitle.setBounds(220, 80, 300, 50);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        mainPanel.add(lblTitle);
        lblDispecer.setBounds(95,340,100,60);
        lblDispecer.setFont(new Font("Arial", Font.PLAIN, 18));
        mainPanel.add(lblDispecer);
        lblMusterija.setBounds(305,340,100,60);
        lblMusterija.setFont(new Font("Arial", Font.PLAIN, 18));
        mainPanel.add(lblMusterija);
        lblVozac.setBounds(525,340,100,60);
        lblVozac.setFont(new Font("Arial", Font.PLAIN, 18));
        mainPanel.add(lblVozac);

        btnDispecer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DispecerLogin dl = new DispecerLogin(taxiSluzba);
                dl.setVisible(true);
            }
        });

        btnMusterija.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MusterijaLogin ml = new MusterijaLogin(taxiSluzba);
                ml.setVisible(true);
            }
        });

        btnVozac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VozacLogin vl = new VozacLogin(taxiSluzba);
                vl.setVisible(true);
            }
        });
    }

}
