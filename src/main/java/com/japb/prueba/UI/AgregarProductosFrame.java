package com.japb.prueba.UI;

import com.japb.prueba.entity.Producto;
import com.japb.prueba.services.AgregarProducto;

public class AgregarProductosFrame extends javax.swing.JFrame {

    public AgregarProductosFrame() {
        initComponents();
        setTitle("Formulario");
        setResizable(false);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idjTextField1 = new javax.swing.JTextField();
        idJLabel1 = new javax.swing.JLabel();
        titleJLabel2 = new javax.swing.JLabel();
        titlejTextField2 = new javax.swing.JTextField();
        descriptionJLabel3 = new javax.swing.JLabel();
        descriptionjTextField3 = new javax.swing.JTextField();
        pricejTextField4 = new javax.swing.JTextField();
        priceJLabel4 = new javax.swing.JLabel();
        stockJLabel5 = new javax.swing.JLabel();
        stockjTextField5 = new javax.swing.JTextField();
        sendjButton1 = new javax.swing.JButton();
        cleanjButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        categoryjTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idJLabel1.setText("ID");

        titleJLabel2.setText("Title");

        descriptionJLabel3.setText("Description");

        pricejTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricejTextField4ActionPerformed(evt);
            }
        });

        priceJLabel4.setText("Price");

        stockJLabel5.setText("Stock");

        sendjButton1.setText("Send");
        sendjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendjButton1ActionPerformed(evt);
            }
        });

        cleanjButton2.setText("Clean");
        cleanjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanjButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Category");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cleanjButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendjButton1)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stockJLabel5)
                            .addComponent(descriptionJLabel3)
                            .addComponent(titleJLabel2)
                            .addComponent(idJLabel1)
                            .addComponent(priceJLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idjTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(titlejTextField2)
                                .addComponent(pricejTextField4)
                                .addComponent(stockjTextField5)
                                .addComponent(categoryjTextField6))
                            .addComponent(descriptionjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idJLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleJLabel2)
                    .addComponent(titlejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionJLabel3)
                    .addComponent(descriptionjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceJLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockJLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryjTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendjButton1)
                    .addComponent(cleanjButton2))
                .addGap(25, 25, 25))
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

    private void cleanjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanjButton2ActionPerformed
        idjTextField1.setText("");
        titlejTextField2.setText("");
        descriptionjTextField3.setText("");
        pricejTextField4.setText("");
        stockjTextField5.setText("");
        categoryjTextField6.setText("");
    }//GEN-LAST:event_cleanjButton2ActionPerformed

    private void pricejTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricejTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricejTextField4ActionPerformed

    private void sendjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendjButton1ActionPerformed
        Producto item = new Producto();
        try{
        item.setId(Integer.parseInt(idjTextField1.getText()));
        item.setTitle(titlejTextField2.getText());
        item.setDescription(descriptionjTextField3.getText());
        item.setPrice(Float.parseFloat(pricejTextField4.getText()));
        item.setStock(Integer.parseInt(stockjTextField5.getText()));
        item.setCategory(categoryjTextField6.getText());
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
        AgregarProducto agrega = new AgregarProducto();
        agrega.agregaItem(item);

    }//GEN-LAST:event_sendjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categoryjTextField6;
    private javax.swing.JButton cleanjButton2;
    private javax.swing.JLabel descriptionJLabel3;
    private javax.swing.JTextField descriptionjTextField3;
    private javax.swing.JLabel idJLabel1;
    private javax.swing.JTextField idjTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel priceJLabel4;
    private javax.swing.JTextField pricejTextField4;
    private javax.swing.JButton sendjButton1;
    private javax.swing.JLabel stockJLabel5;
    private javax.swing.JTextField stockjTextField5;
    private javax.swing.JLabel titleJLabel2;
    private javax.swing.JTextField titlejTextField2;
    // End of variables declaration//GEN-END:variables
}
