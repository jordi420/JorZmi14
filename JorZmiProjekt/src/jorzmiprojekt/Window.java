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

    DatabaseMetaData MD = null;
    private Connection conn = null;
    String primaryKey = null;
    int primKeyPosition = 0;
    DefaultTableModel tableModel;
    
    public Window() {
        initComponents();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Could not load mysql driver!");
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading MySQL Driver");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(UserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ServerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UserField)
                                    .addComponent(ServerField, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DatabaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DatabaseField, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PasswordField)
                                    .addComponent(PortField, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                            .addComponent(dropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(conButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(discButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
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
        String user = UserField.getText();
        String password = PasswordField.getText();
        String database = DatabaseField.getText();
        String server = ServerField.getText();

        int port = 0;
        try {
            port = Integer.parseInt(PortField.getText());
        } catch (NumberFormatException ex) {
            System.out.println("Please insert a correct port number!");
            javax.swing.JOptionPane.showMessageDialog(this, "Please insert a correct port number");
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, user, password);
            UserField.setEnabled(false);
            PasswordField.setEnabled(false);
            DatabaseField.setEnabled(false);
            ServerField.setEnabled(false);
            PortField.setEnabled(false);
            conButton.setEnabled(false);
            discButton.setEnabled(true);
            dropdown.setEnabled(true);
            
            MD = conn.getMetaData();
            ResultSet res_prim = MD.getPrimaryKeys(null, null, "city");
            res_prim.next();
            primaryKey = res_prim.getString(4);
            primKeyPosition =res_prim.getInt("KEY_SEQ")-1;
            System.out.println("Primary Key Position "+primKeyPosition);
            System.out.println("Primary Key " + res_prim.getString(4));

        } catch (SQLException ex) {
            System.out.println("Could not connect to world database!");
            javax.swing.JOptionPane.showMessageDialog(this, "Could not connect to Server");
        }

        /* OPTIONAL LIST TABLES */
        try {
            MD = conn.getMetaData();

            ResultSet rs = MD.getTables(null, null, null, null);
            while (rs.next()) {
                dropdown.addItem(rs.getString(3));
                //System.out.println(rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println("Could not retrieve database meta-data");
            javax.swing.JOptionPane.showMessageDialog(this, "Could not retrieve database meta-data");
        }
    }//GEN-LAST:event_conButtonActionPerformed

    private void discButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discButtonActionPerformed
        
        try {
            conn.close();

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
            System.out.println("Error closing database connection");
            javax.swing.JOptionPane.showMessageDialog(this, "Error closing database connection");
        }


    }//GEN-LAST:event_discButtonActionPerformed
        private void tableModelChanged(TableModelEvent e){
        System.out.println("table changed");
        int row = e.getFirstRow();
        String columnName = 
        table.getModel().getColumnName(e.getColumn());
                
        int id = 
                Integer.parseInt(table.getModel().getValueAt(row, primKeyPosition).toString());
          System.out.println(columnName +" " +  id);

        String entry_changed = 
                table.getModel().getValueAt(row, e.getColumn()).toString();  
        try {
            PreparedStatement update =
                    conn.prepareStatement(
                            "UPDATE city SET "+ columnName + "= ? WHERE " + primaryKey + " = ?");
            update.setString(1, entry_changed);
            update.setInt(2, id);
            System.out.println(update);
            System.out.println(update.executeUpdate() + " rows changed");
            
        } catch (SQLException ex) {
            System.out.println("Error updating table");
            javax.swing.JOptionPane.showMessageDialog(this, "Error updating table");
        }
    }
        
    private void dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdownActionPerformed
        int num_columns = 0;

        try {
            ResultSet result = MD.getColumns(
                    null, null, dropdown.getSelectedItem().toString(), null);

            //tblEntries.removeAll();
            tableModel = new DefaultTableModel();

            while (result.next()) {
                String columnName = result.getString(4);

                tableModel.addColumn(columnName);
                num_columns++;
                //               int columnType = result.getInt(5);
            }
            table.setModel(tableModel);

        } catch (SQLException ex) {
            System.out.println("Error building column structure for table " + dropdown.getSelectedItem().toString());
            javax.swing.JOptionPane.showMessageDialog(this, "Error building column structure for table " + dropdown.getSelectedItem().toString());
        }

        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM " + dropdown.getSelectedItem().toString());

            while (res.next()) {
                Object[] row = new Object[num_columns];
                for (int i = 1; i <= num_columns; i++) {
                    row[i - 1] = res.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(res.getRow() - 1, row);
            }
            
            table.getModel().addTableModelListener(new TableModelListener() {
                @Override
                public void tableChanged(TableModelEvent e) {
                    System.out.println("table changed");
                    tableModelChanged(e);
                }
            });

        } catch (SQLException ex) {
            System.out.println("Error building result table from database");
            javax.swing.JOptionPane.showMessageDialog(this, "Error building result table from database");
        }


    }//GEN-LAST:event_dropdownActionPerformed

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
    private javax.swing.JButton discButton;
    private javax.swing.JComboBox<String> dropdown;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
