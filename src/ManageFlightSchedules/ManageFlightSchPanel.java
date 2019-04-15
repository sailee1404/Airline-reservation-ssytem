/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageFlightSchedules;
import Business.*;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author BHAGAT
 */
public class ManageFlightSchPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFlightSchPanel
     */
    private TravelAgency travelAgency;
    private JPanel cardSequenceJPanel;
    public ManageFlightSchPanel(TravelAgency travelAgency, JPanel cardSequenceJPanel) {
        initComponents();
        this.travelAgency=travelAgency;
        this.cardSequenceJPanel=cardSequenceJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listOfAirlinersButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(214, 249, 249));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectModel/Webp.net-resizeimage-5.png"))); // NOI18N
        jLabel1.setText("MANAGE FLIGHT SCHEDULE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 450, -1));

        listOfAirlinersButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        listOfAirlinersButton.setText("List Of Flights");
        listOfAirlinersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfAirlinersButtonActionPerformed(evt);
            }
        });
        add(listOfAirlinersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 160, 50));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 340, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void listOfAirlinersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfAirlinersButtonActionPerformed
        // TODO add your handling code here:
        ListOfFlightsPanel listOfFlightsPanel = new ListOfFlightsPanel(travelAgency,cardSequenceJPanel);
        cardSequenceJPanel.add("ListOfFlights",listOfFlightsPanel);
        CardLayout cardLayout= (CardLayout) cardSequenceJPanel.getLayout();
        cardLayout.next(cardSequenceJPanel);
    }//GEN-LAST:event_listOfAirlinersButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton listOfAirlinersButton;
    // End of variables declaration//GEN-END:variables
}
