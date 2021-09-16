package gui.Vozacgui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

import taxisluzba.TaxiSluzba;

public class VozacProzorPrikaz extends JFrame {
	private JButton btnPrikazVoznji = new JButton("Prikaz dodeljenih voznji");
    private JButton btnPrikazVoznjiPrihvacenih = new JButton("Prikaz prihvacenih voznji");
    private JToolBar toolbar = new JToolBar();

    public VozacProzorPrikaz(TaxiSluzba taxiSluzba, String username){
        setTitle("Dashboard za vozaca: " + username);
        setBounds(100,100,1200,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        toolbar.add(btnPrikazVoznji);
        toolbar.add(btnPrikazVoznjiPrihvacenih);
        add(toolbar, BorderLayout.NORTH);

        btnPrikazVoznji.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VozacPrikazDodeljenihVoznji vpdv = new VozacPrikazDodeljenihVoznji(taxiSluzba, username);
                vpdv.setVisible(true);
            }
        });

        btnPrikazVoznjiPrihvacenih.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VozacPrikazPrihvacenihVoznji vppv = new VozacPrikazPrihvacenihVoznji(taxiSluzba, username);
                vppv.setVisible(true);
            }
        });
    }

}
