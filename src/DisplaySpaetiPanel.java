import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class DisplaySpaetiPanel extends GenericPanel {
    private JLabel resultsLabel = new JLabel("Ihre Suche hat folgende Ergebnisse erzielt:");
    

    DefaultTableModel model = new DefaultTableModel();
    JTable resultsTable = new JTable(model);

    public DisplaySpaetiPanel() {
        super();
        this.add(resultsLabel, BorderLayout.NORTH);
        this.add(resultsTable, BorderLayout.CENTER);
        model.addColumn("ID");
        model.addColumn("NAMESPAETI");
        model.addColumn("OPENINGTIMES");
        model.addColumn("ADDRESS");
        model.addColumn("DISTRICT");
        model.addColumn("LATITUDE");
        model.addColumn("LONGITUDE");
    }

   

    public DefaultTableModel getModel() {
        return model;
    }

    public JTable getResultsTable() {
        return resultsTable;
    }

}
