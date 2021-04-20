package br.senac.sp.pi.view;

import br.senac.sp.pi.model.VendaProduto;
import javax.swing.JOptionPane;

public class TelaVenda extends javax.swing.JFrame {
    
    VendaProduto objVendas;

    public TelaVenda() {
        initComponents();
        setResizable(false); //Impedir alteração no tamanho da tela       
        setLocationRelativeTo(null); //deixar centralizado na tela do monitor
        this.setTitle("Loja de Informática - Tela de Vendas"); //altera titulo da janela
        objVendas = new VendaProduto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAdicionaProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalhesProduto = new javax.swing.JTable();
        btnAdicionarCarrinho = new javax.swing.JButton();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblDescricaoProduto = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblValorTotalVenda = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCarrinho = new javax.swing.JTable();
        btnRemoverVenda = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpcoes1 = new javax.swing.JMenu();
        opMenuPrincipal1 = new javax.swing.JMenuItem();
        opCadastroClientes1 = new javax.swing.JMenuItem();
        opCadastroProdutos1 = new javax.swing.JMenuItem();
        opRelatorioSintetico = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        opSair1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAdicionaProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escolha seu produto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tblDetalhesProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Quantidade", "Preço Unit."
            }
        ));
        jScrollPane1.setViewportView(tblDetalhesProduto);

        btnAdicionarCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone adicionar.png"))); // NOI18N
        btnAdicionarCarrinho.setText("Adicionar ao carrinho");
        btnAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCarrinhoActionPerformed(evt);
            }
        });

        lblNomeProduto.setText("Nome:");

        lblDescricaoProduto.setText("Descrição:");

        btnBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone buscar2.png"))); // NOI18N
        btnBuscarProduto.setText("Buscar");

        javax.swing.GroupLayout pnlAdicionaProdutoLayout = new javax.swing.GroupLayout(pnlAdicionaProduto);
        pnlAdicionaProduto.setLayout(pnlAdicionaProdutoLayout);
        pnlAdicionaProdutoLayout.setHorizontalGroup(
            pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                        .addComponent(lblNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescricaoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        pnlAdicionaProdutoLayout.setVerticalGroup(
            pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionaProdutoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricaoProduto)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnlAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lblValorTotalVenda.setText("Valor total da compra:");

        jButton3.setText("Finalizar compra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Quantidade", "Preço Unit."
            }
        ));
        jScrollPane3.setViewportView(tblCarrinho);

        btnRemoverVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone remover.png"))); // NOI18N
        btnRemoverVenda.setText("Remover ");
        btnRemoverVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorTotalVenda)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemoverVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRemoverVenda, jButton3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblValorTotalVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuOpcoes1.setText("Opções");

        opMenuPrincipal1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        opMenuPrincipal1.setText("Menu Principal");
        opMenuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMenuPrincipal1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opMenuPrincipal1);

        opCadastroClientes1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        opCadastroClientes1.setText("Cadastro de Clientes");
        opCadastroClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroClientes1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opCadastroClientes1);

        opCadastroProdutos1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        opCadastroProdutos1.setText("Casdastro de Produtos");
        opCadastroProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroProdutos1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opCadastroProdutos1);

        opRelatorioSintetico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        opRelatorioSintetico.setText("Relatórios");
        opRelatorioSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRelatorioSinteticoActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opRelatorioSintetico);
        menuOpcoes1.add(jSeparator2);

        opSair1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        opSair1.setText("Sair");
        opSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSair1ActionPerformed(evt);
            }
        });
        menuOpcoes1.add(opSair1);

        jMenuBar1.add(menuOpcoes1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAdicionaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAdicionaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opMenuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMenuPrincipal1ActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opMenuPrincipal1ActionPerformed

    private void opCadastroClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroClientes1ActionPerformed
        CadastroClientes telaCadastroClientes = new  CadastroClientes();
        telaCadastroClientes.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opCadastroClientes1ActionPerformed

    private void opCadastroProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroProdutos1ActionPerformed
        CadastroProdutos telaCadastroProdutos = new CadastroProdutos();
        telaCadastroProdutos.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opCadastroProdutos1ActionPerformed

    private void opRelatorioSinteticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRelatorioSinteticoActionPerformed
        TelaRelatorioSintetico telaRelatorio = new TelaRelatorioSintetico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opRelatorioSinteticoActionPerformed

    private void opSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSair1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opSair1ActionPerformed

    private void btnAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCarrinhoActionPerformed
        if(tblDetalhesProduto.getSelectedRow() != -1) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblDetalhesProduto.getSelectedRow();
            
            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDProduto = Integer.parseInt(tblDetalhesProduto.getModel().getValueAt(numeroLinha, 0).toString());
            String nomeProduto = tblDetalhesProduto.getModel().getValueAt(numeroLinha, 1).toString();
            String descricaoProduto = tblDetalhesProduto.getModel().getValueAt(numeroLinha, 2).toString();
            
            objVendas.setId(IDProduto);
            //objCliente.setNome(nome);
            //objCliente.setCpf(cpf);
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um produto da tabela para adicionar ao carrinho!");
        }
    }//GEN-LAST:event_btnAdicionarCarrinhoActionPerformed

    private void btnRemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverVendaActionPerformed
        if(tblCarrinho.getSelectedRow() != -1) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblDetalhesProduto.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDProduto = Integer.parseInt(tblDetalhesProduto.getModel().getValueAt(numeroLinha, 0).toString());

            objVendas.setId(IDProduto);
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um produto do carrinho para apagar!");
        }
    }//GEN-LAST:event_btnRemoverVendaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(tblCarrinho.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblDetalhesProduto.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDProduto = Integer.parseInt(tblDetalhesProduto.getModel().getValueAt(numeroLinha, 0).toString());

            objVendas.setId(IDProduto);
        }else{
            JOptionPane.showMessageDialog(this, "Insira ao menos um produto no carrinho para finalizar a compra!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCarrinho;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnRemoverVenda;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblValorTotalVenda;
    private javax.swing.JMenu menuOpcoes1;
    private javax.swing.JMenuItem opCadastroClientes1;
    private javax.swing.JMenuItem opCadastroProdutos1;
    private javax.swing.JMenuItem opMenuPrincipal1;
    private javax.swing.JMenuItem opRelatorioSintetico;
    private javax.swing.JMenuItem opSair1;
    private javax.swing.JPanel pnlAdicionaProduto;
    private javax.swing.JTable tblCarrinho;
    private javax.swing.JTable tblDetalhesProduto;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtNomeProduto;
    // End of variables declaration//GEN-END:variables
}
