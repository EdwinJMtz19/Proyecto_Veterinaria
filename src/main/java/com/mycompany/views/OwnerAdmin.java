/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.interfaces.DAOCliente;
import com.mycompany.models.Cliente;
import com.mycompany.models.DAOClienteImplements;
import com.mycompany.utils.pagination.EventPagination;
import com.mycompany.utils.pagination.style.PaginationItemRenderStyle1;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 52951
 */
public class OwnerAdmin extends javax.swing.JPanel {

    /**
     * Creates new form OwnerAdmin
     */
    public OwnerAdmin() {
        initComponents();
         LoadOwner(0);
    pgnPagination.setPaginationItemRender(new PaginationItemRenderStyle1());
        pgnPagination.addEventPagination(new EventPagination() {
            @Override
            public void pageChanged(int page) {
                LoadOwner(page);
            }
        });
    }

    private void LoadOwner(int page) {
        try {
            DAOCliente dao = new DAOClienteImplements();
            DefaultTableModel model = (DefaultTableModel) tblTable.getModel();

            //Para la paginacion
            model.setRowCount(0);
            int limit = 2;
            int numeroRegistros = dao.contarRegistros();
            int totalPage = (int) Math.ceil((numeroRegistros / limit) + 1);
            pgnPagination.setPagegination(page, totalPage);
            List<Cliente> lista = dao.listar("", "", page, limit);
            System.out.println(lista.size());
            dao.listar("", "", 0, 0).forEach((u) -> model.addRow(new Object[]{u.getNombre(), u.getCorreo()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgnPagination = new com.mycompany.utils.pagination.Pagination();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAlter = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pgnPagination.setOpaque(false);
        add(pgnPagination, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 484, 445, 43));

        jLabel1.setText("Clientes");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 32, 246, -1));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 54, 716, 32));

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Correo Electronico"
            }
        ));
        jScrollPane1.setViewportView(tblTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 129, 716, 293));

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 492, -1, -1));

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 492, -1, -1));

        btnAlter.setText("Modificar");
        btnAlter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterActionPerformed(evt);
            }
        });
        add(btnAlter, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 492, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        new FormOwner().setVisible(true);
        cargar("","");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAlterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterActionPerformed
        // TODO add your handling code here:
        
         int seleccion = tblTable.getSelectedRow();
        DAOCliente dao = new DAOClienteImplements();
        try {
            List <Cliente> list = dao.listar("","", 0, 0);
            new FormOwner(list.get(seleccion)).setVisible(true);
        
        
        cargar("","");
         } catch (Exception ex) {
            Logger.getLogger(PetsAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargar("","");
    }//GEN-LAST:event_btnAlterActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:
        cargar(txtSearch.getText(),"");
    }//GEN-LAST:event_txtSearchKeyTyped

    
    public void cargar(String nombre,String correo){
    DAOCliente dao = new DAOClienteImplements();
            DefaultTableModel model = (DefaultTableModel) tblTable.getModel();
            model.setRowCount(0);
        try {
            dao.listar(nombre, correo, 0, 0).forEach((u) -> model.addRow(new Object[]{u.getNombre(), u.getCorreo()}));
        } catch (Exception ex) {
            Logger.getLogger(OwnerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }  
}
    
    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
         cargar(txtSearch.getText(),"");
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DAOCliente dao = new DAOClienteImplements();
       String nombre = (String) tblTable.getValueAt(tblTable.getSelectedRow(), 0);
       List <Cliente> lista;
        try {
            lista = dao.listar(nombre, "", 0, 0);
            dao.eliminar(lista.get(0).getId_usuario());
        } catch (Exception ex) {
            Logger.getLogger(OwnerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         cargar("","");
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAlter;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.mycompany.utils.pagination.Pagination pgnPagination;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}