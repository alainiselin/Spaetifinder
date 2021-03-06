import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionListener;

class SpaetiFinderPanel extends GenericPanel {
    private JButton rndSpaetiSearch = new JButtonDesign("Beliebigen Spätkauf finden");
    private JButton nearestSpaetiSearch = new JButtonDesign("Nächstgelegenen Spätkauf finden");

    public SpaetiFinderPanel() {
        super();
        this.add(rndSpaetiSearch, BorderLayout.WEST);
        this.add(nearestSpaetiSearch, BorderLayout.EAST);
        this.remove(returnHome);
    }

    // Method to connect SpaetiFinderPanel with Controller --> random Choice-Button
    // was clicked
    public void addRNDChoiceButtonListener(ActionListener listenForRNDChoiceButton) {
        rndSpaetiSearch.addActionListener(listenForRNDChoiceButton);
    }

    // Method to connect SpaetiFinderPanel with Controller --> nearest Choice-Button
    // was clicked
    public void addNearestChoiceButtonListener(ActionListener listenForNearestChoiceButton) {
        nearestSpaetiSearch.addActionListener(listenForNearestChoiceButton);
    }

}