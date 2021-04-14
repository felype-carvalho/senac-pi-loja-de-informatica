package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadastroProdutos extends javax.swing.JFrame {

  
    public CadastroProdutos() {
        initComponents();
        setResizable(false); //Impedir alteração no tamanho da tela       
        setLocationRelativeTo(null); //deixar centralizado na tela do monitor
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNomeProduto = new javax.swing.JLabel();
        lblDescricaoProduto = new javax.swing.JLabel();
        lblQuantidadeProduto = new javax.swing.JLabel();
        lblPrecoProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtDescricaoProduto = new javax.swing.JTextField();
        txtQuantidadeProduto = new javax.swing.JTextField();
        txtPrecoProduto = new javax.swing.JFormattedTextField();
        btnAdicionarProduto = new javax.swing.JButton();
        btnLimparProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnRemoverProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        lblConsultaNome = new javax.swing.JLabel();
        lblConsultaDescricao = new javax.swing.JLabel();
        txtConsultaNome = new javax.swing.JTextField();
        txtConsultaDescricao = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpcoes = new javax.swing.JMenu();
        opMenuPrincipal = new javax.swing.JMenuItem();
        opCadastroClientes = new javax.swing.JMenuItem();
        opTelaVendas = new javax.swing.JMenuItem();
        opRelatorioSintetico = new javax.swing.JMenuItem();
        opRelatorioAnalitico = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produtos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        lblNomeProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNomeProduto.setText("Nome:");

        lblDescricaoProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDescricaoProduto.setText("Descrição:");

        lblQuantidadeProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblQuantidadeProduto.setText("Quantidade:");

        lblPrecoProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPrecoProduto.setText("Preço:");

        txtPrecoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProdutoActionPerformed(evt);
            }
        });

        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        btnLimparProduto.setText("Limpar");
        btnLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblQuantidadeProduto)
                        .addComponent(lblDescricaoProduto)
                        .addComponent(lblPrecoProduto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblNomeProduto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoProduto))
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtDescricaoProduto))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoProduto)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeProduto)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(lblPrecoProduto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnLimparProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Quantidade", "Preço"
            }
        ));
        tblProdutos.setToolTipText("");
        jScrollPane1.setViewportView(tblProdutos);

        btnRemoverProduto.setText("Remover");
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setText("Alterar");

        lblConsultaNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblConsultaNome.setText("Nome:");

        lblConsultaDescricao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblConsultaDescricao.setText("Descrição:");

        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblConsultaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblConsultaDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsultaDescricao))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btnRemoverProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsultaNome)
                    .addComponent(txtConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConsultaDescricao)
                    .addComponent(txtConsultaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        menuOpcoes.setText("Opções");

        opMenuPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        opMenuPrincipal.setText("Menu Principal");
        opMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMenuPrincipalActionPerformed(evt);
            }
        });
        menuOpcoes.add(opMenuPrincipal);

        opCadastroClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        opCadastroClientes.setText("Cadastro de Clientes");
        opCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadastroClientesActionPerformed(evt);
            }
        });
        menuOpcoes.add(opCadastroClientes);

        opTelaVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        opTelaVendas.setText("Tela de Vendas");
        opTelaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opTelaVendasActionPerformed(evt);
            }
        });
        menuOpcoes.add(opTelaVendas);

        opRelatorioSintetico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        opRelatorioSintetico.setText("Relatórios Sintéticos");
        opRelatorioSintetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRelatorioSinteticoActionPerformed(evt);
            }
        });
        menuOpcoes.add(opRelatorioSintetico);

        opRelatorioAnalitico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        opRelatorioAnalitico.setText("Relatórios Analíticos");
        opRelatorioAnalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRelatorioAnaliticoActionPerformed(evt);
            }
        });
        menuOpcoes.add(opRelatorioAnalitico);
        menuOpcoes.add(jSeparator1);

        opSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        opSair.setText("Sair");
        opSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(opSair);

        jMenuBar1.add(menuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        
        String nome= txtNomeProduto.getText();
        String descricao= txtDescricaoProduto.getText();
        String quantidade= txtQuantidadeProduto.getText();
        String preco= txtPrecoProduto.getText();
                
        //validando a obrigatoriedade do nome
        if(txtNomeProduto.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Digite o nome o produto!");
            return;
        }
        
         //validando a obrigatoriedade da descrição
        if(txtDescricaoProduto.getText().trim().equals("")){
            
            JOptionPane.showMessageDialog(this, "Digite a descrição do produto!");
            txtDescricaoProduto.setBackground(Color.red); //Deixar campo vermelha para informar o erro
            return;       
        }
        
        //validando a obrigatoriedade da quantidade
        if(txtQuantidadeProduto.getText().trim().equals("")){
            
            JOptionPane.showMessageDialog(this, "Digite a quantidade do produto!");
            txtQuantidadeProduto.setBackground(Color.red); //Deixar campo vermelha para informar o erro
            return;       
            
          }else{
            try {
                int qtd = Integer.parseInt(txtQuantidadeProduto.getText());
                           
            }catch (NumberFormatException erro){ //Caso o usuário não digitar um número
                
              JOptionPane.showMessageDialog(this, "Digite somente número no campo quantidade!");
               txtQuantidadeProduto.setBackground(Color.red); //Deixar campo vermelha para informar o erro
               return;
          }

            //Validando a quantidade do preço
            if(txtPrecoProduto.getText().trim().equals("")){
            
            JOptionPane.showMessageDialog(this, "Digite o preço do produto!");
            txtPrecoProduto.setBackground(Color.red); //Deixar campo vermelha para informar o erro
            return;                     
        }
        
       } 
        
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
                      
        modelo.addRow(new String[]{nome,descricao, quantidade, preco});
                       
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
          int indiceLinha = tblProdutos.getSelectedRow();

    if(indiceLinha<0){

      JOptionPane.showMessageDialog(this, "Selecione uma linha!");

      return;

    }
   
    DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();

    modelo.removeRow(indiceLinha);
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void btnLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdutoActionPerformed
        txtNomeProduto.setText("");
        txtDescricaoProduto.setText("");
        txtQuantidadeProduto.setText("");
        txtPrecoProduto.setText("");           
    }//GEN-LAST:event_btnLimparProdutoActionPerformed

    private void txtPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoProdutoActionPerformed

    private void opMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMenuPrincipalActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opMenuPrincipalActionPerformed

    private void opCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadastroClientesActionPerformed
        CadastroClientes telaCadastroClientes = new  CadastroClientes();
        telaCadastroClientes.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opCadastroClientesActionPerformed

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

    private void opRelatorioAnaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRelatorioAnaliticoActionPerformed
        TelaRelatorioAnalitico telaRelatorio = new TelaRelatorioAnalitico();
        telaRelatorio.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_opRelatorioAnaliticoActionPerformed

    private void opSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opSairActionPerformed

   
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
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimparProduto;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblConsultaDescricao;
    private javax.swing.JLabel lblConsultaNome;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPrecoProduto;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem opCadastroClientes;
    private javax.swing.JMenuItem opMenuPrincipal;
    private javax.swing.JMenuItem opRelatorioAnalitico;
    private javax.swing.JMenuItem opRelatorioSintetico;
    private javax.swing.JMenuItem opSair;
    private javax.swing.JMenuItem opTelaVendas;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtConsultaDescricao;
    private javax.swing.JTextField txtConsultaNome;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JFormattedTextField txtPrecoProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables
}
