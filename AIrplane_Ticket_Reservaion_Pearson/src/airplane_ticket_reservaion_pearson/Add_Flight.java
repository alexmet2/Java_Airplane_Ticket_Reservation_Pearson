/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package airplane_ticket_reservaion_pearson;  /* the command for the connection between the classes */

import java.sql.Connection; /*  it is used to bring certain classes or the entire packages, into visibility */
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Add_Flight extends javax.swing.JInternalFrame {
/* 
    public = public is a Java keyword which declares a member's access as public.
    extends = indicates that a class is inherited from another class.
*/
    public Add_Flight() {
        initComponents(); /* it is a method that swing Designer creates to initialise components */
        autoID(); /* FL0.. - call of a class that generates an ID for a flight */
    }

    Connection con; /* used as a variable for the connection to the database */
    PreparedStatement pst; /* used to prepare for the functions of the database (insert,update...) */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Flight_ID_Add_Flight = new javax.swing.JLabel();
        Flight_Name_Add_Flight = new javax.swing.JTextField();
        Source_Add_Flight = new javax.swing.JComboBox<>();
        Departure_Add_Flight = new javax.swing.JComboBox<>();
        Date_Add_Flight = new com.toedter.calendar.JDateChooser();
        Departure_Time_Add_Flight = new javax.swing.JTextField();
        Arrival_Time_Add_Flight = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel1.setText("Flight ID");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Flight Name");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Source");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Departure");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Departure Time");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("Arrival Time");

        Flight_ID_Add_Flight.setFont(new java.awt.Font("sansserif", 3, 16)); // NOI18N
        Flight_ID_Add_Flight.setText("jLabel8");

        Source_Add_Flight.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        Source_Add_Flight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birmingham", "Dothan", "Huntsville", "Mobile", "Montgomery" }));

        Departure_Add_Flight.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        Departure_Add_Flight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Birmingham", "Dothan", "Huntsville", "Mobile", "Montgomery" }));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(Flight_ID_Add_Flight))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Source_Add_Flight, 0, 160, Short.MAX_VALUE)
                            .addComponent(Flight_Name_Add_Flight)
                            .addComponent(Departure_Add_Flight, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Departure_Time_Add_Flight)
                    .addComponent(Date_Add_Flight, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(Arrival_Time_Add_Flight))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(69, 69, 69)
                .addComponent(jButton2)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(Date_Add_Flight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Departure_Time_Add_Flight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Flight_ID_Add_Flight))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Flight_Name_Add_Flight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Source_Add_Flight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Departure_Add_Flight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(Arrival_Time_Add_Flight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        this.hide(); /* closes the window */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Flight_ID = Flight_ID_Add_Flight.getText(); /* it gets the text that the user has input on the text Field  */
        String Flight_Name = Flight_Name_Add_Flight.getText();
        String Source = Source_Add_Flight.getSelectedItem().toString().trim();
        String Departure = Departure_Add_Flight.getSelectedItem().toString().trim();
        
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd"); /* it declares the format and gets the date of birth */
        String Date = da.format(Date_Add_Flight.getDate()); /* convertion of the date variable as a String */            
        
        String Departure_Time = Departure_Time_Add_Flight.getText();
        String Arrival_Time = Arrival_Time_Add_Flight.getText();        
       
        if(Flight_Name.isEmpty() || Date.isEmpty() || Departure_Time.isEmpty() || Arrival_Time.isEmpty()){            
            JOptionPane.showMessageDialog(this, "Some fields are blank...Please fill them out..."); /* shows a message to fill the empty fields if they are not filled by the user */
        }
        else if(Source_Add_Flight.getSelectedItem() == Departure_Add_Flight.getSelectedItem()){            
            JOptionPane.showMessageDialog(this, "Please input different source and departures..."); /* shows a message if the source and the departure are the same value */
        }
        else{
            try {
                Class.forName("com.mysql.jdbc.Driver"); /* it is a method that returns the class object associated with the class or interface passed as the first parameter */
                con = DriverManager.getConnection("jdbc:mysql://localhost/airplane_ticket_reservation","root",""); /* establishes connection to the local host */
                pst = con.prepareStatement("insert into flight(ID,Flight_Name,Source,Departure,Date,Departure_Time,Arrival_Time)values(?,?,?,?,?,?,?)"); /* inserts into the database */

                pst.setString(1, Flight_ID); /* converts the values as a String and inputs them in an order in the database (the number is the order for the insert and the variable is what will be inserted into the database) */
                pst.setString(2, Flight_Name);
                pst.setString(3, Source);
                pst.setString(4, Departure);
                pst.setString(5, Date);
                pst.setString(6, Departure_Time);
                pst.setString(7, Arrival_Time);

                pst.executeUpdate(); /* database update */

                JOptionPane.showMessageDialog(null, "Flight created..."); /* confirmation message for the data insertion in the database */
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Add_Flight.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Add_Flight.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void autoID(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); /* it is a method that returns the class object associated with the class or interface passed as the first parameter */
            con = DriverManager.getConnection("jdbc:mysql://localhost/airplane_ticket_reservation","root",""); /* establishes connection to the local host */
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(id) from flight"); /* searches the max ID in the database for the flight */
            rs.next();
            rs.getString("MAX(id)");
            if (rs.getString("MAX(id)") == null){
                Flight_ID_Add_Flight.setText("FL001");
            }
            else{
                long id = Long.parseLong(rs.getString("MAX(id)").substring(2,rs.getString("MAX(id)").length()));
                id++;
                Flight_ID_Add_Flight.setText("FL" + String.format("%03d", id));                
            } 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Add_Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Add_Customer.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Arrival_Time_Add_Flight;
    private com.toedter.calendar.JDateChooser Date_Add_Flight;
    private javax.swing.JComboBox<String> Departure_Add_Flight;
    private javax.swing.JTextField Departure_Time_Add_Flight;
    private javax.swing.JLabel Flight_ID_Add_Flight;
    private javax.swing.JTextField Flight_Name_Add_Flight;
    private javax.swing.JComboBox<String> Source_Add_Flight;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
