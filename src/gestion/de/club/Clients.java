/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.club;

import java.util.Date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import oracle.net.aso.d;
import oracle.sql.DATE;

/**
 *
 * @author user
 */
public class Clients extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel m;
    
    public Clients() {
        super("Clients");
        initComponents();
        conn = DBConnection.connection();
 }
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
        txt_cli_cne = new javax.swing.JTextField();
        txt_cli_nom = new javax.swing.JTextField();
        txt_cli_pre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_cli = new javax.swing.JTable();
        b_aj_cli = new javax.swing.JButton();
        b_mod_cli = new javax.swing.JButton();
        b_supp_cli = new javax.swing.JButton();
        b_rech_cli = new javax.swing.JButton();
        txt_rech_cli = new javax.swing.JTextField();
        b_cli_aff = new javax.swing.JButton();
        txt_cli_email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(0, 204, 0));

        jLabel6.setFont(new java.awt.Font("Candara Light", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Menu");

        b_menu_clubs.setBackground(new java.awt.Color(0, 255, 51));
        b_menu_clubs.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        b_menu_clubs.setForeground(new java.awt.Color(255, 255, 255));
        b_menu_clubs.setText("Clubs");
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
                .addGap(0, 136, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setText("CNE de Client : ");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setText("Nom de Client :");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel9.setText("Prenom de Client : ");

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel10.setText("Email de Client : ");

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel11.setText("Gestion Des Clients");

        txt_cli_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cli_nomActionPerformed(evt);
            }
        });

        txt_cli_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cli_preActionPerformed(evt);
            }
        });

        tab_cli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNE de Clients", "Nom de Clients", "Prenom de Clients", "Email de Clients"
            }
        ));
        tab_cli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab_cli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_cliMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab_cli);

        b_aj_cli.setText("Ajouter");
        b_aj_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_aj_cliActionPerformed(evt);
            }
        });

        b_mod_cli.setText("Modifier");
        b_mod_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mod_cliActionPerformed(evt);
            }
        });

        b_supp_cli.setText("Supprimer");
        b_supp_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_supp_cliActionPerformed(evt);
            }
        });

        b_rech_cli.setText("Rechercher");
        b_rech_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rech_cliActionPerformed(evt);
            }
        });

        txt_rech_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rech_cliActionPerformed(evt);
            }
        });
        txt_rech_cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rech_cliKeyReleased(evt);
            }
        });

        b_cli_aff.setText("Afficher");
        b_cli_aff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cli_affActionPerformed(evt);
            }
        });

        txt_cli_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cli_emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_cli_pre)
                                    .addComponent(txt_cli_nom)
                                    .addComponent(txt_cli_cne, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cli_email))
                                .addGap(241, 241, 241))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(156, 156, 156))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b_cli_aff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_rech_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b_rech_cli))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b_aj_cli)
                                .addGap(18, 18, 18)
                                .addComponent(b_mod_cli)
                                .addGap(18, 18, 18)
                                .addComponent(b_supp_cli)
                                .addGap(4, 4, 4)))
                        .addGap(0, 41, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_cli_cne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_cli_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_cli_pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_cli_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_aj_cli)
                    .addComponent(b_mod_cli)
                    .addComponent(b_supp_cli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_rech_cli)
                    .addComponent(txt_rech_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b_cli_aff)
                        .addGap(45, 45, 45)))
                .addGap(132, 132, 132))
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

    private void txt_cli_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cli_preActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cli_preActionPerformed

    private void txt_cli_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cli_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cli_nomActionPerformed

    private void b_menu_clubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_menu_clubsActionPerformed
        // TODO add your handling code here:
                setVisible(false);
        Clients obj = new Clients();
        obj.setVisible(true);
    }//GEN-LAST:event_b_menu_clubsActionPerformed

    private void b_aj_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_aj_cliActionPerformed

            int cne = Integer.parseInt(txt_cli_cne.getText());
            String nom = txt_cli_nom.getText();
            String pre = txt_cli_pre.getText();
            String email = txt_cli_email.getText();
        
        try {

            String sql = "INSERT INTO CLIENTS VALUES('"+cne+"','"+nom+"','"+pre+"','"+email+"')";
            //String sql = "call addItemClub('"+nom+"' ,'"+fond+"','"+desc+"','"+date+"')";
            PreparedStatement p = conn.prepareStatement(sql);
            //PreparedStatement p = conn.prepareStatement("call addItemClub('"+nom+"' ,'"+fond+"','"+desc+"','"+date+"')");
            p.execute();
            
            JOptionPane.showMessageDialog(null,"Le Client a été bien insere");
          
            DefaultTableModel model = (DefaultTableModel)tab_cli.getModel();
            model.addRow(new Object[]{txt_cli_cne.getText(),txt_cli_nom.getText(),txt_cli_pre.getText(),txt_cli_email.getText()});
        
            txt_cli_cne.setText("");
            txt_cli_nom.setText("");
            txt_cli_pre.setText("");
            txt_cli_email.setText("");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
            
    }//GEN-LAST:event_b_aj_cliActionPerformed

    private void txt_rech_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rech_cliActionPerformed
       
    }//GEN-LAST:event_txt_rech_cliActionPerformed

    private void b_mod_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mod_cliActionPerformed
        // TODO add your handling code here:
        String nom = txt_cli_nom.getText();
        int cne = Integer.parseInt(txt_cli_cne.getText());
        String pre = txt_cli_pre.getText();
        String  email= txt_cli_email.getText(); 
        
        try {
            PreparedStatement ps = conn.prepareStatement("update clients set cne_cli='"+cne+"' , nom_cli='"+nom+"' , prenom_cli='"+pre+"' , email_cli = '"+email+"' where cne_cli = '"+cne+"'");
             //String sql = "call updateItemClub('"+nom+"' ,'"+fond+"','"+desc+"','"+date+"')";
             
            //PreparedStatement ps = conn.prepareStatement("call updateItemClub('"+nom+"','"+fond+"','"+desc+"',"+date+")");
            int i = ps.executeUpdate();
            
            if (i>0){
                  JOptionPane.showMessageDialog(null,"Modification Valide !!");
        }
            modifier();
            }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
    }//GEN-LAST:event_b_mod_cliActionPerformed

    private void tab_cliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_cliMouseClicked
        // TODO add your handling code here:     
        try {
        int row = tab_cli.getSelectedRow();
        String tab_click = (tab_cli.getModel().getValueAt(row,0).toString());
        String sql = "select * from clients where cne_cli ='"+tab_click+"'";
  
       PreparedStatement  ps = conn.prepareStatement(sql);
            rs= ps.executeQuery();
             
            if(rs.next()){
                String add1 = rs.getString("CNE_CLI");
                txt_cli_cne.setText(add1);
                String add2 = rs.getString("NOM_CLI");
                txt_cli_nom.setText(add2);
                String add3 = rs.getString("PRENOM_CLI");
                txt_cli_pre.setText(add3);
                String add4 = rs.getString("EMAIL_CLI");
                txt_cli_email.setText(add4);
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
       
    }//GEN-LAST:event_tab_cliMouseClicked

    private void filtre(String sql){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(m);
        tab_cli.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(sql));
        
    }
    
    private void modifier() throws SQLException{
        String sql= "select * from clients";
        
        PreparedStatement p = conn.prepareStatement(sql);
        try{
            p = conn.prepareStatement(sql);
            rs = p.executeQuery();
            tab_cli.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); 
        }
    }
    
    private void b_cli_affActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cli_affActionPerformed

        try {
            PreparedStatement ps = conn.prepareStatement("select * from clients");
            rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)tab_cli.getModel();
            tm.setRowCount(0);
            
           while(rs.next()){
               Object o[]={rs.getInt("cne_cli"),rs.getString("nom_cli"),rs.getString("prenom_cli"),rs.getString("email_cli")};
               tm.addRow(o);      
               }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_b_cli_affActionPerformed

    private void b_supp_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_supp_cliActionPerformed
        // TODO add your handling code here
        try {
        int row = tab_cli.getSelectedRow();
        String x = tab_cli.getModel().getValueAt(row,0).toString();
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this,"Vous voulez vraiment le supprimer ?");
        if(dialogResult == 0) {
            
         String sql ="DELETE FROM CLIENTS WHERE cne_cli ='"+x+"'";
         PreparedStatement  ps = conn.prepareStatement(sql);     
         //PreparedStatement  ps = conn.prepareStatement("call deleteItemCLub('"+x+"')");
         ps.execute();
         
         JOptionPane.showMessageDialog(null,"Suppression Valide !!");
         modifier();
         txt_cli_cne.setText(null);
         txt_cli_nom.setText(null);
         txt_cli_pre.setText(null);
         txt_cli_email.setText(null);
         
        }
       
            
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_b_supp_cliActionPerformed

    private void txt_rech_cliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rech_cliKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rech_cliKeyReleased

    private void b_rech_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rech_cliActionPerformed
      int cne_cli = Integer.parseInt(txt_rech_cli.getText()) ;
      for(int i = 0 ; i<tab_cli.getRowCount() ; i++) {
          if(tab_cli.getValueAt(i,0).equals(cne_cli)){
              tab_cli.setRowSelectionInterval(i,i);
          }
      }
    }//GEN-LAST:event_b_rech_cliActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        setVisible(false);
        Employees obj = new Employees();
        obj.setVisible(true);       
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
                      setVisible(false);
        Produit obj = new Produit();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void txt_cli_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cli_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cli_emailActionPerformed

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
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_aj_cli;
    private javax.swing.JButton b_cli_aff;
    private javax.swing.JButton b_menu_clubs;
    private javax.swing.JButton b_mod_cli;
    private javax.swing.JButton b_rech_cli;
    private javax.swing.JButton b_supp_cli;
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
    private javax.swing.JTable tab_cli;
    private javax.swing.JTextField txt_cli_cne;
    private javax.swing.JTextField txt_cli_email;
    private javax.swing.JTextField txt_cli_nom;
    private javax.swing.JTextField txt_cli_pre;
    private javax.swing.JTextField txt_rech_cli;
    // End of variables declaration//GEN-END:variables
}
