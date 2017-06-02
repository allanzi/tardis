/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.products;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import mocks.ProductsMock;
import models.Product;
import views.SalesView;

/**
 *
 * @author FelipeVasconcelos
 */
public class ProductsViews extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicio
     */
    public ProductsViews() {
        initComponents();
    }
    
    private static ProductsMock ProductsMock = new ProductsMock();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel() {
            private Image image;
            {
                try {
                    image = ImageIO.read(new File("src/resources/fundo.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        usersLink = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productsLink = new javax.swing.JLabel();
        soldsLink = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        saleTable = new javax.swing.JTable();
        addProductButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INÍCIO");
        setMinimumSize(new java.awt.Dimension(630, 415));

        usersLink.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        usersLink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/USUARIO.png"))); // NOI18N
        usersLink.setText("USUÁRIOS");
        usersLink.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usersLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersLinkMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/RELATORIO.png"))); // NOI18N
        jLabel2.setText("RELATÓRIOS");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        productsLink.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        productsLink.setForeground(new java.awt.Color(255, 0, 0));
        productsLink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ESTOQUE.png"))); // NOI18N
        productsLink.setText("ESTOQUE");
        productsLink.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productsLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsLinkMouseClicked(evt);
            }
        });

        soldsLink.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        soldsLink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/VENDAS.png"))); // NOI18N
        soldsLink.setText("VENDAS");
        soldsLink.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        soldsLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soldsLinkMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SUPORTE.png"))); // NOI18N
        jLabel5.setText("SUPORTE");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Object[][] o = new Object[ProductsMock.get().size()][ProductsMock.get().size()*7];
        int count = 0;
        int column = 0;

        for (Product product : ProductsMock.get()) {
            o[column][count++] = product.getId();
            o[column][count++] = product.getCode();
            o[column][count++] = product.getName();
            o[column][count++] = product.getPrice();
            o[column][count++] = product.getProducer();
            o[column][count++] = product.getPlatform();
            o[column][count++] = product.getAmount();
            column++;
        }
        saleTable.setModel(new javax.swing.table.DefaultTableModel(
            o,
            new String [] {
                "ID", "Codigo", "Nome", "Preço", "Produtor", "Plataforma", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(saleTable);
        if (saleTable.getColumnModel().getColumnCount() > 0) {
            saleTable.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            saleTable.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            saleTable.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            saleTable.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        addProductButton.setText("Adicionar produto");
        addProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(usersLink)
                    .addComponent(soldsLink)
                    .addComponent(productsLink)
                    .addComponent(jLabel5))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addProductButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(usersLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(soldsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(productsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addProductButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersLinkMouseClicked
        this.dispose();
        ProductsViews users = new ProductsViews();
        users.run();
    }//GEN-LAST:event_usersLinkMouseClicked

    private void soldsLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soldsLinkMouseClicked
        this.dispose();
        SalesView sales = new SalesView();
        sales.run();
    }//GEN-LAST:event_soldsLinkMouseClicked

    private void productsLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsLinkMouseClicked
        this.dispose();
        ProductsViews products = new ProductsViews();
        products.run();
    }//GEN-LAST:event_productsLinkMouseClicked

    private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductButtonActionPerformed
        
    }//GEN-LAST:event_addProductButtonActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(ProductsViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsViews().setVisible(true);
            }
        });
    }

    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsViews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel productsLink;
    private javax.swing.JTable saleTable;
    private javax.swing.JLabel soldsLink;
    private javax.swing.JLabel usersLink;
    // End of variables declaration//GEN-END:variables
}
