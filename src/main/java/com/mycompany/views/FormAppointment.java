/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.interfaces.DAOCitas;
import com.mycompany.interfaces.DAOCliente;
import com.mycompany.interfaces.DAOVeterinario;
import com.mycompany.models.Citas;
import com.mycompany.models.Cliente;
import com.mycompany.models.DAOCitasImplements;
import com.mycompany.models.DAOClienteImplements;
import com.mycompany.models.DAOVeterinarioImplements;
import com.mycompany.models.Mascota;
import com.mycompany.models.Veterinario;
import com.mycompany.utils.Utils;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 52951
 */
public class FormAppointment extends javax.swing.JFrame {

    /**
     * Creates new form FormAppointment
     */
    Mascota mas;

    public FormAppointment(Mascota mass) throws Exception {
        initComponents();
        lblEmpty.setVisible(false);
        mas = mass;
         DAOCliente cliente = new DAOClienteImplements();
        List<Cliente> listCli = cliente.listar(mas.getId_usuario());
        txtPet.setText(mas.getNombre());
        txtOwner.setText(listCli.get(0).getNombre());
        DAOVeterinario daov = new DAOVeterinarioImplements();
        List<Veterinario> vet = daov.listar("", "", 0, 0);
        for(int i = 0; i < vet.size(); i++)
             cbxVeterinarian.addItem(vet.get(i).getNombre());
        
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        txtPet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOwner = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnCancel = new javax.swing.JToggleButton();
        lblEmpty = new javax.swing.JLabel();
        cbxAnio = new javax.swing.JComboBox<>();
        cbxDia = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        cbxHora = new javax.swing.JComboBox<>();
        cbxMinuto = new javax.swing.JComboBox<>();
        cbxVeterinarian = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Agendar");
        pnlPrincipal.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 6, 159, 59));

        lblSubtitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSubtitle.setText("Cita");
        pnlPrincipal.add(lblSubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 71, -1, -1));

        txtPet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPetMousePressed(evt);
            }
        });
        txtPet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPetKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtPet, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 145, 260, 32));

        jLabel1.setText("Nombre de la Mascota");
        pnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 123, -1, -1));

        jLabel2.setText("Nombre del Cliente");
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 195, -1, -1));

        txtOwner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOwnerKeyTyped(evt);
            }
        });
        pnlPrincipal.add(txtOwner, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 217, 260, 32));

        jLabel3.setText("Nombre del Veterinario");
        pnlPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 261, -1, -1));

        jLabel6.setText("Fecha");
        pnlPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel7.setText("Hora");
        pnlPrincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        btnAccept.setText("Aceptar");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 626, 260, 39));

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 671, 260, 40));

        lblEmpty.setForeground(new java.awt.Color(204, 0, 0));
        lblEmpty.setText("SE DEBEN RELLENAR TODOS LOS CAMPOS");
        pnlPrincipal.add(lblEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 604, 241, -1));

        cbxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        pnlPrincipal.add(cbxAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        cbxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        pnlPrincipal.add(cbxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        pnlPrincipal.add(cbxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        cbxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        pnlPrincipal.add(cbxHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        cbxMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        cbxMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMinutoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(cbxMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, -1));

        cbxVeterinarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVeterinarianActionPerformed(evt);
            }
        });
        pnlPrincipal.add(cbxVeterinarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        if (txtPet.getText().isEmpty()
                || txtOwner.getText().isEmpty()) {
            lblEmpty.setVisible(true);
        } else {
            
            DAOCliente cliente = new DAOClienteImplements();
            DAOVeterinario veterinario = new DAOVeterinarioImplements();
            DAOCitas dao = new DAOCitasImplements();
            try {
               
                List<Cliente> listCli = cliente.listar(mas.getId_usuario());
                List<Veterinario> listaVet = veterinario.listar("", "", 0, 0);

                if (listaVet.isEmpty()) {
                    javax.swing.JOptionPane.showMessageDialog(this, """
                                                                        Debes ingresar datos correctos
                                                                        No se puede acceder a alguno de los datos""", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                Date fecha = Date.valueOf( (String)(cbxAnio.getSelectedItem())+"-"+
                        (String)(cbxMes.getSelectedItem())+"-"+
                        (String)(cbxDia.getSelectedItem()));
                Time tiempo = Time.valueOf((String)(cbxHora.getSelectedItem())+":"+
                        (String)(cbxMinuto.getSelectedItem())+":00");
                //int id_mascota, int id_usuario, LocalDate fecha, LocalTime hora, String estado
                Citas cita = new Citas(mas.getId_mascota(), listCli.get(0).getId_usuario(),
                fecha.toLocalDate(),tiempo.toLocalTime(),listaVet.get(cbxVeterinarian.getSelectedIndex()).getNombre_usuario(),"pendiente");
                dao.registrar(cita);
                Utils util = new Utils();
                util.sendEmail(listCli.get(0).getNombre(), listCli.get(0).getCorreo(), ((String)(cbxAnio.getSelectedItem())+"-"+
                        (String)(cbxMes.getSelectedItem())+"-"+
                        (String)(cbxDia.getSelectedItem())
                        ),((String)(cbxHora.getSelectedItem())+":"+
                        (String)(cbxMinuto.getSelectedItem())+":00"));
                this.setVisible(false);
            } catch (Exception ex) {
                Logger.getLogger(FormAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnAcceptActionPerformed

    private void txtPetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPetMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPetMousePressed

    private void txtPetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPetKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();  // Ignorar la entrada de caracteres no deseados
        }
    }//GEN-LAST:event_txtPetKeyTyped

    private void txtOwnerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();  // Ignorar la entrada de caracteres no deseados
        }
    }//GEN-LAST:event_txtOwnerKeyTyped

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cbxMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMinutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMinutoActionPerformed

    private void cbxVeterinarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVeterinarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxVeterinarianActionPerformed

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
            java.util.logging.Logger.getLogger(FormAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormAppointment(null).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FormAppointment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JToggleButton btnCancel;
    private javax.swing.JComboBox<String> cbxAnio;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxHora;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxMinuto;
    private javax.swing.JComboBox<String> cbxVeterinarian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblEmpty;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtOwner;
    private javax.swing.JTextField txtPet;
    // End of variables declaration//GEN-END:variables
}
