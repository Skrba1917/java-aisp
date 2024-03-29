package gui.Dispatchergui;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import taxisluzba.TaxiSluzba;
import voznja.VoznjaTel;

public class DispecerPrikazVoznjiTelefon extends JFrame {
	private JTable tabela;
    private ArrayList<VoznjaTel> voznjeTel = new ArrayList<>();

    public DispecerPrikazVoznjiTelefon(TaxiSluzba taxiSluzba) {
        setTitle("Prikaz svih voznji narucenih telefonom");
        setBounds(100,100,1200,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        String [] glava = new String[] {
                "id", "Vreme porudzbine", "Adresa polaska", "Adresa destinacije", "Musterija", "Vozac",
                "Predjeni KM", "Trajanje", "Status", "ID musterije", "ID vozaca"
        };
        voznjeTel = taxiSluzba.sveVoznjeTel();
        Object [][] content = new Object [voznjeTel.size()][glava.length];

        for(int i=0;i<voznjeTel.size();i++){
            VoznjaTel voznja = voznjeTel.get(i);
            content[i][0] = voznja.getId();
            content[i][1] = voznja.getVremePorudzbine();
            content[i][2] = voznja.getAdresaPolaska();
            content[i][3] = voznja.getAdresaDestinacije();
            content[i][4] = voznja.getMusterija().getUsername();
            content[i][5] = voznja.getVozac().getUsername();
            content[i][6] = voznja.getBrojKmPredjenih();
            content[i][7] = voznja.getTrajanjeVoznje();
            content[i][8] = voznja.getStatusVoznje();
            content[i][9] = voznja.getIdMusterije();
            content[i][10] = voznja.getIdVozaca();
        }
        DefaultTableModel dtm = new DefaultTableModel(content,glava);
        tabela = new JTable(dtm);
        tabela.setAutoCreateRowSorter(true);
        tabela.setRowSelectionAllowed(true);
        tabela.setColumnSelectionAllowed(false);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabela.setDefaultEditor(Object.class, null);
        JScrollPane scrollPane = new JScrollPane(tabela);
        add(scrollPane, BorderLayout.CENTER);
    }

}
