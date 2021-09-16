package gui.Vozacgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import taxisluzba.TaxiSluzba;
import voznja.StatusVoznje;
import voznja.VoznjaTel;

public class VozacZavrsavanjeVoznje extends JFrame {
	private JPanel mainPanel;
    private JTextField brojKmPredjenihField = new JTextField(8);
    private JTextField trajanjeVoznjeField = new JTextField(8);
    private JButton btnZavrsi = new JButton("Zavrsi");

    public VozacZavrsavanjeVoznje(TaxiSluzba taxiSluzba, VoznjaTel voznjaTel) {
        setTitle("Zavrsi voznju");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        mainPanel = new JPanel();
        setContentPane(mainPanel);
        mainPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
        mainPanel.setLayout(null);

        JLabel lblBrojKmPredjenih = new JLabel("Broj KM predjenih: ");
        lblBrojKmPredjenih.setBounds(20, 40, 150, 40);
        mainPanel.add(lblBrojKmPredjenih);

        brojKmPredjenihField = new JTextField();
        brojKmPredjenihField.setColumns(8);
        brojKmPredjenihField.setBounds(175, 40, 150, 40);
        mainPanel.add(brojKmPredjenihField);

        JLabel lblTrajanjeVoznje = new JLabel("Trajanje voznje: ");
        lblTrajanjeVoznje.setBounds(20, 160, 150, 40);
        mainPanel.add(lblTrajanjeVoznje);

        trajanjeVoznjeField = new JTextField();
        trajanjeVoznjeField.setColumns(8);
        trajanjeVoznjeField.setBounds(175, 160, 150, 40);
        mainPanel.add(trajanjeVoznjeField);

        btnZavrsi = new JButton("Zavrsi");
        btnZavrsi.setBounds(250, 300, 150, 40);
        mainPanel.add(btnZavrsi);

        btnZavrsi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(provera()){
                    voznjaTel.setStatusVoznje(StatusVoznje.ZAVRSENA);
                    voznjaTel.setBrojKmPredjenih(Integer.parseInt(brojKmPredjenihField.getText()));
                    voznjaTel.setTrajanjeVoznje(Integer.parseInt(trajanjeVoznjeField.getText()));
                    taxiSluzba.saveVoznjeTel();
                    JOptionPane.showMessageDialog(null, "Voznja je uspesno zavrsena!", "Zavrsi voznju", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    private boolean provera() {
        boolean ok = true;
        String poruka = "Ispravite greske!\n";

        if (brojKmPredjenihField.getText().trim().equals("")) {
            poruka += "- Unesite broj predjenih kilometara\n";
            ok = false;
        }
        if (trajanjeVoznjeField.getText().trim().equals("")) {
            poruka += "- Unesite trajanje voznje\n";
            ok = false;
        } if(ok == false) {
            JOptionPane.showMessageDialog(null, poruka, "Pogresni podaci", JOptionPane.WARNING_MESSAGE);
        }return ok;
    }

}
