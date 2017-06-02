/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Services.UserService;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import mocks.UserMock;
import models.User;
import views.SalesView;

/**
 *
 * @author FelipeVasconcelos
 */
public class UsersIndex extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicio
     */
    public UsersIndex() {
        initComponents();
    }

    private static UserMock UserMock = new UserMock();

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
        jLabel3 = new javax.swing.JLabel();
        soldsLink = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        addUserButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        removerUserButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INÍCIO");
        setMinimumSize(new java.awt.Dimension(630, 415));

        usersLink.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        usersLink.setForeground(new java.awt.Color(255, 0, 0));
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

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ESTOQUE.png"))); // NOI18N
        jLabel3.setText("ESTOQUE");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
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

        Object[][] o = new Object[UserMock.get().size()][UserMock.get().size()*7];
        int column = 0;
        int line = 0;

        for (User user : UserMock.get()) {
            o[line][column++] = user.getId();
            o[line][column++] = user.getName();
            o[line][column++] = user.getEmail();
            o[line][column++] = user.getCpf();
            o[line][column++] = user.getRg();
            o[line][column++] = user.getBirth_date().toString();
            o[line][column++] = user.getPhone();
            line++;
            column = 0;
        }
        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            o,
            new String [] {
                "ID", "Nome", "Email", "CPF", "RG", "Data de nascimento", "Telefone"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jScrollPane1.setViewportView(usersTable);
    if (usersTable.getColumnModel().getColumnCount() > 0) {
        usersTable.getColumnModel().getColumn(0).setHeaderValue("Title 1");
        usersTable.getColumnModel().getColumn(1).setHeaderValue("Title 2");
        usersTable.getColumnModel().getColumn(2).setHeaderValue("Title 3");
        usersTable.getColumnModel().getColumn(3).setHeaderValue("Title 4");
    }

    addUserButton.setText("Adicionar usuário");
    addUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            addUserButtonMouseClicked(evt);
        }
    });

    editUserButton.setText("Editar usuário");
    editUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            editUserButtonMouseClicked(evt);
        }
    });

    removerUserButton.setText("Remover usuario");
    removerUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            removerUserButtonMouseClicked(evt);
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
                .addComponent(jLabel3)
                .addComponent(jLabel5))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(removerUserButton)
            .addGap(43, 43, 43)
            .addComponent(addUserButton)
            .addContainerGap())
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(147, 147, 147)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
            .addGap(12, 12, 12))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jSeparator1)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(usersLink, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(soldsLink, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addGap(57, 57, 57))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editUserButton)
                        .addComponent(removerUserButton)
                        .addComponent(addUserButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
    );

    getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersLinkMouseClicked
        this.dispose();
        UsersIndex users = new UsersIndex();
        users.run();
    }//GEN-LAST:event_usersLinkMouseClicked

    private void soldsLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soldsLinkMouseClicked
        this.dispose();
        SalesView sales = new SalesView();
        sales.run();
    }//GEN-LAST:event_soldsLinkMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        ProductsViews products = new ProductsViews();
        products.run();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void addUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserButtonMouseClicked
        User user = new User();
        UsersCreate view = new UsersCreate(user, false);
        view.run();
        this.dispose();
    }//GEN-LAST:event_addUserButtonMouseClicked

    private void editUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserButtonMouseClicked
        if (usersTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para edita-la");
            return;
        }
        
        try {
            int id = (int) usersTable.getModel().getValueAt(usersTable.getSelectedRow(), 0);
            User user = UserMock.find(id);
            UsersCreate view = new UsersCreate(user, true);
            view.run();
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(UsersIndex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editUserButtonMouseClicked

    private void removerUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerUserButtonMouseClicked
        if (usersTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para removê-la");
            return;
        }
        
        try {
            int id = (int) usersTable.getModel().getValueAt(usersTable.getSelectedRow(), 0);
            User user = UserMock.find(id);
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja realmente remover o(a) usuario(a): " + user.getName() + ".");
            
            if (confirm == JOptionPane.YES_OPTION) {
                UserService service = new UserService();
                service.delete(id);
                this.dispose();
                this.run();
            }
        } catch (Exception ex) {
            Logger.getLogger(UsersIndex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removerUserButtonMouseClicked

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
        //<editorUser user = new User();
        
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
            java.util.logging.Logger.getLogger(UsersIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsersIndex view = new UsersIndex();
                view.setDefaultCloseOperation(UsersIndex.DISPOSE_ON_CLOSE);
                view.setVisible(true);
            }
        });
    }

    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsersIndex view = new UsersIndex();
                view.setDefaultCloseOperation(UsersIndex.DISPOSE_ON_CLOSE);
                view.setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton editUserButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton removerUserButton;
    private javax.swing.JLabel soldsLink;
    private javax.swing.JLabel usersLink;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}