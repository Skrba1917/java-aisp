package gui.Dispatchergui;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import automobil.Automobil;
import taxisluzba.TaxiSluzba;

public class DispecerPrikazAutomobila extends JFrame {
    private JTable tabela;
    private ArrayList<Automobil> automobili = new ArrayList<>();

    public DispecerPrikazAutomobila(TaxiSluzba taxiSluzba){
        setTitle("Prikaz svih automobila");
        setBounds(100,100,1200,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        String [] glava = new String[] {
                "Model", "Proizvodjac", "Godina proizvodnje", "Broj tablica", "ID vozila", "Vrsta",
                "ID Vozaca"
        };
        automobili = taxiSluzba.sviAutomobili();
        Object [][] content = new Object [automobili.size()][glava.length];

        for(int i=0;i<automobili.size();i++){
            Automobil automobil = automobili.get(i);
            content[i][0] = automobil.getModel();
            content[i][1] = automobil.getProizvodjac();
            content[i][2] = automobil.getGodProizvodnje();
            content[i][3] = automobil.getBrTablica();
            content[i][4] = automobil.getIdVozila();
            content[i][5] = automobil.getVrsta();
            content[i][6] = automobil.getIdVozaca();
        }
        DefaultTableModel dtm = new DefaultTableModel(content,glava);
        tabela = new JTable(dtm);
        tabela.setRowSelectionAllowed(true);
        tabela.setColumnSelectionAllowed(false);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabela.setDefaultEditor(Object.class, null);
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane, BorderLayout.CENTER);
    }

}
