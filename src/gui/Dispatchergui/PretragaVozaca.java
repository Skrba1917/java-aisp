package gui.Dispatchergui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import automobil.Automobil;
import gui.Vozacgui.VozacProzorPrikaz;
import korisnik.Pol;
import korisnik.Vozac;
import taxisluzba.TaxiSluzba;

public class PretragaVozaca extends JFrame {
	private JPanel mainPanel;
    private JTextField imeField;
    private JTextField prezimeField;
    private JTextField plataField;
 
    public PretragaVozaca(TaxiSluzba taxiSluzba){
        setTitle("Pretrazi vozaca ");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100,100,1000,600);
        mainPanel = new JPanel();
        setContentPane(mainPanel);
        mainPanel.setBorder(new EmptyBorder(3,3,3,3));
        mainPanel.setLayout(null);
 
        JLabel lblIme = new JLabel("Ime: ");
        lblIme.setBounds(20,50,150,40);
        lblIme.setFont(new Font("Arial", Font.BOLD,14));
        mainPanel.add(lblIme);
 
        imeField = new JTextField();
        imeField.setColumns(8);
        imeField.setBounds(160,50, 200,40);
        mainPanel.add(imeField);
 
        JLabel lblPrezime = new JLabel("Prezime: ");
        lblPrezime.setBounds(20,100,150,40);
        lblPrezime.setFont(new Font("Arial", Font.BOLD,14));
        mainPanel.add(lblPrezime);
 
        prezimeField = new JTextField();
        prezimeField.setColumns(8);
        prezimeField.setBounds(160,100, 200,40);
        mainPanel.add(prezimeField);
 
        JLabel lblAutomobil = new JLabel("Automobil: ");
        lblAutomobil.setBounds(20,200,150,40);
        lblAutomobil.setFont(new Font("Arial", Font.BOLD,14));
        mainPanel.add(lblAutomobil);
 
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel());
        comboBox.setBounds(160,200,200,40);
        comboBox.setFont(new Font("Arial", Font.BOLD,14));
        comboBox.setMaximumRowCount(100);
        mainPanel.add(comboBox);
 
        for (Automobil automobil: taxiSluzba.getAutomobili()){
            comboBox.addItem(automobil.getIdVozila());
        }
 
        JLabel lblPlata = new JLabel("Plata: ");
        lblPlata.setBounds(20,150,150,40);
        lblPlata.setFont(new Font("Arial", Font.BOLD,14));
        mainPanel.add(lblPlata);
 
        plataField = new JTextField();
        plataField.setColumns(8);
        plataField.setBounds(160,150, 200,40);
        mainPanel.add(plataField);
 
        JButton btnPretrazi = new JButton("Pretrazi");
        btnPretrazi.setBounds(400,520,150,40);
        btnPretrazi.setFont(new Font("Arial", Font.BOLD, 14));
        mainPanel.add(btnPretrazi);
    }
	
	
}
