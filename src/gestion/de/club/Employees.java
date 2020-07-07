/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.club;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class Employees extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public Employees() {
        super("Employees");
        initComponents();
        conn = DBConnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        b_menu_clubs = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_emp_cne = new javax.swing.JTextField();
        txt_emp_nom = new javax.swing.JTextField();
        txt_emp_pre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_emp = new javax.swing.JTable();
        b_aj_emp = new javax.swing.JButton();
        b_mod_emp = new javax.swing.JButton();
        b_supp_emp = new javax.swing.JButton();
        b_rech_emp = new javax.swing.JButton();
        txt_rech_emp = new javax.swing.JTextField();
        txt_emp_sal = new javax.swing.JTextField();
        b_emp_aff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(0, 204, 0));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Menu");

        b_menu_clubs.setBackground(new java.awt.Color(0, 255, 51));
        b_menu_clubs.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        b_menu_clubs.setForeground(new java.awt.Color(255, 255, 255));
        b_menu_clubs.setText("Clients");
        b_menu_clubs.setBorder(null);
        b_menu_clubs.setBorderPainted(false);
        b_menu_clubs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_menu_clubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_menu_clubsActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(0, 255, 51));
        jButton22.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Produits");
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(0, 255, 51));
        jButton23.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Employees");
        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(255, 51, 51));
        jButton24.setText("Logout");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b_menu_clubs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButton24))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(b_menu_clubs, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton24)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setText("CNE : ");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setText("Nom de L'employee : ");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel9.setText("Prenom de L'employee : ");

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel10.setText("Salaire : ");

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel11.setText("Gestion Des Employees");

        txt_emp_cne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emp_cneActionPerformed(evt);
            }
        });

        txt_emp_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emp_nomActionPerformed(evt);
            }
        });

        txt_emp_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emp_preActionPerformed(evt);
            }
        });

        tab_emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNE", "Nom de L'employee", "Prenom de L'employee", "Salaire"
            }
        ));
        tab_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_empMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab_emp);

        b_aj_emp.setText("Ajouter");
        b_aj_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_aj_empActionPerformed(evt);
            }
        });

        b_mod_emp.setText("Modifier");
        b_mod_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mod_empActionPerformed(evt);
            }
        });

        b_supp_emp.setText("Supprimer");
        b_supp_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_supp_empActionPerformed(evt);
            }
        });

        b_rech_emp.setText("Rechercher");
        b_rech_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rech_empActionPerformed(evt);
            }
        });

        txt_rech_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rech_empActionPerformed(evt);
            }
        });

        txt_emp_sal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emp_salActionPerformed(evt);
            }
        });

        b_emp_aff.setText("Afficher");
        b_emp_aff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_emp_affActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_emp_pre, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(txt_emp_nom)
                            .addComponent(txt_emp_cne)
                            .addComponent(txt_emp_sal))
                        .addGap(172, 172, 172))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(b_aj_emp)
                                        .addGap(18, 18, 18)
                                        .addComponent(b_mod_emp)))
                                .addGap(18, 18, 18)
                                .addComponent(b_supp_emp))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b_emp_aff)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_rech_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b_rech_emp))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_emp_cne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_emp_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_emp_pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_emp_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_aj_emp)
                            .addComponent(b_mod_emp)
                            .addComponent(b_supp_emp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_emp_aff)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_rech_emp)
                            .addComponent(txt_rech_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(172, 172, 172))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_menu_clubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_menu_clubsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Clients obj = new Clients();
        obj.setVisible(true);

    }//GEN-LAST:event_b_menu_clubsActionPerformed

    private void txt_emp_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emp_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emp_nomActionPerformed

    private void txt_emp_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emp_preActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emp_preActionPerformed

    private void tab_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_empMouseClicked

        try {
            int row = tab_emp.getSelectedRow();
            String tab_click = (tab_emp.getModel().getValueAt(row, 0).toString());
            String sql = "select * from employees where cne_emp ='" + tab_click + "'";

            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("cne_emp");
                txt_emp_cne.setText(add1);
                String add2 = rs.getString("nom_emp");
                txt_emp_nom.setText(add2);
                String add3 = rs.getString("prenom_emp");
                txt_emp_pre.setText(add3);
                String add4 = rs.getString("salair_emp");
                txt_emp_sal.setText(add4);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tab_empMouseClicked

    private void modifier() throws SQLException {
        String sql = "select * from employees";

        PreparedStatement p = conn.prepareStatement(sql);
        try {
            p = conn.prepareStatement(sql);
            rs = p.executeQuery();
            tab_emp.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void b_aj_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_aj_empActionPerformed

        String nom = txt_emp_nom.getText();
        String sal = txt_emp_sal.getText();
        String cne = txt_emp_cne.getText();
        String pre = txt_emp_pre.getText();

        try {
            PreparedStatement p = conn.prepareStatement("INSERT INTO EMPLOYEES VALUES('" + cne + "','" + nom + "','" + pre + "','" + sal + "')");
            //PreparedStatement p = conn.prepareStatement("call addItemEtudiant('"+cne+"','"+nom+"','"+pre+"','"+date+"','"+filier+"')");
            p.execute();
            JOptionPane.showMessageDialog(null, "L'employees a été bien insere");

            DefaultTableModel model = (DefaultTableModel) tab_emp.getModel();
            model.addRow(new Object[]{txt_emp_cne.getText(), txt_emp_nom.getText(), txt_emp_pre.getText(), txt_emp_sal.getText()});

            txt_emp_nom.setText("");
            txt_emp_sal.setText("");
            txt_emp_cne.setText("");
            txt_emp_pre.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_b_aj_empActionPerformed

    private void b_mod_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mod_empActionPerformed
        // TODO add your handling code here:
        String nom = txt_emp_nom.getText();
        String sal = txt_emp_sal.getText();
        String cne = txt_emp_cne.getText();
        String pre = txt_emp_pre.getText();
        try {
            PreparedStatement ps = conn.prepareStatement("update employees set cne_emp='" + cne + "' , nom_emp='" + nom + "' , prenom_emp='" + pre + "' , salair_emp= '" + sal + "' where cne_emp = '" + cne + "'");
            //PreparedStatement ps = conn.prepareStatement("call updateItemEtudiant('"+cne+"' , '"+nom+"' ,'"+pre+"' ,'"+date+"' ,'"+filier+"')");
            int i = ps.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Modification Valide !!");
                txt_emp_nom.setText("");
                txt_emp_sal.setText("");
                txt_emp_cne.setText("");
                txt_emp_pre.setText("");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_b_mod_empActionPerformed

    private void txt_rech_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rech_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rech_empActionPerformed

    private void txt_emp_salActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emp_salActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emp_salActionPerformed

    private void txt_emp_cneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emp_cneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emp_cneActionPerformed

    private void b_supp_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_supp_empActionPerformed
        // TODO add your handling code here:
        try {
            int row = tab_emp.getSelectedRow();
            String x = tab_emp.getModel().getValueAt(row, 0).toString();

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Vous voulez vraiment le supprimer ?");
            if (dialogResult == 0) {
                String sql = "DELETE FROM employees WHERE cne_emp ='" + x + "'";
                PreparedStatement p = conn.prepareStatement(sql);
                //PreparedStatement  ps = conn.prepareStatement("call deleteItemEtudiant('"+x+"')");
                p.executeUpdate();
                JOptionPane.showMessageDialog(null, "Suppression Valide !!");
                modifier();
                txt_emp_nom.setText(null);
                txt_emp_pre.setText(null);
                txt_emp_cne.setText(null);
                txt_emp_sal.setText(null);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_b_supp_empActionPerformed

    private void b_rech_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rech_empActionPerformed
        // TODO add your handling code here:
        String cne_emp = txt_rech_emp.getText();
        for (int i = 0; i < tab_emp.getRowCount(); i++) {
            if (tab_emp.getValueAt(i, 0).equals(cne_emp)) {
                tab_emp.setRowSelectionInterval(i, i);
            }
        }
    }//GEN-LAST:event_b_rech_empActionPerformed

    private void b_emp_affActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_emp_affActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement ps = conn.prepareStatement("select * from employees");
            rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) tab_emp.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object o[] = {rs.getString("CNE_EMP"), rs.getString("NOM_EMP"), rs.getString("PRENOM_EMP"), rs.getString("SALAIR_EMP")};
                tm.addRow(o);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_emp_affActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Produit obj = new Produit();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Employees obj = new Employees();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
                setVisible(false);
        login obj = new login();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_aj_emp;
    private javax.swing.JButton b_emp_aff;
    private javax.swing.JButton b_menu_clubs;
    private javax.swing.JButton b_mod_emp;
    private javax.swing.JButton b_rech_emp;
    private javax.swing.JButton b_supp_emp;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab_emp;
    private javax.swing.JTextField txt_emp_cne;
    private javax.swing.JTextField txt_emp_nom;
    private javax.swing.JTextField txt_emp_pre;
    private javax.swing.JTextField txt_emp_sal;
    private javax.swing.JTextField txt_rech_emp;
    // End of variables declaration//GEN-END:variables
}
