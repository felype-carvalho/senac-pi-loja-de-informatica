package br.senac.sp.pi.view;

import javax.swing.ImageIcon;
public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
        setResizable(false); //Impedir alteração no tamanho da tela       
        setLocationRelativeTo(null); //deixar centralizado na tela do monitor
        this.setTitle("Loja de Informática - Menu Principal"); //altera titulo da janela
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separadorMenuOpcoes = new javax.swing.JSeparator();
        pnlMenuPrincipal = new javax.swing.JPanel();
        painelImagemFundo1 = new br.senac.sp.pi.model.PainelImagemFundo();
        btnTelaCadastroClientes = new javax.swing.JButton();
        btnTelaCadastroProdutos = new javax.swing.JButton();
        btnTelaVendas = new javax.swing.JButton();
        btnTelaRelSintetico = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuOpcoes = new javax.swing.JMenu();
        opCadastroClientes = new javax.swing.JMenuItem();
        opCadastroProdutos = new javax.swing.JMenuItem();
        opTelaVendas = new javax.swing.JMenuItem();
        opRelatorioSintetico = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Principal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        painelImagemFundo1.setImg(new ImageIcon("src/main/resources\\Imagem Fundo Painel.jpg"));

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

        btnTelaRelSintetico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone analytics1.png"))); // NOI18N
        btnTelaRelSintetico.setText("Relatórios");
        btnTelaRelSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaRelSinteticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTelaCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTelaVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTelaCadastroProdutos)
                    .addComponent(btnTelaRelSintetico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        painelImagemFundo1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnTelaCadastroClientes, btnTelaCadastroProdutos, btnTelaRelSintetico, btnTelaVendas});

        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaCadastroProdutos)
                    .addComponent(btnTelaCadastroClientes))
                .addGap(45, 45, 45)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaVendas)
                    .addComponent(btnTelaRelSintetico, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        painelImagemFundo1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnTelaCadastroClientes, btnTelaCadastroProdutos, btnTelaRelSintetico, btnTelaVendas});

        javax.swing.GroupLayout pnlMenuPrincipalLayout = new javax.swing.GroupLayout(pnlMenuPrincipal);
        pnlMenuPrincipal.setLayout(pnlMenuPrincipalLayout);
        pnlMenuPrincipalLayout.setHorizontalGroup(
            pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuPrincipalLayout.setVerticalGroup(
            pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        opRelatorioSintetico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        opRelatorioSintetico.setText("Relatórios");
        opRelatorioSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRelatorioSinteticoActionPerformed(evt);
            }
        });
        menuOpcoes.add(opRelatorioSintetico);
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
            .addComponent(pnlMenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void opRelatorioSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRelatorioSinteticoActionPerformed
        TelaRelatorioSintetico telaRelatorio = new TelaRelatorioSintetico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opRelatorioSinteticoActionPerformed

    
    
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
    private javax.swing.JButton btnTelaRelSintetico;
    private javax.swing.JButton btnTelaVendas;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem opCadastroClientes;
    private javax.swing.JMenuItem opCadastroProdutos;
    private javax.swing.JMenuItem opRelatorioSintetico;
    private javax.swing.JMenuItem opSair;
    private javax.swing.JMenuItem opTelaVendas;
    private br.senac.sp.pi.model.PainelImagemFundo painelImagemFundo1;
    private javax.swing.JPanel pnlMenuPrincipal;
    private javax.swing.JSeparator separadorMenuOpcoes;
    // End of variables declaration//GEN-END:variables
}
