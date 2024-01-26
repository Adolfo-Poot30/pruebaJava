package com.japb.prueba.UI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class menuFrame extends javax.swing.JFrame {

    public menuFrame() {
        initComponents();
        setTitle("Opciones");
        setResizable(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmarCierre();
            }
        });
    }

    private void confirmarCierre() {
        int opcion = javax.swing.JOptionPane.showConfirmDialog(this,
                "¿Deseas cerrar sesión?",
                "Confirmar Cierre", javax.swing.JOptionPane.YES_NO_OPTION);

        if (opcion == javax.swing.JOptionPane.YES_OPTION) {
            
            if(productosVentana != null && productosVentana.isShowing()){
                productosVentana.dispose();
            }
            if(agregarProductoVentana != null && agregarProductoVentana.isShowing()){
                agregarProductoVentana.dispose();
            }
            dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        verProductosButton = new javax.swing.JButton();
        agregarProductoButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();

        jMenuItem1.setBackground(new java.awt.Color(255, 0, 0));
        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        verProductosButton.setText("Ver todos los productos");
        verProductosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProductosButtonActionPerformed(evt);
            }
        });

        agregarProductoButton.setText("Agregar producto");
        agregarProductoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoButtonActionPerformed(evt);
            }
        });

        editarButton.setText("Editar un producto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verProductosButton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarButton)
                            .addComponent(agregarProductoButton))))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(verProductosButton)
                .addGap(44, 44, 44)
                .addComponent(agregarProductoButton)
                .addGap(52, 52, 52)
                .addComponent(editarButton)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private TodosLosProductosFrame productosVentana;
    private AgregarProductosFrame agregarProductoVentana;
    
    private void verProductosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProductosButtonActionPerformed
        productosVentana = new TodosLosProductosFrame();
        productosVentana.setVisible(true);
    }//GEN-LAST:event_verProductosButtonActionPerformed

    private void agregarProductoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoButtonActionPerformed
        agregarProductoVentana = new AgregarProductosFrame();
        agregarProductoVentana.setVisible(true);
    }//GEN-LAST:event_agregarProductoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProductoButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton verProductosButton;
    // End of variables declaration//GEN-END:variables
}
