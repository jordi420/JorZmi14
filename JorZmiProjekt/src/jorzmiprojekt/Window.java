/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorzmiprojekt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Firstech
 */
public class Window extends javax.swing.JFrame {
    //Erstellung von Grund-Variablen
    DatabaseMetaData MD = null;
    private Connection conn = null;
    String primaryKey = null;
    int primKeyPosition = 0;
    DefaultTableModel tableModel;
    int index = 0;
    
    public Window() {
        initComponents();
        
        // Driver laden bzw finden
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
        } catch (ClassNotFoundException ex) {
            System.out.println("Driber nicht gefunden");
            System.exit(1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxTables = new javax.swing.JComboBox<>();
        ServerField = new javax.swing.JTextField();
        ServerLabel = new javax.swing.JLabel();
        PortLabel = new javax.swing.JLabel();
        PortField = new javax.swing.JTextField();
        UserLabel = new javax.swing.JLabel();
        UserField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JTextField();
        conButton = new javax.swing.JButton();
        discButton = new javax.swing.JButton();
        DatabaseLabel = new javax.swing.JLabel();
        DatabaseField = new javax.swing.JTextField();
        dropdown = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();

        cbxTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTablesActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ServerField.setText("localhost");
        ServerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerFieldActionPerformed(evt);
            }
        });

        ServerLabel.setText("Server");

        PortLabel.setText("Port");

        PortField.setText("3306");
        PortField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortFieldActionPerformed(evt);
            }
        });

        UserLabel.setText("User");

        UserField.setText("root");

        PasswordLabel.setText("Password");

        conButton.setText("Connect");
        conButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conButtonActionPerformed(evt);
            }
        });

        discButton.setText("Disconnect");
        discButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discButtonActionPerformed(evt);
            }
        });

        DatabaseLabel.setText("Database");

        DatabaseField.setText("world");

        dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdownActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(UserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ServerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UserField)
                                    .addComponent(ServerField, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(DatabaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DatabaseField, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PasswordField)
                                    .addComponent(PortField, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                            .addComponent(dropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(conButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(discButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(ServerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ServerField)
                    .addComponent(PortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PortField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conButton))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(discButton)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatabaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatabaseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertButton)
                    .addComponent(deleteButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ServerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServerFieldActionPerformed

    private void PortFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PortFieldActionPerformed

    private void cbxTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTablesActionPerformed

    private void conButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conButtonActionPerformed
        // Die Daten, die in den TextFields sind, werden in Variablen gepeichert
        String user = UserField.getText();
        String password = PasswordField.getText();
        String database = DatabaseField.getText();
        String server = ServerField.getText();
        int port = 0; // Wichtig fur die Uberprufung
        
        // Uberprufung von Port Zahl
        try {
            port = Integer.parseInt(PortField.getText());
        } catch (NumberFormatException ex) {
            System.out.println("Please insert a correct port number!");
            javax.swing.JOptionPane.showMessageDialog(this, "Please insert a correct port number");
        }
        
        // Connection erstellen
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, user, password);
            // setEnable auf false, damit man kein Zugriff auf denen hat
            UserField.setEnabled(false);
            PasswordField.setEnabled(false);
            DatabaseField.setEnabled(false);
            ServerField.setEnabled(false);
            PortField.setEnabled(false);
            conButton.setEnabled(false);
            discButton.setEnabled(true);
            dropdown.setEnabled(true);
            dropdownValues(); //Dropdown Liste
            
            //PrimaryKeyfinden
            MD = conn.getMetaData();
            ResultSet res_prim = MD.getPrimaryKeys(null, null, "city");
            res_prim.next();
            primaryKey = res_prim.getString(4);
            primKeyPosition = res_prim.getInt("KEY_SEQ")-1;
        } catch (SQLException ex) {
            System.out.println("Fehler bei Erstellung einer Sitzung mit der DB");
        }
    }//GEN-LAST:event_conButtonActionPerformed

    private void discButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discButtonActionPerformed
        //Schliessen von der Sitzung
        try {
            conn.close();
            // setEnable auf true, damit man spater eine Sitzung erstellen kann
            UserField.setEnabled(true);
            PasswordField.setEnabled(true);
            DatabaseField.setEnabled(true);
            ServerField.setEnabled(true);
            PortField.setEnabled(true);
            conButton.setEnabled(true);
            discButton.setEnabled(false);
            dropdown.setModel(new DefaultComboBoxModel<String>());
            dropdown.setEnabled(false);
            table.setModel(new DefaultTableModel());
            table.setEnabled(false);
        } catch (SQLException ex) {
            System.out.println("Fehler bei das Schliessen von Sitzung");
        }
    }//GEN-LAST:event_discButtonActionPerformed
    
    private void tableModelChanged(TableModelEvent e){    
        //Methoder fur die Update von Daten
        int row = e.getFirstRow();
        String columnName = table.getModel().getColumnName(e.getColumn());     
        int id = Integer.parseInt(table.getModel().getValueAt(row, primKeyPosition).toString());
        String entryChanged =  table.getModel().getValueAt(row, e.getColumn()).toString();  
        
        try {
            PreparedStatement update = conn.prepareStatement("UPDATE city SET "+ columnName + "= ? WHERE " + primaryKey + " = ?");
            update.setString(1, entryChanged);
            update.setInt(2, id);
            System.out.println(update);
            System.out.println(update.executeUpdate() + " rows changed");
            
        } catch (SQLException ex) {
            System.out.println("Felher bei Update");
        }
    }
        
    private void dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownActionPerformed
        //Selktieren von Daten, wenn man bei DropdownMenu ein Tablle wahtl
        int num_columns = 0;
        try {
            ResultSet result = MD.getColumns(null, null, dropdown.getSelectedItem().toString(), null);
            tableModel = new DefaultTableModel();
            while (result.next()) {
                String columnName = result.getString(4); // Wenn mehr Colums gibt als die Tabelle bei der GUI, dann werden
                tableModel.addColumn(columnName);       // andere Spalten zugefugt.
                num_columns++;
            }
            table.setModel(tableModel);

        } catch (SQLException ex) {
            System.out.println("Felher bei Darstellung von Spalten" + dropdown.getSelectedItem().toString());
        }

        Statement stm;
        try {
            stm = conn.createStatement(); // Erstellung einer Statement, die all Daten der Tabelle selektiert.
            ResultSet res = stm.executeQuery("SELECT * FROM " + dropdown.getSelectedItem().toString());

            while (res.next()) { //Selektierung von Daten Zeile fur Zeile
                Object[] row = new Object[num_columns];
                for (int i=1; i<=num_columns; i++) {
                    row[i-1] = res.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(res.getRow()-1, row);
            }
            
            table.getModel().addTableModelListener(new TableModelListener() {
                @Override
                public void tableChanged(TableModelEvent e) {   //Table wurde aktualisiert
                    System.out.println("Table Updated");
                    tableModelChanged(e);
                }
            });

        } catch (SQLException ex) {
            System.out.println("Felher bei Darstellung von Datenbank");
        }
    }//GEN-LAST:event_dropdownActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        //Insert von neue Zeile
        try { 
            // Die letzte Zeile wird kopiert und dann zugefugt.
            int numCol=0;
            int lastRow=table.getModel().getRowCount()-1;
            ResultSet res =MD.getColumns(null, null, dropdown.getItemAt(index).toString(), null);
            String sql="INSERT INTO city (";
            res.next();
            
            while(res.next()){  //Die Namen der Spalten werden genommen
                sql+=res.getString(4)+",";
                numCol++;
            }
            
            sql = sql.substring(0, sql.length()-1);
            sql+=") VALUES (";
         
            for(int i=0; i<numCol; i++){    //Die Daten der Zeile werden genommen
                sql+="?,";
            }
            sql = sql.substring(0, sql.length()-1);
            sql+=");";
            PreparedStatement prepInsert = conn.prepareStatement(sql);
            
            for(int i=0; i<numCol; i++){
                prepInsert.setString(i+1, ""+table.getModel().getValueAt(lastRow, i+1)); //Einfugen der neue Zeile
            }
            prepInsert.executeUpdate(); //Statement Execute
            
        } catch (SQLException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row = table.getSelectedRow(); //Findet die selektierte Zeile
        int id =  Integer.parseInt(table.getModel().getValueAt(row, primKeyPosition).toString()); //Findet den ID
        try{      
            //Erstellung und Einfuhrung von PreparedStatement zum Loschen der Zeile
            PreparedStatement delete=conn.prepareStatement("DELETE from city WHERE id = ?;");
            delete.setInt(1, id);
            delete.executeUpdate();
            tableModel.removeRow(row);
        }catch(SQLException e){
              Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, e);  
        }  
    }//GEN-LAST:event_deleteButtonActionPerformed
    private void dropdownValues(){
        // Findung von Tabellen fur die Dropdown Liste
        try { 
            MD = conn.getMetaData();
            ResultSet res = MD.getTables(null, null,null,null);
            while(res.next()){
                dropdown.addItem(res.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DatabaseField;
    private javax.swing.JLabel DatabaseLabel;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField PortField;
    private javax.swing.JLabel PortLabel;
    private javax.swing.JTextField ServerField;
    private javax.swing.JLabel ServerLabel;
    private javax.swing.JTextField UserField;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JComboBox<String> cbxTables;
    private javax.swing.JButton conButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton discButton;
    private javax.swing.JComboBox<String> dropdown;
    private javax.swing.JButton insertButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
