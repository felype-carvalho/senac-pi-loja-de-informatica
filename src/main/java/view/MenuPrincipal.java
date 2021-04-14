package view;

public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
        setResizable(false); //Impedir alteração no tamanho da tela       
        setLocationRelativeTo(null); //deixar centralizado na tela do monitor       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separadorMenuOpcoes = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnTelaCadastroClientes = new javax.swing.JButton();
        btnTelaCadastroProdutos = new javax.swing.JButton();
        btnTelaVendas = new javax.swing.JButton();
        btnTelaRelSintetico = new javax.swing.JButton();
        btnTelaRelAnalitico = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuOpcoes = new javax.swing.JMenu();
        opCadastroClientes = new javax.swing.JMenuItem();
        opCadastroProdutos = new javax.swing.JMenuItem();
        opTelaVendas = new javax.swing.JMenuItem();
        opTelaRelatorios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Principal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        btnTelaCadastroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone cadastro clientes.png"))); // NOI18N
        btnTelaCadastroClientes.setText("Cadastro de Clientes");
        btnTelaCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastroClientesActionPerformed(evt);
            }
        });

        btnTelaCadastroProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone produto.png"))); // NOI18N
        btnTelaCadastroProdutos.setText("Cadastro de Produtos");
        btnTelaCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastroProdutosActionPerformed(evt);
            }
        });

        btnTelaVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone vendas.png"))); // NOI18N
        btnTelaVendas.setText("Tela de Vendas");
        btnTelaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaVendasActionPerformed(evt);
            }
        });

        btnTelaRelSintetico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone analytics2.png"))); // NOI18N
        btnTelaRelSintetico.setText("Relatórios Sintético");
        btnTelaRelSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaRelSinteticoActionPerformed(evt);
            }
        });

        btnTelaRelAnalitico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone analytics1.png"))); // NOI18N
        btnTelaRelAnalitico.setText("Relatórios Analíticos");
        btnTelaRelAnalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaRelAnaliticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTelaRelAnalitico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTelaCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTelaVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTelaCadastroProdutos)
                    .addComponent(btnTelaRelSintetico, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnTelaCadastroClientes, btnTelaCadastroProdutos, btnTelaRelSintetico, btnTelaVendas});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaCadastroClientes)
                    .addComponent(btnTelaCadastroProdutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaVendas)
                    .addComponent(btnTelaRelSintetico, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTelaRelAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnTelaCadastroClientes, btnTelaCadastroProdutos, btnTelaRelSintetico, btnTelaVendas});

        menuOpcoes.setText("Opções");

        opCadastroClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        opCadastroClientes.setText("Cadastro de Clientes");
        opCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroClientesActionPerformed(evt);
            }
        });
        menuOpcoes.add(opCadastroClientes);

        opCadastroProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        opCadastroProdutos.setText("Casdastro de Produtos");
        opCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroProdutosActionPerformed(evt);
            }
        });
        menuOpcoes.add(opCadastroProdutos);

        opTelaVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        opTelaVendas.setText("Tela de Vendas");
        opTelaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTelaVendasActionPerformed(evt);
            }
        });
        menuOpcoes.add(opTelaVendas);

        opTelaRelatorios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        opTelaRelatorios.setText("Tela de Relatórios");
        opTelaRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTelaRelatoriosActionPerformed(evt);
            }
        });
        menuOpcoes.add(opTelaRelatorios);
        menuOpcoes.add(jSeparator1);

        opSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        opSair.setText("Sair");
        opSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(opSair);

        barraMenu.add(menuOpcoes);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastroClientesActionPerformed
        CadastroClientes telaCadastroClientes = new  CadastroClientes();
        telaCadastroClientes.setVisible(true);        
        setVisible(false);
    }//GEN-LAST:event_btnTelaCadastroClientesActionPerformed

    private void btnTelaCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastroProdutosActionPerformed
        CadastroProdutos telaCadastroProdutos = new CadastroProdutos();
        telaCadastroProdutos.setVisible(true); 
        setVisible(false);
    }//GEN-LAST:event_btnTelaCadastroProdutosActionPerformed

    private void btnTelaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaVendasActionPerformed
        TelaVenda telaVenda = new TelaVenda();
        telaVenda.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnTelaVendasActionPerformed

    private void btnTelaRelSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaRelSinteticoActionPerformed
        TelaRelatorioSintetico telaRelatorio = new TelaRelatorioSintetico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnTelaRelSinteticoActionPerformed

    private void opCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroClientesActionPerformed
        CadastroClientes telaCadastroClientes = new  CadastroClientes();
        telaCadastroClientes.setVisible(true);        
        setVisible(false);
    }//GEN-LAST:event_opCadastroClientesActionPerformed

    private void opCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroProdutosActionPerformed
        CadastroProdutos telaCadastroProdutos = new CadastroProdutos();
        telaCadastroProdutos.setVisible(true); 
        setVisible(false);
    }//GEN-LAST:event_opCadastroProdutosActionPerformed

    private void opSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opSairActionPerformed

    private void opTelaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opTelaVendasActionPerformed
        TelaVenda telaVenda = new TelaVenda();
        telaVenda.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opTelaVendasActionPerformed

    private void opTelaRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opTelaRelatoriosActionPerformed
        TelaRelatorioSintetico telaRelatorio = new TelaRelatorioSintetico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opTelaRelatoriosActionPerformed

    private void btnTelaRelAnaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaRelAnaliticoActionPerformed
        TelaRelatorioAnalitico telaRelatorio = new TelaRelatorioAnalitico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnTelaRelAnaliticoActionPerformed

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnTelaCadastroClientes;
    private javax.swing.JButton btnTelaCadastroProdutos;
    private javax.swing.JButton btnTelaRelAnalitico;
    private javax.swing.JButton btnTelaRelSintetico;
    private javax.swing.JButton btnTelaVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem opCadastroClientes;
    private javax.swing.JMenuItem opCadastroProdutos;
    private javax.swing.JMenuItem opSair;
    private javax.swing.JMenuItem opTelaRelatorios;
    private javax.swing.JMenuItem opTelaVendas;
    private javax.swing.JSeparator separadorMenuOpcoes;
    // End of variables declaration//GEN-END:variables
}
